
import java.io.*;
import java.util.*;

public class Biblioteca {

	private ArrayList<Area> areas;
	private String nome;
	private ArrayList <Requisicao> requisicoes;	//alteracao permitida? !!!!!!
	private ArrayList<Utilizador> utilizadores;
	private ArrayList<Publicacao> publicacoes;

	public Biblioteca() {		//??
		
	}
	
	public Biblioteca(String nome) {		//??
		
		this.nome = nome;
	}

	public ArrayList <Requisicao> getObrasRequisitadas() {
		return requisicoes;
	}

	public void addArea(Area novaArea) {
		
		Area area = findArea (novaArea);
		
		if (area==null){
			areas.add(novaArea);
		}
		else System.out.println("Tema já registado na Base de Dados");
	}

	private Area findArea(Area novaArea) {
		
		for (Area area:areas){
			
			if (area.getNome().equals(novaArea.getNome())){  //Comparacao apenas do nome?
				return area;
			}
		}
		return null;
	}

	public void addUtilizador(Utilizador novoUtilizador) {
		
		Utilizador util = findUtilizador (novoUtilizador);
		
		if (util == null){
			
			utilizadores.add(novoUtilizador);
		}
		
	}

	private Utilizador findUtilizador(Utilizador novoUtilizador) {
		
		for (Utilizador u : utilizadores){
			
			if (novoUtilizador.getNum()==u.getNum()){
				System.out.println("Número de utilizador já registado!");
				return u;
			}
			else if (novoUtilizador.getUser().equals(u.getUser())){
				System.out.println("Nome de utilizador já registado!");
				return u;
			}
		}
		return null;
	}

	public ArrayList <Publicacao> getListaPub() {

		return publicacoes;
	}

	public ArrayList <Utilizador> getListaUtilizadores() {
		return utilizadores;
	}

	public ArrayList <Publicacao> getReqPorLeitor(Utilizador leitor) { //leitor (permite qualquer dado) ou numero?
		
		ArrayList <Publicacao> pubLeitor = new ArrayList <Publicacao>();
		
		for (Requisicao req : requisicoes){
			
			if (req.getLeitor().getNum()== leitor.getNum()){
				pubLeitor.add(req.getPublicacao());
			}
			
		}
		
		return pubLeitor;
	}

	public Publicacao getPublicacao(String id) {
		
	
		for (Publicacao pub : publicacoes){
			
			if(pub.getId().equals(id)){
				
				return pub;
			}
			else{
				System.out.println("Publicacao não encontrada");
				return null;
			}
		}
		
		return null;
	}

	public Utilizador getUtilizador(int numero) {
		
		for (Utilizador util : utilizadores){  //repetida parte do find ??
			
			if(util.getNum()== numero){
				
				return util;
			}
			else{
				System.out.println("Utilizador não registado");
				return null;
			}
		}
		
		return null;
	}

//	public String findUserName(String userName) {
//		throw new UnsupportedOperationException("The method is not implemented yet.");
//	}
//
//	public String findNumUtilizador(String userName) {
//		throw new UnsupportedOperationException("The method is not implemented yet.");
//	}

}
