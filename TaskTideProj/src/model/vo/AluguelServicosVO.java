package model.vo;
public class AluguelServicosVO {
	 public int codigo;
	 public String nome;
	 public int quantidade;
	 public float valorUnit;
	
	public void AluguelServicos(int codigo, String nome, int quantidade, float valorUnit) {
		this.codigo = codigo;
		this.nome = nome;
		this.quantidade = quantidade;
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
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getValorUnit() {
		return valorUnit;
	}
	public void setValorUnit(float valorUnit) {
		this.valorUnit = valorUnit;
	}
}
