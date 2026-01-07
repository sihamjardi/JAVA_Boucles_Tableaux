package tp3;

public class Ex4Test {

    public static void main(String[] args) {

        double[][] t1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        double[][] t2 = {
                {10, 20, 30},
                {40, 50, 60}
        };

        System.out.println("Tableau t1 :");
        TableauUtils.affiche(t1);

        System.out.println("\nTableau t2 :");
        TableauUtils.affiche(t2);

        System.out.println("\nTableaux réguliers ? " + TableauUtils.regulier(t1));

        System.out.println("\nSomme des lignes de t1 :");
        double[] sommes = TableauUtils.sommeLignes(t1);
        for (double s : sommes) {
            System.out.println(s);
        }

        System.out.println("\nSomme t1 + t2 :");
        double[][] somme = TableauUtils.somme(t1, t2);

        if (somme != null)
            TableauUtils.affiche(somme);
        else
            System.out.println("Impossible de faire la somme.");
    }
}
