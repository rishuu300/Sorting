import java.util.Arrays;
public class Three_Way_Partitioning {
    public static void hoares(int arr[]){
        int l=0, h=arr.length-1, mid=0;
        while(mid<=h){
            switch(arr[mid]){
                case 0:{
                    swap(arr,l,mid);
                    l++;mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    swap(arr,mid,h);
                    h--;
                    break;
                }
            }
        }
    }
    private static void swap(int arr[],int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {0,0,1,2,1,0,1,1,0,0,2,2,2,0,0,0,1,1,0};
        hoares(arr);
        System.out.println(Arrays.toString(arr));
    }
}
