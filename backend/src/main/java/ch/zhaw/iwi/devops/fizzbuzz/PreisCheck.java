package ch.zhaw.iwi.devops.fizzbuzz;

public class PreisCheck {
    public String CheckP(double zahl){
        if  (zahl >0.0 && zahl <= 1.0){
            return "Sehr billig";
        }
        else if (zahl >= 1.0 && zahl <= 5.0){
            return "Billig";
        }
        else if (zahl > 5.0 && zahl <= 10.0){
            return "Ok";
        }
        else if (zahl > 10.0 && zahl <= 20.0 ){
            return "teuer";
        }
        else if (zahl > 20.0){
            return "sehr teuer";
        }

        
        else if (zahl < 0){
            return "Geld zurück";
        } 
        

        return "undefiniert";
        
    }
}
