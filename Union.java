public class Union {
    public static void union(int a[], int b[]){
        int i=0, j=0;
        while(i<a.length && j<b.length){
            if(i>0 && a[i-1]==a[i]){
                i++;
                continue;
            }
            else if(j>0 && b[j-1]==b[j]){
                j++;
                continue;
            }
            else if(a[i]<b[j]){
                System.out.println(a[i]);
                i++;
            }
            else if(b[j]<a[i]){
                System.out.println(b[j]);
                j++;
            }
            else{
                System.out.println(a[i]);
                i++;j++;
            }
        }
        while(i<a.length){
            if(i>0 && a[i-1]==a[i]){
                i++;
                continue;
            }
            else{
                System.out.println(a[i]);
                i++;
            }
        }
        while(j<b.length){
            if(j>0 && b[j-1]==b[j]){
                j++;
                continue;
            }
            else{
                System.out.println(b[j]);
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 2, 3 };
        int arr2[] = { 2, 3, 3, 4, 5, 5 };
        union(arr1, arr2);
    }
}
