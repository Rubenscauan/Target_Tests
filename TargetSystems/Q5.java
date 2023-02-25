
import java.util.Vector;


public class Q5 {
    public static void main(String[] args){
        String string = "abcdefghijklmnopqrstuvwxyz";
        Vector<Character> invertido = new Vector<>();
        for(int i = string.length()-1; i > -1; i--){
            invertido.add(string.charAt(i));
        }
        System.out.println(invertido);
        invertido.toString();
    }
}

