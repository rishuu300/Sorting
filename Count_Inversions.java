public class Count_Inversions {
    static void countInversions(long arr[], int low, int high, long count[]){
        if(low<high){
            int mid = (low+high)/2;
            countInversions(arr,low,mid,count);
            countInversions(arr,mid+1,high,count);
            merge(arr,low,mid,high,count);
        }
    }
    
    static void merge(long arr[], int low, int mid, int high, long count[]){
        int i = low, j = mid+1;
        int k = 0;
        long temp[] = new long[high-low+1];
        
        while(i<=mid && j<=high){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
                count[0] += (mid - i + 1);
            }
        }
        
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        
        while(j<=high){
            temp[k++] = arr[j++];
        }
        
        for(i=low, k=0; i<=high; i++, k++){
            arr[i] = temp[k];
        }
    }
    
    static long inversionCount(long arr[], int n) {
        long count[] = new long[]{0};
        countInversions(arr,0,n-1,count);
        return count[0];
    }
    public static void main(String[] args) {
        
    }
}
