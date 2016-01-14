package pt.uc.dei.biblioteca;


import java.io.*;
import java.util.*;

public class AnaliseEstatistica {

//	Requisicao [][] listaRequisicoes;
	ArrayList <Requisicao> listaRequisicoes;
	
				// RECEBER APENAS DADOS DO PERIODO A ESTUDAR ?? (12 MESES)
	public AnaliseEstatistica(ArrayList <Requisicao> listaRequisicoes) {

//		this.listaRequisicoes = new Requisicao [listaRequisicoes.size()][2];
//		for (int i =0; i<listaRequisicoes.size();i++){
//			this.listaRequisicoes[i][0]=listaRequisicoes.get(i);
//		}
		this.listaRequisicoes = listaRequisicoes;
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

	public int getNumReqPorPublicacao(String iD) {	//Subrtituir por CodigoBarras//Escolher periodo a estudar?  ???
		
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

}
