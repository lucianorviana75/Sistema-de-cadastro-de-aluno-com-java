/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.alunos;

/**
 *
 * @author ribei
 */
public class Turma {
    
    private Aluno[]alunos;
    private int quantidade;
    
    public Turma(){
        alunos = new Aluno[5];
        quantidade = 0;
    }
    
    public void adcionarAluno(Aluno aluno){
        if(quantidade < alunos.length){
            alunos[quantidade]=aluno;
            quantidade++;
        }else{
            System.out.println("Turma cheia! Nao e possivel adcionar mais alunos.");
        }
    }
    public void exibirTodos(){
        for(int i = 0; i<quantidade; i++){
            alunos[i].exibirInformacoes();
        }
    }
}
