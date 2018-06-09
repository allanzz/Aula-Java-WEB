package br.com.casadocodigo.loja.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
@Entity
public class Livro {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String titulo;
	@Lob
	private String descricao;
	private BigDecimal preco;
	private int paginas;
	@ManyToMany
	private List<Autor> autores=new ArrayList<>();
	public List<Autor> getAutores() {
		return autores;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", descricao=" + descricao + ", preço=" + preco + ", paginas=" + paginas
				+ "]";
	}

}
