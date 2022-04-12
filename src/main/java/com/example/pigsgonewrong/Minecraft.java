package com.example.pigsgonewrong;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.Map;

public class Minecraft extends Pieces implements Runnable {

    //Attributs
    private ArrayList<javafx.scene.Node> crafting;
    private GridPane craftingTable;
    private Map inventory;
    private final double constanteResis = 40;
    private boolean piecesCollees;
    private Thread thread;
    private NextGen nextGen;

    public Minecraft() {
        super();

    }

    //Méthodes
    public void coller() {
        craftingTable = new GridPane();
        crafting = new ArrayList();
        crafting.addAll(craftingTable.getChildren());
        piecesCollees = true;
    }

    public void breakingBad() { //Destruction du véhicule
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        double comboBreaker = constanteResis * getResistance();
        if ((carambolage.getVitesseHorizontale() > comboBreaker) || (carambolage.getVitesseVerticale() > comboBreaker)) {
            piecesCollees = false;

        }
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