package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LeadersInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int [] arr = new int[input];
        for (int i = 0; i < input; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> ans =leaders(arr);
        for(int a : ans){
            System.out.print(a + " ");
        }
    }

//              Brute Force (Naive)


//    private static ArrayList<Integer> leaders(int [] arr){
//        ArrayList<Integer> res = new ArrayList<>();
//        int n = arr.length;
//        for (int i = 0; i < arr.length; i++) {
//            boolean flag = false;
//            for (int j = i+1; j < n; j++) {
//                if(arr[i] <= arr[j]){
//                    flag = true;
//                    break;
//                }
//            }
//            if(flag == false){
//                res.add(arr[i]);
//            }
//        }
//        return res;
//    }


//                    Optimal Version

    private static ArrayList<Integer> leaders(int [] arr){
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        int currLeader = arr[n-1];
        res.add(currLeader);
        for(int i = n-2; i >= 0; i--){
          if(currLeader < arr[i]){
              currLeader = arr[i];
              res.add(currLeader);
          }
        }
        Collections.reverse(res);
        return res;
    }
}
