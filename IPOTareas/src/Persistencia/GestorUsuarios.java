package Persistencia;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dominio.Usuario;

public class GestorUsuarios {
	
	static Scanner lectura = new Scanner(System.in);
	
	public int leerNumero() throws IOException{
		File archivo = new File ("./usuarios.txt");
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);
		
		int numUsuarios = Integer.parseInt(br.readLine());
		return numUsuarios;
	}
	
	public void leerUsuarios() throws IOException{
		File archivo = new File ("./usuarios.txt");
		int numUsuarios = leerNumero();
		Usuario[] usuarios = new Usuario[numUsuarios];
		FileReader fr = new FileReader(archivo);
		BufferedReader br = new BufferedReader(fr);
		
		for(int i=0; i<numUsuarios;i++){
			String Nick = br.readLine();
			String Pass = br.readLine();
			String Nombre = br.readLine();
			String Apellidos = br.readLine();
			String Fecha = br.readLine();
			
			Usuario usuario = new Usuario(Nick,Nombre,Apellidos,Pass,Fecha);
			System.out.println("Usuario creado");
		}
		
	}
	


}
