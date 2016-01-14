
import java.io.*;
import java.util.*;

public class Jornal extends Periodica {

	private final boolean requisitavel = false;

	public Jornal(String titulo, Date dataPub, String descricao, String id,int maxDiasRequisicao,  String periodicidade) {
//		Periodica(String titulo, Date dataPub, String descricao, String id, String periodicidade)
		super(titulo, dataPub, descricao, id, maxDiasRequisicao, periodicidade);
		throw new UnsupportedOperationException("The method is not implemented yet.");
	}

}
