import banco.cuentaCorriente;
import banco.Banco;
import org.junit.Test;
import static org.junit.Assert.*;
//imports per fer servir la paramtrització
import java.util.Arrays;
import java.util.Collection;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/**
 *
 * @author Anas
 */
@RunWith(Parameterized.class)
public class cuentaCorrienteTest {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {     
            {1000, false, 100000, 3000}, {40, true, 10000, 300}, {50, true, 1000, 30}
           });
    }
    
    private double date;
    private boolean expected;
    private cuentaCorriente c = new cuentaCorriente("Test1","24876987Y",new Banco("BNC Internacional Banc"),3);
    private double tae;
     
    public cuentaCorrienteTest(double date,boolean expected, double c, double tae) {
        this.date=date;
        this.expected=expected;
        this.c.ingreso(c);
        this.tae=tae;
    }
    
    @Test
    public void  testRetirar() {
        cuentaCorriente result = new cuentaCorriente("Ana Pastor","24876987Y",new Banco("BNC Internacional Banc"),3);
        boolean res=result.retirar(this.date);
        assertEquals(this.expected, res);  
    }
    
    @Test
    public void  testInteresTAE() {
        double res=c.interesTAE();
        assertEquals(this.tae, res, 2);  
    }
}