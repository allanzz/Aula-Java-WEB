package br.com.casadocodigo.loja.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Livro {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	public Integer getId() {
		return id;
	}
	@NotEmpty
	@NotNull
	private String titulo;
	@Lob
	@Length(min=10)
	private String descricao;
	@DecimalMin("20")
	private BigDecimal preco;
	@Min(50)
	private int paginas;
	@ManyToMany
	@Size(min=1)
	@NotNull
	private List<Autor> autores=new ArrayList<>();
	@Temporal(TemporalType.DATE)
	@NotNull
	Calendar dataDePublicacao;
	String capaPath;
	
	public Calendar getDataDePublicacao() {
		return dataDePublicacao;
	}
	public void setDataDePublicacao(Calendar dataDePublicacao) {
		this.dataDePublicacao = dataDePublicacao;
	}
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
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
	public String getCapaPath() {
		return capaPath;
	}
	public void setCapaPath(String capaPath) {
		this.capaPath = capaPath;
	}
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", descricao=" + descricao + ", preço=" + preco + ", paginas=" + paginas
				+ "]";
	}

}
