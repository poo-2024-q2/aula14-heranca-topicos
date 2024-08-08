package funcionarios;

public class AssistenteAdministrativo extends Funcionario {
    private double horasExtras;

    public AssistenteAdministrativo(String nome, String cpf, double salarioBase, double descontos, double horasExtras) {
        super(nome, cpf, salarioBase, descontos);
        this.horasExtras = horasExtras;
    }

    @Override
    protected double getAdicionais() {
        return this.salarioBase / 220 * 1.5 * this.horasExtras;
    }
}
