package br.com.infob.controle_epi.controle_epi.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table(name="Usuario")
@Entity
public class Usuario{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="usuario_id")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="email")
    private String email;

    @Column(name="senha")
    private String senha;

    @Column(name="turma")
    private String turma;

    public Usuario() {
    }



    public Usuario(Integer id, String nome, String email, String senha, String turma) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.turma = turma;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

      
}



