package com.kingaspx.DownloadVideo.util;

import com.github.kiulian.downloader.OnYoutubeDownloadListener;
import com.github.kiulian.downloader.YoutubeDownloader;
import com.github.kiulian.downloader.YoutubeException;
import com.github.kiulian.downloader.model.VideoDetails;
import com.github.kiulian.downloader.model.YoutubeVideo;
import com.github.kiulian.downloader.model.formats.AudioVideoFormat;
import com.github.kiulian.downloader.model.formats.Format;
import com.idrsolutions.image.JDeli;
import static com.kingaspx.DownloadVideo.Main.downloadModal;
import com.kingaspx.DownloadVideo.menu.ResultModal;
import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.EncodingAttributes;
import java.awt.Desktop;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class Downloader {

    private JProgressBar progressBar;
    private String id_video;

    private String title;
    private String author;
    private String description;
    private long views;

    private BufferedImage buffImage;

    public Downloader(JProgressBar progressBar, String id_video) {
        this.progressBar = progressBar;
        this.id_video = id_video;
    }

    public void start() {
        try {
            // init downloader
            YoutubeDownloader downloader = new YoutubeDownloader();

// or just extend functionality via existing API
// cipher features
            downloader.addCipherFunctionPattern(2, "\\b([a-zA-Z0-9$]{2})\\s*=\\s*function\\(\\s*a\\s*\\)\\s*\\{\\s*a\\s*=\\s*a\\.split\\(\\s*\"\"\\s*\\)");
// extractor features
            downloader.setParserRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.121 Safari/537.36");
            downloader.setParserRetryOnFailure(1);

// parsing data
            String videoId = id_video; // for url https://www.youtube.com/watch?v=abc12345
            YoutubeVideo video = downloader.getVideo(videoId);

// video details
            VideoDetails details = video.details();

            author = details.author();
            title = details.title();
            description = details.description();
            views = details.viewCount();

            details.thumbnails().forEach(image -> {
                getImage(image);
            });

// get videos with audio
            List<AudioVideoFormat> videoWithAudioFormats = video.videoWithAudioFormats();
            videoWithAudioFormats.forEach(it -> {
                System.out.println(it.videoQuality() + " : " + it.url());
            });

// itags can be found here - https://gist.github.com/sidneys/7095afe4da4ae58694d128b1034e01e2
            Format formatByItag = video.findFormatByItag(136);
            if (formatByItag != null) {
                System.out.println(formatByItag.url());
            }

            File outputDir = new File("videos");

// sync downloading
//        File file = video.download(videoWithAudioFormats.get(0), outputDir);
// async downloading with callback
            video.downloadAsync(videoWithAudioFormats.get(0), outputDir, new OnYoutubeDownloadListener() {
                @Override
                public void onDownloading(int progress) {
                    progressBar.setValue(progress);
                }

                @Override
                public void onFinished(File video) {
                    try {
                        File audio = new File(video.getName().replace(".mp4", "") + "+.mp3");

                        AudioAttributes audioAttrs = new AudioAttributes();
                        audioAttrs.setCodec("libmp3lame");
                        audioAttrs.setBitRate(new Integer(128000));
                        audioAttrs.setChannels(new Integer(2));
                        audioAttrs.setSamplingRate(new Integer(44100));

                        EncodingAttributes attrs = new EncodingAttributes();
                        attrs.setFormat("mp3");
                        attrs.setAudioAttributes(audioAttrs);

                        Encoder encoder = new Encoder();
                        encoder.encode(video, audio, attrs);

                        downloadModal.dispose();
                        new ResultModal(new JFrame(), false, author, title, description, views, buffImage, audio, video).setVisible(true);
                    } catch (IllegalArgumentException ex) {
                        Logger.getLogger(Downloader.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (EncoderException ex) {
                        Logger.getLogger(Downloader.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

                @Override
                public void onError(Throwable throwable) {
                    System.out.println("Error: " + throwable.getLocalizedMessage());
                }
            });
        } catch (YoutubeException ex) {
            Logger.getLogger(Downloader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Downloader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getImage(String url) {
        String filename = "image.webp";

        try (InputStream in = new URL(url).openStream()) {
            Files.copy(in, Paths.get(filename));

            File webFile = new File(filename);
            BufferedImage image = JDeli.read(webFile);

            buffImage = image;
        } catch (Exception e) {
        }
    }

    public static void openAudio(File file) {
        try {
            Desktop desktop = Desktop.getDesktop();
            desktop.open(new File(file.getAbsolutePath()));
        } catch (Exception e) {
        }
    }

    public static void openVideo(File file) {
        try {
            Desktop desktop = Desktop.getDesktop();
            desktop.open(new File(file.getAbsolutePath()));
        } catch (Exception e) {
        }
    }

}
