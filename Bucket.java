import java.util.*;
public class Bucket {
    public static void bucket(int arr[], int k){
        int max=arr[0];
        for(int i=1; i<arr.length; i++)
            max = Math.max(max,arr[i]);
        max++;

        ArrayList<ArrayList<Integer>> bkt = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<k; i++)
            bkt.add(new ArrayList<>());

        for(int i=0; i<arr.length; i++){
            int bi = (k*arr[i])/max;
            bkt.get(bi).add(arr[i]);
        }

        for(int i=0; i<k; i++)
            Collections.sort(bkt.get(i));

        int idx = 0;
        for(int i=0; i<k; i++)
            for(int j=0; j<bkt.get(i).size(); j++)
                arr[idx++] = bkt.get(i).get(j);
    }
    public static void main(String[] args) {
        int arr[] = {4,3,5,2,6,4,2,2};
        bucket(arr,4);
        System.out.println(Arrays.toString(arr));
    }
}
