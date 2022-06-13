public class Main {
    public static void main(String[] args) {
        String name;
        float valor;

        CaixaAssinaturaLeaf quadrinhos = new CaixaAssinaturaLeaf("Quadrinhos", 15);
        CaixaAssinaturaLeaf chaveiros = new CaixaAssinaturaLeaf("Chaveiros", 5);
        CaixaAssinaturaLeaf bustos = new CaixaAssinaturaLeaf("Bustos", 10);
        CaixaAssinaturaLeaf adesivos = new CaixaAssinaturaLeaf("Adesivos", 1);
        CaixaAssinaturaLeaf posters = new CaixaAssinaturaLeaf("Porters", 25);
        CaixaAssinaturaLeaf camisetas = new CaixaAssinaturaLeaf("Camisetas", 25);
        CaixaAssinaturaLeaf canetas = new CaixaAssinaturaLeaf("Canetas", 3);
        CaixaAssinaturaLeaf miniaturas = new CaixaAssinaturaLeaf("Miniaturas", 20);

        CaixaAssinaturaComposite platina = new CaixaAssinaturaComposite();

        //10 itens
        platina.add(quadrinhos);
        platina.add(chaveiros);
        platina.add(bustos);
        platina.add(adesivos);
        platina.add(posters);
        platina.add(camisetas);
        platina.add(canetas);
        platina.add(miniaturas);
        platina.add(quadrinhos);
        platina.add(posters);

        System.out.println("\n***** CATEGORIA PLATINA *****\n");

        name = quadrinhos.getNomeItem();
        System.out.println("Nome do item: " + name);
        valor = quadrinhos.getPreco();
        System.out.println("Preço do item: " + valor);

        name = chaveiros.getNomeItem();
        System.out.println("\nNome do item: " + name);
        valor = chaveiros.getPreco();
        System.out.println("Preço do item: " + valor);

        name = bustos.getNomeItem();
        System.out.println("\nNome do item: " + name);
        valor = bustos.getPreco();
        System.out.println("Preço do item: " + valor);

        name = adesivos.getNomeItem();
        System.out.println("\nNome do item: " + name);
        valor = adesivos.getPreco();
        System.out.println("Preço do item: " + valor);

        name = posters.getNomeItem();
        System.out.println("\nNome do item: " + name);
        valor = posters.getPreco();
        System.out.println("Preço do item: " + valor);

        name = camisetas.getNomeItem();
        System.out.println("\nNome do item: " + name);
        valor = camisetas.getPreco();
        System.out.println("Preço do item: " + valor);

        name = canetas.getNomeItem();
        System.out.println("\nNome do item: " + name);
        valor = canetas.getPreco();
        System.out.println("Preço do item: " + valor);

        name = miniaturas.getNomeItem();
        System.out.println("\nNome do item: " + name);
        valor = miniaturas.getPreco();
        System.out.println("Preço do item: " + valor);

        name = quadrinhos.getNomeItem();
        System.out.println("\nNome do item: " + name);
        valor = quadrinhos.getPreco();
        System.out.println("Preço do item: " + valor);

        name = posters.getNomeItem();
        System.out.println("\nNome do item: " + name);
        valor = posters.getPreco();
        System.out.println("Preço do item: " + valor);

        valor = platina.getPreco();

        System.out.println("\nPreço da Caixa de Assinatura Platina: " + valor);

        CaixaAssinaturaComposite ouro = new CaixaAssinaturaComposite();

        //7 itens
        ouro.add(quadrinhos);
        ouro.add(adesivos);
        ouro.add(posters);
        ouro.add(camisetas);
        ouro.add(canetas);
        ouro.add(canetas);
        ouro.add(miniaturas);

        System.out.println("\n\n***** CATEGORIA OURO *****\n");

        name = quadrinhos.getNomeItem();
        System.out.println("Nome do item: " + name);
        valor = quadrinhos.getPreco();
        System.out.println("Preço do item: " + valor);

        name = adesivos.getNomeItem();
        System.out.println("\nNome do item: " + name);
        valor = adesivos.getPreco();
        System.out.println("Preço do item: " + valor);

        name = posters.getNomeItem();
        System.out.println("\nNome do item: " + name);
        valor = posters.getPreco();
        System.out.println("Preço do item: " + valor);

        name = camisetas.getNomeItem();
        System.out.println("\nNome do item: " + name);
        valor = camisetas.getPreco();
        System.out.println("Preço do item: " + valor);

        name = canetas.getNomeItem();
        System.out.println("\nNome do item: " + name);
        valor = canetas.getPreco();
        System.out.println("Preço do item: " + valor);

        name = canetas.getNomeItem();
        System.out.println("\nNome do item: " + name);
        valor = canetas.getPreco();
        System.out.println("Preço do item: " + valor);

        name = miniaturas.getNomeItem();
        System.out.println("\nNome do item: " + name);
        valor = miniaturas.getPreco();
        System.out.println("Preço do item: " + valor);

        valor = ouro.getPreco();

        System.out.println("\nPreço da Caixa de Assinatura Ouro: " + valor);

        CaixaAssinaturaComposite prata = new CaixaAssinaturaComposite();

        //5 itens
        prata.add(miniaturas);
        prata.add(adesivos);
        prata.add(posters);
        prata.add(canetas);
        prata.add(miniaturas);

        System.out.println("\n\n***** CATEGORIA PRATA *****\n");

        name = miniaturas.getNomeItem();
        System.out.println("Nome do item: " + name);
        valor = miniaturas.getPreco();
        System.out.println("Preço do item: " + valor);

        name = adesivos.getNomeItem();
        System.out.println("\nNome do item: " + name);
        valor = adesivos.getPreco();
        System.out.println("Preço do item: " + valor);

        name = posters.getNomeItem();
        System.out.println("\nNome do item: " + name);
        valor = posters.getPreco();
        System.out.println("Preço do item: " + valor);

        name = canetas.getNomeItem();
        System.out.println("\nNome do item: " + name);
        valor = canetas.getPreco();
        System.out.println("Preço do item: " + valor);

        name = miniaturas.getNomeItem();
        System.out.println("\nNome do item: " + name);
        valor = miniaturas.getPreco();
        System.out.println("Preço do item: " + valor);

        valor = prata.getPreco();

        System.out.println("\nPreço da Caixa de Assinatura Prata: " + valor);

        CaixaAssinaturaComposite bronze = new CaixaAssinaturaComposite();

        //3 itens
        bronze.add(quadrinhos);
        bronze.add(camisetas);
        bronze.add(miniaturas);

        System.out.println("\n\n***** CATEGORIA BRONZE *****\n");

        name = quadrinhos.getNomeItem();
        System.out.println("Nome do item: " + name);
        valor = quadrinhos.getPreco();
        System.out.println("Preço do item: " + valor);

        name = camisetas.getNomeItem();
        System.out.println("\nNome do item: " + name);
        valor = camisetas.getPreco();
        System.out.println("Preço do item: " + valor);

        name = miniaturas.getNomeItem();
        System.out.println("\nNome do item: " + name);
        valor = miniaturas.getPreco();
        System.out.println("Preço do item: " + valor);

        valor = bronze.getPreco();

        System.out.println("\nPreço da Caixa de Assinatura Bronze: " + valor);

    }
}
