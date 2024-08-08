package funcionarios;

public class Vendedor extends Funcionario {
    private double vendas;
    private double taxaComissao;

    public Vendedor(String nome, String cpf, double salarioBase, double descontos, double vendas, double taxaComissao) {
        super(nome, cpf, salarioBase, descontos);
        this.vendas = vendas;
        this.taxaComissao = taxaComissao;
    }

    @Override
    protected double getAdicionais() {
        return this.vendas * this.taxaComissao;
    }
}
