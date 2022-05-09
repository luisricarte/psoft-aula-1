
public class Produto {
    private String ID;
    private String nome;
    private String fabricante;

    public Produto(String ID, String nome, String fabricante) {
        this.ID = ID;
        this.nome = nome;
        this.fabricante = fabricante;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String retornaProduto(Produto produto){
        return produto.nome;
    }
}
