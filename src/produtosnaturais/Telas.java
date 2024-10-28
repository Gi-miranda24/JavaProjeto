/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtosnaturais;

import java.awt.Frame;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Telas {
    Scanner scanner = new Scanner(System.in);
    Frame frame = new Frame();
    
    public void inicial() {
        boolean continuar = true;
        int opcao = 0;
       
        System.out.println("--- Bem-vindo a Natural Point! ---");
        System.out.println("Digite uma das seguintes opções:");
        System.out.printf("""
                          1. Login como cliente\n
                          2. Cadastro como cliente\n
                          0. Encerrar interação.
                          """);
        System.out.println("Digite sua opção: ");
        do{
        try {
                String input = scanner.nextLine();
                // Se a leitura for bem-sucedida, você pode sair do loop.
                try {
                        opcao = Integer.parseInt(input); // Converte a string para inteiro
                         // Se a conversão for bem-sucedida, sai do loop
                }catch (NumberFormatException e) {
                        System.out.printf("Erro: Você deve digitar um número inteiro válido. Digite sua opção: ");
                        continue;
                }
                
                switch(opcao){
                    case 1:
                    loginUsuario();
                    break;
                case 2: 
                    cadastrarUsuario();
                    break;
                case 0:
                    return;
                default:
                    System.out.printf("""
                                       Opção inválida. Digite uma opção existente para continuar: """);
                    break;
                }
            
            } catch (InputMismatchException e) {
                System.out.printf("Opção inválida. Digite uma opção existente para continuar: ");
                // Limpa o buffer do scanner
                scanner.next(); // Consumir o valor inválido
            }
        }while(continuar);
    }
    
    public void cadastrarUsuario(){
        System.out.println("--- Cadastro de Usuário ---");
        System.out.println("nome:");
        String nome = JOptionPane.showInputDialog(frame,"Digite seu nome:");
        frame.setFocusable(true);
        System.out.println("e-mail:");
        String email = JOptionPane.showInputDialog(frame,"Digite seu email:");
        System.out.println("senha:");
        String senha = JOptionPane.showInputDialog(null,
                "Senha deve ter 8 caracteres, pelo menos um número, uma letra maiúscula e um caractere especial"+"Digite a senha:");
        double telefone = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite seu telefone:"));
        scanner.next();
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
   
    public void loginUsuario(){
        System.out.println("--- Login do Usuário ---");
        System.out.println("Email:");
        String email = JOptionPane.showInputDialog(null,"Digite seu nome:");
        System.out.println("Senha:");
        String senha = JOptionPane.showInputDialog(null,"Digite a senha:");
        
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
