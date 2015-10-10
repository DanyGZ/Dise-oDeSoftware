package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Daniel on 10/10/2015.
 */
public class PozoleVerdeStoreTest {
    Pozole pozole;
    Pozole pozole1;
    PozoleStore pozoleStore;

    @Before
    public void setUp(){
        pozoleStore = new PozoleVerdeStore();
    }

    @Test
    public void testWithCachete(){
        pozole = new PozoleVerdeCachete();
        pozole1 = pozoleStore.orderPozole("cachete");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithEspinazo(){
        pozole = new PozoleVerdeEspinazo();
        pozole1 = pozoleStore.orderPozole("espinazo");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithLomo(){
        pozole = new PozoleVerdeLomo();
        pozole1 = pozoleStore.orderPozole("lomo");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithOreja(){
        pozole = new PozoleVerdeOreja();
        pozole1 = pozoleStore.orderPozole("oreja");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPierna(){
        pozole = new PozoleVerdePierna();
        pozole1 = pozoleStore.orderPozole("pierna");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPollo(){
        pozole = new PozoleVerdePollo();
        pozole1 = pozoleStore.orderPozole("pollo");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithTrompa(){
        pozole = new PozoleVerdeTrompa();
        pozole1 = pozoleStore.orderPozole("trompa");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test(expected = NullPointerException.class)
    public void testWithException(){
        pozole = new PozoleVerdeTrompa();
        pozole1 = pozoleStore.orderPozole("");
        assertEquals(pozole.getName(), pozole1.getName());
    }
}
