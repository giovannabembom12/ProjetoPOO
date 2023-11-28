package model.vo;

public class ProdutoVO {
	 public int codigo;
	 public String nome;
	 public String fornecedor;
	 public String categoria;
	 public double valorUnit;
	
	public void AluguelServicos(int codigo, String nome, String fornecedor, String categoria, double valorUnit) {
		this.codigo = codigo;
		this.nome = nome;
		this.fornecedor = fornecedor;
		this.categoria = categoria;
		this.valorUnit = valorUnit;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getValorUnit() {
		return valorUnit;
	}
	public void setValorUnit(double valorUnit) {
		this.valorUnit = valorUnit;
	}
}
