public class Main {
    public static void main(String[] args){
        int num1 = 12, num2= 10;
        Suma sum = new Suma();
        Resta rest = new Resta();
        System.out.println("Resultado suma de 2 numeros: " + sum.suma2num(num1, num2));
        System.out.println("Resultado suma acumulada: " + sum.sumaAcumulada(sum.suma2num(num1, num2)));
        System.out.println("Resultado suma acumulada: " + sum.sumaAcumulada(sum.suma2num(num1, num2)));
        System.out.println("Resultado suma acumulada: " + sum.sumaAcumulada(7));
        System.out.println("\n\n");
        System.out.println("Resultado resta de 2 numeros: " + rest.resta2num(num1, num2));
        System.out.println("Resultado resta acumulada: " + rest.restaAcumulada(rest.resta2num(num1, num2)));
        System.out.println("Resultado resta acumulada: " + rest.restaAcumulada(rest.resta2num(num1, num2)));
        System.out.println("Resultado resta acumulada: " + rest.restaAcumulada(7));
    }
}
