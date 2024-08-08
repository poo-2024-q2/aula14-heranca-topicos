package funcionarios;

import java.util.ArrayList;

public class GerenteAdministrativo extends Gerente {
    public GerenteAdministrativo(String nome, String cpf, double salarioBase, double descontos, Nivel nivel, 
        ArrayList<AssistenteAdministrativo> equipe) {
        super(nome, cpf, salarioBase, descontos, nivel);
        this.equipe.addAll(equipe);
    }

    @Override
    protected double getAdicionais() {
        if (this.nivel == Nivel.JUNIOR) {
            return this.salarioBase * 0.05;
        } else if (this.nivel == Nivel.PLENO) {
            return this.salarioBase * 0.1;
        } else {
            return this.salarioBase * 0.15;
        }
    }
}
