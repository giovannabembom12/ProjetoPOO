package model.vo;
public class DespesaVO {
private String despesa;
private int valor;
private String nome;
public DespesaVO(String despesa, int valor, String nome) {
this.despesa = despesa;
this.valor = valor;
this.nome = nome;
}
public String getDespesa() {
return despesa;
}
public void setDespesa(String Despesa) {
this.despesa = despesa;
}
public int getValor() {
return valor;
}
public void setValor(int valor) {
this.valor = valor;
}
public String getNome() {
return despesa;
}
public void setNome(String nome) {
this.nome = nome;
}
}
