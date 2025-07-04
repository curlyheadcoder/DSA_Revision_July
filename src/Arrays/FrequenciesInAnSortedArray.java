package Arrays;

public class FrequenciesInAnSortedArray {
    public static void main(String[] args) {
        int [] arr = {10,10,10,30,50};
        frequencies(arr);
//        for(int a : arr){
//            System.out.print(a + " ");
//        }
    }
    private static void frequencies(int [] arr){
        int n = arr.length;
        int freq = 1, i = 1;
        while (i < n){
            while (i < n && arr[i] == arr[i-1]){
                freq++;
                i++;
            }
            System.out.print(arr[i - 1] + " ->  " + freq + "    ");
            i++;
            freq = 1;
        }
        if(n == 1 || arr[n-1] != arr[n-2]){
            System.out.println(arr[n-1] + " ->  " + 1);
        }
    }
}
