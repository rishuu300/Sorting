import java.util.Arrays;
public class Quick {
    public static int hoaresPartition(int arr[], int l, int h){
        int pivot = arr[l];
        int i=l-1;
        int j=h+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);

            do{
                j--;
            }while(arr[j]>pivot);

            if(i>=j)
               return j;
            swap(arr,i,j);
        }
    }
    public static int lomutoPartition(int arr[], int l, int h){
        int pivot = arr[h];
        int i=l-1;
        for(int j=l; j<=h-1; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return i+1;
    }
    private static void swap(int arr[],int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void quickSort(int arr[], int l, int h){
        // if(l<h){
            // int p = lomutoPartition(arr,l,h);
            // quickSort(arr,l,p-1);
            // quickSort(arr,p+1,h);
        
            // int p = hoaresPartition(arr,l,h);
            // quickSort(arr,l,p);
            // quickSort(arr,p+1,h);
        // }

        //Tail call optimization 
        while(l<h){
            int p = hoaresPartition(arr,l,h);
            quickSort(arr,l,p);
            l = p+1;
        }
    }
    public static void main(String[] args) {
        int arr[] = {30,10,18,3,2,16,50,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
