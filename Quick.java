public class Quick {
    static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static void quickSort(int arr[], int low, int high)
    {
        if(low<high){
            int partition = lomuto(arr,low,high);
            quickSort(arr,low,partition-1);
            quickSort(arr,partition+1,high);
        }
    }
    
    static int hoare(int arr[], int low, int high)
    {
        int pivot = arr[low];
        int i = low-1, j = high+1;
        
        while(true){
            do{
                i++;
            }while(arr[i] < pivot);
            
            do{
                j--;
            }while(arr[j] > pivot);
            
            if(i>=j){
                return j;
            }
            
            swap(arr,i,j);
        }
    }
    
    static int lomuto(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low-1;
        
        for(int j=low; j<=high-1; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }
        
        swap(arr,i+1,high);
        
        return i+1;
    }
    public static void main(String[] args) {
        
    }
}
