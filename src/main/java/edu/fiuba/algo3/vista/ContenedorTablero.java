package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.Tablero;
import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ContenedorTablero extends HBox {
    private Stage stage;
    private Tablero tablero;

    public ContenedorTablero(Stage stage, SectorAlgoritmo sectorAlgoritmo) {
        super();
        this.stage = stage;
        this.setAlignment(Pos.BOTTOM_LEFT);
        this.setPadding(new Insets(20,20,20,20));
        this.setBackground(new Background(new BackgroundFill(Color.web("F7F5E6"), CornerRadii.EMPTY, Insets.EMPTY)));
        this.setSpacing(20);

        VBox contenedorBloques = new ContenedorBloques(stage, sectorAlgoritmo);

        VBox contenedorDibujo = new ContenedorDibujo(stage, sectorAlgoritmo.getSectorDibujo(), sectorAlgoritmo);

        VBox contenedorAlgoritmos = new ContenedorAlgoritmos(stage, sectorAlgoritmo);

        this.getChildren().addAll(contenedorDibujo, contenedorBloques, contenedorAlgoritmos);

    }

}
