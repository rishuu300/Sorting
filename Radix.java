import java.util.Arrays;
public class Radix {
    public static void radixSort(int arr[]){
        int max=arr[0];
        for(int i=1; i<arr.length; i++)
            max = Math.max(max,arr[i]);

        for(int exp=1; max/exp>0; exp*=10)
            count(arr,exp);
    }

    private static void count(int[] arr, int exp){
        int count[] = new int[10];
        int output[] = new int[arr.length];
        for(int i=0; i<arr.length; i++)
            count[(arr[i]/exp)%10]++;
        for(int i=1; i<10; i++)
            count[i] += count[i-1];

        for(int i=0; i<arr.length; i++){
            output[count[(arr[i]/exp)%10]-1] = arr[i];
            count[(arr[i]/exp)%10]--;
        }
        for(int i=0; i<arr.length; i++)
            arr[i] = output[i];
    }

    public static void main(String[] args) {
        int arr[] = {4,3,5,2,6,4,2,2};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
