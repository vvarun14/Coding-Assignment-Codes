// REVERSE INTEGER

import java.util.Scanner;

public class Assignment12 {
    public static int Reverse(int num){
        int a = num;
        int reverse = 0;
        if(a<0){
            a*=-1;
            while(a>0){
                reverse *= 10;
                reverse += a%10;
                a /= 10;
            }
        }
        else{
            while(a>0){
                reverse *= 10;
                reverse += a%10;
                a /= 10;
            }
        }
        if(num < 0){
            return reverse*-1;
        }
        return reverse;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = Reverse(number);
        System.out.println(result);
    }
}
