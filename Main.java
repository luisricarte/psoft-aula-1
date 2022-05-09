import com.sun.jdi.connect.Connector;

public class Main {

    public static void main(String args[]){
        Produto produto = new Produto("teste","nomeTeste", "fabricante");
        Lote lote = new Lote("idteste", produto,1);
    }
}
