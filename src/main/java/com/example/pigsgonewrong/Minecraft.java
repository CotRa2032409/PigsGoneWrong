package com.example.pigsgonewrong;

import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.Map;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.KeyCode;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Minecraft {

    //Attributs
    private ArrayList crafting;
    private GridPane craftingTable;
    private Map inventory;

    //Méthodes
    public void coller() {

    }

    //dies
    public void afficherGrille() {
        ImageView image0 = new ImageView("file:Case.jpg");
        image0.setPreserveRatio(true);

        ArrayList<ImageView> imageComplete = new ArrayList<>();

        imageComplete.add(image0);
        imageComplete.add(image0);
        imageComplete.add(image0);
        imageComplete.add(image0);
        imageComplete.add(image0);
        imageComplete.add(image0);
        imageComplete.add(image0);
        imageComplete.add(image0);
        imageComplete.add(image0);

        //Liste Image
        ArrayList<Image> images = new ArrayList<>();

        Image imageA = new Image("file:mario0.jpg");
        Image imageB = new Image("file:mario1.jpg");
        Image imageC = new Image("file:mario2.jpg");
        Image imageD = new Image("file:mario3.jpg");
        Image imageE = new Image("file:mario4.jpg");
        Image imageF = new Image("file:mario5.jpg");
        Image imageG = new Image("file:mario6.jpg");
        Image imageH = new Image("file:mario7.jpg");
        Image imageI = new Image("file:mario8.jpg");

        images.add(imageA);
        images.add(imageB);
        images.add(imageC);
        images.add(imageD);
        images.add(imageE);
        images.add(imageF);
        images.add(imageG);
        images.add(imageH);
        images.add(imageI);

        GridPane gridPane = new GridPane();
        gridPane.add(image0, 0, 0);
        gridPane.add(image0, 1, 0);
        gridPane.add(image0, 2, 0);
        gridPane.add(image0, 0, 1);
        gridPane.add(image0, 1, 1);
        gridPane.add(image0, 2, 1);
        gridPane.add(image0, 0, 2);
        gridPane.add(image0, 1, 2);
        gridPane.add(image0, 2, 2);

        //Drag and drop
        for (ImageView temp : imageComplete) {
            temp.setOnDragDetected((ae) -> {
                System.out.println("Drag");
                Dragboard dragboard = temp.startDragAndDrop(TransferMode.MOVE);
                ClipboardContent content = new ClipboardContent();
                content.putImage(temp.getImage());
                dragboard.setContent(content);
            });
            temp.setOnDragOver((ae) -> {
                ae.acceptTransferModes(TransferMode.MOVE);
            });
            temp.setOnDragDropped(ae -> {
                ImageView source = (ImageView) ae.getGestureSource();
                Image imageSource = source.getImage();
                source.setImage(temp.getImage());
                temp.setImage(imageSource);
                System.out.println("Drag and drop");
                ae.setDropCompleted(true);
                int verification = 0;
                for (int i = 0; i < imageComplete.size(); i++) {
                    /*if (imageComplete.get(i).getImage() == imageOriginales.get(i)) {
                        verification++;
                    }*/
                }
            });
        }
    }
}