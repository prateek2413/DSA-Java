import java.io.BufferedReader;
import java.io.InputStreamReader;

class SolutionStringCompress{
    public String stringCompress(String s){
        StringBuilder sb=new StringBuilder();
        if(s==null||s.isEmpty()){
            return sb.toString();
        }
        int count = 1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }else{
                sb.append(s.charAt(i)).append(count);
                count=1;
            }
        }
        sb.append(s.charAt(s.length() - 1)).append(count);
        return sb.toString();
    }
}
public class StringCompress {
    public static void main(String args[])throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        SolutionStringCompress s1=new SolutionStringCompress();
        System.out.println(s1.stringCompress(s));
        
    }
}
