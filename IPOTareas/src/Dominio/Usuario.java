package Dominio;

import java.sql.SQLException;
import java.util.List;

//import com.mysql.jdbc.util.PropertiesDocGenerator;

import Persistencia.GestorUsuarios;

public class Usuario {
	protected String Nick;
	protected String Nombre;
	protected String Apellido;
	protected String Password;
	protected String Fecha;
	protected GestorUsuarios gestorUsuarios;
	
	public String getFecha() {
		return Fecha;
	}

	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	public Usuario() {
		gestorUsuarios = new GestorUsuarios();
	}
	
	public Usuario(String Nick, String Nombre, String Apellido, String Password, String Fecha){
		this.Nick=Nick;
		this.Nombre=Nombre;
		this.Apellido=Apellido;
		this.Password=Password;
		this.Fecha=Fecha;
		gestorUsuarios = new GestorUsuarios();
	}
	
	public Usuario(String Nick){
		this.Nick=Nick;
		gestorUsuarios = new GestorUsuarios();
	}

	public String getNick() {
		return Nick;
	}

	public void setNick(String nick) {
		Nick = nick;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public GestorUsuarios getGestorUsuarios() {
		return gestorUsuarios;
	}

	public void setGestorUsuarios(GestorUsuarios gestorUsuarios) {
		this.gestorUsuarios = gestorUsuarios;
	}
	
	public Usuario leerUsuario() throws SQLException {
		return gestorUsuarios.read(this.Nick);
	}
	
	public List<Usuario> leerTodos() throws SQLException {
		return gestorUsuarios.readAll();
	}
	public boolean comprobar(String pass){
		return (this.Password.equals(pass));
		
	}
	
	public int insertar() throws SQLException{
		return gestorUsuarios.insert(this);
	}
}


