import java.util.ArrayList;

public class Main {
    public Contador contador = new Contador();
    public static void main(String args[]) {
        ArrayList<Integer> moedas = new ArrayList<Integer>();
        moedas.add(100);
        moedas.add(50);
        moedas.add(25);
        moedas.add(10);

        Contador contador = new Contador();
        System.out.print(contador.calculoTroco(moedas, 150));
    }
    
    }
    
