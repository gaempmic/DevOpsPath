package ch.zhaw.iwi.devops.fizzbuzz;

public class AlterTest {
    public String alterTest(int zahl){
        if  (zahl >0 && zahl <= 12){
            return "klein";
        }
        else if (zahl >= 12 && zahl <= 20){
            return "Teenager";
        }
        else if (zahl > 20 && zahl <= 30){
            return "Jung aber erwachsen";
        }
        else if (zahl > 30 && zahl <= 65 ){
            return "Erwachsen";
        }
        else if (zahl > 65){
            return "Pensioniert";
        }
        return "nicht klar";
    }
}
