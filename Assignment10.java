// PALINDROME INTEGER

// import java.util.Scanner;

// public class Assignment10 {
//     public static int PalindromeInt(int [] array){
//         int a = 0;
//         for(int i = 0; i<array.length/2; i++){
//             if(array[i] == array[array.length - 1 - i]){
//                 a++;
//                 continue;
//             }
//             else{
//                 break;
//             }
//         }
//         if(a==array.length/2){
//             return 1;
//         }
//         return 0;
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int [] inputarray = new int[size];
//         for(int i = 0; i<size; i++){
//             inputarray[i] = sc.nextInt();
//         }
//         int result = PalindromeInt(inputarray);
//         System.out.println(result);
//     }
// }
