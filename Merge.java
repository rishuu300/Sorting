import java.util.Arrays;
public class Merge {
    public static void merge(int arr[], int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int left[] = new int[n1];
        int rigth[] = new int[n2];

        for(int i=0; i<n1; i++){
            left[i] = arr[i+l];
        }
        for(int i=0; i<n2; i++){
            rigth[i] = arr[m+1+i];
        }

        int i=0; int j=0; int k=l;
        while(i<n1 && j<n2){
            if(left[i]<=rigth[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = rigth[j++];
            }
        }
        while(i<n1){
            arr[k++] = left[i++];
        }
        while(j<n2){
            arr[k++] = rigth[j++];
        }
    }
    public static void mergeSort(int arr[],int l, int r){
        if(l<r){
            int m = l+(r-l)/2;
            mergeSort(arr, l, m);
            mergeSort(arr,m+1,r);
            merge(arr, l, m, r);
        }
    }
    public static void main(String[] args) {
        int arr[] = {30,10,18,3,2,16,50,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
