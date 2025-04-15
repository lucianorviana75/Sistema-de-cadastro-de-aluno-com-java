/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.alunos;

/**
 *
 * @author ribei
 */
public class Alunos {

    public static void main(String[] args) {
        //criação de alunos
        Aluno a1 = new Aluno("Ana",18);
        a1.setNotas(new double[]{7.5,8.0,9.0});
        
        Aluno a2 = new Aluno("Bruno",19);
        a2.setNotas(new double[]{6.0,7.5,8.5});
        
        
        Aluno a3 = new Aluno("Carlos",20);
        a3.setNotas(new double[]{9.0,9.5,10.0});
        
        //criação da turma;
        Turma turma = new Turma();
        
        //Adcionando alunos a turma;
        turma.adcionarAluno(a1);
        turma.adcionarAluno(a2);
        turma.adcionarAluno(a3);
        
        //Exibindo informacoes a turma;
        turma.exibirTodos();
    }
}
