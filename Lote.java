public class Lote {
    private String ID;
    public Produto produto;
    private Integer quantidade;

    public Lote(String ID, Produto produto, Integer quantidade) {
        this.ID = ID;
        this.produto = produto;
        this.quantidade = quantidade;
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Produto getProduto() {
        return produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }


}
