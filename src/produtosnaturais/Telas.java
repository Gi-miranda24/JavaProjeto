/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtosnaturais;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Telas {
    Scanner scanner = new Scanner(System.in);
    
    public void cadastrarUsuario(){
        System.out.println("--- Cadastro de Usuário ---");
        System.out.println("nome:");
        String nome = scanner.nextLine();
        System.out.println("e-mail:");
        String email = scanner.nextLine();
        System.out.println("senha:");
        String senha = scanner.nextLine();
        System.out.println("telefone:");
        String telefone = scanner.nextLine();
    }
    
    public void cadastrarProdutos(){
        System.out.println("--- Cadastro de Produtos ---");
        System.out.println("nome:");
        String nome = scanner.nextLine();
        System.out.println("Descrição:");
        String descricao = scanner.nextLine();
        System.out.println("Preço:");
        String preco = scanner.nextLine();
        System.out.println("Categoria:");
        String categoria = scanner.nextLine();
    }
   
    public void loginUsuario(){
        System.out.println("--- Login do Usuário ---");
        System.out.println("Email:");
        String email = scanner.nextLine();
        System.out.println("Senha:");
        String senha = scanner.nextLine();
        
    }
     public void exibirPortifolio(){
       int i = 0;
       //usuariologado é um exemplo. Este nome precisa ser mudado para o parâmetro que será inserido posteriormente.
       //for(int i = 0; i < usuariologado.produtos.size() ; i++){
        //   System.out.println("Produtos:" + produto.getProduto());
           
           
      // }
        
        
    }
     
     public void msgErro(){
        System.out.println("Erro de validação ");
        System.out.println("E");
        String email = scanner.nextLine();
        System.out.println("Senha:");
        String senha = scanner.nextLine();
    }
    
    
}
