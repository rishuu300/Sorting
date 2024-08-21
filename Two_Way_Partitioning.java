import java.util.Arrays;
public class Two_Way_Partitioning {
    public static void naive(int arr[]){
        int temp[] = new int[arr.length];
        int i=0;
        for(int j=0; j<arr.length; j++){
            if(arr[j]<0){
               temp[i] = arr[j];
               i++;
            }
        }
            
        for(int j=0; j<arr.length; j++){
            if(arr[j]>=0){
               temp[i] = arr[j];
               i++;
            }
        }

        for(int j=0; j<arr.length; j++)
            arr[j] = temp[j];
    }

    public static void hoares(int arr[]){
        int i=-1, j=arr.length;
        while(true){
            do{
                i++;
            }while(arr[i]<0);
            do{
                j--;
            }while(arr[j]>=0);
            if(i>=j)
               return;
            swap(arr,i,j);
        }
    }
    private static void swap(int arr[],int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {-12,10,-10,15};
        // naive(arr);
        hoares(arr);
        System.out.println(Arrays.toString(arr));
    }
}
