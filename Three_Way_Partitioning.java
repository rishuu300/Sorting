import java.util.ArrayList;
public class Three_Way_Partitioning {
    public void swap(ArrayList<Integer> arr, int i, int j){
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

    public void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public void rangeSort(int arr[], int a, int b){
        int low = 0, mid = 0, high = arr.length-1;
        
        while(mid<=high){
            if(arr[mid] < a){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid] >= a && arr[mid] <= b){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }

    public void sort012(ArrayList<Integer> arr) {
        int low = 0, mid = 0, high = arr.size()-1;
        
        while(mid<=high){
            if(arr.get(mid) == 0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr.get(mid) == 1){
                mid++;
            }
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public static void main(String[] args) {

    }
}
