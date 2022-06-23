package course.dio.Lists.Intefaces.Arrays;

import java.util.*;

public class exemploordenaçãogato {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "Vermelho"));
            add(new Gato("Simba", 6, "Marrom"));
            add(new Gato("Jon", 1, "Branco"));
        }};
        System.out.println("--\t Inseption Order \t--");
        System.out.println(meusGatos);
        System.out.println("--\tRandom Order \t--");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        System.out.println("--\tNatural Order \t--");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        System.out.println("--\tAge's Order \t--");
//        Collections.sort(meusGatos, new ComparatorIdade())
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("--\tColor's Order \t--");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);
        System.out.println("--\tName/Color/Age's Order \t--");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }

}
 class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato() {
    }

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(idade, gato.idade) && Objects.equals(cor, gato.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, cor);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

     @Override
     public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
     }
 }

 class ComparatorIdade implements Comparator<Gato> {
     @Override
     public int compare(Gato g1, Gato g2) {
         return Integer.compare(g1.getIdade(), g2.getIdade());
     }
 }
 class ComparatorCor implements Comparator<Gato>{
     @Override
     public int compare(Gato g1, Gato g2) {
         return g1.getCor(). compareToIgnoreCase(g2.getCor());
     }
     }
     class ComparatorNomeCorIdade implements Comparator<Gato>{
         @Override
         public int compare(Gato g1, Gato g2) {
             int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
             if(nome != 0) return nome;

             int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
             if(cor!=0)  return cor;

             return Integer.compare(g1.getIdade(), g2.getIdade());
         }

 }
