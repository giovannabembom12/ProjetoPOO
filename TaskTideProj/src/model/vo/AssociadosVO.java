package model.vo;

import java.util.Objects;
public class AssociadosVO {
private int id;
private String nome;
private String segmento;
private String contato;
public AssociadosVO(int id, String nome, String segmento, String contato) {
this.id = id;
this.nome = nome;
this.segmento = segmento;
this.contato = contato;
}
public int getId() {
return id;
}
public String getNome() {
return nome;
}
public String getSegmento() {
return segmento;
}
public String getContato() {
return contato;
}
@Override
public boolean equals(Object o) {
if (this == o) return true;
if (o == null || getClass() != o.getClass()) return false;
AssociadosVO associado = (AssociadosVO) o;
return id == associado.id;
}
@Override
public int hashCode() {
return Objects.hash(id);
}
}

