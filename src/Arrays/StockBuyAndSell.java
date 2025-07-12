package Arrays;

import java.util.Scanner;

public class StockBuyAndSell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = maxProfit(arr);
        System.out.println(ans);
    }
    private static int maxProfit(int [] price){
        int profit = 0;
        for (int i = 1; i < price.length; i++) {
            if(price[i] > price[i-1]) profit += price[i] - price[i-1];
        }
        return profit;
    }
}
