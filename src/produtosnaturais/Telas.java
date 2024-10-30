package produtosnaturais;

import java.awt.Frame;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Telas {
    Scanner scanner = new Scanner(System.in);
    Frame frame = new Frame();
    Servico servico = new Servico();
    
    public void inicial() {
        while (true) {
            System.out.println("Bem-vindo a Natural Point! Digite uma das opções disponíveis:");
            System.out.println("1. Login como cliente");
            System.out.println("2. Cadastro como usuário");
            System.out.println("0. Encerrar sistema");

            String input = scanner.nextLine();

            switch (input) {
                case "1" -> loginUsuario();
                case "2" -> cadastrarUsuario();
                case "0" -> {
                    System.out.println("Sistema encerrado.");
                    scanner.close();
                    return; // Sai do método e encerra o programa
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
    
    public void cadastrarUsuario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Cadastro de Usuário ---");
        System.out.println("nome:");
        scanner.nextLine();
        String nome = scanner.nextLine();
        System.out.println("e-mail:");
        String email = scanner.nextLine();
        System.out.println("senha:");
        String senha = scanner.nextLine();
        System.out.println("Digite o telefone abaixo:");
        String telefone = scanner.nextLine();
        
        Usuario user = new Usuario(nome,email,senha,telefone);
        servico.usuariosCadastrados.add(user);
        System.out.println(servico.usuariosCadastrados.get(0));
        scanner.next();
        scanner.close();
    }
    
    public void cadastrarProdutos(){
        System.out.println("--- Cadastro de Produtos ---");
        System.out.println("nome:");
        String nome = JOptionPane.showInputDialog(null,"Nome do Produto:");
        System.out.println("Descrição:");
        String descricao = JOptionPane.showInputDialog(null,"Descrição do Produto:");
        System.out.println("Preço:");
        String preco = JOptionPane.showInputDialog(null,"Preço do Produto:");
        System.out.println("Categoria:");
        String categoria = JOptionPane.showInputDialog(null,"Categoria:");
    }
   
    public void loginUsuario() {
        String email;
        String senha;

        while (true) {
            System.out.println("Caso deseje voltar ao último menu, digite 0 e confirme");
            System.out.printf("Digite seu email: ");
            email = scanner.nextLine();
            
            if (email.equals("0")) {
                return; // Volta para o menu inicial
            }
            
            System.out.printf("Digite sua senha: ");
            senha = scanner.nextLine();

            

            if (senha.equals("0")) {
                return; // Volta para o menu inicial
            }

            // Aqui você deve verificar as credenciais do usuário.
            // Por enquanto, vamos usar credenciais fictícias.
            if (email.equals("usuario@exemplo.com") && senha.equals("senha123")) {
                //exibirPortfolio(); // Redireciona para exibirPortfolio
                return; // Sai do método após o sucesso
            } else {
                System.out.println("Credenciais incorretas. Tente novamente ou digite '0' para voltar.");
            }
        }
    }
    
    /*
     public void exibirPortifolio(){
       int i = 0;
       usuariologado é um exemplo. Este nome precisa ser mudado para o parâmetro que será inserido posteriormente.
       for(int i = 0; i < usuariologado.produtos.size() ; i++){
         System.out.println("Produtos:" + produto.getProduto());
         
           
           
       }
        
        
    }
     */
    public void msgErro(){
        System.out.println("Erro de validação ");
        System.out.println("E");
        String email = scanner.nextLine();
        System.out.println("Senha:");
        String senha = scanner.nextLine();
    }
    
    
}
