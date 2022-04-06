import java.util.ArrayList;

public class Contador {
    public void contador(){}

    public ArrayList<Integer> calculoTroco(ArrayList<Integer> moedas, int valor){
        int contador = 0 ;
        ArrayList<Integer> troco = new ArrayList<>();
        for(int i=0; i < moedas.size(); i++){
            while(moedas.get(i) <= valor){
                troco.add(moedas.get(i));
                valor = valor - moedas.get(i);
                contador++;
            }
        }
        return troco;
    }
}
