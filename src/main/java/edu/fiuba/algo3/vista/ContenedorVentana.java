package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Tablero;
import edu.fiuba.algo3.modelo.bloque.BloqueAcoplado;
import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class ContenedorVentana extends HBox {
    private Stage stage;

    public ContenedorVentana(Stage stage, BloqueAcoplado sectorAlgoritmo, SectorDibujo sectorDibujo) {
        super();
        this.stage = stage;
        stage.setMaximized(true);
        //this.setAlignment(Pos.BOTTOM_LEFT);
        //this.setHeight(200);
        //this.setPadding(new Insets(20,20,20,20));
        this.setBackground(new Background(new BackgroundFill(Color.web("F7F5E6"), CornerRadii.EMPTY, Insets.EMPTY)));
        this.setSpacing(20);

        VBox contenedorBloques = new ContenedorBloques(stage, sectorAlgoritmo, sectorDibujo);

        VBox contenedorDibujo = new ContenedorDibujo(stage, sectorDibujo, sectorAlgoritmo);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setFitToWidth(false);
        scrollPane.setContent(new ContenedorAlgoritmos(stage, sectorAlgoritmo));
        //VBox contenedorAlgoritmos = new ContenedorAlgoritmos(stage, sectorAlgoritmo);

        this.getChildren().addAll(contenedorDibujo, contenedorBloques, contenedorAlgoritmos);

    }

}
