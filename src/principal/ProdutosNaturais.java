

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
        
         Scanner scanner = new Scanner(System.in);
         Telas tela  = new Telas();
         List<Usuario> usuariosCadastrados;
          
         tela.cadastrarUsuario();
         tela.cadastrarProdutos();
         tela.loginUsuario();
         tela.msgErro();
        
    }
    
    
}
