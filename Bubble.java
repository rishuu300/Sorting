import java.util.*;
public class Bubble{
    public static void bubble(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            boolean swapped = false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    swapped = true;
                }
            }
            if(swapped==false)
               break;
        }
    }

    private static void swap(int arr[],int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {2,10,8,7};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}