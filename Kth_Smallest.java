public class Kth_Smallest {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j]; 
        arr[j] = temp;
    }
    
    public static int lomuto(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;
        
        for(int j=low; j<high; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }
        
        swap(arr,i+1,high);
        return i+1;
    }
    
    public static int kthSmallest(int[] arr, int k) {
        int low = 0, high = arr.length-1;
        
        while(low<=high){
            int partition = lomuto(arr,low,high);
            
            if(partition == k-1){
                return arr[partition];
            }
            else if(partition > k-1){
                high = partition-1;
            }
            else{
                low = partition+1;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
