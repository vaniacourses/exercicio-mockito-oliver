package jogo;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import jogo.Dado;
import jogo.Jogador;
import jogo.Jogo;

public class JogoTest {

		Jogador jogador = mock(Jogador.class);
		Dado dadinho1 = mock(Dado.class);
		Dado dadinho2 = mock(Dado.class);

        @Test
        @DisplayName("Testar resultado 7 (ganhar)") 
        public boolean lancarReturnTrue7() {
            when(jogador.lancar(dadinho1, dadinho2)).thenReturn(7);
            boolean result = jogo();
            if(result){
                return True;
            } else {
                return False;
            }
        }

        @Test
        @DisplayName("Testar resultado 11 (ganhar)") 
        public boolean lancarReturnTrue11() {
            when(jogador.lancar(dadinho1, dadinho2)).thenReturn(11);
            boolean result = jogo();
            if(result){
                return True;
            } else {
                return False;
            }
        }

        @Test
        @DisplayName("Testar resultado 2 (perder)") 
        public boolean lancarReturnFalse2(){
            when(jogador.lancar(dadinho1, dadinho2)).thenReturn(2);
            boolean result = jogo();
            if(!result){
                return True;
            } else {
                return False;
            }
        }

        @Test
        @DisplayName("Testar resultado 3 (perder)") 
        public boolean lancarReturnFalse3(){
            when(jogador.lancar(dadinho1, dadinho2)).thenReturn(3);
            boolean result = jogo();
            if(!result){
                return True;
            } else {
                return False;
            }
        }

        @Test
        @DisplayName("Testar resultado 12 (perder)") 
        public boolean lancarReturnFalse12(){
            when(jogador.lancar(dadinho1, dadinho2)).thenReturn(12);
            boolean result = jogo();
            if(!result){
                return True;
            } else {
                return False;
            }
        }
}