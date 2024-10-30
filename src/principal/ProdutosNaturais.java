

package principal;


import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;
import produtosnaturais.Telas;
import produtosnaturais.Usuario;

/**
 *
 * @author aluno
 */
public class ProdutosNaturais {
    
   
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Telas tela = new Telas();
        tela.inicial();
    }  
}
