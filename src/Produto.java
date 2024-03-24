import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Produto {

    //Atributos
    private int codigo;
    private int fabricanteNumero;
    private String fabricanteNome;
    private String nomeProduto;
    private String descricaoDescricao;
    private double custo;
    private int estoque;
    private double valorVendaDoProduto;


    //Getters e Setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getFabricanteNumero() {
        return fabricanteNumero;
    }

    public void setFabricanteNumero(int fabricanteNumero) {
        this.fabricanteNumero = fabricanteNumero;
    }

    public String getFabricanteNome() {
        return fabricanteNome;
    }

    public void setFabricanteNome(String fabricanteNome) {
        this.fabricanteNome = fabricanteNome;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoDescricao() {
        return descricaoDescricao;
    }

    public void setDescricaoDescricao(String descricaoDescricao) {
        this.descricaoDescricao = descricaoDescricao;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getValorVendaDoProduto() {
        return valorVendaDoProduto;
    }

    public void setValorVendaDoProduto(double valorVendaDoProduto) {
        this.valorVendaDoProduto = valorVendaDoProduto;
    }

    //Metodos
    public void inserirDados()  {
        this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o Código: "));
        this.fabricanteNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número fabricante: "));
        this.fabricanteNome = JOptionPane.showInputDialog("Digite o nome fabricante: ");
        this.nomeProduto = JOptionPane.showInputDialog("Digite o nome do produto: ");
        this.descricaoDescricao = JOptionPane.showInputDialog("Digite a descrição: ");
        this.custo = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo:"));
        this.estoque = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade no estoque: "));
    }

    public double atualizarCusto(double taxa) {
        this.valorVendaDoProduto = this.custo + (this.custo * taxa / 100);
        return this.valorVendaDoProduto;
    }


    public void mostrarDados () {
        String mensagem = "Objeto produto criado a partir da classe Produto";

        mensagem += "\nCódigo: " + this.codigo;
        mensagem += "\nNúmero Fabricante: " + this.fabricanteNumero;
        mensagem += "\nNome Fabricante: " + this.fabricanteNome;
        mensagem += "\nNome do Produto: " + this.nomeProduto;
        mensagem += "\nDescrição: " + this.descricaoDescricao;
        mensagem += "\nCusto: " + this.custo;
        mensagem += "\nValor de Venda do Produto com taxa de entrega: " + this.valorVendaDoProduto;
        mensagem += "\nEstoque: " + this.estoque;

        NumberFormat formatar = DecimalFormat.getCurrencyInstance();

        JOptionPane.showMessageDialog(null, mensagem);


    }


}
