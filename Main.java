public class Main{
    public static void main(String[] args) {
        
        int[] temperature = new int[14];
        
        //code added from github's remote repo

        for (int i = 0; i < temperature.length; i++) {
            temperature[i] = (int)(Math.random()*201-100);
            System.out.println(temperature[i]);
        }

        System.out.printf("Average is equal to: %.2f", calcAvg(temperature));

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
}   
