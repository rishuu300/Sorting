import java.util.Arrays;

public class Triangles {
    public static int count(int arr[]){
        Arrays.sort(arr);
        int count = 0;
        for(int i=arr.length-1; i>=1; i--){
            int l=0;
            int r=i-1;
            while(l<r){
                if(arr[l]+arr[r]>arr[i]){
                    count += r-l;
                    r--;
                }
                else
                    l++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {4,3,5,2,6,4,2,2};
        System.out.println(count(arr));
    }
}
