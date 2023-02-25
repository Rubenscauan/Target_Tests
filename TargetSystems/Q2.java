import java.util.ArrayList;
import java.util.Scanner;

public class Q2{
    public static void main(String[] args){

        System.out.println("Informe um numero para ser se esta na fibonnaci");
        Scanner user = new Scanner(System.in);
        int numero = user.nextInt();
        user.close();
        
        ArrayList<Integer> fibonnaci = new ArrayList<Integer>();
        int a = 1;
        int b = 0;
        
        fibonnaci.add(b);
        fibonnaci.add(a);
        
        for(int i = 0; i < numero; i++){
            a +=b;
            b+=a;
            fibonnaci.add(a);
        }
        System.out.println(fibonnaci);
        if(fibonnaci.contains(numero)){
            System.out.println("pertence");
        }else  
            System.out.println("nao pertence");
    }
    
}