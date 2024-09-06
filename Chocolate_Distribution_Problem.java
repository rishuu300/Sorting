import java.util.ArrayList;
import java.util.Collections;

public class Chocolate_Distribution_Problem {
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        int res = Integer.MAX_VALUE;
        
        for(int i=0; i<n-m+1; i++){
            res = Math.min(res, a.get(i+m-1) - a.get(i));
        }
        
        return (long)res;
    }
    public static void main(String[] args) {
        
    }
}
