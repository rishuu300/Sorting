public class Kth {
    public static int kth(int arr[], int k){
        int l=0, r = arr.length-1;
        while(l<=r){
            int p = partition(arr,l,r);
            if(p==k-1)
               return arr[p];
            else if(p>k-1)
               r = p-1;
            else
               l = p+1;
        }
        return -1;
    }

    private static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i=l-1;
        for(int j=l; j<r-1; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,r);
        return i+1;
    }

    private static void swap(int arr[],int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {4,3,5,2,6,3,2,2};
        System.out.println(kth(arr,5));
    }
}
