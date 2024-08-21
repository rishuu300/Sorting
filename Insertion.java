import java.util.Arrays;
public class Insertion {
    public static void insertion(int arr[]){
        for(int i=0; i<arr.length; i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args){
        int arr[] = {20,50,40,60,10,30};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
