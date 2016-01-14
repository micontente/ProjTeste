package pt.uc.dei.biblioteca;

import java.util.ArrayList;
import java.util.Date;

public class NaoPeriodica extends Publicacao {

	private final boolean requisitavel = true;

	public NaoPeriodica(String titulo, Date dataPub, String descricao, String id, ArrayList<Area> areas) {
		super(titulo, dataPub, descricao, id, areas);
	}
	
	public boolean getRequisitavel() {
		return requisitavel;
	}

}
