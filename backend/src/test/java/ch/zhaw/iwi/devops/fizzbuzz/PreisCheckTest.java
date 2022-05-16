package ch.zhaw.iwi.devops.fizzbuzz;
import org.junit.Assert;
import org.junit.Test;

public class PreisCheckTest {

    @Test
    public void SehrBillig(){
        PreisCheck ac = new PreisCheck();
        Assert.assertEquals("Sehr billig", ac.Check(0.5));
    }

    @Test
    public void Billig(){
        PreisCheck ac = new PreisCheck();
        Assert.assertEquals("Billig", ac.Check(5));
    }

    @Test
    public void Ok(){
        PreisCheck ac = new PreisCheck();
        Assert.assertEquals("Ok", ac.Check(7.5));
    }

    @Test
    public void Teuer(){
        PreisCheck ac = new PreisCheck();
        Assert.assertEquals("teuer", ac.Check(18.3));
    }

    @Test
    public void sehrTeuer(){
        PreisCheck ac = new PreisCheck();
        Assert.assertEquals("sehr teuer", ac.Check(78));
    }

    @Test
    public void GeldZurück(){
        PreisCheck ac = new PreisCheck();
        Assert.assertEquals("Geld zurück ;)", ac.Check(-3));
    }

}



