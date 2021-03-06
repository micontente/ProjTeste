package pt.uc.dei.biblioteca;


import java.io.*;
import java.util.*;

public class AnaliseEstatistica {
	
//	Ficheiro emprestimos01.csv
	private BufferedWriter fW;
	private String nomeDoFicheiro="emprestimos.csv";
	
//	Requisicao [][] listaRequisicoes;
	ArrayList <Requisicao> listaRequisicoes;
	
//	ArrayList de publicacoes, vindo da biblioteca
	private ArrayList<Publicacao> publicacoes;
	
// RECEBER APENAS DADOS DO PERIODO A ESTUDAR ?? (12 MESES)
	public AnaliseEstatistica(ArrayList <Requisicao> listaRequisicoes, ArrayList <Publicacao> publicacoes) {

//		this.listaRequisicoes = new Requisicao [listaRequisicoes.size()][2];
//		for (int i =0; i<listaRequisicoes.size();i++){
//			this.listaRequisicoes[i][0]=listaRequisicoes.get(i);
//		}
		this.listaRequisicoes = listaRequisicoes;
		this.publicacoes=publicacoes;
	}
/**
 * NAO TESTADO
 * @return Publicacao mais Requisitada (Publicacao)
 */
	
	public Publicacao getPubMaisRequisitada() {
		
		ArrayList<Publicacao> pubRequisitadas = new ArrayList<Publicacao>();
		ArrayList<Integer> nRequisicoes = new ArrayList <Integer>();
		int count=0;
		
		for (Requisicao obraReq:listaRequisicoes){
			
			if (pubRequisitadas.contains(obraReq.getPublicacao())==false){
				pubRequisitadas.add(obraReq.getPublicacao());
//				count = nRequisicoes.get(pubRequisitadas.indexOf(obraReq));	
				nRequisicoes.add(pubRequisitadas.indexOf(obraReq), 1);
			}
			else {
				count = nRequisicoes.get(pubRequisitadas.indexOf(obraReq));
				nRequisicoes.add(pubRequisitadas.indexOf(obraReq), count++);
			}
			
		}
		
		// publicacao com mais requisicoes
		
		int indiceReqMax =0;
		int max = 0; 
		
		for (int i = 0; i<nRequisicoes.size(); i++){
			
			if (nRequisicoes.get(i)>max){
				max = nRequisicoes.get(i);
				indiceReqMax = i;
			}
		}
		
		//APENAS RETORNA UMA - E SE HOUVER MAIS DO QUE UMA COM O MESMO NUMERO DE REQ?
		return pubRequisitadas.get(indiceReqMax);
		
	}

	public ArrayList <String> getPubAtraso() {
		
		ArrayList <String> publicacoesAtraso = new ArrayList <String>();
		Calendar dataHoje = Calendar.getInstance();
		Calendar dataEntrega = Calendar.getInstance();
		
//		Calendar d1 = Calendar.getInstance();		
//		d1.set(1988, 3, 9);
		
		for (Requisicao req : listaRequisicoes){
			
			//TESTAR --> PROBLEMA COM TRANSICOES DE MESES E ANOS??	
			dataEntrega.set(req.getPublicacao().getDataRec().get(0), req.getPublicacao().getDataRec().get(1), 
					req.getPublicacao().getDataRec().get(2)+req.getPublicacao().getMaxDiasRequisicao());
			
			if (dataEntrega.compareTo(dataHoje)<0){
				publicacoesAtraso.add(req.getPublicacao().getTitulo());  //o que devolver? - titulo, codBarras, id?
			}
		}
		
		return publicacoesAtraso;
	}

	public int getNumReqPorPublicacao(String iD) {	//Substituir por CodigoBarras//Escolher periodo a estudar?  ???
		
		int nRequisicoes = 0;
		for (Requisicao obraReq:listaRequisicoes){
			
			if(obraReq.getPublicacao().getId().equals(iD)){
				nRequisicoes++;
			}
		}
		return nRequisicoes;
	}

//	public ArrayList <Publicacao> getPubReqAno() {
//		throw new UnsupportedOperationException("The method is not implemented yet.");
//	}
	
	
	/*
	 * Procura, na lista de requisi��es, quantas requisicoes s�o da publicacao dada
	 */
	public int getNumReqPublicacao(Publicacao p) {
		int count=0;
		for (Requisicao r: listaRequisicoes){
			if (r.getPublicacao().equals(p)) count++;
		}
		return count;
	}
	
	/*
	 * Procura, na lista de requisicoes, as requisicoes de uma publicacao e adiciona a um ArrayList
	 */
	
	public ArrayList<Requisicao> reqPublicacao(Publicacao p) {
		ArrayList<Requisicao> reqPublicacao=new ArrayList<Requisicao>();
		for (Requisicao r: listaRequisicoes) {
			if (r.getPublicacao().equals(p)) reqPublicacao.add(r);
		}
		return reqPublicacao;
	}
	
	/*
	 * Procura na lista de requisicoes, o maxTempRequicao (� mais r�pida que organizar o arraylist)
	 */
	public int maxTempReqPublicacao(Publicacao p){
		ArrayList<Requisicao> r=new ArrayList<Requisicao>();
		r=reqPublicacao(p);
		int tempo=r.get(0).getDataDevolvido().compareTo(r.get(0).getDataRequisicao());
		for (Requisicao req: r) {
			if (req.getDataDevolvido().compareTo(req.getDataRequisicao())>tempo) tempo=req.getDataDevolvido().compareTo(req.getDataRequisicao());
		}
		return tempo;
	}
	
	/*
	 * Procura na lista de requisicoes, o minTempRequicao (� mais r�pida que organizar o arraylist)
	 */
	public int minTempReqPublicacao(Publicacao p){
		ArrayList<Requisicao> r=new ArrayList<Requisicao>();
		r=reqPublicacao(p);
		int tempo=r.get(0).getDataDevolvido().compareTo(r.get(0).getDataRequisicao());
		for (Requisicao req: r) {
			if (req.getDataDevolvido().compareTo(req.getDataRequisicao())<tempo) tempo=req.getDataDevolvido().compareTo(req.getDataRequisicao());
		}
		return tempo;
	}
	
	/*
	 * Calcula o tempo m�dio de um empr�stimo.
	 */
	public int medTempReqPublicacao(Publicacao p){
		ArrayList<Requisicao> r=new ArrayList<Requisicao>();
		r=reqPublicacao(p);
		int tempo=0;
		for (Requisicao req: r) {
			tempo+=req.getDataDevolvido().compareTo(req.getDataRequisicao());
		}
		return tempo;
	}
	
	/*
	 * Cria uma linha por publica��o, com os dados separados por v�rgulas, ordenados por
	 * titulo, dataPub, numEmprestimos, emprestimoMin, emprestimoMax, emprestimoMed, descricao
	 */
	public void enviaDadosEscrita(){
		abreFicheiro();
		for (Publicacao p: publicacoes) {
			String linha="";
			linha=linha+p.getTitulo()+p.getDataPub()+getNumReqPublicacao(p)+minTempReqPublicacao(p)+maxTempReqPublicacao(p)+medTempReqPublicacao(p)+p.getDescricao();
			escreveFicheiro(linha);
		}
		fechaFicheiro();
	}
		
	public boolean escreveFicheiro(String linha) {
		
		try {
		fW.write(linha,0,linha.length());
		fW.newLine();
		return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public void fechaFicheiro() {

		try {
			fW.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void abreFicheiro() {
		try {
			BufferedWriter fW=new BufferedWriter(new FileWriter(new File(nomeDoFicheiro)));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
