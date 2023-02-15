package com.example.angol;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class TestController{

    @FXML
    Label punkty;
    @FXML
    Label punkty2;
    @FXML
    Label answerD;
    @FXML
    Label answerD2;
    @FXML
    Label answerZ;
    @FXML
    Label answerZ2;
    @FXML
    public Button nextQ;
    @FXML
    Button btnNxt;
    @FXML
    GridPane grid1;
    @FXML
    GridPane grid2;
    @FXML
    public Button nextQ2;
    @FXML
    Button btnNxt2;
    @FXML
    public Button nextQ3;
    @FXML
    Button btnNxt3;
    @FXML
    GridPane grid3;
    @FXML
    Label answerZ3;
    @FXML
    Label answerD3;
    @FXML
    Label punkty3;
    @FXML
    public Button nextQ4;
    @FXML
    Button btnNxt4;
    @FXML
    GridPane grid4;
    @FXML
    Label answerZ4;
    @FXML
    Label answerD4;
    @FXML
    Label punkty4;
    @FXML
    public Button nextQ5;
    @FXML
    Button btnNxt5;
    @FXML
    GridPane grid5;
    @FXML
    Label answerZ5;
    @FXML
    Label answerD5;
    @FXML
    Label punkty5;
    @FXML
    public Button nextQ6;
    @FXML
    Button btnNxt6;
    @FXML
    GridPane grid6;
    @FXML
    Label answerZ6;
    @FXML
    Label answerD6;
    @FXML
    Label punkty6;
    @FXML
    public Button nextQ7;
    @FXML
    Button btnNxt7;
    @FXML
    GridPane grid7;
    @FXML
    Label answerZ7;
    @FXML
    Label answerD7;
    @FXML
    Label punkty7;
    @FXML
    public Button nextQ8;
    @FXML
    Button btnNxt8;
    @FXML
    GridPane grid8;
    @FXML
    Label answerZ8;
    @FXML
    Label answerD8;
    @FXML
    Label punkty8;
    @FXML
    Label wynik6;
    @FXML
    Label wynik3;
    @FXML
    Label wynik1;
    @FXML
    Label punktyA;
    @FXML
    public Button btnWynikZ;
    @FXML
    Button wynikZ;
    @FXML
    public Button btnMenu;
    @FXML
    Button menuBtn;




    public void nextQ() throws Exception {
        Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("test2-view.fxml"));
        Stage window = (Stage) this.btnNxt.getScene().getWindow();
        window.setScene(new Scene(root, 900.0D, 700.0D));
    }
    public void nextQ2() throws Exception {
        Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("test3-view.fxml"));
        Stage window = (Stage) this.btnNxt2.getScene().getWindow();
        window.setScene(new Scene(root, 900.0D, 700.0D));
    }
    public void nextQ3() throws Exception {
        Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("test4-view.fxml"));
        Stage window = (Stage) this.btnNxt3.getScene().getWindow();
        window.setScene(new Scene(root, 900.0D, 700.0D));
    }
    public void nextQ4() throws Exception {
        Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("test5-view.fxml"));
        Stage window = (Stage) this.btnNxt4.getScene().getWindow();
        window.setScene(new Scene(root, 900.0D, 700.0D));
    }
    public void nextQ5() throws Exception {
        Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("test6-view.fxml"));
        Stage window = (Stage) this.btnNxt5.getScene().getWindow();
        window.setScene(new Scene(root, 900.0D, 700.0D));
    }
    public void nextQ6() throws Exception {
        Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("test7-view.fxml"));
        Stage window = (Stage) this.btnNxt6.getScene().getWindow();
        window.setScene(new Scene(root, 900.0D, 700.0D));
    }
    public void nextQ7() throws Exception {
        Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("test8-view.fxml"));
        Stage window = (Stage) this.btnNxt7.getScene().getWindow();
        window.setScene(new Scene(root, 900.0D, 700.0D));
    }
    public void nextQ8() throws Exception {
        Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("results-view.fxml"));
        Stage window = (Stage) this.btnNxt8.getScene().getWindow();
        window.setScene(new Scene(root, 900.0D, 700.0D));
    }
    public void btnMenu() throws Exception {
        Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("second-view.fxml"));
        Stage window = (Stage) this.menuBtn.getScene().getWindow();
        window.setScene(new Scene(root, 900.0D, 700.0D));
    }


    //1 PYTANIE
    public void dobra11 (ActionEvent event)
    {
        answerD.setText("DOBRA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(1);
        punkty.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle = String.format("-fx-text-fill: black;-fx-background-color: green;");
        source.setStyle(bstyle);
        grid1.setDisable(true);
    }


    public void zla12 (ActionEvent event)
    {
        answerZ.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid1.setDisable(true);

    }

    public void zla13 (ActionEvent event)
    {
        answerZ.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid1.setDisable(true);
    }

    public void zla14 (ActionEvent event)
    {
        answerZ.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid1.setDisable(true);
    }

    //2 PYTANIE
    public void dobra2 (ActionEvent event)
    {
        answerD2.setText("DOBRA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(1);
        punkty2.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle = String.format("-fx-text-fill: black;-fx-background-color: green;");
        source.setStyle(bstyle);
        grid2.setDisable(true);
    }


    public void zla21 (ActionEvent event)
    {
        answerZ2.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty2.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid2.setDisable(true);

    }

    public void zla22 (ActionEvent event)
    {
        answerZ2.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty2.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid2.setDisable(true);
    }

    public void zla23 (ActionEvent event)
    {
        answerZ2.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty2.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid2.setDisable(true);
    }

    //3 PYTANIE
    public void dobra3 (ActionEvent event)
    {
        answerD3.setText("DOBRA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(1);
        punkty3.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle = String.format("-fx-text-fill: black;-fx-background-color: green;");
        source.setStyle(bstyle);
        grid3.setDisable(true);
    }


    public void zla31 (ActionEvent event)
    {
        answerZ3.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty3.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid3.setDisable(true);

    }

    public void zla33 (ActionEvent event)
    {
        answerZ3.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty3.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid3.setDisable(true);
    }

    public void zla34 (ActionEvent event)
    {
        answerZ3.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty3.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid3.setDisable(true);
    }

    //4 PYTANIE
    public void dobra4 (ActionEvent event)
    {
        answerD4.setText("DOBRA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(1);
        punkty4.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle = String.format("-fx-text-fill: black;-fx-background-color: green;");
        source.setStyle(bstyle);
        grid4.setDisable(true);
    }


    public void zla41 (ActionEvent event)
    {
        answerZ4.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty4.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid4.setDisable(true);

    }

    public void zla43 (ActionEvent event)
    {
        answerZ4.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty4.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid4.setDisable(true);
    }

    public void zla44 (ActionEvent event)
    {
        answerZ4.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty4.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid4.setDisable(true);
    }

    //5 PYTANIE
    public void dobra5 (ActionEvent event)
    {
        answerD5.setText("DOBRA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(1);
        punkty5.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle = String.format("-fx-text-fill: black;-fx-background-color: green;");
        source.setStyle(bstyle);
        grid5.setDisable(true);
    }


    public void zla52 (ActionEvent event)
    {
        answerZ5.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty5.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid5.setDisable(true);

    }

    public void zla53 (ActionEvent event)
    {
        answerZ5.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty5.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid5.setDisable(true);
    }

    public void zla54 (ActionEvent event)
    {
        answerZ5.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty5.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid5.setDisable(true);
    }

    //6 PYTANIE
    public void dobra6 (ActionEvent event)
    {
        answerD6.setText("DOBRA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(1);
        punkty6.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle = String.format("-fx-text-fill: black;-fx-background-color: green;");
        source.setStyle(bstyle);
        grid6.setDisable(true);
    }


    public void zla61 (ActionEvent event)
    {
        answerZ6.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty6.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid6.setDisable(true);

    }

    public void zla62 (ActionEvent event)
    {
        answerZ6.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty6.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid6.setDisable(true);
    }

    public void zla64 (ActionEvent event)
    {
        answerZ6.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty6.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid6.setDisable(true);
    }

    //7 PYTANIE
    public void dobra7 (ActionEvent event)
    {
        answerD7.setText("DOBRA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(1);
        punkty7.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle = String.format("-fx-text-fill: black;-fx-background-color: green;");
        source.setStyle(bstyle);
        grid7.setDisable(true);
    }


    public void zla71 (ActionEvent event)
    {
        answerZ7.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty7.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid7.setDisable(true);

    }

    public void zla73 (ActionEvent event)
    {
        answerZ7.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty7.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid7.setDisable(true);
    }

    public void zla74 (ActionEvent event)
    {
        answerZ7.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty7.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid7.setDisable(true);
    }

    //8 PYTANIE
    public void dobra8 (ActionEvent event)
    {
        answerD8.setText("DOBRA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(1);
        punkty8.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle = String.format("-fx-text-fill: black;-fx-background-color: green;");
        source.setStyle(bstyle);
        grid8.setDisable(true);
    }


    public void zla81 (ActionEvent event)
    {
        answerZ8.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty8.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid8.setDisable(true);

    }

    public void zla82 (ActionEvent event)
    {
        answerZ8.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty8.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid8.setDisable(true);
    }

    public void zla83 (ActionEvent event)
    {
        answerZ8.setText("ZŁA ODPOWIEDŹ !!!");
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punkty8.setText(instance.getPointsCount() + "/" + instance.getMaxPointsCount());
        Button source = (Button) event.getSource();
        source.setDisable(true);
        String bstyle=String.format("-fx-text-fill: black;-fx-background-color: red;");
        source.setStyle(bstyle);
        grid8.setDisable(true);
    }

    public void btnWynikZ (ActionEvent event)
    {
        Counter instance = Counter.getInstance();
        instance.addPoints(0);
        punktyA.setText(instance.getPointsCount() + " / " + instance.getMaxPointsCount());

        if(instance.getPointsCount() >= 0)
        {
            if(instance.getPointsCount() > 3)
            {
                if(instance.getPointsCount() > 6)
                {
                    wynik6.setText("GRATULACJE !!!");
                }else
                wynik3.setText("OK, poćwicz jeszcze.");
            }else
            wynik1.setText("Wracaj do nauki!");
        }
    }

}