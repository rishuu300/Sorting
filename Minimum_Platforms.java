import java.util.Arrays;

public class Minimum_Platforms {
    static int findPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int count = 1, res = 1;
        int i = 1, j = 0;
        while(i<arr.length && j<dep.length){
            if(arr[i] <= dep[j]){
                i++;
                count++;
            }
            else{
                j++;
                count--;
            }
            
            res = Math.max(res, count);
        }
        
        return res;
    }
    public static void main(String[] args) {
        
    }
}
