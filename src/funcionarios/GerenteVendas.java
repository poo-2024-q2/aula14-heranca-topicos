package funcionarios;

import java.util.ArrayList;

public final class GerenteVendas extends Gerente {
    public GerenteVendas(String nome, String cpf, double salarioBase, double descontos, Nivel nivel, ArrayList<Vendedor> equipe) {
        super(nome, cpf, salarioBase, descontos, nivel);
        this.equipe.addAll(equipe);
    }

    @Override
    protected double getAdicionais() {
        if (this.nivel == Nivel.JUNIOR) {
            return this.salarioBase * 0.1;
        } else if (this.nivel == Nivel.PLENO) {
            return this.salarioBase * 0.15;
        } else {
            return this.salarioBase * 0.2;
        }
    }
}
