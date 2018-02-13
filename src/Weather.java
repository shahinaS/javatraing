public class Weather {

    public static void main(String[] args){

        int temp = 50;
        String sunCondition = "Sunny";

        if (temp > 60) {

            System.out.println("Weather is cold");
        }
        else if ((temp<60) && (sunCondition == "Bunny")){
            System.out.println("Weather is hot");
            System.out.println("It's a Sunny Day");
        }
        else if((temp<60) && (sunCondition == "Sunny")){
            System.out.println("Weather is much OK now");
        }
        System.out.println("The Program is ending");
        }

    }

