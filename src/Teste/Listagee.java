package Teste;

import java.io.File;
import java.util.ArrayList;

public class Listagee {
	
	public static void main(String args[]) {
		Boolean verificador = false;		
	    ArrayList<String> lista = new ArrayList<>();
		//*********************************************
		File diretorio = new File("C:\\Users\\leandro\\Desktop\\ArquivosTeste");
		for(File file:diretorio.listFiles()) {
			
			String nome = file.getName();
			//System.out.println(file.getName());
			for(int i =0; i< lista.size();i++) {
				
				if(lista.get(i)==nome) {
					verificador = true;
				}else {
					verificador = false;
				}
			}
			
			if(verificador == true) {
				File apaga = new File(":\\Users\\leandro\\Desktop\\ArquivosTeste\\ + 'nome'");
				apaga.delete();
			}else {
				lista.add(nome);
			}
			
		}
		//File f = new File("C:\\Users\\leandro\\Desktop\\ArquivosTeste\\Lei.pdf");
		//if( f.delete() )
			//System.out.println("Arquivo Deletado Com sucesso");
		
	}
	
	

}
