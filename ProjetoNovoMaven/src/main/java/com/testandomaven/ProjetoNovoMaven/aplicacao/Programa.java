package com.testandomaven.ProjetoNovoMaven.aplicacao;

import com.testandomaven.ProjetoNovoMaven.dominio.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null,"Joao Piress", "joaopedropires61@gmail.com");
        Pessoa p2 = new Pessoa(null,"Ana Piress", "anapires@gmail.com");
        Pessoa p3 = new Pessoa(null,"Yasmin Piress", "yasminpires@gmail.com");
        Pessoa p4 = new Pessoa(null,"Sandro Soares", "sandrosoares@gmail.com");



        /* QUANDO INSTANCIAR  O OBJETO A BAIXO, PRECISA PASSAR COMO ARGUMENTO O NOME QUE ESTA DENTRO DA PASA META
        META-INF e DENTRO DO ARQUIVO PERSISTENCE PASSAR O PERSISTENCEUNITNAME COMO ARGUMENTO, CONFIGURANDO
        DE ACORCO COM AS INFORMACOES PASSADAS DENTRO DO ARQUIVO PERSISTENCE */
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");

        //CRIANDO CONEXAO COM O BANCO DE DADOS
        EntityManager em = emf.createEntityManager();

        //QUANDO O JPA FAZ UMA TRANSACAO QUE N E UMA SIMPLES LEITURA DO BD ELE PRECISA DE UMA TRANSACAO
        em.getTransaction().begin();

        //METODO PARA BUSCAR DENTRO DO BANCO DE DADOS ATRAVES DO ID
        Pessoa p = em.find(Pessoa.class, 4);
        System.out.println(p);
        
        //Adicionando objeto no DATABASE em.persist(p4);

        //CONFIRMANDO TRANSACOES FEITAS
        em.getTransaction().commit();


        System.out.println("Pronto!");
        em.close();
        emf.close();

    }
}
