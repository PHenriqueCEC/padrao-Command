package fab;

public class AtacarAlvo implements Missao {
    private Piloto piloto;

    public AtacarAlvo(Piloto piloto){
        this.piloto = piloto;
    }

    public void iniciar(){
        this.piloto.atacar();
    }

    public void abortar(){
        this.piloto.defender();
    }
}
