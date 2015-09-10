package mx.iteso;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class TacitKnowledgePrinterTest {
    private Printer printer;

    //Test printNumbers with a limit of 10
        //Verify print() being called 10 times
        //Verify expected result

    //Test printNumbers with a limit of 0
        //Verify Exception

    //What else can we test?
        //What should we verify?
    @Before
    public void setUp(){
        printer = mock(Printer.class);
    }

    @Test
    public void printNumbers(){
        TacitKnowledgePrinter tacitKnowledgePrinter = new TacitKnowledgePrinter(printer);
        tacitKnowledgePrinter.printNumbers(10);
        verify(printer, times(10)).print(""+anyInt());
    }

    @Test
    public void verifyResult(){
        TacitKnowledgePrinter tacitKnowledgePrinter = new TacitKnowledgePrinter(printer);
        tacitKnowledgePrinter.printNumbers(5);
        assertEquals(tacitKnowledgePrinter.printNumbers(5), "12Tacit4Knowledge");
    }

    @Test(expected = Exception.class)
    public void verifyException(){
        TacitKnowledgePrinter tacitKnowledgePrinter = new TacitKnowledgePrinter(printer);
        tacitKnowledgePrinter.printNumbers(0);
    }

    @Test
    public void forbiddenTest() {
        assertTrue(true);
    }

}
