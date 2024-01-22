// INTERSECTION OF SORTED ARRAYS

// import java.util.Scanner;

// public class Assignment15 {
//     public static void Similarity(int [] array1, int [] array2){
//         int [] similar = new int[array1.length];
//         int a = 0;
//         for(int i = 0; i<array2.length; i++){
//             int initial = array2[i];
//             for(int j = 0; j<array1.length; j++){
//                 if(initial == array1[j]){
//                     similar[a] = initial;
//                     a++;
//                     break;
//                 }
//             }
//         }
//         for(int i = 0; i<similar.length; i++){
//             if(similar[i] != 0){
//                 System.out.print(similar[i]+ " ");
//             }
//             else{
//                 continue;
//             }
//         }
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter size of array A: ");
//         int sizeA = sc.nextInt();
//         int [] A = new int[sizeA];
//         System.out.println("Enter elements of array A: ");
//         for(int i = 0; i<sizeA; i++){
//             A[i] = sc.nextInt();
//         }
//         System.out.println("Enter size of array B: ");
//         int sizeB = sc.nextInt();
//         int [] B = new int[sizeB];
//         System.out.println("Enter elements of array B: ");
//         for(int i = 0; i<sizeB; i++){
//             B[i] = sc.nextInt();
//         }

//         Similarity(A, B);
//     }
// }
