package Arrays;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromASortedArray {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,3,3,3,4};
        int [] uniqueArr = removeDuplicates(arr);
        for(int val : uniqueArr){
            System.out.print(val + " ");
        }
    }
    private static int [] removeDuplicates(int [] arr){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int a : arr){
            set.add(a);
        }
        // Convert LinkedHashSet to int []
        int [] res = new int [set.size()];
        int i = 0;
        for(int s : set){
            res[i++] = s;
        }
        return res;
    }
}
