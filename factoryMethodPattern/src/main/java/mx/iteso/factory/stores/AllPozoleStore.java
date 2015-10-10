package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;

/**
 * Created by Daniel on 08/10/2015.
 */
public class AllPozoleStore extends PozoleStore {
    String broth;

    public AllPozoleStore(String type){
        this.broth = type;
    }

    @Override
    protected Pozole createPozole(String meat) {
        if(broth.equals("blanco")){
            if (meat.equals("pollo"))
                return new PozoleBlancoPollo();
            else if (meat.equals("cachete") )
                return new PozoleBlancoCachete();
            else if (meat.equals("oreja"))
                return new PozoleBlancoOreja();
            else if (meat.equals("pierna") )
                return new PozoleBlancoPierna();
            else if (meat.equals("trompa"))
                return new PozoleBlancoTrompa();
            else if (meat.equals("lomo"))
                return new PozoleBlancoLomo();
            else if (meat.equals("espinazo"))
                return new PozoleBlancoEspinazo();
            else return null;

        }else if(broth.equals("verde")){
            if (meat.equals("pollo"))
                return new PozoleVerdePollo();
            else if (meat.equals("cachete") )
                return new PozoleVerdeCachete();
            else if (meat.equals("oreja"))
                return new PozoleVerdeOreja();
            else if (meat.equals("pierna") )
                return new PozoleVerdePierna();
            else if (meat.equals("trompa"))
                return new PozoleVerdeTrompa();
            else if (meat.equals("lomo"))
                return new PozoleVerdeLomo();
            else if (meat.equals("espinazo"))
                return new PozoleVerdeEspinazo();
            else return null;

        }else if(broth.equals("rojo")){
            if (meat.equals("pollo"))
                return new PozoleRojoPollo();
            else if (meat.equals("cachete") )
                return new PozoleRojoCachete();
            else if (meat.equals("oreja"))
                return new PozoleRojoOreja();
            else if (meat.equals("pierna") )
                return new PozoleRojoPierna();
            else if (meat.equals("trompa"))
                return new PozoleRojoTrompa();
            else if (meat.equals("lomo"))
                return new PozoleRojoLomo();
            else if (meat.equals("espinazo"))
                return new PozoleRojoEspinazo();
            else return null;

        }
        else if(broth.equals("menudo")){
            return new Menudo();

        }
        else if(broth.equals("pozolillo")){
            return new Pozolillo();

        }
        else{
            return null;
        }
    }
}
