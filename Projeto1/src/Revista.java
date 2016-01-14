
import java.io.*;
import java.util.*;

public class Revista extends Periodica {

	private String volume;
	private String numero;
	private final boolean requisitavel = true;
	private String codBarras;

	public Revista(String titulo, Date dataPub, String descricao, String id, int maxDiasRequisicao, String periodicidade, String volume, String numero, String codBarras) {
		super(titulo, dataPub, descricao, id, maxDiasRequisicao, periodicidade);
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public String getVolume() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public String getNumero() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

	public String getCodBarras() {
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

}
