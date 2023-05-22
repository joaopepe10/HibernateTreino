package com.testandomaven.ProjetoNovoMaven.dominio;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Pessoa implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer idConta;

    private String nome;
    private String email;

    public Pessoa() {
    }

    public Pessoa(Integer idConta,String nome, String email) {
        super();
        this.idConta = idConta;
        this.nome = nome;
        this.email = email;
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
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

    @Override
    public String toString() {
        return "Pessoa [id=" + getIdConta() + ", nome=" + nome + ", email=" + email + "]";
    }



}