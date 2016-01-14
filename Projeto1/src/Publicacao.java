import java.util.ArrayList;
import java.util.Date;

public class Publicacao {

	private Date dataPub;
	private String descricao;
	private boolean disponivel;
	private String id;
	private String titulo;
//	private Calendar dataRec;
	private ArrayList<Area> areas;

	public Publicacao(String titulo, Date dataPub, String descricao, String id, ArrayList<Area> areas) {
		this.titulo=titulo;
		this.dataPub=dataPub;
		this.descricao=descricao;
		this.id=id;
		this.disponivel=true;
	}

	public Date getDataPub() {
		return dataPub;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getTitulo() {
		return titulo;
	}

	public boolean getDisponibilidade() {
		return disponivel;
	}

	public ArrayList<Area> getAreas() {
		return areas;
	}
	
	public String getId() {
		return id;
	}

}
