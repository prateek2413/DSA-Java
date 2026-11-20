import java.io.BufferedReader;
import java.io.InputStreamReader;

class SolutionRotation{
    public boolean isRotation(String a, String b){
        if(a.length()!=b.length()){
            return false;
        }
        String s=a+a;
        return s.contains(b);

    }
}

public class CheckRotation {
    public static void main(String argh[])throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a=br.readLine();
        String b=br.readLine();
        SolutionRotation s1=new SolutionRotation();
        System.out.println(s1.isRotation(a,b));

    }
}
