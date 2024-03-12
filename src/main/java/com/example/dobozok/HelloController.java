package com.example.dobozok;

import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class HelloController {
    @FXML private Pane pnJatek;
    @FXML private Label zartdb;
    @FXML private Label nyitottdb;
    int ss,oo;


    private Label[][] lt = new Label[10][15];
    private AnimationTimer timer = null;
    private long tt=0;
    private int zart=0;
    private int nyitott=0;
    public void initialize(){
        for(int s=0;s<10;s++) for(int o=0;o<15;o++){
            int ss=s,oo=o;
            lt[s][o] = new Label();
            lt[s][o].setLayoutX(10+o*64);
            lt[s][o].setLayoutY(10+s*64);
            lt[s][o].setOnMouseEntered(e-> lt[ss][oo].setStyle("-fx-background-color:lightgreen;"));
            lt[s][o].setOnMouseExited(e-> lt[ss][oo].setStyle("-fx-background-color:white;"));
            lt[s][o].setOnMousePressed(e-> katt(ss,oo));
            lt[s][o].setGraphic(new ImageView(new Image(getClass().getResourceAsStream("null.png"))));
            timer = new AnimationTimer() {
                @Override
                public void handle(long now) {
                    //timer=now+"500_000_000";
                    //if(now==timer) mozgat();
                }
            };
            pnJatek.getChildren().add(lt[s][o]);
        }

    }

    @FXML private void onRandomClick(){
        for(int s=0;s<10;s++) for(int o=0;o<15;o++){
            int rand = (int)(Math.random()*10+1);

        }
    }
    private void katt(int s,int o){

    }

}