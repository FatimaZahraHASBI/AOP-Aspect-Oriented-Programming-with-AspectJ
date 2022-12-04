import metier.Compte;
import metier.IMetierBanque;
import metier.IMetierBanqueImpl;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        new Application().start();
    }
    public void start() {
        System.out.println("Démarrage de l'application");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Donner le code du compte :");
        long code = scanner.nextLong();
        System.out.print("Donner le solde initiale du compte :");
        double solde = scanner.nextDouble();
        IMetierBanque metierBanque = new IMetierBanqueImpl();
        metierBanque.addCompte(new Compte(code, solde));
        while (true) {
            System.out.print("Type Opération:");
            String type = scanner.next();
            if (type.equals("quitter")) break;
            System.out.print("Montant :");
            double montant = scanner.nextDouble();
            if (type.equals("v")) {
                metierBanque.verser(code, montant);
            } else if (type.equals("r")) {
                metierBanque.retirer(code, montant);
            }
            Compte compte = metierBanque.consulter(code);
            System.out.println("Etat du compte :" + compte.toString());
        }
        System.out.println("Fin de l'application");
    }
}
