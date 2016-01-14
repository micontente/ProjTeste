package pt.uc.dei.biblioteca;

import java.util.ArrayList;
import java.util.Date;

public class Jornal extends Periodica {

	private final boolean requisitavel = false;

	public Jornal(String titulo, Date dataPub, String descricao, String id, ArrayList<Area> areas, String periodicidade) {
		super(titulo, dataPub, descricao, id, areas, periodicidade);
	}
	
	public boolean getRequisitavel() {
		return requisitavel;
	}

}
