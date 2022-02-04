import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class DolarParaRealTest {

    @Test
    void deveRetornarValorConvertido() {
        DolarParaReal dolarReal = new DolarParaReal();
        dolarReal.setValor(1.0);
        dolarReal.setTaxa(0.4);

        assertEquals(7.4, Math.round(dolarReal.calcularNota()*100.0)/100.0);
    }


}