package fab;

public class Defender implements Missao {
    private Piloto piloto;

    public Defender(Piloto piloto){
        this.piloto = piloto;
    }

    public void iniciar(){
        this.piloto.defender();
    }

    public void abortar(){
        this.piloto.atacar();
    }
}
