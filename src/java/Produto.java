/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author saimor
 */

@Entity
@Table(name = "produto")
public class Produto implements Serializable{
    @Id
    @GeneratedValue
    
    @Column(name = "cod_produto")
    private Integer cod_produto;
    
    @Column(name = "quantidade")
    private Integer quantidade;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "preco")
    private BigDecimal preco;
    
    @Column(name = "tipo")
    private String tipo;

    public Integer getCod_produto() {
        return cod_produto;
    }

    public void setCod_produto(Integer cod_produto) {
        this.cod_produto = cod_produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + Objects.hashCode(this.cod_produto);
        hash = 41 * hash + Objects.hashCode(this.quantidade);
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + Objects.hashCode(this.preco);
        hash = 41 * hash + Objects.hashCode(this.tipo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.cod_produto, other.cod_produto)) {
            return false;
        }
        if (!Objects.equals(this.quantidade, other.quantidade)) {
            return false;
        }
        return Objects.equals(this.preco, other.preco);
    }

    public Produto(Integer cod_produto, Integer quantidade, String nome, BigDecimal preco, String tipo) {
        this.cod_produto = cod_produto;
        this.quantidade = quantidade;
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }
    
    public Produto() {
        this.cod_produto = 0;
        this.quantidade = 0;
        this.nome = "";
        this.preco = null;
        this.tipo = "";
    }
    
    @Override
    public String toString() {
        return "Produto{" + "cod_produto=" + cod_produto + ", quantidade=" + quantidade + ", nome=" + nome + ", preco=" + preco + ", tipo=" + tipo + '}';
    }

    
    
}
