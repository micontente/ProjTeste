
import java.io.*;
import java.util.*;

public class Requisicao {

	private Date dataDevolvido;// = dataRequisicao-1dia;
	private Calendar dataRequisicao = Calendar.getInstance();
	private Utilizador leitor;
	private Publicacao publicacao;
	private Calendar dataDevolucao;

	public Requisicao(Utilizador leitor, Publicacao publicacao) {
		
		this.leitor=leitor;
		this.publicacao=publicacao;
//		dataDevolucao --> em funcao de publicacao.getMaxDiasRequisicao();
	}

	public Date getDataDevolvido() {
		return dataDevolvido;
	}

	public void setDataDevolvido(Date dataDevolvido) {
		this.dataDevolvido = dataDevolvido;
	}

	public Calendar getDataRequisicao() {
		return dataRequisicao;
	}

	public void setDataRequisicao(Calendar dataRequisicao) {
		this.dataRequisicao = dataRequisicao;
	}

	public Utilizador getLeitor() {
		return leitor;
	}

	public void setLeitor(Utilizador leitor) {
		this.leitor = leitor;
	}

	public Publicacao getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}

	public Calendar getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Calendar dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}



}
