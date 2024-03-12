package com.example.dobozok;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class HelloController {
    @FXML private Pane pnJatek;



    private Label[][] lt = new Label[10][15];

    public void initialize(){
        for(int s=0;s<10;s++) for(int o=0;o<15;o++){
            lt[s][o] = new Label();
            lt[s][o].setLayoutX(10+o*64);
            lt[s][o].setLayoutY(10+s*64);
            lt[s][o].setGraphic(new ImageView(new Image(getClass().getResourceAsStream("null.png"))));

            pnJatek.getChildren().add(lt[s][o]);
        }

    }

}