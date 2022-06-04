package ch.zhaw.iwi.devops.fizzbuzz;
import org.junit.Assert; // assertEquals(expected,actual) Der Test scheitert, wenn die beiden Werte nicht übereinstimmen.
import org.junit.Test; //automatische verknüpfung der Test cases mit dem test lap 


public class PreisCheckTest {
    
    //Preis zwischen 0 und 1 CHF ist sehr billig
    @Test //wird verwendet um den Testcase direkt mit dem Testlab zu verbinden
    public void PreisCheck_SehrBillig(){
        PreisCheck ac = new PreisCheck();
        Assert.assertEquals("Sehr billig", ac.CheckP(0.5)); //wie oben erwähnt, die Methode assertEquals(expected,actual) überprüft ob die beiden Werte übereinstimmen
    }

    //Preis zwischen 1 und 5 CHF is Billig 
    @Test
    public void PreisCheck_Billig(){
        PreisCheck ac = new PreisCheck();
        Assert.assertEquals("Billig", ac.CheckP(5));
    }
    //Preis zwischen 5 und 10 ist ok 
    @Test
    public void PreisCheck_Ok(){
        PreisCheck ac = new PreisCheck();
        Assert.assertEquals("Ok", ac.CheckP(7.5));
    }
    //Preis zwischen 10 und 20 ist teuer
    @Test
    public void PreisCheck_Teuer(){
        PreisCheck ac = new PreisCheck();
        Assert.assertEquals("teuer", ac.CheckP(18.3));
    }
    //Preis über 20 ist sehr teuer
    @Test
    public void PreisCheck_sehrTeuer(){
        PreisCheck ac = new PreisCheck();
        Assert.assertEquals("sehr teuer", ac.CheckP(78));
    }

    //Geld zurück wenn Preis negativ ist 
    @Test
    public void PreisCheck_GeldZurück(){
        PreisCheck ac = new PreisCheck();
        Assert.assertEquals("Geld zurück", ac.CheckP(-1));
    }

}



