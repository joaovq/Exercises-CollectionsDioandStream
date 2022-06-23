package course.dio.Lists.Intefaces.Set;

import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));

        Set<Serie> series = new HashSet<>(){{
            add(new Serie("got", "aventura", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("Two and a Half man", "Comédia", 25));
        }};
        System.out.println("Ordem aleatória");
        for (Serie serie: series) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getDuracaoEp());

        System.out.println("");
        System.out.println("Ordem de inserção");

        Set<Serie> series1 = new LinkedHashSet<>(){{
            add(new Serie("got", "aventura", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("Two and a Half man", "Comédia", 25));
        }};
        for (Serie insercao: series1
             ) {
            System.out.println(insercao.getNome() + " - "
                    + insercao.getGenero() + " - " + insercao.getDuracaoEp());
        };
        System.out.println("");
        System.out.println("Ordem Natural");
        Set<Serie> series2 = new TreeSet<>(series1);

        for (Serie insercao: series2
        ) {
            System.out.println(insercao.getNome() + " - "
                    + insercao.getGenero() + " - " + insercao.getDuracaoEp());
        };

        System.out.println("");
        System.out.println("Ordem Nome/Genero/Duração");

        Set<Serie> series3 = new TreeSet<>(new ComparatorNomeGeneroDuracao());
        series3.addAll(series);

        for (Serie insercao: series3
        ) {
            System.out.println(insercao.getNome() + " - "
                    + insercao.getGenero() + " - " + insercao.getDuracaoEp());
        };

        System.out.println("");
        System.out.println("Ordem por gênero");

        Set<Serie> series4 = new TreeSet<>(new ComparatorGenero());
        series4.addAll(series);
        for (Serie insercao: series4
        ) {
            System.out.println(insercao.getNome() + " - "
                    + insercao.getGenero() + " - " + insercao.getDuracaoEp());
        };

        System.out.println("");

        System.out.println("Ordem por tempo de episodio");

        Set<Serie> series5 = new TreeSet<>(new ComparatorDuracao());
        series5.addAll(series);

        for (Serie insercao: series5
        ) {
            System.out.println(insercao.getNome() + " - "
                    + insercao.getGenero() + " - " + insercao.getDuracaoEp());
        };
    }
}

    class Serie implements Comparable<Serie>{
        private String nome;
        private String genero;
        private Integer duracaoEp;


        public Serie(String nome, String genero, Integer duracaoEp) {
            this.nome = nome;
            this.genero = genero;
            this.duracaoEp = duracaoEp;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public Integer getDuracaoEp() {
            return duracaoEp;
        }

        public void setDuracaoEp(Integer duracaoEp) {
            this.duracaoEp = duracaoEp;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Serie serie = (Serie) o;
            return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(duracaoEp, serie.duracaoEp);
        }
        @Override
        public int hashCode() {
            return Objects.hash(nome, genero, duracaoEp);
        }

        @Override
        public int compareTo(Serie serie) {
            return this.getGenero().compareTo(serie.getGenero());
        }
    }

    class ComparatorNomeGeneroDuracao implements Comparator<Serie> {

        @Override
        public int compare(Serie s1, Serie s2) {
            int nome = s1.getNome().compareTo(s2.getNome());
            if(nome!=0) return nome;

            int genero = s1.getGenero().compareTo(s2.getGenero());
            if(genero !=0) return genero;

            return Integer.compare(s1.getDuracaoEp(), s2.getDuracaoEp());
        }
    }

class ComparatorGenero implements Comparator<Serie>{


    @Override
    public int compare(Serie s1, Serie s2) {
        return s1.getGenero().compareToIgnoreCase(s2.getGenero());
    }
}

class ComparatorDuracao implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int duracao = Integer.compare(s1.getDuracaoEp(), s2.getDuracaoEp());
        if(duracao!=0) return duracao;
        return s1.getNome().compareToIgnoreCase(s2.getNome());
    }
}