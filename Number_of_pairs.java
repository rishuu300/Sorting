import java.util.Arrays;

public class Number_of_pairs {
    public int countPairs(int arr[], int element, int noOfY[], int n){
        int count = 0;
        
        if(element == 0){
            return 0;
        }
        else if(element == 1){
            return noOfY[0];
        }
        else{
            int idx = Arrays.binarySearch(arr,element);
            
            if(idx < 0){
                idx = Math.abs(idx+1);
                count = n - idx;
            }
            else{
                while(idx < n && arr[idx] == element){
                    idx++;
                }
            }
            
            count = n - idx;
        }
        
        count += (noOfY[0] + noOfY[1]);
        
        if(element == 2){
            count -= (noOfY[3] +  noOfY[4]);
        }
        
        if(element == 3){
            count += noOfY[2];
        }
        
        return count;
    }
    
    public long countPairs(int x[], int y[], int M, int N) {
        int noOfY[] = new int[5];
        for(int i=0; i<N; i++){
            if(y[i] < 5){
                noOfY[y[i]]++;
            }
        }
        
        Arrays.sort(y);
        long totalPairs = 0;
        for(int i=0; i<M; i++){
            totalPairs +=  countPairs(y, x[i], noOfY, N);
        }
        
        return totalPairs;
    }
    public static void main(String[] args) {
        
    }
}
