package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.bloque.BloqueAcoplado;
import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.List;

public class ContenedorAlgoritmos extends VBox {
    private Stage stage;

    public ContenedorAlgoritmos(Stage stage, BloqueAcoplado sectorAlgoritmo) {
        super();
        this.stage = stage;
        this.setAlignment(Pos.BOTTOM_RIGHT);
        this.setPadding(new Insets(400,400,400,400));
        this.setBackground(new Background(new BackgroundFill(Color.web("#a29bfe"), CornerRadii.EMPTY, Insets.EMPTY)));
        this.setSpacing(20);

        Text titulo = new Text("Espacio de trabajo");
        titulo.setFont(Font.font("Calibri", FontWeight.BOLD,20));
        titulo.setFill(Color.web("7665a0"));

        List<Button> bloques = sectorAlgoritmo.vistasBloques(stage);

        /*Button botonRemover = new BotonRemover("Remover", 140, 70, 160, 70, Color.web("7665a0"), Color.web("645880"));
        //botonRemover.setOnAction(new BotonRemoverEventHandler());
        botonRemover.setDefaultButton(true);
        botonRemover.setLayoutX(0);
        botonRemover.setLayoutY(0);*/

        this.getChildren().addAll(titulo); //saco botonRemover
        this.getChildren().addAll(bloques);
    }

}
