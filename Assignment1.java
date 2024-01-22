

import java.util.Scanner;

public class Assignment1{
    public static int Candies(int [] array){
        int [] candies = new int[array.length];
        int sum = 0; 

        if(array.length == 1){
            return 1;
        }

        for(int i = 0; i<array.length; i++){
            candies[i] = 1;
        }
        
        for(int i = 0; i<array.length - 1; i++){
            if(array[i+1] > array[i]){
                candies[i+1] = candies[i] + 1;
            }
        }
        for(int i = array.length-2; i>=0; i--){
            if(array[i] > array[i+1] && candies[i] <= candies[i+1]){
                candies[i] = candies[i+1] + 1;
            }
            sum += candies[i];
        }

        sum += candies[array.length-1];

        return sum;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int size = sc.nextInt();

        System.out.println("Enter their rating values: ");
        int [] rating = new int[size];
        for(int i = 0; i<size; i++){
            rating[i] = sc.nextInt();
        }

        int result = Candies(rating);
        System.out.println(result);
    }
}