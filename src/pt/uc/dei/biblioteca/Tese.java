package pt.uc.dei.biblioteca;

import java.util.ArrayList;
import java.util.Date;

public class Tese extends NaoPeriodica {

	private String autor;
	private String orientador;
	private boolean mestrado;
	private final boolean requisitavel = true;
	private int codBarras;

	public Tese(String titulo, String autor, Date dataPub, String descricao, String id, ArrayList<Area> areas, String orientador, boolean mestrado, int codBarras) {
	
		super(titulo, dataPub, descricao, id, areas);
		this.autor=autor;
		this.orientador=orientador;
		this.codBarras=codBarras;
	}
	
	public String getAutor() {
		return autor;
	}

	public String getOrientador() {
		return orientador;
	}

	public int getCodBarras() {
		return codBarras;
	}

	public String getGrau() {
		if (mestrado) return "Mestrado";
		else return "Doutoramento";
	}
	
	public boolean getRequisitavel() {
		return requisitavel;
	}

}
