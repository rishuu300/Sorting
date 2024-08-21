import java.util.Arrays;
public class Selection {
    public static void selection(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++)
                if(arr[j]<arr[min])
                   min = j;
            swap(arr,i,min);
            
        }
    }
    private static void swap(int arr[],int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {10,5,8,20,2,18};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
