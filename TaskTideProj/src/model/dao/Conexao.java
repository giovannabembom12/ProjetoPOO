package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Conexao {
	
	Connection conn = null;
	public Connection conectaBD() {
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/tasktide?user=root&password=250207gioVanna";
			conn = DriverManager.getConnection(url);			
		} catch(SQLException erro){
			JOptionPane.showMessageDialog(null, "Conexao" + erro);
		}
		return conn;
	}
}
