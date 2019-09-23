import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    private Printer printer;

    @Before
    public void before(){
        printer = new Printer(500, 1000);
    }

    @Test
    public void testGetSheets(){
        assertEquals(500, printer.getSheets());
    }

    @Test
    public void testPrintCopiesCanPrint(){
        printer.printCopies(100, 2);
        assertEquals(300, printer.getSheets());
    }

    @Test
    public void testPrintCopiesCannotPrint(){
        printer.printCopies(1000, 5);
        assertEquals(500, printer.getSheets());
    }
}
