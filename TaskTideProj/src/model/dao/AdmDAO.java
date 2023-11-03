package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.vo.AdmVO;
public class AdmDAO {
	Connection conn;
	PreparedStatement pstm;
	
	public ResultSet autenticacaoUsuario(AdmVO objusuariovo) {
		conn = new Conexao().conectaBD();
		
		try {
			String sql = "SELECT * FROM tbAdmin WHERE cpf = ? AND senha = ?";
			
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objusuariovo.getCpf());
			pstm.setString(2, objusuariovo.getSenha_us());
			
			ResultSet rs = pstm.executeQuery();
			return rs;
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "AdmDAO" + erro);
			return null;
		}
	}
	
	public void cadastrarUsuario(AdmVO objusuariovo2) {
		String sql = "INSERT INTO tbAdm (cpf, nomecomp, data_nasc, fone, senha) VALUES (?, ?, ?, ?, ?)";

		
		conn = new Conexao().conectaBD();
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objusuariovo2.getCpf());
			pstm.setString(2, objusuariovo2.getNome_comp());
			pstm.setString(3, objusuariovo2.getData_nasc());
			pstm.setString(4, objusuariovo2.getFone());
			pstm.setString(5, objusuariovo2.getSenha_us());
			
			pstm.execute();
			pstm.close();
			
			JOptionPane.showMessageDialog(null, "Cadastro concluído com sucesso!");
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "AdmDAO" + erro);
}
				
	}
}
