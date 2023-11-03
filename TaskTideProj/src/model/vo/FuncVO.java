package model.vo;

public class FuncVO {
	
	private int id_usuario;
	private String nome_comp, senha_us, fone, email, cpf;
	private String data_nasc;
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNome_comp() {
		return nome_comp;
	}
	public void setNome_comp(String nome_comp) {
		this.nome_comp = nome_comp;
	}
	public String getSenha_us() {
		return senha_us;
	}
	public void setSenha_us(String senha_us) {
		this.senha_us = senha_us;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(String dataNascimento) {
		this.data_nasc = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
