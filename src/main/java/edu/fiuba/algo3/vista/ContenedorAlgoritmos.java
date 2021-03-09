package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.bloque.ContenedorDeBloques;
import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import javafx.geometry.Insets;
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
        this.setPadding(new Insets (5,180,1000,5));
        this.setBackground(new Background(new BackgroundFill(Color.web("#c3beff"), CornerRadii.EMPTY, Insets.EMPTY)));

        Text titulo = new Text("ESPACIO DE TRABAJO\n");
        titulo.setFont(Font.font("Calibri", FontWeight.BOLD,20));
        titulo.setFill(Color.web("000000"));

        Text aclaracion = new Text("Para ingresar a un contenedor (X2, X3 o Invertir), simplemente hacer click en el una vez que este añadido.\n" +
                "Para salir, hacer click en el boton Salir del contenedor\n");
        titulo.setFont(Font.font("Calibri", FontWeight.BOLD,15));
        titulo.setFill(Color.web("000000"));

        List<VBox> bloques = sectorAlgoritmo.vistasBloques(stage, contenedorActual);
        this.getChildren().addAll(titulo,aclaracion);
        this.getChildren().addAll(bloques);
    }

}
