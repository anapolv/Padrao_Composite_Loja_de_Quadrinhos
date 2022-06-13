public class CaixaAssinaturaLeaf extends CaixaAssinaturaComponent {
    public CaixaAssinaturaLeaf(String nomeItem, float preco){
        this.nomeItem = nomeItem;
        this.preco = preco;
    }

    @Override
    public String getNomeItem(){
        return(this.nomeItem);
    }

    @Override
    public float getPreco(){
        return(this.preco);
    }

    @Override
    public void add(CaixaAssinaturaComponent item){
        System.out.println("Adicione o item na caixa de assinatura.");
    }

    @Override
    public void remove(CaixaAssinaturaComponent item){
        System.out.println("Remova o item da caixa de assinatura.");
    }
}
