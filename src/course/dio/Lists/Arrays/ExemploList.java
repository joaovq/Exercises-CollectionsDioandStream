package course.dio.Lists.Arrays;

import java.util.*;
import java.util.LinkedList;

/*Dada uma lista com 7 notas de um aluno {7.0,8.6,9.0,4.5,6.7,3.4,7.8}, faça*/
public class ExemploList {
    public static void main(String[] args) {
//        Antes do java 5, List notas = new Array.List();
//        List <Double> notas = new ArrayList<Double>();Generics (jdk 5) Diamond Operator
//        ArrayList<Double> notas = new ArrayList<>();/*Em alguma situações não é
//        recomedavel*/
//        List<Double> notas = Arrays.asList(7d,8.6d,9d,4.5d,6.7d,3.4d,7.8d);

        /*  List<Double> notas = Arrays.asList(7d,8.6d,9d,4.5d,6.7d,3.4d,7.8d);
        notas.add(7.8d);
        System.out.println(notas);

        pode fazer isso, mas não posso adicionar nem remover nesse exemplo*/

          /* List<Double> notas = Arrays.asList(7d,8.6d,9d,4.5d,6.7d,3.4d,7.8d);
        notas.add(7.8d);
        notas.remove(8.6d);
        System.out.println(notas);

        pode fazer isso, mas não posso adicionar nem remover nesse exemplo*/

        System.out.println("Crie uma lista e mostre os números");
        List<Double> notas = new ArrayList<Double>();//generics jdk 5
        notas.add(7d);
        notas.add(5d);
        notas.add(8.6d);
        notas.add(4.3d);
        notas.add(7.9d);
        notas.add(9.8d);
        notas.add(10d);
        System.out.println(notas); // ou
        System.out.println(notas.toString());

        System.out.println("Mostre a posição da nota 5.0");

        System.out.println("Posição da nota 5.0: " + notas.indexOf(5d));


        System.out.println("Adicione a nota 8.0 na posição 4");

        notas.add(4,8d);

        System.out.println("Elemento da posição 4: " + notas.get(4));

        System.out.println("substitua a nota 5 pela nota 6.0");
        System.out.println(notas);
        System.out.println("Indice do elemento 5.0: "+ notas.indexOf(5d));

        notas.set(1,6d);
        System.out.println(notas);
        System.out.println("Elemento na posição 2: "+ notas.get(1) );

        System.out.println("Confira se a nota 5.0 está na lista: ");

        System.out.println("É verdade que a nota 5 está na lista? "+ notas.contains(5d));


        System.out.println("Exiba todos na tela na ordem que foram informados ");

        for (Double elements: notas
             ) {
            System.out.print(elements + " ");
        }

//    Double assim é uma classe que passa o tipo doubl em objeto,
//    double assim é um tipo primitivo
//        Isso possiblita transformar elementos de String em double

        System.out.println("Exiba a terceira nota adicionada");
        System.out.println(notas.get(1)+ " " + notas.get(2)+ " " + notas.get(3));
        System.out.println(notas);

        System.out.println("Exiba a menor nota: " + Collections.min(notas) );

        System.out.println("Exiba a maior nota: " + Collections.max(notas) );

        System.out.println("Exiba a soma dos valores: ");

        Iterator<Double> iterator = notas.iterator();

        Double soma =0d;

        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma: " + soma);

        System.out.println("Exiba a média dos elementos: " + soma/notas.size());

        System.out.println("remova a nota 8.6: " + notas.remove(8.6d));
        System.out.println("remova a nota na posição 0: " + notas.remove(0));

        System.out.println("Remova as notas menores que 7: ");
        System.out.println(notas);
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next<7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");

        notas.clear();

        System.out.println(notas);

        System.out.println("Mostre, ela está vazia? " + notas.isEmpty());




    }
}
