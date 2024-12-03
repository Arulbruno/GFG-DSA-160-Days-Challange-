import java.io.*;
import java.util.* ;

public class LongestConsecutive {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        if(arr.length==0){
            return 0;
        }
        int temp=0;
        int c=1;
        int tot=1;
        // for(int i=0;i<arr.length;i++){
        //    for(int j=i+1;j<arr.length;j++){
        //        if(arr[i]>arr[j]){
        //            temp=arr[i];
        //            arr[i]=arr[j];
        //            arr[j]=temp;
        //        }
        //    }
        // }
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]==arr[i-1]+1){
                c++;
                tot=Math.max(tot,c);
            }
            else{
                c=1;
            }
        }
        return tot;
    }
}