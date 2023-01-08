package fab;

public class Piloto {
    private String nome;
    private String patente;
    private String acao;

    public Piloto(String nome, String patente){
        this.nome = nome;
        this.patente = patente;
    }

    public String getAcao(){
        return this.acao;
    }

    public void atacar(){
        this.acao = "O combatente está Atacando";
    }

    public void defender(){
        this.acao = "O combatente está Defendendo";
    }
}
