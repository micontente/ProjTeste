package pt.uc.dei.biblioteca;

import java.util.ArrayList;
import java.util.Date;

public class Livro extends NaoPeriodica {

	private ArrayList <String> autores;
	private final String isbn;
	private String edicao;
	private String editor;
	private final boolean requisitavel = true;
	private int codBarras;

	public Livro(String titulo, ArrayList<String> autores, Date dataPub, String descricao, String id, ArrayList<Area> areas, String isbn, String edicao, String editor, int codBarras) {
		super(titulo, dataPub, descricao, id, areas);
		this.isbn=isbn;
		this.edicao=edicao;
		this.editor=editor;
		this.codBarras=codBarras;
		this.autores=autores;
	}

	public ArrayList <String> getAutores() {
		return autores;
	}

	public String getISBN() {
		return isbn;
	}

	public String getEdicao() {
		return edicao;
	}

	public String getEditor() {
		return editor;
	}

	public int getCodBarras() {
		return codBarras;
	}
	
	public boolean getRequisitavel() {
		return requisitavel;
	}

}
