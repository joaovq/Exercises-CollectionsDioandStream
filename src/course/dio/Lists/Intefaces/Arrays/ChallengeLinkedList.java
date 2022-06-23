package course.dio.Lists.Intefaces.Arrays;

import java.util.LinkedList;
import java.util.List;

public class ChallengeLinkedList {
    public static void main(String[] args) {
        List<Double> notas2 = new LinkedList<Double>();
        notas2.add(5d);
        notas2.add(6.7d);
        notas2.add(9.8d);
        notas2.add(4.8d);
        notas2.add(8.2d);
        notas2.add(5.9d);
        System.out.println(notas2);
        System.out.println(notas2.get(0));
        System.out.println(notas2.remove(0));
        System.out.println(notas2);
    }
}
