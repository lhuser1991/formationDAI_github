import java.util.Arrays;
import java.util.Random;

public class NumberCombination {
    public static void main(String[] args) throws Exception {
        System.out.println("Bonjour, vous êtes dans le fichier NumberCombination.java. Bonne séance de codding :).");

        // Objectif : afficher un tableau composé de 3 nombres aléatoires compris entre 0 et 10 avec comme condition :
        // 1) les deux premiers nombres du tableau doivent êtres pairs et le troisième impairs.
        // é) afficher le nombre d'essai effectué pour obtenir le tableau désiré.

        Random rd = new Random();
        // int[] tab ={0,0,3};  // test

        int[] tab = new int[3];
        int validation = 0;
        int cpt = 1;

        while(validation == 0) {
            for (int i = 0; i < tab.length; i++) {
                int nb = rd.nextInt(10);
                tab[i] = nb;
            }

            System.out.println("Voici le tableau obtenue : "+Arrays.toString(tab)); // optionnel

            if(tab[0]!=(0&1) && tab[1]!=(0&1) && tab[0]%2==0 && tab[1]%2==0 && tab[2]%2!=0) {
                validation = 1;
            } else {
                cpt++;
            }

        }

        System.out.println("Voici le tableau final obtenue : "+Arrays.toString(tab));
        System.out.println("Voici le nombre d'essai effectué pour obtenir le tableau : "+cpt);

        // for (int i = 0; i < tab.length; i++) {
        //     int nb = rd.nextInt(10);
        //     tab[i] = nb;
        //     System.out.println("Voici le nombre " + (i + 1) + " selectionné aléatoirement entre 0 et 10 : " + nb + ".");
        // }

        // System.out.println("Voici le tableau crée : "+Arrays.toString(tab));

        // if(tab[0]!=(0&1) & tab[1]!=(0&1) & tab[0]%2==0 & tab[1]%2==0 ) {
        //     System.out.print("Le tableau commence par deux nombres pairs.");
        // } else {
        //     System.out.print("Le tableau ne commence pas par deux nombres pairs.");
        // }


    }
}
