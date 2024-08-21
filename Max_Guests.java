import java.util.Arrays;
public class Max_Guests {
    public static int naive(int arr[], int dep[]){
        int res = 0;
        for(int i=0; i<arr.length; i++){
            int curr = 1;
            for(int j=i+1; j<arr.length; j++)
                if((arr[i]>=arr[j] && arr[i]<=dep[j]) || arr[j]>=arr[i] && arr[j]<=dep[i])
                   curr++;
            res = Math.max(res,curr);
        }
        return res;
    }
    public static int efficient(int arr[], int dep[]){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i=1, j=0, res=1, curr=1;
        while(i<arr.length && j<arr.length){
            if(arr[i]<=dep[j]){
                curr++;
                i++;
            }
            else{
                curr--;
                j++;
            }
            res = Math.max(res,curr);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {600,700,900};
        int dep[] = {730,800,1000};
        System.out.println(naive(arr,dep));
        System.out.println(efficient(arr,dep));
    }
}
