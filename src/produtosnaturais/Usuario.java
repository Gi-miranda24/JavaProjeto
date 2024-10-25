/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produtosnaturais;

import java.util.List;

/**
 *
 * @author aluno
 */
public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private double telefone;
    List<Produto> produtos;
    
    public Usuario(String nome, String email, String senha, double telefone) {
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
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }
    
    //Validações especificas para Usuario
    protected void validarNome(String nome){
        if(nome == null || nome.trim(). isEmpty()){
            throw new IllegalArgumentException("O  campo nome não pode estar vazio.");
   
        }
    }
    protected void validarEmail(String email){
        if(email == null || email.trim(). isEmpty()){
            throw new IllegalArgumentException("o Campo email não pode estar vazia.");
   
        }
    }
    
    
    
    protected void validarSenha(String senha){
        if(senha == null || senha.trim(). isEmpty()){
            throw new IllegalArgumentException("O  campo senha não pode estar vazio.");
   
        }
    }
    protected void validarTelefone(double telefone){
        if(telefone == 0){
            throw new IllegalArgumentException("o Campo telefone não pode estar vazia.");
   
        }
    }
}
