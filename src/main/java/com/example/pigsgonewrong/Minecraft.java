package com.example.pigsgonewrong;

import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;
import java.util.Objects;

public class Minecraft extends Pieces implements Runnable { //Gère la zone de construction du véhicule

    //Attributs
    private ArrayList<javafx.scene.Node> crafting = new ArrayList<>();
    private Menus menu;
    private GridPane craftingTable;
    private final double constanteResis = 40;
    private boolean piecesCollees;
    private Group stickyPiston;
    private Pieces everything;

    public Minecraft() {
        super();
        everything = new Pieces();
        stickyPiston = new Group();
        menu = new Menus();
    }

    //Méthodes
    public Group coller() {
        for (int i = 0; i < menu.getArrayListObjet().size(); i++) {

            if (!Objects.equals(menu.getArrayListObjet().get(i - 1).getImage().getUrl(), "file:Nothing.png")) {
                stickyPiston.getChildren().addAll(menu.getArrayListObjet().get(i - 1), menu.getArrayListObjet().get(i));
            }

            if (!Objects.equals(menu.getArrayListObjet().get(i + 1).getImage().getUrl(), "file:Nothing.png")) {
                stickyPiston.getChildren().add(menu.getArrayListObjet().get(i + 1));
            }
            if (!Objects.equals(menu.getArrayListObjet().get(i + 3).getImage().getUrl(), "file:Nothing.png")) {
                stickyPiston.getChildren().add(menu.getArrayListObjet().get(i + 3));
            }
        }

        for (int i = 0; i < stickyPiston.getChildren().size(); i++) {
            System.err.println(stickyPiston.getChildren().get(i).getId());
        }
        /*
        Node node1 = null;
        Node node2 = null;

        //Java est cave!! (Initialisation obligatoire des Integer, sinon Java est pas content) :(
        Integer colIndex1 = null;
        Integer rowIndex1 = null;
        Integer colIndex2 = null;
        Integer rowIndex2 = null;
        for (int i = 0; i < menu.getGridPaneObjet().getChildren().size(); i++) {
            if (i % 2 == 0) { //Verification de la node1
                node1 = menu.getGridPaneObjet().getChildren().get(i);
                colIndex1 = GridPane.getColumnIndex(menu.getGridPaneObjet().getChildren().get(i));
                rowIndex1 = GridPane.getRowIndex(menu.getGridPaneObjet().getChildren().get(i));
            } else if (node1 == null) {
                node1 = menu.getGridPaneObjet().getChildren().get(i);
            }
            if (i % 2 != 0) { //Verification de la node2
                node2 = menu.getGridPaneObjet().getChildren().get(i);
                colIndex2 = GridPane.getColumnIndex(menu.getGridPaneObjet().getChildren().get(i));
                rowIndex2 = GridPane.getRowIndex(menu.getGridPaneObjet().getChildren().get(i));
            }
            if (node1 != null && node2 != null) { //Verification si une a cote de l'autre ou une au-dessus de l'autre
                if (colIndex2.equals(colIndex1 + 1) && rowIndex2.equals(rowIndex1)) {
                    stickyPiston.getChildren().addAll(node1, node2);
                } else if (rowIndex2.equals(rowIndex1 + 1) & colIndex2.equals(colIndex1)) {
                    stickyPiston.getChildren().addAll(node1, node2);
                }
            }
        }*/
        setPiecesCollees(true); //Ready to go!
        return stickyPiston;
    }

    public Image pokeBall(Pieces piece1, Pieces piece2) { //Fonctionne plus ou moins comme une Poke ball (un conteneur contient un contenu)
        if (piece1.isConteneur() && piece2.isContenu()) {
            System.err.println(piece1.getImage().getUrl());
            if (Objects.equals(piece1.getImage().getUrl(), "file:BoiteBois.png")) {
                if (Objects.equals(piece2.getImage().getUrl(), "file:Cochon.png"))
                    return new Image("file:PigBoiteBois.png");
                if (Objects.equals(piece2.getImage().getUrl(), "file:Moteur.png"))
                    return new Image("file:MoteurBoiteBois.png");
            }
            if (Objects.equals(piece1.getImage().getUrl(), "file:BoiteMetal.png")) {
                if (Objects.equals(piece2.getImage().getUrl(), "file:Cochon.png"))
                    return new Image("file:PigBoiteMetal.png");
                if (Objects.equals(piece2.getImage().getUrl(), "file:Moteur.png"))
                    return new Image("file:MoteurBoiteMetal.png");
            }
            if (Objects.equals(piece1.getImage().getUrl(), "file:BoiteCarbone.png")) {
                if (Objects.equals(piece2.getImage().getUrl(), "file:Cochon.png"))
                    return new Image("file:PigBoiteCarbone.png");
                if (Objects.equals(piece2.getImage().getUrl(), "file:Moteur.png"))
                    return new Image("file:MoteurBoiteCarbone.png");
            }
        }
        return null;
    }

    public void breakingBad() { //Destruction du véhicule
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        double comboBreaker = constanteResis * getResistance();
        if ((carambolage.getVitesseHorizontale() > comboBreaker) || (carambolage.getVitesseVerticale() > comboBreaker)) {
            setPiecesCollees(false); //dies
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
            temp.setOnDragOver((ae) -> ae.acceptTransferModes(TransferMode.MOVE));
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

    public Group getStickyPiston() {
        return stickyPiston;
    }

    public void setStickyPiston(Group stickyPiston) {
        this.stickyPiston = stickyPiston;
    }

    public ArrayList<Node> getCrafting() {
        return crafting;
    }

    public void setCrafting(ArrayList<Node> crafting) {
        this.crafting = crafting;
    }

    public GridPane getCraftingTable() {
        return craftingTable;
    }

    public void setCraftingTable(GridPane craftingTable) {
        this.craftingTable = craftingTable;
    }

    public boolean isPiecesCollees() {
        return piecesCollees;
    }

    public void setPiecesCollees(boolean piecesCollees) {
        this.piecesCollees = piecesCollees;
    }

    public Pieces getEverything() {
        return everything;
    }

    public void setEverything(Pieces everything) {
        this.everything = everything;
    }
}