package ch.zhaw.iwi.devops.fizzbuzz;
import org.junit.Assert;
import org.junit.Test;


public class PreisCheckTest {

    //Preis zwischen 0 und 1 CHF ist sehr billig
    @Test
    public void SehrBillig(){
        PreisCheck ac = new PreisCheck();
        Assert.assertEquals("Sehr billig", ac.Check(0.5));
    }

    //Preis zwischen 1 und 5 CHF is Billig 
    @Test
    public void Billig(){
        PreisCheck ac = new PreisCheck();
        Assert.assertEquals("Billig", ac.Check(5));
    }
    //Preis zwischen 5 und 10 ist ok 
    @Test
    public void Ok(){
        PreisCheck ac = new PreisCheck();
        Assert.assertEquals("Ok", ac.Check(7.5));
    }
    //Preis zwischen 10 und 20 ist teuer
    @Test
    public void Teuer(){
        PreisCheck ac = new PreisCheck();
        Assert.assertEquals("teuer", ac.Check(18.3));
    }
    //Preis über 20 ist sehr teuer
    @Test
    public void sehrTeuer(){
        PreisCheck ac = new PreisCheck();
        Assert.assertEquals("sehr teuer", ac.Check(78));
    }

    //Geld zurück 
    @Test
    public void GeldZurück(){
        PreisCheck ac = new PreisCheck();
        Assert.assertEquals("Geld zurück ;)", ac.Check(-1));
    }

    //Luxus esse

    @Test
    public void Luxus(){
        PreisCheck ac = new PreisCheck();
        Assert.assertEquals("Luxus", ac.Check(1000));
    }


}



