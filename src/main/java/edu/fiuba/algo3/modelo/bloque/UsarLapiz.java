package edu.fiuba.algo3.modelo.bloque;

import edu.fiuba.algo3.modelo.sector.SectorDibujo;

public abstract class UsarLapiz {

    private static LevantarLapiz levantarLapiz;
    private static BajarLapiz bajarLapiz;

    static{
        levantarLapiz = new LevantarLapiz();
        bajarLapiz = new BajarLapiz();

        bajarLapiz.setInversa(levantarLapiz);
        levantarLapiz.setInversa(bajarLapiz);
    }

    private UsarLapiz inversa;

    UsarLapiz(){
    }

    abstract void usar(SectorDibujo sectorDibujo);

    protected void setInversa(UsarLapiz inversa){
        this.inversa = inversa;
    }

    public UsarLapiz inversa(){
        return this.inversa;
    }

}
