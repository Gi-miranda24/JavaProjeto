/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtosnaturais;

import java.util.Scanner;

import java.util.List;

/**
 *
 * @author aluno
 */

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    List<Produto> produtos;
    List<Usuario> usuariosCadastrados;
    
    public Usuario(String nome, String email, String senha, String telefone) {
        validarNome(nome);//Validação ocorre aqui
        validarEmail(email);//Validação ocorre aqui
        validarSenha(senha);//Validação ocorre aqui
        validarTelefone(telefone);//Validação ocorre aqui
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        validarNome(nome);//Validação reaplicada se o nome for alterado
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        validarEmail(email);//Validação reaplicada se o nome for alterado
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        validarSenha(senha);//Validação reaplicada se o nome for alterado
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        validarTelefone(telefone);//Validação reaplicada se o nome for alterado
        this.telefone = telefone;
    }
    
    //Validações especificas para Usuario
    protected void validarNome(String nome){
        if(nome == null || nome.isEmpty()){
            System.out.println("O  campo nome não pode estar vazio.");
   
        }
    }
    
    protected void validarEmail(String email){
        if(email == null || email.isEmpty()){
            System.out.println("O Campo email não pode estar vazia.");
        }
    }
      
    protected void validarSenha(String senha){
        if(senha == null || senha.isEmpty()){
            System.out.println("O  campo senha não pode estar vazio.");
   
        }
        //Verifica o comprimento mínimo
        if (senha.length() < 8) {
            System.out.println("A senha deve ter pelo menos 8 caracteres.");
        }
    
        // Verifica se a senha contém pelo menos um número
        if (!senha.matches(".*\\d.*")) {
            System.out.println("A senha deve conter pelo menos um número.");
        }

        // Verifica se a senha contém pelo menos uma letra maiúscula
        if (!senha.matches(".*[A-Z].*")) {
            System.out.println("A senha deve conter pelo menos uma letra maiúscula.");
        }
       // Verifica se a senha contém pelo menos um caractere especial
        if (!senha.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
            System.out.println("A senha deve conter pelo menos um caractere especial.");
        }
      } 
    
    protected void validarTelefone(String telefone){
        if(email == null || email.trim().isEmpty()){
            throw new IllegalArgumentException("O Campo email não pode estar vazia.");
   
        }
    }
    
    
}
