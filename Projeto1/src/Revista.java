import java.util.ArrayList;
import java.util.Date;

public class Revista extends Periodica {

	private String volume;
	private String numero;
	private final boolean requisitavel = true;
	private int codBarras;

	public Revista(String titulo, Date dataPub, String descricao, String id, ArrayList<Area> areas, String periodicidade, String volume, String numero, int codBarras) {
		super(titulo, dataPub, descricao, id, areas, periodicidade);
		this.volume=volume;
		this.numero=numero;
		this.codBarras=codBarras;
	}

	public String getVolume() {
		return volume;
	}

	public String getNumero() {
		return numero;
	}

	public int getCodBarras() {
		return codBarras;
	}
	
	public boolean getRequisitavel() {
		return requisitavel;
	}

}
