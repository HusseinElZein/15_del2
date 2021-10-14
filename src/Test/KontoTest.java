package Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {

    @org.junit.jupiter.api.Test

    void setPenge1() {

        Spil.Konto konto1 = new Spil.Konto();
        konto1.setPenge1(-1001);
       int expectedResult = 0;
       assertEquals(expectedResult, konto1.getPenge1() );
    }

    @org.junit.jupiter.api.Test
    void setPenge2() {

        Spil.Konto konto2 = new Spil.Konto();
        konto2.setPenge2(-1001);
        int expectedResult = 0;
        assertEquals(expectedResult, konto2.getPenge2() );


    }
}