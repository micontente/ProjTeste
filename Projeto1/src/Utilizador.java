
import java.io.*;
import java.util.*;

public class Utilizador {

	private String nome;
	private String user;
	private String password;
	private String tipo;
	private int num;

	public Utilizador(String nome, String user, String password, String tipo, int num) {
		
		this.nome = nome;
		this.user = user;
		this.password = password;
		this.tipo = tipo;
		this.num = num;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTipo() {
		return tipo;
	}

//	public void setTipo(String tipo) {
//		this.tipo = tipo;
//	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	

}
