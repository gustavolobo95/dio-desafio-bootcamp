package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
public static void main(String[] args) {
	
	Curso curso1 = new Curso();
		
	curso1.setTitulo("Curso de Java");
	curso1.setDescricao("Ensinaremos a linguagem Java do basico, ao avançado, passando por conceitos de OO à frameworks");
	curso1.setCargaHoraria(57);
	
	System.out.println(curso1);
	
	Curso curso2 = new Curso();
	
	curso2.setTitulo("Curso de Javascript");
	curso2.setDescricao("Programação Web moderna");
	curso2.setCargaHoraria(50);
	
	System.out.println(curso2);
	
	Mentoria mentoria1 = new Mentoria();
	
	mentoria1.setTitulo("Mentoria de Java");
	mentoria1.setDescricao("Mentoria com Especialista Java");
	mentoria1.setData(LocalDate.now());
	
	System.out.println();
	System.out.println(mentoria1);
} 
}
