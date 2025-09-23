import jogo.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class JogoTest {

    @Test
    void deveGanharNoPrimeiroTurnoCom7() {
        // Arrange
        Dado d1 = mock(Dado.class);
        Dado d2 = mock(Dado.class);
        Jogador jogador = mock(Jogador.class);

        when(jogador.lancar(d1, d2)).thenReturn(7);

        Jogo jogo = new Jogo(jogador, d1, d2);

        // Act
        boolean resultado = jogo.jogo();

        // Assert
        assertTrue(resultado);
    }

    @Test
    void devePerderNoPrimeiroTurnoCom2() {
        Dado d1 = mock(Dado.class);
        Dado d2 = mock(Dado.class);
        Jogador jogador = mock(Jogador.class);

        when(jogador.lancar(d1, d2)).thenReturn(2);

        Jogo jogo = new Jogo(jogador, d1, d2);

        boolean resultado = jogo.jogo();

        assertFalse(resultado);
    }

    @Test
    void deveGanharNoSegundoTurnoComMesmoPonto() {
        Dado d1 = mock(Dado.class);
        Dado d2 = mock(Dado.class);
        Jogador jogador = mock(Jogador.class);

        when(jogador.lancar(d1, d2))
                .thenReturn(5)   // primeiro lançamento define ponto
                .thenReturn(3)   // não ganha ainda
                .thenReturn(5);  // acerta o ponto e ganha

        Jogo jogo = new Jogo(jogador, d1, d2);

        boolean resultado = jogo.jogo();

        assertTrue(resultado);
    }

    @Test
    void devePerderNoSegundoTurnoCom7() {
        Dado d1 = mock(Dado.class);
        Dado d2 = mock(Dado.class);
        Jogador jogador = mock(Jogador.class);

        when(jogador.lancar(d1, d2))
                .thenReturn(6)  // primeiro ponto
                .thenReturn(7); // perde no segundo lançamento

        Jogo jogo = new Jogo(jogador, d1, d2);

        boolean resultado = jogo.jogo();

        assertFalse(resultado);
    }
}
