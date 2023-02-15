package com.example.angol;




import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.net.URL;

public class LiczbyController {
    @FXML
    Button btnl;
    @FXML
    Button btnk;
    @FXML
    Button btnbackhello;
    @FXML
    Label text;
    @FXML
    Label points;
    @FXML
    public Button btntestkolory;
    public Button btnz;
    public Button btnr;
    public Button btnbackzwierzeta;
    public Button btnbackrodziny;

    public LiczbyController() {
    }

    public void onLiczbyButtonClick() throws Exception {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("liczby-view.fxml"));
        Stage window = (Stage)this.btnl.getScene().getWindow();
        window.setScene(new Scene(root, 800.0D, 700.0D));
    }

    public void onKoloryButtonClick() throws Exception {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("kolory-view.fxml"));
        Stage window = (Stage)this.btnk.getScene().getWindow();
        window.setScene(new Scene(root, 800.0D, 700.0D));
    }

    public void ButtonTestKolory() throws Exception {
	Counter instance = Counter.getInstance();
        instance.zeroPoints(0);
        Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("test1-view.fxml"));
        Stage window = (Stage) this.btntestkolory.getScene().getWindow();
        window.setScene(new Scene(root, 900.0D, 700.0D));
    }
    public void ButtonBackHello() throws Exception {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("hello-view.fxml"));
        Stage window = (Stage)this.btnbackhello.getScene().getWindow();
        window.setScene(new Scene(root, 800.0D, 700.0D));
    }
    public void onZwierzetaButtonClick() throws Exception {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("zwierzeta-view.fxml"));
        Stage window = (Stage)this.btnz.getScene().getWindow();
        window.setScene(new Scene(root, 800.0D, 700.0D));
    }

    public void onRodzinyButtonClick() throws Exception {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("rodzina-view.fxml"));
        Stage window = (Stage)this.btnr.getScene().getWindow();
        window.setScene(new Scene(root, 800.0D, 700.0D));
    }

    public void ButtonBackZwierzeta() throws Exception {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("second-view.fxml"));
        Stage window = (Stage)this.btnbackzwierzeta.getScene().getWindow();
        window.setScene(new Scene(root, 800.0D, 700.0D));
    }

    public void ButtonBackRodziny() throws Exception {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("second-view.fxml"));
        Stage window = (Stage)this.btnbackrodziny.getScene().getWindow();
        window.setScene(new Scene(root, 800.0D, 700.0D));
    }

    public void pyt1(ActionEvent event)
    {
        //System.out.println("PRAWIDLOWA odpowiedz !!");
        text.setText("PRAWIDLOWA ODPOWIEDZ !!!!!!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(1);
        points.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
    }

    public void pyt1b(ActionEvent event)
    {
        //System.out.println("PRAWIDLOWA odpowiedz !!");
        text.setText("BLEDNA ODPOWIEDZ !!!!!!!");

    }

    public void pyt1bb(ActionEvent event)
    {
        //System.out.println("PRAWIDLOWA odpowiedz !!");
        text.setText("BLEDNA ODPOWIEDZ !!!!!!!");
    }

    public void onDogSound() {
        URL resource = this.getClass().getClassLoader().getResource("DOG.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void onCatSound() {
        URL resource = this.getClass().getClassLoader().getResource("CAT.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }

    public void onElephantSound() {
        URL resource = this.getClass().getClassLoader().getResource("elephant.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void onGiraffeSound() {
        URL resource = this.getClass().getClassLoader().getResource("giraffe.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void onCowSound() {
        URL resource = this.getClass().getClassLoader().getResource("cow.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void onPigSound() {
        URL resource = this.getClass().getClassLoader().getResource("pig.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void onMouseSound() {
        URL resource = this.getClass().getClassLoader().getResource("mouse.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void onTigerSound() {
        URL resource = this.getClass().getClassLoader().getResource("tiger.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }

    public void onSnakeSound() {
        URL resource = this.getClass().getClassLoader().getResource("snake.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }

    public void onFrogSound() {
        URL resource = this.getClass().getClassLoader().getResource("frog.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void onMotherSound() {
        URL resource = this.getClass().getClassLoader().getResource("mother.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void onFatherSound() {
        URL resource = this.getClass().getClassLoader().getResource("father.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void onSisterSound() {
        URL resource = this.getClass().getClassLoader().getResource("sister.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void onBrotherSound() {
        URL resource = this.getClass().getClassLoader().getResource("brother.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void onGrandmotherSound() {
        URL resource = this.getClass().getClassLoader().getResource("grandmother.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void onGrandfatherSound() {
        URL resource = this.getClass().getClassLoader().getResource("grandfather.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void onAuntSound() {
        URL resource = this.getClass().getClassLoader().getResource("aunt.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    public void onUncleSound() {
        URL resource = this.getClass().getClassLoader().getResource("uncle.mp3");

        if (resource == null) {
            return;
        }

        Media media = new Media(resource.toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }










}
