package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
public static void main(String[] args) {
	
	Curso curso1 = new Curso();
		
	curso1.setTitulo("Curso de Java");
	curso1.setDescricao("Ensinaremos a linguagem Java do basico, ao avançado, passando por conceitos de OO à frameworks");
	curso1.setCargaHoraria(57);
	
	System.out.println(curso1);
	
	Mentoria mentoria1 = new Mentoria();
	
	mentoria1.setTitulo("Mentoria de Java");
	mentoria1.setDescricao("Mentoria com Especialista Java");
	mentoria1.setData(LocalDate.now());
	
	System.out.println();
	System.out.println(mentoria1);
	System.out.println("");
	
	Bootcamp bootcamp = new Bootcamp();
	
	bootcamp.setNome("Bootcamp DIO Java Developer");
	bootcamp.setDescricao("Desenvolvido para acelerar a carreira de desenvolvedores em formação!");
	bootcamp.getConteudos().add(curso1);
	bootcamp.getConteudos().add(mentoria1);
	
	Dev devGustavo = new Dev();
	devGustavo.setNome("Gustavo");
	devGustavo.inscreverBootcamp(bootcamp);
	System.out.println("Conteudos Inscritos Gustavo: " + devGustavo.getConteudosInscritos());
	devGustavo.progredir();
	devGustavo.progredir();
	System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("Conteudos Inscritos Gustavo: " + devGustavo.getConteudosInscritos());
	System.out.println("Conteudos Concluidos Gustavo: " + devGustavo.getConteudosConcluidos());
	System.out.println("XP: " + devGustavo.calcularXP());
	
	System.out.println("");
	
	Dev devVictor = new Dev();
	devVictor.setNome("Victor");
	devVictor.inscreverBootcamp(bootcamp);
	System.out.println("Conteudos Inscritos Dev Victor: " + devVictor.getConteudosInscritos());
	devVictor.progredir();
	System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
	System.out.println("Conteudos Inscritos Dev Victor: " + devVictor.getConteudosInscritos());
	System.out.println("Conteudos Concluidos Victor: " + devVictor.getConteudosConcluidos());
	System.out.println("XP: " + devVictor.calcularXP());
} 
}
