public class Inversions {
    public static int naive(int arr[]){
        int res = 0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]<arr[j])
                   res++;
            }
        }
        return res;
    }

    public static int merge(int arr[], int l, int m, int r){
        int res = 0;
        int n1 = m-l+1;
        int n2 = r-m;
        int left[] = new int[n1];
        int rigth[] = new int[n2];

        for(int i=0; i<n1; i++)
            left[i] = arr[l+i];
        for(int i=0; i<n2; i++)
            rigth[i] = arr[m+1+i];

        int i=0, j=0, k=l;
        while(i<n1 && j<n2){
            if(left[i]<=rigth[j])
               arr[k++] = left[i++];
            else{
                arr[k++] = rigth[j++];
                res += (n1-i);
            }
        }

        while(i<n1)
            arr[k++] = left[i++];
        while(j<n2)
            arr[k++] = rigth[j++];
        return res;
    }
    public static int efficient(int arr[], int l, int r){
        int res = 0;
        if(l<r){
            int m = l+(r-l)/2;
            res += efficient(arr, l, m);
            res += efficient(arr, m+1, r);
            res += merge(arr, l, m, r);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1, 20, 6, 4, 5};
        System.out.println(efficient(arr, 0, arr.length-1));
    }
}
