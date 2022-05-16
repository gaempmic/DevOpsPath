package ch.zhaw.iwi.devops.fizzbuzz;
import org.junit.Assert;
import org.junit.Test;

public class AlterTestCheck {

    @Test
    public void AlterTestJung(){
        AlterTest ac = new AlterTest();
        Assert.assertEquals("klein", ac.alterTest(12));
    }

    @Test
    public void AlterTestTeenager(){
        AlterTest ac = new AlterTest();
        Assert.assertEquals("Teenager", ac.alterTest(18));
    }

    @Test
    public void halberwachsen(){
        AlterTest ac = new AlterTest();
        Assert.assertEquals("Jung aber erwachsen", ac.alterTest(28));
    }

    @Test
    public void erwachsen(){
        AlterTest ac = new AlterTest();
        Assert.assertEquals("Erwachsen", ac.alterTest(45));
    }

    @Test
    public void pensioniert(){
        AlterTest ac = new AlterTest();
        Assert.assertEquals("Pensioniert", ac.alterTest(28));
    }

    @Test
    public void nichtklar(){
        AlterTest ac = new AlterTest();
        Assert.assertEquals("nicht klar", ac.alterTest(-3));
    }

}



