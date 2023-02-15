package com.example.angol;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.net.URL;


public class LiczbyController2 {
    @FXML
    Button btnbackliczby;
    @FXML
    Button btnbackkolory;
    @FXML
    Button btntestliczby;


    public LiczbyController2()  {
    }

    public void ButtonBackLiczby() throws Exception {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("second-view.fxml"));
        Stage window = (Stage)this.btnbackliczby.getScene().getWindow();
        window.setScene(new Scene(root, 800.0D, 700.0D));
    }

    public void ButtonBackKolory() throws Exception {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("second-view.fxml"));
        Stage window = (Stage)this.btnbackkolory.getScene().getWindow();
        window.setScene(new Scene(root, 800.0D, 700.0D));
    }

    public void ButtonTestLiczby() throws Exception {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("testliczby-view.fxml"));
        Stage window = (Stage)this.btntestliczby.getScene().getWindow();
        window.setScene(new Scene(root, 800.0D, 700.0D));
    }



    public void oneSoundPlay() {
        URL resource = this.getClass().getClassLoader().getResource("ONE.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void twoSoundPlay() {
        URL resource = this.getClass().getClassLoader().getResource("TWO.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void threeSoundPlay() {
        URL resource = this.getClass().getClassLoader().getResource("THREE.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void fourSoundPlay() {
        URL resource = this.getClass().getClassLoader().getResource("FOUR.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void redSoundPlay() {
        URL resource = this.getClass().getClassLoader().getResource("RED.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void blackSoundPlay() {
        URL resource = this.getClass().getClassLoader().getResource("BLACK.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void whiteSoundPlay() {
        URL resource = this.getClass().getClassLoader().getResource("WHITE.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void blueSoundPlay() {
        URL resource = this.getClass().getClassLoader().getResource("BLUE.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }

    public void pinkSoundPlay() {
        URL resource = this.getClass().getClassLoader().getResource("PINK.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }

    public void greenSoundPlay() {
        URL resource = this.getClass().getClassLoader().getResource("GREEN.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void yellowSoundPlay() {
        URL resource = this.getClass().getClassLoader().getResource("YELLOW.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void purpleSoundPlay() {
        URL resource = this.getClass().getClassLoader().getResource("PURPLE.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void brownSoundPlay() {
        URL resource = this.getClass().getClassLoader().getResource("BROWN.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }

    public void graySoundPlay() {
        URL resource = this.getClass().getClassLoader().getResource("GRAY.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }

    public void orangeSoundPlay() {
        URL resource = this.getClass().getClassLoader().getResource("ORANGE.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void fiveSoundPlay() {
        URL resource = this.getClass().getClassLoader().getResource("FIVE.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void sixSoundPlay() {
        URL resource = this.getClass().getClassLoader().getResource("six.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }

    public void sevenSoundPlay() {
        URL resource = this.getClass().getClassLoader().getResource("seven.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void eightSoundPlay() {
        URL resource = this.getClass().getClassLoader().getResource("eight.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void nineSoundPlay() {
        URL resource = this.getClass().getClassLoader().getResource("nine.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }

    public void tenSoundPlay() {
        URL resource = this.getClass().getClassLoader().getResource("ten.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }

}

