import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {
    @Test
    public void acelerarTeste(){
        Carro c1 = new Carro(183,120);
        c1.acelerar();
        assertEquals(130,c1.getVelocidade());
    }
    @Test
    public void pararTeste(){
        Carro c2 = new Carro(160,80);
        c2.parar();
        assertEquals(0,c2.getVelocidade());
    }

    @Test
    public void reduzirTeste(){
        Carro c3 = new Carro(120,50);
        c3.reduzir();
        assertEquals(8, c3.getVelocidade());
    }
    @Test
    public void reduzirTeste2(){
        Carro c4 = new Carro(120,9);
        c4.reduzir();
        assertEquals(9, c4.getVelocidade());
    }

    @Test
    public void frearTeste(){
        Carro c4 = new Carro(120,9);
        c4.frear();
        assertEquals(0, c4.getVelocidade());
    }

}
