import java.util.ArrayList;
import java.util.HashMap;

public class Bibliotheque {
    private ArrayList<Livre> listeLivres;
    private  HashMap<Utilisateur, ArrayList<Livre>> empruntsUtilisateurs;

    //Creation du constructeur
    /*nous initialisons listeLivres dans le constructeur pour que des la
     * creation de l'objet bibliotheque l'arraylist oit initialisé
     */
    public Bibliotheque(){
        this.listeLivres = new ArrayList<>();
        this.empruntsUtilisateurs = new HashMap<>();
    }


    //Méthode pour ajouter un livre à la bibliothèque.
    /*nous allons créér une méthode ajouterLivre qui prend en paramétre un livre deja créé et l'ajoute dans 
     * le tableau dynamique(arraylist) nommé listeLivres.En soit ce tableau contiendra tout les livres qu'on ajoutera dans 
     * la bibliotheque
     */
    public void ajouterLivre(Livre instanceLivre){
        /*nous devons d'abord verifier si le livre existe avant de pouvoir l'integrer dans la bibliotheque 
         * s'il existe deja dans la bibliotheque alors il faudra juste mettre a jour son nombre de copie
        */
        if (listeLivres.contains(instanceLivre)){
            System.out.println("Ce livre est deja dans la bibliotheque.\t Nous allons ajouter une copie ");
            // Mettre à jour le nombre de copies disponibles du livre existant
            instanceLivre.setNombreCopies(instanceLivre.getNombreCopies() + 1); // Incrémente le nombre de copies
            
        }else {
            listeLivres.add(instanceLivre); // Ajoute le nouveau livre à la liste

            System.out.println("Nouveau livre ajouté à la bibliothèque.");
        }
    }

    //Méthode pour supprimer un livre de la bibliothèque.
    //Méthode pour rechercher un livre par titre, auteur ou ISBN.
    //Méthode pour enregistrer l'emprunt d'un livre par un utilisateur.
    //Méthode pour enregistrer le retour d'un livre par un utilisateur.
    //Méthode pour vérifier l'éligibilité d'un utilisateur à emprunter un livre.

}
