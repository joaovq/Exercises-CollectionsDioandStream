package course.dio.Lists.Arrays;

import java.util.*;

/*Faça um programa que leia 6 temperaturas médias de um lugar, dos 6 primeiros meses do ano,
 e a partir disso, calcula a temperatura média

 * Depois disso, mostrar as temperaturas maiores que essa temperatura
 média e em que mês elas ocorreram
* */
public class Ex1 {
    public static void main(String[] args) {
//        Locale.setDefault(new Locale("pt", "BR"));

        List<Double> temperaturasMedias = new ArrayList<Double>();
        ArrayList<String> meses = new ArrayList<>(){{
            add("Janeiro");
            add("Fevereiro");
            add("Março");
            add("Abril");
            add("Maio");
            add("Junho");
        }};

        Scanner scan = new Scanner(System.in);

        double valorTemperatura;

        for (int i=0; i<6;i++){
            System.out.println("Digite a Temperatura média do " + (i+1) + "º" + " mês: ");
            valorTemperatura = scan.nextDouble();
            temperaturasMedias.add(valorTemperatura);
        }


//        System.out.println("Todas as temperaturas= "+ temperaturasMedias.toString()); ou
        System.out.println("Todas as temperaturas= "+ temperaturasMedias);

        //para praticar iterator

        Iterator<Double> iterator = temperaturasMedias.iterator();

        Double soma= 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println("Soma: " +  soma);
        Double media = soma/6;
        System.out.println("Média: " +  media);

        Iterator<Double> iterator1 = temperaturasMedias.iterator();

        System.out.println("Maiores temperaturas que a média");
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next>media){
                switch (temperaturasMedias.indexOf(next)) {

                    case 0:
                    System.out.println( (temperaturasMedias.indexOf(next)+1) + " "+ meses.get(temperaturasMedias.indexOf(next))+ ": "+ next);
                    break;
                    case 1:
                        System.out.println( (temperaturasMedias.indexOf(next)+1) + " "+ meses.get(temperaturasMedias.indexOf(next))+ ": "+ next);
                    break;
                    case 2:
                        System.out.println( (temperaturasMedias.indexOf(next)+1) + " "+ meses.get(temperaturasMedias.indexOf(next))+ ": "+ next);
                    break;
                    case 3:
                        System.out.println( (temperaturasMedias.indexOf(next)+1) + " "+ meses.get(temperaturasMedias.indexOf(next))+ ": "+ next);
                    break;
                    case 4:
                        System.out.println( (temperaturasMedias.indexOf(next)+1) + " "+ meses.get(temperaturasMedias.indexOf(next))+ ": "+ next);
                    break;
                    case 5:
                        System.out.println( (temperaturasMedias.indexOf(next)+1) + " "+ meses.get(temperaturasMedias.indexOf(next))+ ": "+ next);
                    break;
                    default:
                    System.out.println("Tem alguma coisa errada ou nenhuma temperatura é maior que a média");
                    break;
            }
            }
            else System.out.println("Nenhuma temperatura é maior que a média");
        }
        System.out.println(temperaturasMedias);

    }
}
