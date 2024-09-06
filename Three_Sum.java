import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Three_Sum {
    public boolean pairSum(int arr[], int start, int end, int sum){
        Set<Integer> s = new HashSet<>();
        
        for(int i=start; i<=end; i++){
            if(s.contains(sum-arr[i])){
                return true;
            }
            s.add(arr[i]);
        }
        
        return false;
    }
    
	public boolean naive(int arr[] , int n)
    {
        for(int i=0; i<n; i++){
            if(pairSum(arr,i+1,n-1,(-arr[i]))){
                return true;
            }
        }
        return false;
    }

    public static boolean efficient(int arr[], int n){
        Arrays.sort(arr);
        
        for(int i=0; i<n-2; i++){
            int low = i+1, high = n-1;
            
            while(low<high){
                int sum = arr[i]+arr[low]+arr[high];
                
                if(sum==0){
                    return true;
                }
                else if(sum < 0){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        
        return false;
    }
    public static void main(String[] args) {
        
    }
}
