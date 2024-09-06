import java.util.ArrayList;
import java.util.Arrays;

public class Overlapping_Intervals {
    public int[][] overlappedInterval(int[][] Intervals)
    {
        ArrayList<int[]> result = new ArrayList<>();
        Arrays.sort(Intervals, (a,b) -> a[0] - b[0]);
        
        int curr[] = Intervals[0];
        result.add(curr);
        
        for(int i=1; i<Intervals.length; i++){
            int next[] = Intervals[i];
            
            if(curr[1] >= next[0]){
                curr[1] = Math.max(curr[1], next[1]);
            }
            else{
                curr = next;
                result.add(curr);
            }
        }
        
        return result.toArray(new int[result.size()][2]);
    }
    public static void main(String[] args) {
        
    }
}
