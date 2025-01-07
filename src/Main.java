public class Main {
    public static void main(String[] args) {
        System.out.printf("Screen Match Movies");
        System.out.println("Filme: Jumanji");
        

        int yearOfRelease = 1995;
        System.out.println("Ano de lançamento: " + yearOfRelease);
        boolean includedPlan = true;
        double movieRating = 8.2;
        System.out.println(movieRating);
        String sinopse;
        sinopse = """
                Filme Jumanji
                Uma aventura do jogo de tabuleiro para a vida real!
                Ano de lançamento
                """ + yearOfRelease;
        System.out.println(sinopse);

        }
    }
