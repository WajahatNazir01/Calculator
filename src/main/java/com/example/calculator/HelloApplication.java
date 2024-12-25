package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Label firstnumber = new Label("First Number:");
        stylelabel(firstnumber);
        TextField textField = new TextField();
        styletextfields(textField);
        HBox hbox = new HBox(20,firstnumber, textField);
        hbox.setAlignment(Pos.CENTER);

        Label secondnumber = new Label("Second Number:");
        stylelabel(secondnumber);
        TextField textField2 = new TextField();
        styletextfields(textField2);
        HBox hbox2 = new HBox(20,secondnumber, textField2);
        hbox2.setAlignment(Pos.CENTER);

        Button plus = new Button("+");
        Button minus = new Button("-");
        Button multiply = new Button("*");
        Button divide = new Button("/");
        stylebutton(plus);
        stylebutton(minus);
        stylebutton(multiply);
        stylebutton(divide);

        HBox buttons = new HBox(10,plus,minus,multiply,divide);
        buttons.setAlignment(Pos.CENTER);
        buttons.setSpacing(10);


        Label label = new Label("Result:");
        TextField textField3 = new TextField();
        HBox hbox3 = new HBox(20,label,textField3);
        hbox3.setAlignment(Pos.CENTER);

        Button clear = new Button("Clear");
        clear.setOnAction(e->{
            textField3.clear();
            textField2.clear();
            textField.clear();
        });
        stylebutton(clear);

        VBox full = new VBox(10,hbox,hbox2,buttons,hbox3,clear);
        full.setAlignment(Pos.CENTER);

        plus.setOnAction(e->{
            int number1 = Integer.parseInt(textField.getText());
            int number2 = Integer.parseInt(textField2.getText());
            int result = number1+number2;
            textField3.setText(String.valueOf(result));
        });

        minus.setOnAction(e->{
            int number1 = Integer.parseInt(textField.getText());
            int number2 = Integer.parseInt(textField2.getText());
            int result = number1-number2;
            textField3.setText(String.valueOf(result));

        });
        multiply.setOnAction(e->{
            int number1 = Integer.parseInt(textField.getText());
            int number2 = Integer.parseInt(textField2.getText());
            int result = number1*number2;
            textField3.setText(String.valueOf(result));

        });
        divide.setOnAction(e->{
            int number1 = Integer.parseInt(textField.getText());
            int number2 = Integer.parseInt(textField2.getText());
            int result = number1/number2;
            textField3.setText(String.valueOf(result));

        });

        Scene scene = new Scene(full,620,440);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();

    }
    public void stylebutton(Button button){
        button.setStyle("-fx-font-size: 20px; -fx-text-fill: WHITE; -fx-background-color: #3d3a9f");

    }
    public void stylelabel(Label label){
        label.setStyle("-fx-background-color: #3d3a9f; -fx-text-fill: WHITE; -fx-font-size: 20px;");
    }

    public void styletextfields(TextField field){
        field.setStyle("-fx-background-color: #3d3a9f; -fx-text-fill: WHITE; -fx-font-size: 20px;");
    }
    public static void main(String[] args) {
        launch();
    }
}