package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

private	LocalDate data;

public Mentoria() {
	
}

public LocalDate getData() {
	return data;
}
public void setData(LocalDate data) {
	this.data = data;
}

@Override
public String toString() {
	return "Mentoria [Titulo: " + getTitulo() + ", Descri��o: " + getDescricao() + ", Data: " + data + "]";
}

@Override
public double calcularXP() {
	// TODO Auto-generated method stub
	return XP_PADRAO + 20d;
}




	
}
