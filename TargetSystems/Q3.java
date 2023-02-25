import java.util.ArrayList;
import java.util.Collections;

public class Q3 {
    public static void main(String[] args){
        ArrayList<Double> faturado = new ArrayList<>();
        faturado.add(12d);
        faturado.add(13d);
        faturado.add(11d);
        faturado.add(6d);
        faturado.add(0d);
        faturado.add(19d);
        System.out.println(Collections.max(faturado));
        System.out.println(Collections.min(faturado));
        double media = 0;
        int tamanho = faturado.size();
        for(double valor:faturado){
            if(valor == 0){
                tamanho--;
                continue;
        }
            media = media + valor;
        }
        media = media/tamanho;
        System.out.println(media);
    }
}
