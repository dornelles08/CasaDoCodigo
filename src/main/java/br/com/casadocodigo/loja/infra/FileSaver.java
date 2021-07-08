package br.com.casadocodigo.loja.infra;

import java.io.IOException;

import javax.servlet.http.Part;

public class FileSaver {
	
	private static final String SERVER_PATH = "C:\\Users\\liped\\Documents\\Projetos\\CasaDoCodigo\\files\\";
	
	public String write(Part arquivo, String path){
		try {
			String relativePath = path + "\\" + arquivo.getSubmittedFileName();
			arquivo.write(SERVER_PATH + relativePath);
			return relativePath;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
	}
}
