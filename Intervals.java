import java.util.Arrays;
import java.util.Comparator;
public class Intervals {
    public static void print(intervals arr[]){
        Arrays.sort(arr,new myComp());
        int res = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[res].end>arr[i].st){
                arr[res].st = Math.min(arr[res].st,arr[i].st);
                arr[res].end = Math.max(arr[res].end,arr[i].end);
            }
            else{
                res++;
                arr[res] = arr[i];
            }
        }

        for(int i=0; i<=res; i++)
            System.out.println(arr[i].st+" "+arr[i].end);
    }
    public static void main(String[] args) {
        intervals[] arr = {new intervals(5,10),
                        new intervals(3,15),
                        new intervals(18, 30),
                        new intervals(2,7)};
        print(arr);
    }   
}
class intervals{
    int st;
    int end;
    public intervals(int st, int end){
        this.st = st;
        this.end = end;
    }
}
class myComp implements Comparator<intervals>{
    public int compare(intervals a, intervals b){
        return (a.st - b.st);
    }
}