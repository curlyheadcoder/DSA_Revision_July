package Arrays;

import java.util.Scanner;

public class StockBuyAndSellRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] weekDay = new int[n];
        for (int i = 0; i < n; i++) {
            weekDay[i] = sc.nextInt();
        }
        int ans = maxProfit(weekDay, 0, n-1);
        System.out.println(ans);
    }
    private static int maxProfit(int [] price, int start, int end){
        if(end <= start){
            return 0;
        }
        int profit = 0;
        for (int i = start; i < end; i++) {
            for (int j = i+1; j <= end; j++) {
                if(price[j] > price[i]){
                    int currProfit = price[j] - price[i] + maxProfit(price, start, i-1) + maxProfit(price, j+1, end);
                    profit = Math.max(profit, currProfit);
                }
            }
        }
        return profit;
    }
}
