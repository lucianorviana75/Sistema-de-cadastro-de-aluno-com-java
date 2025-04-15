/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alunos;

/**
 *
 * @author ribei
 */
public class Aluno {
    private String nome;
    private int idade;
    private double[]notas;
    
    //construtor
    public Aluno(String nome,int idade){
        this.nome=nome;
        this.idade=idade;
        this.notas = new double[3];//inicializa um arrey de 3 notas
    }
    //Método para definir as notas;
    public void setNotas(double[] notas){
        if(notas.length == 3){
            this.notas = notas;
        }else{
            System.out.println("Erro: E necessario passar exatamente 3 notas.");
        }
    }
    //Método para calcular as notas;
    public double getMedia(){
        double soma = 0;
        for(double nota : notas){
            soma += nota;
        }
        return soma / notas.length;
    }
    //Método para exibir as informaçoes do aluno;
    public void exibirInformacoes(){
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+ idade);
        System.out.println("Notas:");
        for(double nota : notas){
            System.out.println(nota + " ");
        }
        System.out.println("\nMedia: " + getMedia());
        System.out.println("-----------------------");
    }
    
}
