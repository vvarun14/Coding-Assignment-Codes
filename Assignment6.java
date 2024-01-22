// ADD ONE TO NUMBER

// import java.util.Scanner;

// public class Assignment6{
//     public static void plusOne(int [] array){
//         int [] newarr = new int [array.length+1];
//         if(array[0] == 9){
//             for(int i = 1; i<newarr.length; i++){
//                 newarr[i] = array[i-1];
//             }
//             if(newarr[newarr.length-1] <= 8){
//                 newarr[newarr.length-1] += 1;
//             }
//             else{
//                 for(int i = newarr.length-1; i>=0; i--){
//                     if(newarr[i]>=9){
//                         newarr[i] = 0;
//                         newarr[i-1] += 1;
//                     }
//                     else{
//                         break;
//                     }
//                 }
//             }
//             if(newarr[0] == 0){
//                 for(int i = 1; i<newarr.length; i++){
//                     array[i-1] = newarr[i];
//                     System.out.print(array[i-1]+ " ");
//                 }
//             }
//             else{
//                 for(int i = 0; i<newarr.length; i++){
//                     System.out.print(newarr[i]+ " ");
//                 }
//             }
//         }
//         else{
//             if(array[array.length - 1] <= 8){
//                 array[array.length - 1] += 1;
//             }
//             else{
//                 for(int i = array.length-1; i>=0; i--){
//                     if(array[i] >= 9){
//                         array[i] = 0;
//                         array[i-1] += 1;
//                     }
//                     else{
//                         break;
//                     }
//                 }
//             }
//             for(int i = 0; i<array.length; i++){
//                 System.out.print(array[i] + " ");
//             }
//         }
        
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int [] array = new int[size];
//         for(int i = 0; i<size; i++){
//             array[i] = sc.nextInt();
//         }
//         plusOne(array);
//     }
// }
