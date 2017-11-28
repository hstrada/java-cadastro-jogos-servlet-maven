package br.senai.sp.model;

public class Jogo {

	private Long id;
	private String nome;
	private String desenvolvedor;
	private String genero;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDesenvolvedor() {
		return desenvolvedor;
	}

	public void setDesenvolvedor(String desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Jogo(Long id, String nome, String desenvolvedor, String genero) {
		super();
		this.id = id;
		this.nome = nome;
		this.desenvolvedor = desenvolvedor;
		this.genero = genero;
	}

	public Jogo() {

	}

	@Override
	public String toString() {
		return "Jogo [id=" + id + ", nome=" + nome + ", desenvolvedor=" + desenvolvedor + ", genero=" + genero + "]";
	}

}
