import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_of_two_sorted_arrays {
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static ArrayList<Integer> printIntersection(int arr1[], int arr2[]) {
        ArrayList<Integer> al = new ArrayList<>();
        
        int i=0, j=0;
        
        while(i < arr1.length && j < arr2.length){
            if(i > 0 && arr1[i] == arr1[i-1]){
                i++;
                continue;
            }
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr2[j] < arr1[i]){
                j++;
            }
            else{
                al.add(arr1[i]);
                i++;
                j++;
            }
        }
        
        return (al.size() == 0) ? new ArrayList(Arrays.asList(-1)) : al;
    }
    public static void main(String[] args) {
        
    }
}
