import java.util.Arrays;
public class Zero_Sum {
    public static void zeroSum(int arr[]){
        boolean found = false;
        Arrays.sort(arr);
        for(int i=0; i<arr.length-2; i++){
            int l=i+1, r = arr.length-1;
            while(l<r){
                if(arr[i]+arr[l]+arr[r]==0){
                    System.out.println(arr[i]+" "+arr[l]+" "+arr[r]);
                    found = true;
                    l++;r--;
                }
                else if(arr[i]+arr[l]+arr[r]<0)
                    l++;
                else
                    r--;
            }
        }
        if(found==false)
           System.out.println("No triplet found");
    }
    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        zeroSum(arr);
    }
}
