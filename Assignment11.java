// VERIFY PRIME

// import java.util.Scanner;

// public class Assignment11 {
//     public static void checkPrime(int number){
//         boolean isPrime = false;
//         if(number == 1 || number == 2){
//             isPrime = true;
//         }
//         else{
//             for(int i = 2; i<number; i++){
//                 if(number%i != 0){
//                     isPrime = true;
//                     continue;
//                 }
//                 else{
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }
//         if(isPrime == true){
//             System.out.println("True");
//         }
//         else{
//             System.out.println("False");
//         }
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         checkPrime(number);
//     }
// }
