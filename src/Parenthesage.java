import java.util.Scanner;
import java.util.Stack;

public class Parenthesage {
    private static boolean validerParenthesage(String chaine) {
        Stack<Character> delim = new Stack<>();
        for (int i = 0; i < chaine.length(); i++)
            switch (chaine.charAt(i)) {
                case '(':
                    delim.push('(');
                    break;
                case ')':
                    if (delim.empty() || delim.pop() != '(')
                        return false;
                    break;
            }
        return delim.empty();
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String entree = "Q";
        do {
            System.out.println("Entrez une chaîne contenant des parenthèses. (Q pour quitter)");
            entree = in.nextLine();

            boolean valide = validerParenthesage(entree);

            if (valide)
                System.out.println("La chaîne entrée est bien parenthésée");
            else
                System.out.println("La chaîne entrée n'est pas bien parenthésée");

            System.out.println();
        } while (!entree.equals("Q"));
    }
}
