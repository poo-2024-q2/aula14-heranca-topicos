package funcionarios;

public class ClasseAnonima {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", "123.456.789-00", 1000, 100) {
            @Override
            protected double getAdicionais() {
                return salarioBase * 0.3;
            }
        };
        System.out.printf("Salário bruto: %.2f\n", funcionario.getSalarioBruto());
        System.out.printf("Adicionais: %.2f\n", funcionario.getAdicionais());
        System.out.printf("Salário líquido: %.2f\n", funcionario.getSalarioLiquido());
    }
}
