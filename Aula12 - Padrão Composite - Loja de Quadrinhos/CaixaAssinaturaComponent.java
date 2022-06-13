public abstract class CaixaAssinaturaComponent {
    String nomeItem;
    float preco;

    public abstract String getNomeItem();
    public abstract float getPreco();
    public abstract void add(CaixaAssinaturaComponent itemCaixa);
    public abstract void remove(CaixaAssinaturaComponent itemCaixa);
}