package course.dio.Lists.Intefaces.Set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        System.out.println("Cores em baixo da outra, de forma aleatória");
        Set<String> coresArcoIris= new HashSet<>() {{
        add("Azul");
        add("Vermelho");
        add("Rosa");
        add("Laranja");
        add("Amarelo");
        add("Verde");
        }};
        for (String cor:coresArcoIris
             ) {
            System.out.println(cor);
        }

        System.out.println("");
        System.out.println("Ordem alfabética");

        Set<String>  corAlfabetica = new TreeSet<>(coresArcoIris);

        for (String cor: corAlfabetica
             ) {
            System.out.println(cor);
        }
        System.out.println("");
        List<String> corOrdemReversa = new ArrayList<>(coresArcoIris);
        System.out.println("");
        System.out.println("Ordem Normal");
        System.out.println(corOrdemReversa);
        System.out.println("");
        System.out.println("Ordem reversa");


        Collections.reverse(corOrdemReversa);


        for (String reverse:corOrdemReversa
             ) {
            System.out.println(reverse);
        }

        System.out.println("");
        System.out.println("Exibir as cores que começam com a letra v");
        Iterator<String> iterator = coresArcoIris.iterator();

        while(iterator.hasNext()){
            String next = iterator.next();
            if(next.startsWith("V")) System.out.println(next + " ");
        }

        System.out.println("Remover começando com 'v'");

        Iterator<String> iterator1 = coresArcoIris.iterator();

        while(iterator1.hasNext()){
            if(!iterator1.next().startsWith("V")) iterator1.remove();
        };
        System.out.println(coresArcoIris);

        System.out.println("Limpar o conjunto" );

        coresArcoIris.clear();

        System.out.println("O conjunto está vazio? " + coresArcoIris.isEmpty());
    }
}
