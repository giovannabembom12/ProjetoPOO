package model.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.*;
import model.vo.EventoVO;
public class EventoDAO {
	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	ArrayList<EventoVO> lista = new ArrayList<EventoVO>();
	
	public void cadastrarEvento(EventoVO objeventovo) {
		String sql = "INSERT INTO tbEvento (nome_evento, descricao, data_event) VALUES (?, ?, ?)";
		
		conn = new Conexao().conectaBD();
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objeventovo.getNome_e());
			pstm.setString(2, objeventovo.getDesc_ev());
			pstm.setString(3, objeventovo.getDt_event());
		
			
			pstm.execute();
			pstm.close();
			
			JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "EventoDAO" + erro);
}}
		public ArrayList<EventoVO> listarEvento(){

			String sql = "SELECT cod, nome, dataprevis, localizacao FROM tbEvento";
			conn = new Conexao().conectaBD();

			try {
				pstm = conn.prepareStatement(sql);
				rs = pstm.executeQuery();
				
				while(rs.next()) {
					EventoVO obj = new EventoVO();
					obj.setId_event(rs.getInt("cod"));
					obj.setNome_e(rs.getString("nome"));
					obj.setDt_event(rs.getString("dataprevis"));
					obj.setLocal(rs.getString("localizacao"));
					
					lista.add(obj);
				}
				
			}catch(SQLException erro) {
				JOptionPane.showMessageDialog(null, "EventoDAO"+ erro);
			}
				return lista;	
		}
		
		public List<EventoVO> pesquisarEventos(String nome) throws SQLException{
			try {
			String sql = "SELECT * FROM tbEvento WHERE nome LIKE ?";
			conn = new Conexao().conectaBD();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, "%"+nome+"%");;
			rs = pstm.executeQuery();
			
			while(rs.next()) {
				EventoVO obj = new EventoVO();
				obj.setId_event(rs.getInt("cod"));
				obj.setNome_e(rs.getString("nome"));
				obj.setDt_event(rs.getString("dataprevis"));
				obj.setLocal(rs.getString("localizacao"));
				
				lista.add(obj);
			}
		
			
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro: "+ e);
		}
			return lista;
				
	}
	
	public boolean excluirEventos(int cod) {
		try {
			String sql = "DELETE FROM tbEvento WHERE cod = ?";
			conn = new Conexao().conectaBD();
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, cod);;
			 int rowsAffected = pstm.executeUpdate();

		        return rowsAffected > 0;
		
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro: "+ e);
			return false;
		}
	}
	
	public boolean alterarEventos(EventoVO obje) {
		try {
			String sql = "UPDATE  tbEvento "
					+ "SET nome = " + obje.getNome_e() + ", "
							+ "descricao =" + obje.getDesc_ev()+ ","
									+ "localizacao =" +obje.getLocal()+","
											+ "dataprevis =" +obje.getDt_event()+ " " 
													+ "WHERE cod = " + obje.getId_event()+ " ";
			conn = new Conexao().conectaBD();
			pstm = conn.prepareStatement(sql);
			pstm.executeUpdate();

	        
	        return true; // Retorna true se pelo menos uma linha foi afetada
			
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro: "+ e);
			return false;
	}
		
}
}
