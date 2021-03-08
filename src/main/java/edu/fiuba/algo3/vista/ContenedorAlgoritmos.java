package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.bloque.ContenedorDeBloques;
import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.List;

public class ContenedorAlgoritmos extends VBox {
    private Stage stage;

    public ContenedorAlgoritmos(Stage stage, SectorAlgoritmo sectorAlgoritmo, ContenedorDeBloques contenedorActual) {
        super();
        this.stage = stage;

        //stage.setMaximized(true);
        //this.setPadding(new Insets(500,700,700,500));
        this.setPadding(new Insets (5,700,1000,5));
        this.setBackground(new Background(new BackgroundFill(Color.web("#c3beff"), CornerRadii.EMPTY, Insets.EMPTY)));

        Text titulo = new Text("ESPACIO DE TRABAJO\n");
        titulo.setFont(Font.font("Calibri", FontWeight.BOLD,20));
        titulo.setFill(Color.web("000000"));

        List<VBox> bloques = sectorAlgoritmo.vistasBloques(stage, contenedorActual);
        this.getChildren().addAll(titulo);
        this.getChildren().addAll(bloques);
    }

}
