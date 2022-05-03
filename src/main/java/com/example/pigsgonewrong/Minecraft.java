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
    private ArrayList<javafx.scene.Node> crafting;
    private Menus menu = new Menus();
    private GridPane craftingTable;
    private final double constanteResis = 40;
    private boolean piecesCollees;
    private Group stickyPiston = new Group();

    public Minecraft() {
        super();
    }

    //Méthodes
    public void coller() {

        crafting.addAll(menu.getGridPaneObjet().getChildren());
        Node node1 = null;
        Node node2 = null;

        //Java est cave!! (Initialisation obligatoire des Integer, sinon Java est pas content) :(
        Integer colIndex1 = null;
        Integer rowIndex1 = null;
        Integer colIndex2 = null;
        Integer rowIndex2 = null;
        for (int i = 0; i < menu.getGridPaneObjet().getChildren().size(); i++) {
            if (i % 2 == 0) { //Vérification de la node1
                node1 = menu.getGridPaneObjet().getChildren().get(i);
                colIndex1 = GridPane.getColumnIndex(menu.getGridPaneObjet().getChildren().get(i));
                rowIndex1 = GridPane.getRowIndex(menu.getGridPaneObjet().getChildren().get(i));
            } else if (node1 == null) {
                node1 = menu.getGridPaneObjet().getChildren().get(i);
            }
            if (i % 2 != 0) { //Vérification de la node2
                node2 = menu.getGridPaneObjet().getChildren().get(i);
                colIndex2 = GridPane.getColumnIndex(menu.getGridPaneObjet().getChildren().get(i));
                rowIndex2 = GridPane.getRowIndex(menu.getGridPaneObjet().getChildren().get(i));
            }
            if (node1 != null && node2 != null) { //Vérification si une à côté de l'autre ou une au-dessus de l'autre
                if (colIndex2.equals(colIndex1 + 1) && rowIndex2.equals(rowIndex1)) {
                    stickyPiston.getChildren().addAll(node1, node2);
                } else if (rowIndex2.equals(rowIndex1 + 1) & colIndex2.equals(colIndex1)) {
                    stickyPiston.getChildren().addAll(node1, node2);
                }
            }
        }
        setPiecesCollees(true); //Ready to go!
    }

    public void pokeBall(Pieces piece1, Pieces piece2) { //Fonctionne plus ou moins comme une Pokeball (un conteneur contient un contenu)
        if ((piece1.isConteneur() && piece2.isContenu()) || (piece1.isContenu() && piece2.isConteneur())) {
            stickyPiston.getChildren().addAll(piece1, piece2);

            System.err.println("COLLEES");
        }
        /*else if (Objects.equals(piece1.getImage(), new ImageView("file:Nothing.png")) || Objects.equals(piece2.getImage(), new ImageView("file:Nothing.png"))) {
        }*/
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
}