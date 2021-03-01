package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.controlador.BotonSalirEventHandler;
import edu.fiuba.algo3.modelo.Personaje;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.Tablero;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.stage.Stage;

public class ContenedorTablero extends VBox {
    private Stage stage;
    private SectorDibujo sectorDibujo;
    public ContenedorTablero(Stage stage, SectorDibujo sectorDibujo) {
        super(100);
        this.stage = stage;
        this.sectorDibujo = sectorDibujo;
        this.setAlignment(Pos.TOP_LEFT);
        this.setPadding(new Insets(100,100,100,100));
        this.setBackground(new Background(new BackgroundFill(Color.web("#00f"), CornerRadii.EMPTY, Insets.EMPTY)));
        this.setSpacing(5);
        Box b = new Box(10,10,10);
        setPosicionDelPersonaje(b, sectorDibujo.getPersonaje().getPosicion());
        b.setMaterial(new PhongMaterial(Color.RED));
        this.getChildren().addAll(b);
    }

    private void setPosicionDelPersonaje(Box b, Posicion posicion){
        b.setTranslateX(posicion.getPosicionX());
        b.setTranslateY(posicion.getPosicionY());
    }

}
