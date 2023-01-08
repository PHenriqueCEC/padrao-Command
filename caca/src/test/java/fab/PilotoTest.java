package fab;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class PilotoTest {
    Piloto piloto;
    Militar militar;

    @BeforeEach
    void setUp(){
        piloto = new Piloto("Pedro", "Tenente");
        militar = new Militar();
    }


    @Test
    void deveAtacar() {
        Missao ataque = new AtacarAlvo(piloto);
        militar.iniciarMissao(ataque);

        assertEquals("O combatente está Atacando", piloto.getAcao());
    }

    @Test
    void deveDefender() {
        Missao defesa = new Defender(piloto);
        militar.iniciarMissao(defesa);

        assertEquals("O combatente está Defendendo", piloto.getAcao());
    }

    @Test
    void deveAbortarAtaque() {
        Missao defesa = new Defender(piloto);
        Missao ataque = new AtacarAlvo(piloto);

        militar.iniciarMissao(defesa);
        militar.iniciarMissao(ataque);

        militar.abortarUltimaMissao();

        assertEquals("O combatente está Defendendo", piloto.getAcao());
    }

    @Test
    void deveCancelarDefesa() {
        Missao defesa = new Defender(piloto);
        Missao ataque = new AtacarAlvo(piloto);

        militar.iniciarMissao(ataque);
        militar.iniciarMissao(defesa);

        militar.abortarUltimaMissao();

        assertEquals("O combatente está Atacando", piloto.getAcao());
    }
}
