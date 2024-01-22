// BEST TIME TO BUY AND SELL STOCK

// import java.util.Scanner;

// public class Assignment2 {
//     public static void BestTiming(int [] array){
//         int buy = array[0];
//         int profit = 0;
//         int sell = 0;
//         int maxprofit = Integer.MIN_VALUE;
//         for(int i = 0; i<array.length; i++){
//             if(i<array.length-1){
//                 sell = array[i+1];
//             }
//             if(sell < buy){
//                 buy = sell;
//             }
//             else{
//                 profit = sell - buy;
//             }
//             if(profit > maxprofit){
//                 maxprofit = profit;
//             }
//         }
//         System.out.println(maxprofit);
//     }
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of days to be considered: ");
//         int NoOfDays = sc.nextInt();
//         int stockarray [] = new int[NoOfDays];

//         System.out.println("Enter the prizes for each day: ");
//         for(int i = 0; i<NoOfDays; i++){
//             stockarray[i] = sc.nextInt();
//         }

//         BestTiming(stockarray);
//     }
// }
