
import java.io.*;
import java.util.*;

public class Livro extends NaoPeriodica {

	private ArrayList <String> autores;
	private final String isbn;
	private String edicao;
	private String editor;
	private final boolean requisitavel = true;
	private String codBarras;

	public Livro(String titulo, ArrayList<String> autores, Date dataPub, String descricao, String id, String isbn, String edicao, String editor, String codBarras, int maxDiasRequisicao) {
		super(titulo, dataPub, descricao, id, maxDiasRequisicao);
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public ArrayList <String> getAutores() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public String getISBN() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public String getEdicao() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public String getEditor() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public String getCodBarras() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

}
