public class Suma {
    private static int acumulado = 0;

    public static int suma2num(int n1, int n2){
        return n1+n2;
    }

    public static int sumaAcumulada(int num){
        return acumulado += num;
    }
}