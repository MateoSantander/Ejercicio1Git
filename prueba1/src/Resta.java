public class Resta {
    private int acumulado = 0;

    public int resta2num(int n1, int n2){
        return n1-n2;
    }

    public int restaAcumulada(int num){
        return acumulado -= num;
    }
}
