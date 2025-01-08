public class Conditional {
    public static void main(String[] args) {
        int yearOfRelease = 1995;
        boolean includedPlan = true;
        double movieRating = 8.2;
        String typePlan = "plus";

        if (yearOfRelease >= 1995) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme da década de 90 considerado um blockbuster, vale a pena assisistir");

        }

        if (includedPlan == true || typePlan.equals("plus")) {
            System.out.println("Filme disponível");
        } else {
            System.out.println("Comprar filme");
        }
    }
}
