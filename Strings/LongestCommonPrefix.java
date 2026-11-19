

import java.io.BufferedReader;
import java.io.InputStreamReader;
class Solution{
    public String LongestCommonPrefix(String[] arr){
        String prefix=arr[0];
        for(int i=1;i<arr.length;i++){
            while(!arr[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }

}

public class LongestCommonPrefix {
    public static void main (String args[])throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=br.readLine();
        }
        Solution sl=new Solution();
        System.out.println(sl.LongestCommonPrefix(arr));
        
    }
}
