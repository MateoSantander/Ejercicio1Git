public class Resta {
    private static int acumulado = 0;

    public static int resta2num(int n1, int n2){
        return n1-n2;
    }

    public static int restaAcumulada(int num){
        return acumulado -= num;
    }
}
