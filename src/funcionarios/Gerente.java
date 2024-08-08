package funcionarios;

import java.util.ArrayList;

public abstract class Gerente extends Funcionario {
    protected enum Nivel {
        JUNIOR, PLENO, SENIOR
    }

    protected Nivel nivel;
    protected ArrayList<Funcionario> equipe;

    public Gerente(String nome, String cpf, double salarioBase, double descontos, Nivel nivel) {
        super(nome, cpf, salarioBase, descontos);
        this.nivel = nivel;
        this.equipe = new ArrayList<>();
    }
}
