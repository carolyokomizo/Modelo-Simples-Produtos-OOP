public class Main {

    public static void main(String[] args) {

        Produto prod1 = new Produto();
        prod1.inserirDados();
        prod1.atualizarCusto(5);
        prod1.mostrarDados();

        System.out.println("Codigo do Produto: " + prod1.getCodigo());
        System.out.println("Numero de Fabricante: " + prod1.getFabricanteNumero());
        System.out.println("Nome do Fabricante: " + prod1.getFabricanteNome());
        System.out.println("Nome do Produto: " + prod1.getFabricanteNome());
        System.out.println("Descricao: " + prod1.getDescricaoDescricao());
        System.out.println("Custo: " + prod1.getCusto());
        System.out.println("Valor final do Produto com taxa de entrega: " + prod1.getValorVendaDoProduto());
        System.out.println("Estoque: " + prod1.getEstoque());

//--------------------------------------------------------------------------------------

        System.out.println("-------------------------------------------------------------");

        Videogame game1 = new Videogame();
        game1.inserirDados();
        game1.atualizarCusto(5);
        game1.mostrarDados();

        System.out.println("Codigo do Produto: " + game1.getCodigo());
        System.out.println("Numero de Fabricante: " + game1.getFabricanteNumero());
        System.out.println("Nome do Fabricante: " + game1.getFabricanteNome());
        System.out.println("Nome do Produto: " + game1.getFabricanteNome());
        System.out.println("Descricao: " + game1.getDescricaoDescricao());
        System.out.println("Custo: " + game1.getCusto());
        System.out.println("Valor final do Produto: " + game1.getValorVendaDoProduto());
        System.out.println("Estoque: " + game1.getEstoque());

//--------------------------------------------------------------------------------------

        System.out.println("-------------------------------------------------------------");

        Smartphone phone1 = new Smartphone();
        phone1.inserirDados();
        phone1.atualizarCusto(5);
        phone1.mostrarDados();

        System.out.println("Codigo do Produto: " + phone1.getCodigo());
        System.out.println("Numero de Fabricante: " + phone1.getFabricanteNumero());
        System.out.println("Nome do Fabricante: " + phone1.getFabricanteNome());
        System.out.println("Nome do Produto: " + phone1.getFabricanteNome());
        System.out.println("Descricao: " + phone1.getDescricaoDescricao());
        System.out.println("Custo: " + phone1.getCusto());
        System.out.println("Valor final do Produto: " + phone1.getValorVendaDoProduto());
        System.out.println("Estoque: " + phone1.getEstoque());

//--------------------------------------------------------------------------------------

        System.out.println("-------------------------------------------------------------");

        Headset headset1 = new Headset();
        headset1.inserirDados();
        headset1.atualizarCusto(5);
        headset1.mostrarDados();

        System.out.println("Codigo do Produto: " + headset1.getCodigo());
        System.out.println("Numero de Fabricante: " + headset1.getFabricanteNumero());
        System.out.println("Nome do Fabricante: " + headset1.getFabricanteNome());
        System.out.println("Nome do Produto: " + headset1.getFabricanteNome());
        System.out.println("Descricao: " + headset1.getDescricaoDescricao());
        System.out.println("Custo: " + headset1.getCusto());
        System.out.println("Valor final do Produto: " + headset1.getValorVendaDoProduto());
        System.out.println("Estoque: " + headset1.getEstoque());

        System.out.println("-------------------------------------------------------------");
        System.out.println("Fim!");
    }


}
