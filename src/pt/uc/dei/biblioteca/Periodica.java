package pt.uc.dei.biblioteca;

import java.util.ArrayList;
import java.util.Date;

public class Periodica extends Publicacao {

	private String periodicidade; //Hip�teses v�lidas=Di�ria, Semanal, Quinzenal, Mensal, Trimestral, Semestral ou Anual

	public Periodica(String titulo, Date dataPub, String descricao, String id, ArrayList<Area> areas, String periodicidade) {
		super(titulo, dataPub, descricao, id, areas);
		this.periodicidade=periodicidade;
	}
	
	public String getPeriodicidade() {
		return periodicidade;
	}

}
