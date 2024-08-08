package funcionarios;

public abstract class Funcionario {
    protected String nome;
    protected String cpf;
    protected double salarioBase;
    protected double descontos;

    public Funcionario(String nome, String cpf, double salarioBase, double descontos) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
        this.descontos = descontos;
    }

    protected abstract double getAdicionais();

    public final double getSalarioBruto() {
        return this.salarioBase + this.getAdicionais();
    }

    public final double getSalarioLiquido() {
        return this.getSalarioBruto() - this.descontos;
    }
}
