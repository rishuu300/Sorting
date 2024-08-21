public class Intersection {
    public static void efficient(int a[], int b[]){
        int i=0, j=0;
        while(i<a.length && j<b.length){
            if(i>0 && a[i-1]==a[i]){
                i++;
                continue;
            }
            else if(a[i]>b[j])
                j++;
            else if(a[i]<b[j])
                i++;
            else{
                System.out.println(a[i]);
                i++;j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 2, 3 };
        int arr2[] = { 2, 3, 3, 4, 5, 5 };
        efficient(arr1, arr2);
    }
}
