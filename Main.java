public class Main{
    public static void main(String[] args) {
        
        int[] temperature = new int[14];
        
        //code added from github's remote repo

        for (int i = 0; i < temperature.length; i++) {
            temperature[i] = (int)(Math.random()*201-100);
        }

        System.out.printf("Average is equal to: %.2f\n", calcAvg(temperature));
        System.out.println("Highest num is equal to: " + calcMax(temperature));
    }

    public static double calcAvg(int[] temp){

        double total = 0.0;
        int allowedNum = 0;


        for (int i : temp) {
            if(i < 50 && i > -50){
                total += i;
                allowedNum++;
            }
        }

        return total / allowedNum;
    }


    public static int calcMax(int[] temp){
        int highestNum = 0;

        for (int i : temp){
            if(i > highestNum)
                highestNum = i;
        }

        return highestNum;
    }
        
} 

