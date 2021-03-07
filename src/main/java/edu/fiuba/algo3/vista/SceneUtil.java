package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.bloque.ContenedorDeBloques;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneUtil {

    static public Scene getScene(Stage stage, ContenedorDeBloques sectorAlgoritmo, SectorDibujo sectorDibujo){
        return new Scene(new ContenedorVentana(stage, sectorAlgoritmo, sectorDibujo), 1920,1080);
    }

}
