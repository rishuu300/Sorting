import java.util.Arrays;
public class Chocolate {
    public static int chocolate(int arr[], int m){
        if(m>arr.length)
           return -1;
        Arrays.sort(arr);
        int res = arr[m-1]-arr[0];
        for(int i=1; (i+m-1)<arr.length; i++)
            res = Math.min(res,arr[i+m-1]-arr[i]);
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {7,3,2,4,9,12,56};
        System.out.println(chocolate(arr, 3));
    }
}
