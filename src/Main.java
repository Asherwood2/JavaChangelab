import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public record Denomination(String name, Double amt, String form, String  img){}



    //Beginning of Purse class
public class Purse {
    //Map<String, Integer> cash;


    //Constructor
    public Purse(){
        Map<String, Integer> cash;
    }

    //Method for adding cash
    public void add(Record denomination, int cash){

    }
    //Remove
    public double remove(){
        return 0.0;//holding spot
    }
}





public class Register {

        public Purse makeChange(double amt) {
            Purse purse1 = new Purse();


            //Logic
            double temphundred = amt / 100;
            int hundred = (int) Math.round(temphundred);
            if (hundred > 0){
                for(int i = 0 ; i < hundred ; i++){
                    amt = amt - 100;
                }
            }

            double tempfifty = amt / 50;
            int fifty = (int) Math.round(tempfifty);
            if(fifty > 0){
                for(int i = 0 ; i < fifty ; i++){
                    amt = amt - 50;
                }
            }

            double temptwenty = amt / 20;
            int twenty = (int) Math.round(temptwenty);
            if(twenty > 0){
                for(int i = 0 ; i < twenty ; i++){
                    amt = amt - 20;
                }
            }

            double tempten = amt / 10;
            int ten = (int) Math.round(tempten);
            if(ten > 0){
                for(int i = 0 ; i < ten ; i++){
                    amt = amt - 10;
                }
            }

            double tempfive = amt / 5;
            int five = (int) Math.round(tempfive);
            if(five > 0){
                for(int i = 0 ; i < five ; i++){
                    amt = amt - 5;
                }
            }

            double tempone = amt / 1;
            int one = (int) Math.round(tempone);
            if(one > 0){
                for(int i = 0 ; i < one ; i++){
                    amt = amt - 1;
                }
            }

            double tempquarter = amt / .25;
            int quarter = (int) Math.round(tempquarter);
            if(quarter > 0){
                for(int i = 0 ; i < quarter ; i++){
                    amt = amt - .25;
                }
            }

            double tempdime = amt / .10;
            int dime = (int) Math.round(tempdime);
            if(dime > 0){
                for(int i = 0 ; i < dime ; i++){
                    amt = amt - .10;
                }
            }

            double tempnickel = amt / .05;
            int nickel = (int) Math.round(tempnickel);
            if(nickel > 0){
                for(int i = 0 ; i < nickel ; i++){
                    amt = amt - .05;
                }
            }

            double temppenny = amt / .01;
            int penny = (int) Math.round(temppenny);
            if(penny > 0){
                for(int i = 0 ; i < penny ; i++){
                    amt = amt - .01;
                }
            }


        //purse1.add(Hundred, hundred);


            return purse1;
        }


}






    public static void main(String[] args) {
        Denomination hundred = new Denomination("hundred-dollar note", 100.00, "bill", "hundred.png");
        Denomination fifty = new Denomination("fifty-dollar note", 50.00, "bill", "fifty.png");
        Denomination twenty = new Denomination("twenty-dollar note", 20.00, "bill", "twenty.png");
        Denomination ten = new Denomination("ten-dollar note", 10.00, "bill", "ten.png");
        Denomination five = new Denomination("five-dollar note", 50.00, "bill", "five.png");
        Denomination one = new Denomination("one-dollar note", 10.00, "bill", "one.png");
        Denomination quarter = new Denomination("Quarter", .25, "coin", "quarter.png");
        Denomination dime = new Denomination("dime", .10, "coin", "dime.png");
        Denomination nickel = new Denomination("nickel", .05, "coin", "nickel.png");
        Denomination penny = new Denomination("penny", .01, "coin", "penny.png");
        }
    }
