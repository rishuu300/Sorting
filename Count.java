import java.util.Arrays;
public class Count {
    public static int[] count(int arr[], int k){
        int count[] = new int[k];
        int output[] = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            count[arr[i]-1]++;
        }

        for(int i=1; i<k; i++){
            count[i] += count[i-1];
        }

        for(int i=arr.length-1; i>=0; i--){
            output[count[arr[i]-1]-1] = arr[i];
            count[arr[i]-1]--;
        }
        return output;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,5,2,6,4,2,2};
        count(arr,6);
        System.out.println(Arrays.toString(count(arr,6)));
    }
}
