package com.example.angol;




import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.fxml.Initializable;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.util.Duration;


public class HelloController implements Initializable {

    public MediaView movieView;
    @FXML
    Button btn1;
    @FXML
    Button btnTutorialView;
    public MediaPlayer mediaPlayer;
    public File file;
    public Media media;
    @FXML
    private MediaView setMediaPlayer;
    @FXML
    public MediaView mediaView;
    @FXML
    public Button onPlayMovie;
    @FXML
    public Button onPauseMovie;

    @FXML
    private Button bckTutorialToH;
    private Button bcktutorial;


    public HelloController() {
    }

    public void onHelloButtonClick() throws Exception {
        Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("second-view.fxml"));
        Stage window = (Stage) this.btn1.getScene().getWindow();
        window.setScene(new Scene(root, 800.0D, 700.0D));
    }



    public void onTutorialView() throws Exception {
        Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("tutorial-view.fxml"));
        Stage window = (Stage) this.btnTutorialView.getScene().getWindow();
        window.setScene(new Scene(root, 800.0D, 700.0D));
    }

   public void onBackTutorial() throws Exception {
        Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("hello-view.fxml"));
        Stage window = (Stage) this.bckTutorialToH.getScene().getWindow();
        window.setScene(new Scene(root, 800.0D, 700.0D));
    }
@FXML
    public void initialize(URL arg0, ResourceBundle arg1) {
        if (movieView == null) {
            return;
        }

        file = new File("D:\\Studia -  Magister\\Programowanie Java\\Angol\\src\\main\\resources\\TUTORIAL.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
//            movieView = new MediaView(mediaPlayer);
//            movieView.setMediaPlayer(mediaPlayer);
        movieView.setMediaPlayer(mediaPlayer);
    }


    public void onPlayMovie() {
        mediaPlayer.play();
    }

    public void onPauseMovie() {
        mediaPlayer.pause();
    }

    public void onResetMovie() {
        if (mediaPlayer.getStatus() != MediaPlayer.Status.READY) {
            mediaPlayer.seek(Duration.seconds(0.0));
        }
    }
}


