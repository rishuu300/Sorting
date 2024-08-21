import java.util.Arrays;
public class Shell {
    public static void shell(int arr[]){
        for(int gap=arr.length/2; gap>=1; gap/=2)
            for(int j=gap; j<arr.length; j++)
                for(int i=j-gap; i>=0; i-=gap){
                    if(arr[i+gap]>arr[i])
                       break;
                    else
                        swap(arr,i,i+gap);
                }
    }
    private static void swap(int arr[],int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,5,2,6,4,2,2};
        shell(arr);
        System.out.println(Arrays.toString(arr));
    }
}
