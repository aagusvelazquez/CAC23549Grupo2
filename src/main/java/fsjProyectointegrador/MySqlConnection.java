package fsjProyectointegrador;

import java.sql.*;

public class MySqlConnection {
	private static final String CONTROLADOR = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/confbsas";
	private static final String USSER = "root";
	private static final String PASS = "";
	
	static {
		try {
			Class.forName(CONTROLADOR);
		} catch (ClassNotFoundException e){
			System.out.println("Error al cargar el controlador.");
			e.printStackTrace();
		}
	}
	public static Connection conectar () {
		Connection conexion = null;
		
		try {
			conexion = DriverManager.getConnection(URL, USSER, PASS);
		} catch(SQLException e) {
			System.out.println("Error al establecer la conexión.");
			e.printStackTrace();
		}
		return conexion;
	}
}
