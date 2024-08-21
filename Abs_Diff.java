import java.util.*;
public class Abs_Diff {
    public static void absDiff(List<Integer>list, int x){
        Collections.sort(list,(a,b) -> Math.abs(x-a) - Math.abs(x-b));
    }
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>(List.of(10,5,3,9,2));
        absDiff(list, 7);
        for(int num:list)
            System.out.print(num+" ");
    }
}
