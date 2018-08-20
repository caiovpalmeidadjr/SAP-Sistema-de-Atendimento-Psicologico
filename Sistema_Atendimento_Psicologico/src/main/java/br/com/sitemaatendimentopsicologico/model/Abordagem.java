package br.com.sitemaatendimentopsicologico.model;

public class Abordagem {

	private long id;
	private String nome;
	private Psicologo psicologo;
	private TipoAbordagem tipoAbordagem;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Psicologo getPsicologo() {
		return psicologo;
	}

	public void setPsicologo(Psicologo psicologo) {
		this.psicologo = psicologo;
	}

	public TipoAbordagem getTipoAbordagem() {
		return tipoAbordagem;
	}

	public void setTipoAbordagem(TipoAbordagem tipoAbordagem) {
		this.tipoAbordagem = tipoAbordagem;
	}

}
