public class Suma {
    private int n1, n2, acumulado = 0;

    public int Suma2num(int n1, int n2){
        return SumaTotal(n1+n2,acumulado);
    }

    public int SumaTotal(int num, int acumulado){
        return acumulado += num;
    }
}