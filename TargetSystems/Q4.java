public class Q4{
    public static void main(String[] args){
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double total = sp+rj+mg+es+outros;

        System.out.println(total);

        System.out.println(calcula_percent(total, sp));
        

    }
    public static double calcula_percent(double total, double desejado){
        double valor=0;
        desejado = desejado*100;
        valor = desejado/total;
        return valor;
    }
}