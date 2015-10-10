package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Daniel on 10/10/2015.
 */
public class AllPozoleStoreTest {
    Pozole pozole;
    PozoleStore pozoleStore;
    Pozole pozole1;

    @Before
    public void setUp(){
        pozole = mock((Pozole.class));
    }

    @Test
    public void testWithMenudo(){
        pozoleStore = new AllPozoleStore("menudo");
        pozole1 = pozoleStore.orderPozole("");
        when(pozole.getName()).thenReturn("Menudo");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozolillo(){
        pozoleStore = new AllPozoleStore("pozolillo");
        pozole1 = pozoleStore.orderPozole("");
        when(pozole.getName()).thenReturn("Pozolillo con Pollo, Espinazo y Lomo");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test(expected = NullPointerException.class)
    public void testWithPozoleStoreException(){
        pozoleStore = new AllPozoleStore("");
        pozole1 = pozoleStore.orderPozole("");
        when(pozole.getName()).thenReturn("Pozole rojo con Cachete");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test(expected = NullPointerException.class)
    public void testWithPozoleBlancoException(){
        pozoleStore = new AllPozoleStore("blanco");
        pozole1 = pozoleStore.orderPozole("");
        when(pozole.getName()).thenReturn("Pozole Blanco con Cachete");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozoleBlancoCachete(){
        pozoleStore = new AllPozoleStore("blanco");
        pozole1 = pozoleStore.orderPozole("cachete");
        when(pozole.getName()).thenReturn("Pozole Blanco con Cachete");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozoleBlancoEspinazo(){
        pozoleStore = new AllPozoleStore("blanco");
        pozole1 = pozoleStore.orderPozole("espinazo");
        when(pozole.getName()).thenReturn("Pozole Blanco con Espinazo");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozoleBlancoLomo(){
        pozoleStore = new AllPozoleStore("blanco");
        pozole1 = pozoleStore.orderPozole("lomo");
        when(pozole.getName()).thenReturn("Pozole Blanco con Lomo");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozoleBlancoOreja(){
        pozoleStore = new AllPozoleStore("blanco");
        pozole1 = pozoleStore.orderPozole("oreja");
        when(pozole.getName()).thenReturn("Pozole Blanco con Oreja");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozoleBlancoPierna(){
        pozoleStore = new AllPozoleStore("blanco");
        pozole1 = pozoleStore.orderPozole("pierna");
        when(pozole.getName()).thenReturn("Pozole Blanco con Pierna");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozoleBlancoPollo(){
        pozoleStore = new AllPozoleStore("blanco");
        pozole1 = pozoleStore.orderPozole("pollo");
        when(pozole.getName()).thenReturn("Pozole Blanco con Pollo");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozoleBlancoTrompa(){
        pozoleStore = new AllPozoleStore("blanco");
        pozole1 = pozoleStore.orderPozole("trompa");
        when(pozole.getName()).thenReturn("Pozole Blanco con Trompa");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test(expected = NullPointerException.class)
    public void testWithPozoleRojoException(){
        pozoleStore = new AllPozoleStore("rojo");
        pozole1 = pozoleStore.orderPozole("");
        when(pozole.getName()).thenReturn("Pozole rojo con Cachete");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozoleRojoCachete(){
        pozoleStore = new AllPozoleStore("rojo");
        pozole1 = pozoleStore.orderPozole("cachete");
        when(pozole.getName()).thenReturn("Pozole Rojo con Cachete");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozoleRojoEspinazo(){
        pozoleStore = new AllPozoleStore("rojo");
        pozole1 = pozoleStore.orderPozole("espinazo");
        when(pozole.getName()).thenReturn("Pozole Rojo con Espinazo");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozoleRojoLomo(){
        pozoleStore = new AllPozoleStore("rojo");
        pozole1 = pozoleStore.orderPozole("lomo");
        when(pozole.getName()).thenReturn("Pozole Rojo con Lomo");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozoleRojoOreja(){
        pozoleStore = new AllPozoleStore("rojo");
        pozole1 = pozoleStore.orderPozole("oreja");
        when(pozole.getName()).thenReturn("Pozole Rojo con Oreja");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozoleRojoPierna(){
        pozoleStore = new AllPozoleStore("rojo");
        pozole1 = pozoleStore.orderPozole("pierna");
        when(pozole.getName()).thenReturn("Pozole Rojo con Pierna");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozoleRojoPollo(){
        pozoleStore = new AllPozoleStore("rojo");
        pozole1 = pozoleStore.orderPozole("pollo");
        when(pozole.getName()).thenReturn("Pozole Rojo con Pollo");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozoleRojoTrompa(){
        pozoleStore = new AllPozoleStore("rojo");
        pozole1 = pozoleStore.orderPozole("trompa");
        when(pozole.getName()).thenReturn("Pozole Rojo con Trompa");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test(expected = NullPointerException.class)
    public void testWithPozoleVerdeException(){
        pozoleStore = new AllPozoleStore("verde");
        pozole1 = pozoleStore.orderPozole("");
        when(pozole.getName()).thenReturn("Pozole verde con Cachete");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozoleVerdeCachete(){
        pozoleStore = new AllPozoleStore("verde");
        pozole1 = pozoleStore.orderPozole("cachete");
        when(pozole.getName()).thenReturn("Pozole Verde con Cachete");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozoleVerdeEspinazo(){
        pozoleStore = new AllPozoleStore("verde");
        pozole1 = pozoleStore.orderPozole("espinazo");
        when(pozole.getName()).thenReturn("Pozole Verde con Espinazo");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozoleVerdeLomo(){
        pozoleStore = new AllPozoleStore("verde");
        pozole1 = pozoleStore.orderPozole("lomo");
        when(pozole.getName()).thenReturn("Pozole Verde con Lomo");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozoleVerdeOreja(){
        pozoleStore = new AllPozoleStore("verde");
        pozole1 = pozoleStore.orderPozole("oreja");
        when(pozole.getName()).thenReturn("Pozole Verde con Oreja");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozoleVerdePierna(){
        pozoleStore = new AllPozoleStore("verde");
        pozole1 = pozoleStore.orderPozole("pierna");
        when(pozole.getName()).thenReturn("Pozole Verde con Pierna");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozoleVerdePollo(){
        pozoleStore = new AllPozoleStore("verde");
        pozole1 = pozoleStore.orderPozole("pollo");
        when(pozole.getName()).thenReturn("Pozole Verde con Pollo");
        assertEquals(pozole.getName(), pozole1.getName());
    }

    @Test
    public void testWithPozoleVerdeTrompa(){
        pozoleStore = new AllPozoleStore("verde");
        pozole1 = pozoleStore.orderPozole("trompa");
        when(pozole.getName()).thenReturn("Pozole Verde con Trompa");
        assertEquals(pozole.getName(), pozole1.getName());
    }
}
