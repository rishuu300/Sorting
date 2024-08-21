import java.util.Arrays;
public class Pairs {
    public static int getIndex(int y[], int x){
        int l=0, r=y.length-1, ans=-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(y[mid]>x){
                r = mid-1;
                ans=mid;
            }
            else
                l = mid+1;
        }
        return ans;
    }
    public static long countPairs(int x[], int y[]){
        Arrays.sort(x);
        Arrays.sort(y);
        int zeros=0, ones=0, two=0, three=0, four=0;
        for(int i=0; i<y.length-1; i++){
            if(y[i]==0)zeros++;
            if(y[i]==1)ones++;
            if(y[i]==2)two++;
            if(y[i]==3)three++;
            if(y[i]==4)four++;
        }

        long count=0;
        for(int i=0; i<x.length; i++){
            if(x[i]==0)continue;
            else if(x[i]==1)count+=zeros;
            else if(x[i]==2){
                int idx = getIndex(y,2);
                if(idx!=-1)count+=(y.length-idx);
                count-=three;
                count-=four;
                count+=zeros;
                count+=ones;
            }
            else{
                int idx = getIndex(y,x[i]);
                if(idx!=-1)count+=(y.length-idx);
                count+=ones;
                count+=zeros;
                if(x[i]==3)count+=two;
            }
        }
        return count;
    }
}
