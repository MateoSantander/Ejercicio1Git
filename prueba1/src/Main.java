public class Main {
    public static void main(String[] args){
        int num1 = 12, num2= 10;
        System.out.println("Resultado suma de 2 numeros: " + Suma.suma2num(num1, num2));
        System.out.println("Resultado suma acumulada: " + Suma.sumaAcumulada(Suma.suma2num(num1, num2)));
        System.out.println("Resultado suma acumulada: " + Suma.sumaAcumulada(Suma.suma2num(num1, num2)));
        System.out.println("Resultado suma acumulada: " + Suma.sumaAcumulada(7));
        System.out.println("\n\n");
        System.out.println("Resultado resta de 2 numeros: " + Resta.resta2num(num1, num2));
        System.out.println("Resultado resta acumulada: " + Resta.restaAcumulada(Resta.resta2num(num1, num2)));
        System.out.println("Resultado resta acumulada: " + Resta.restaAcumulada(Resta.resta2num(num1, num2)));
        System.out.println("Resultado resta acumulada: " + Resta.restaAcumulada(7));
        System.out.println("\n\n");
    }
}
