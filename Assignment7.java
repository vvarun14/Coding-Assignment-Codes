// MAJORITY ELEMENT

// import java.util.Scanner;

// public class Assignment7 {
//     public static void MajorityElement(int [] array){
//         int multiple = 0;
//         int position = 0;
//         for(int i = 0; i<array.length; i++){
//             int initial = array[i];
//             int mult = 0;
//             for(int j = 0; j<array.length; j++){
//                 if(initial == array[j]){
//                     mult++;
//                 }
//                 if(mult>multiple){
//                     multiple = mult;
//                     position = array[j];
//                 }
//             }
//         }
//         if(multiple > array.length/2){
//             System.out.println(position);
//         }
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int [] inputarray = new int[size];
//         for(int i = 0; i<size; i++){
//             inputarray[i] = sc.nextInt();
//         }
//         MajorityElement(inputarray);
//     }
// }
