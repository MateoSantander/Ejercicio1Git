public class Main {
    public static void main(String[] args){
        int num1 = 12, num2= 10, acumulado = 0;
        Suma sum = new Suma();
        System.out.println("Resultado suma de 2 numeros: " + sum.suma2num(num1, num2));
        System.out.println("Resultado suma acumulada: " + sum.sumaAcumulada(sum.suma2num(num1, num2)));
        System.out.println("Resultado suma acumulada: " + sum.sumaAcumulada(sum.suma2num(num1, num2)));
        System.out.println("Resultado suma acumulada: " + sum.sumaAcumulada(sum.suma2num(num1, num2)));
    }
}
