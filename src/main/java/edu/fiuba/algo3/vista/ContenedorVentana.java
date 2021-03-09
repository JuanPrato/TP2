package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.bloque.ContenedorDeBloques;
import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ContenedorVentana extends HBox {
    private Stage stage;

    public ContenedorVentana(Stage stage, SectorAlgoritmo sectorAlgoritmo, SectorDibujo sectorDibujo, ContenedorDeBloques contenedorActual) {
        super();
        this.stage = stage;
        this.setBackground(new Background(new BackgroundFill(Color.web("F7F5E6"), CornerRadii.EMPTY, Insets.EMPTY)));


        VBox contenedorDibujo = new ContenedorDibujo(stage, sectorDibujo, sectorAlgoritmo);

        VBox contenedorBloques = new ContenedorBloques(stage, sectorDibujo, contenedorActual);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setFitToWidth(false);
        scrollPane.setContent(new ContenedorAlgoritmos(stage, sectorAlgoritmo, contenedorActual));

        this.getChildren().addAll(contenedorDibujo, contenedorBloques, scrollPane);
    }

}
