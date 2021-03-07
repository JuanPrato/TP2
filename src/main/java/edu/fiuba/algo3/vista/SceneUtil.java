package edu.fiuba.algo3.vista;

import edu.fiuba.algo3.modelo.bloque.ContenedorDeBloques;
import edu.fiuba.algo3.modelo.sector.SectorAlgoritmo;
import edu.fiuba.algo3.modelo.sector.SectorDibujo;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneUtil {

    static public Scene getScene(Stage stage, SectorAlgoritmo sectorAlgoritmo, SectorDibujo sectorDibujo,  ContenedorDeBloques contenedorBloques){
        return new Scene(new ContenedorVentana(stage, sectorAlgoritmo, sectorDibujo, contenedorBloques), 1920,1080);
    }

}
