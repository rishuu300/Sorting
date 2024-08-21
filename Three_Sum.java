import java.util.Arrays;

public class Three_Sum {
    public static void threeSum(int arr[], int sum){
        Arrays.sort(arr);
        boolean found = false;
        for(int i=0; i<arr.length-2; i++){
            int l=i+1, r=arr.length-1;
            while(l<r){
                if(arr[i]+arr[l]+arr[r]==sum){
                    System.out.println(arr[i]+" "+arr[l]+" "+arr[r]);
                    found = true;
                    l++;r--;
                }
                else if(arr[i]+arr[l]+arr[r]<sum)
                    l++;
                else
                    r--;
            }
        }
        if(found==false)
           System.out.println("No triplet found");
    }
    public static void main(String[] args) {
        int arr[] = {12, 3, 4, 1, 6, 9};
        threeSum(arr, 24);
    }
}
