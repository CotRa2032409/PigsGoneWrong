package com.example.pigsgonewrong;

import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Menus {

    //Attributs
    private Scene menuPrincipal = null;
    private NextGen nextGen = new NextGen();
    private GridPane gridPaneObjet = new GridPane();
    private ArrayList<Pieces> arrayListObjet = new ArrayList<>();
    private Minecraft minecraft;

    //Méthodes
    public Scene mainMenu() {

        ImageView titre = new ImageView("file:Titre.png");
        Button bouton1 = new Button("");
        bouton1.setGraphic(new ImageView("file:Button1.png"));
        bouton1.setPadding(new Insets(-100, -100, -100, -100));
        bouton1.setOnAction((actionEvent) -> {
            Game.getStage().setScene(level1());
        });
        Button bouton2 = new Button("");
        bouton2.setGraphic(new ImageView("file:Button2.png"));
        bouton2.setPadding(new Insets(-100, -100, -100, -100));
        bouton2.setOnAction((actionEvent) -> {
            Game.getStage().setScene(level2());
        });
        Button bouton3 = new Button("");
        bouton3.setGraphic(new ImageView("file:Button3.png"));
        bouton3.setPadding(new Insets(-100, -100, -100, -100));
        bouton3.setOnAction((actionEvent) -> {
            Game.getStage().setScene(level3());
        });
        HBox hBoxBoutonsNiveaux = new HBox(bouton1, bouton2, bouton3);
        hBoxBoutonsNiveaux.setSpacing(400);
        hBoxBoutonsNiveaux.setAlignment(Pos.CENTER);
        VBox vBoxMenuPrincipal = new VBox(titre, hBoxBoutonsNiveaux);
        vBoxMenuPrincipal.setAlignment(Pos.CENTER);
        vBoxMenuPrincipal.setTranslateX(225);
        Group toutMenuPrincipal = new Group(backgroundMainMenu(), vBoxMenuPrincipal);
        menuPrincipal = new Scene(toutMenuPrincipal);
        return menuPrincipal;
    }

    public Scene level1() {
        Group groupeNiveau1 = new Group(new ImageView("file:Background1.png"), new ImageView("file:Level1.png"), nextGen.collision1(), gridPane(), goal(), retour(), play1());
        return new Scene(groupeNiveau1);
    }

    public Scene level2() {
        Group groupeNiveau2 = new Group(new ImageView("file:Background2.png"), new ImageView("file:Level2.png"), nextGen.collision2(), gridPane(), goal(), retour(), play2());
        return new Scene(groupeNiveau2);
    }

    public Scene level3() {
        Group groupeNiveau3 = new Group(new ImageView("file:Background3.png"), new ImageView("file:Level3.png"), nextGen.collision3(), gridPane(), goal(), retour(), play3());
        return new Scene(groupeNiveau3);
    }

    public Group gridPane() {
        BorderPane borderPane = new BorderPane();

        ImageView image0 = new ImageView("file:Case.png");
        image0.setOpacity(0.1);
        ImageView image1 = new ImageView("file:Case.png");
        image1.setOpacity(0.1);
        ImageView image2 = new ImageView("file:Case.png");
        image2.setOpacity(0.1);
        ImageView image3 = new ImageView("file:Case.png");
        image3.setOpacity(0.1);
        ImageView image4 = new ImageView("file:Case.png");
        image4.setOpacity(0.1);
        ImageView image5 = new ImageView("file:Case.png");
        image5.setOpacity(0.1);
        ImageView image6 = new ImageView("file:Case.png");
        image6.setOpacity(0.1);
        ImageView image7 = new ImageView("file:Case.png");
        image7.setOpacity(0.1);
        ImageView image8 = new ImageView("file:Case.png");
        image8.setOpacity(0.1);

        GridPane gridPaneArriere = new GridPane();

        gridPaneArriere.add(image0, 0, 0);
        gridPaneArriere.add(image1, 0, 1);
        gridPaneArriere.add(image2, 0, 2);
        gridPaneArriere.add(image3, 1, 0);
        gridPaneArriere.add(image4, 1, 1);
        gridPaneArriere.add(image5, 1, 2);
        gridPaneArriere.add(image6, 2, 0);
        gridPaneArriere.add(image7, 2, 1);
        gridPaneArriere.add(image8, 2, 2);
        gridPaneArriere.setAlignment(Pos.CENTER);

        ImageView imageInventaire1Arriere = new ImageView("file:InventaireCase.png");
        imageInventaire1Arriere.setOpacity(0.1);
        ImageView imageInventaire2Arriere = new ImageView("file:InventaireCase.png");
        imageInventaire2Arriere.setOpacity(0.1);
        ImageView imageInventaire3Arriere = new ImageView("file:InventaireCase.png");
        imageInventaire3Arriere.setOpacity(0.1);
        ImageView imageInventaire4Arriere = new ImageView("file:InventaireCase.png");
        imageInventaire4Arriere.setOpacity(0.1);
        ImageView imageInventaire5Arriere = new ImageView("file:InventaireCase.png");
        imageInventaire5Arriere.setOpacity(0.1);
        ImageView imageInventaire6Arriere = new ImageView("file:InventaireCase.png");
        imageInventaire6Arriere.setOpacity(0.1);
        ImageView imageInventaire7Arriere = new ImageView("file:InventaireCase.png");
        imageInventaire7Arriere.setOpacity(0.1);

        HBox hBoxArriere = new HBox(imageInventaire1Arriere, imageInventaire2Arriere, imageInventaire3Arriere, imageInventaire4Arriere, imageInventaire5Arriere, imageInventaire6Arriere, imageInventaire7Arriere);
        borderPane.setBottom(hBoxArriere);
        hBoxArriere.setSpacing(50);
        hBoxArriere.setAlignment(Pos.CENTER);

        //Objets

        Pieces image0Objet = new Pieces("file:Nothing.png");
        Pieces image1Objet = new Pieces("file:Nothing.png");
        Pieces image2Objet = new Pieces("file:Nothing.png");
        Pieces image3Objet = new Pieces("file:Nothing.png");
        Pieces image4Objet = new Pieces("file:Nothing.png");
        Pieces image5Objet = new Pieces("file:Nothing.png");
        Pieces image6Objet = new Pieces("file:Nothing.png");
        Pieces image7Objet = new Pieces("file:Nothing.png");
        Pieces image8Objet = new Pieces("file:Nothing.png");

        Pieces objetInventaire1 = new Pieces();
        objetInventaire1.boiteCarbone();
        Pieces objetInventaire2 = new Pieces();
        objetInventaire2.boiteBois();
        Pieces objetInventaire3 = new Pieces();
        objetInventaire3.boiteMetal();
        Pieces objetInventaire4 = new Pieces();
        objetInventaire4.cochon();
        Pieces objetInventaire5 = new Pieces();
        objetInventaire5.moteur();
        Pieces objetInventaire6 = new Pieces();
        objetInventaire6.roue();

        List<Pieces> inventoryItems = new ArrayList<>();
        inventoryItems.add(objetInventaire1);
        inventoryItems.add(objetInventaire2);
        inventoryItems.add(objetInventaire3);
        inventoryItems.add(objetInventaire4);
        inventoryItems.add(objetInventaire5);
        inventoryItems.add(objetInventaire6);

        gridPaneObjet.add(image0Objet, 0, 0);
        gridPaneObjet.add(image1Objet, 0, 1);
        gridPaneObjet.add(image2Objet, 0, 2);
        gridPaneObjet.add(image3Objet, 1, 0);
        gridPaneObjet.add(image4Objet, 1, 1);
        gridPaneObjet.add(image5Objet, 1, 2);
        gridPaneObjet.add(image6Objet, 2, 0);
        gridPaneObjet.add(image7Objet, 2, 1);
        gridPaneObjet.add(image8Objet, 2, 2);
        borderPane.setCenter(gridPaneObjet);
        gridPaneObjet.setAlignment(Pos.CENTER);
        gridPaneObjet.setTranslateX(75);


        arrayListObjet.add(image0Objet);
        arrayListObjet.add(image1Objet);
        arrayListObjet.add(image2Objet);
        arrayListObjet.add(image3Objet);
        arrayListObjet.add(image4Objet);
        arrayListObjet.add(image5Objet);
        arrayListObjet.add(image6Objet);
        arrayListObjet.add(image7Objet);
        arrayListObjet.add(image8Objet);
        arrayListObjet.add(objetInventaire1);
        arrayListObjet.add(objetInventaire2);
        arrayListObjet.add(objetInventaire3);
        arrayListObjet.add(objetInventaire4);
        arrayListObjet.add(objetInventaire5);
        arrayListObjet.add(objetInventaire6);

        HBox hBoxObjet = new HBox(objetInventaire1, objetInventaire2, objetInventaire3, objetInventaire4, objetInventaire5, objetInventaire6);
        borderPane.setBottom(hBoxObjet);
        hBoxObjet.setSpacing(50);
        hBoxObjet.setAlignment(Pos.CENTER);

        //Les 2 ensemble
        VBox vBoxArriere = new VBox(gridPaneArriere, hBoxArriere);
        vBoxArriere.setSpacing(100);
        vBoxArriere.setAlignment(Pos.CENTER);
        vBoxArriere.setTranslateX(540);

        VBox vBoxObjet = new VBox(gridPaneObjet, hBoxObjet);
        vBoxObjet.setSpacing(100);
        vBoxObjet.setAlignment(Pos.CENTER);
        vBoxObjet.setTranslateX(540);

        Group vBox = new Group(vBoxArriere, vBoxObjet);
        vBox.setTranslateX(-250);
        vBox.setTranslateY(100);
        minecraft = new Minecraft();
        //Drag and drop
        for (Pieces temp : arrayListObjet) {
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
                Pieces source = (Pieces) ae.getGestureSource();
                Pieces target = (Pieces) ae.getGestureTarget();

                switch (source.getImage().getUrl()) {
                    case "file:Cochon.png" -> source.cochon();
                    case "file:BoiteMetal.png" -> source.boiteMetal();
                    case "file:BoiteBois.png" -> source.boiteBois();
                    case "file:BoiteCarbone.png" -> source.boiteCarbone();
                    case "file:Roue.png" -> source.roue();
                    case "file:Moteur.png" -> source.moteur();
                }
                switch (target.getImage().getUrl()) {
                    case "file:Cochon.png" -> target.cochon();
                    case "file:BoiteMetal.png" -> target.boiteMetal();
                    case "file:BoiteBois.png" -> target.boiteBois();
                    case "file:BoiteCarbone.png" -> target.boiteCarbone();
                    case "file:Roue.png" -> target.roue();
                    case "file:Moteur.png" -> target.moteur();
                }
                System.err.println(target.getImage().getUrl());
                System.err.println(source.getImage().getUrl());
                Image imageSource = source.getImage();
                if (Objects.equals(temp.getImage(), target.getImage())) {
                    if (target.isConteneur())
                        temp.setImage(minecraft.pokeBall(target, source));
                    else
                        temp.setImage(imageSource);
                }
                System.out.println("Drag and drop Objet");
                ae.setDropCompleted(true);

            });
            temp.setOnScroll(ae -> {
                temp.setImage(new Image("file:Nothing.png"));
            });

        }

        return vBox;
    }

    public Button play() {
        Button play = new Button("");
        play.setGraphic(new ImageView("file:Play.png"));
        play.setPadding(new Insets(-100, -100, -100, -100));
        play.setTranslateX(1300);
        play.setTranslateY(200);
        play.setOnAction((event) -> {
            Game.getStage().setScene(level1Jouer());
        });
        return play;
    }

    public Button retour() {
        Button retour = new Button("");
        retour.setGraphic(new ImageView("file:Retour.png"));
        retour.setPadding(new Insets(-100, -100, -100, -100));
        retour.setTranslateX(75);
        retour.setTranslateY(50);
        retour.setOnAction((event) -> {
            Game.getStage().setScene(menuPrincipal);
        });
        return retour;
    }

    public Button retry() {
        Button retry = new Button("");
        retry.setGraphic(new ImageView("file:Retry.png"));
        retry.setPadding(new Insets(-100, -100, -100, -100));
        retry.setTranslateX(1100);
        retry.setTranslateY(200);
        retry.setOnAction((event) -> {

        });
        return retry;
    }

    public Group boutonsEtGoal() {
        ImageView goal = new ImageView("file:Goal.png");

        goal.setTranslateX(1400);
        goal.setTranslateY(610);
        goal.setScaleX(1.5);
        goal.setScaleY(1.5);

        TranslateTransition transGoal = new TranslateTransition(Duration.seconds(1), goal);
        transGoal.setByY(10);
        transGoal.setCycleCount(Timeline.INDEFINITE);
        transGoal.setAutoReverse(true);
        transGoal.play();

        return new Group(play(), retry(), goal);
    }

    public Group backgroundMainMenu() {

        ImageView arriere3 = new ImageView("file:Background3.png");
        arriere3.setScaleX(2);
        arriere3.setScaleY(2);
        ImageView arriere2 = new ImageView("file:Background2.png");
        arriere2.setScaleX(2);
        arriere2.setScaleY(2);
        ImageView arriere1 = new ImageView("file:Background1.png");
        arriere1.setScaleX(2);
        arriere1.setScaleY(2);

        return new Group(arriere1, arriere2, arriere3);
    }

    public void activePiece() {

    }

    public GridPane getGridPaneObjet() {
        return gridPaneObjet;
    }

    public void setGridPaneObjet(GridPane gridPaneObjet) {
        this.gridPaneObjet = gridPaneObjet;
    }

    public ArrayList<Pieces> getArrayListObjet() {
        return arrayListObjet;
    }

    public void setArrayListObjet(ArrayList<Pieces> arrayListObjet) {
        this.arrayListObjet = arrayListObjet;
    }

}

