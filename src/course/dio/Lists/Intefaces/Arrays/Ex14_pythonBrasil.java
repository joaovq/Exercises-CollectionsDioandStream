package course.dio.Lists.Intefaces.Arrays;

import java.util.*;
/*
* Utilizando listas faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"
*  O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
* Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
*  entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
* Caso contrário, ele será classificado como "Inocente".*/
public class Ex14_pythonBrasil {
    public static void main(String[] args) {
        //I will finish
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(new Locale("pt", "BR"));

        List<String> perguntas = new ArrayList<String>(){{
            add("\tTelefonou para a vítima?\t");
            add("\tEsteve no local do crime?\t");
            add("\tMora perto da vítima?\t");
            add("\tDevia para a vítima?\t");
            add("\tJá trabalhou com a vítima?\t");
        }};
//                Utilizando as duas formas para praticar
        List<String> respostasSim = new ArrayList<>();

        Iterator<String> iterator = perguntas.iterator();

        String respostas;
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
            System.out.println("\tDigite Sim ou Não para as perguntas: \t ");
            respostas = scan.next();
            if (respostas.equalsIgnoreCase("Sim")) respostasSim.add(respostas);
        }

        System.out.println("Quantidades de Sim's: " + respostasSim.size() + "\n"); // Contagem dos "Sim's", pelo tamanho; da Array

         /*Outra forma de fazer
         *
            Double contador = 0d;
           while(iterator.hasNext()){
                String next = iterator.next();
                System.out.println(next);
                System.out.println("\tDigite Sim ou Não para as perguntas: \t ");
                respostas = scan.next();
                if (respostas.equalsIgnoreCase("Sim")) contador++;
            }
            System.out.println("Quantidades de Sim's: " + contador);

         *
         * */

        //Utilizando o if, mas pode usar o switch

        if(respostasSim.size() < 2)
            System.out.println("Inocente");
        else if(respostasSim.size() < 3)
            System.out.println("Suspeita");
        else if(respostasSim.size() < 5)
            System.out.println("Cumplice");
        else
            System.out.println("Culpada");






    }
}
