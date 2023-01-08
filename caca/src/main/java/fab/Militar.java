package fab;

import java.util.ArrayList;
import java.util.List;

public class Militar {
    private List<Missao> missoes = new ArrayList<Missao>();

    public void iniciarMissao(Missao missao){
        this.missoes.add(missao);
        missao.iniciar();
    }

    public void abortarUltimaMissao() {
        if (missoes.size() != 0){
            Missao missao = this.missoes.get(this.missoes.size() - 1);
            missao.abortar();
            this.missoes.remove(this.missoes.size() - 1);
        }
    }
}
