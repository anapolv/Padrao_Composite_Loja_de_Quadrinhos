import java.util.ArrayList;

public class CaixaAssinaturaComposite extends CaixaAssinaturaComponent {
    private ArrayList <CaixaAssinaturaComponent> itens = new ArrayList<CaixaAssinaturaComponent>();

    @Override
    public String getNomeItem(){
        String nome = nomeItem;
        return(nome);
    }
    
    @Override
    public float getPreco(){
        float soma = 0;
        for(int i=0; i<this.itens.size(); i++){
            soma = soma + this.itens.get(i).getPreco();
        }
        return(soma);
    }

    @Override
    public void add(CaixaAssinaturaComponent item){
        this.itens.add(item);
        
    }
    
    @Override
    public void remove(CaixaAssinaturaComponent item){
        int index;
        
        index = this.itens.indexOf(item);
        
        if(index != -1){
            this.itens.get(index).remove(item);
        }
        
    }
}
