public class Livre {
    /*Nous allons déclarer les attributs de la classe livre */
    private String titre;
    private String auteur;
    private int anneePublication;
    private String ISBN;

    public Livre(){};

    /*construction du constructeur pour initialiser les attributs*/
    public Livre(String titre, String auteur, int anneePublication, String ISBN) {
        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
        this.ISBN = ISBN;
    }


    /*construction des getters et des setters les attributs*/
    public String getTitre(){
        return this.titre;
    }
    public void setTitre(String titre){
        this.titre = titre;
    }

    public String getAuteur(){
        return this.auteur;
    }
    public void setAuteur(String auteur){
        this.auteur = auteur;
    }

    public int getAnneePublication(){
        return this.anneePublication;
    }
    public void setAnneePublication(int anneePublication){
        this.anneePublication = anneePublication;
    }

    public String getISBN(){
        return this.ISBN;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    /*construction de la methode toString() pour initialiser les attributs*/
    public String toString(){
        return "Livre{" +
            "titre='" + titre + '\'' +
            ", auteur='" + auteur + '\'' +
            ", anneePublication=" + anneePublication +
            ", ISBN='" + ISBN + '\'' +
            '}';
    }

}