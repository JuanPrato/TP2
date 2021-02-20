module edu.fiuba.algo3 {
    requires javafx.controls;
    exports edu.fiuba.algo3;
    opens edu.fiuba.algo3.modelo;
    opens edu.fiuba.algo3.modelo.lapiz;
    opens edu.fiuba.algo3.modelo.sector;
    opens edu.fiuba.algo3.modelo.bloque;
}