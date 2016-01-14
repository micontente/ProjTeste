
import java.io.*;
import java.util.*;

public class Publicacao {

	private boolean requisitavel;
	private int maxDiasRequisicao;
	private Date dataPub;
	private String descricao;
	private boolean disponivel;
	private String id;
	private String titulo;
	private Calendar dataRec;
	private ArrayList<Area> Areas;

	public Publicacao(String titulo, Date dataPub, String descricao, String id, int maxDiasRequisicao) {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public Date getDataPub() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public String getDescricao() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public String getTitulo() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public Boolean getPermissaoReq() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public Boolean getDisponibilidade() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public Calendar getDataRec() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public ArrayList<Area> getAreas() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}
	public String getId() {
		return id;
	}

//	public void setId(String id) {
//		this.id = id;
//	}
	public int getMaxDiasRequisicao(){
		return maxDiasRequisicao;
	}
	

}
