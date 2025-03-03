package com.mycompany.larning.java.projectpratico;

import com.mycompany.larning.java.projectpratico.factory.ConstrutorCursos;
import com.mycompany.larning.java.projectpratico.factory.ConstrutorServidorPublico;
import com.mycompany.larning.java.projectpratico.factory.Construtores;
import com.mycompany.larning.java.projectpratico.model.Cursos;
import com.mycompany.larning.java.projectpratico.model.ServidorPublico;
import com.mycompany.larning.java.projectpratico.services.Service;
import com.mycompany.larning.java.projectpratico.services.ServiceImpl;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class SiscapacitApp {

    List<ServidorPublico> servidorPublicos = new LinkedList<>();
    List<Cursos> cursos = new LinkedList<>();

    Service service;

//    //CRUD
//    public void adicionarServidorPublico(){
//        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula: "));
//        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario: "));
//        String foto = JOptionPane.showInputDialog("Digite a foto: ");
//        String nome = JOptionPane.showInputDialog("Digite o nome: ");
//        String cargo = JOptionPane.showInputDialog("Digite o cargo: ");
//        String orgao = JOptionPane.showInputDialog("Digite o orgao: ");
//        String lotacao = JOptionPane.showInputDialog("Digite a lotacao: ");
//        String email = JOptionPane.showInputDialog("Digite o email: ");
//        String acoes = JOptionPane.showInputDialog("Digite as acoes: ");
//        List<String> cursos = new LinkedList<>();
//        String curso = JOptionPane.showInputDialog("Digite o curso: ");
//        cursos.add(curso);
//        ServidorPublico servidorPublico = new ServidorPublico(matricula, foto, nome, cargo, orgao, lotacao, email, salario, cursos, acoes);
//        servidorPublicos.add(servidorPublico);
//
//    }
//    public void listarServidoresPublicos(){
//        servidorPublicos.stream().forEach(System.out::println);
//    }
//   public void  listarServidorPublico(int matricula){
//       Optional<ServidorPublico> servidorEncontrado = servidorPublicos.stream().filter(servidorPublico -> servidorPublico.getMatricula() == matricula).findFirst();
//
//       servidorEncontrado.ifPresentOrElse(
//               System.out::println,
//                () -> System.out.println("Nenhum servidor encontrado com a matrícula " + matricula)
//       );
//    }
//
//    public void alterarServidorPublico(ServidorPublico servidorPublico){
//        Optional<ServidorPublico> servidorEncontrado = servidorPublicos.stream().filter(servidor -> servidor.getMatricula() == servidorPublico.getMatricula()).findFirst();
//        servidorEncontrado.ifPresentOrElse(
//                alterar -> {
//                    servidorPublicos.remove(alterar);
//                    servidorPublicos.add(servidorPublico);
//                },
//                () -> System.out.println("Nenhum servidor encontrado com a matrícula para alterar " + servidorPublico.getMatricula())
//        );
//    }
//    public void excluirServidorPublico(int matricula){
//
//        Optional<ServidorPublico> servidorEncontrado = servidorPublicos.stream().filter(servidorPublico -> servidorPublico.getMatricula() == matricula).findFirst();
//        servidorEncontrado.ifPresentOrElse(
//                remover -> servidorPublicos.remove(remover),
//                () -> System.out.println("Nenhum servidor encontrado com a matrícula para remover " + matricula)
//        );
//
//    }
//
//    //Servidor Publico
//
//    public void calcularFolhaServidoresPublicos(){
//        double folha = servidorPublicos.stream().mapToDouble(ServidorPublico::getSalario).sum();
//        System.out.println("Folha de pagamento: " + folha);
//    }


    public static void main(String[] args) {
        ConstrutorServidorPublico servidorPublico = new ConstrutorServidorPublico();
        SiscapacitApp siscapacitApp = new SiscapacitApp();
        siscapacitApp.servidorPublicos = servidorPublico.construir();
        siscapacitApp.service = new ServiceImpl(siscapacitApp.servidorPublicos);
        double somatoria1 = siscapacitApp.service.calculaFolha();

        List<ServidorPublico> servidorPublico1 = siscapacitApp.service.listarTodosOsObjetos();
        System.out.println(servidorPublico1);

        Construtores construtores = new ConstrutorCursos();
        siscapacitApp.cursos = construtores.construir();
        siscapacitApp.service = new ServiceImpl(siscapacitApp.cursos);
        List<Cursos> cursosList = siscapacitApp.service.listarTodosOsObjetos();
        double somatoria2 = siscapacitApp.service.calculaFolha();
        System.out.println(somatoria1);
        System.out.println(somatoria2);


//        siscapacitApp.servidorPublicos.get(1);

//        siscapacitApp.adicionarServidorPublico();
//        siscapacitApp.adicionarServidorPublico();
//        siscapacitApp.listarServidoresPublicos();
//        siscapacitApp.calcularFolhaServidoresPublicos();
//        siscapacitApp.listarServidorPublico(10101);
//        siscapacitApp.excluirServidorPublico(1010);
        //siscapacitApp.listarServidorPublico(1010);
    }


}
