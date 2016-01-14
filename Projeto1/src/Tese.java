
import java.io.*;
import java.util.*;

public class Tese extends NaoPeriodica {

	private String autor;
	private String orientador;
	private boolean mestrado;
	private final boolean requisitavel = true;
	private String codBarras;

	public Tese (String titulo, Date dataPub, String descricao, String id, int maxDiasRequisicao){
		super(titulo, dataPub, descricao, id, maxDiasRequisicao);
	}
	public String getAutor() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public String getOrientador() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public String getCodBarras() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public String getGrau() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}



}
