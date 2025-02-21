package EntityClasses;

//Création de la classe Filière
public class Filière {
    private int idFiliere;
    private String libelle;
    private String description;
    
    //Constructeur d'initialisation de tous les champs
    public Filière(int idFiliere, String libelle, String description){
        this.idFiliere = idFiliere;
        this.libelle = libelle;
        this.description = description;
    }
    
    //Constructeur sans paramètre
    public Filière(){
    }
    
    //Les Getter
    public int getIdFiliere(){
        return idFiliere;
    }
    public String getLibelle() {
	return libelle;
    }
    public String getDescription() {
	return description;
    }
    //Les Setter
    public void setidFiliere(int idFiliere){
        this.idFiliere=idFiliere;
    }
    public void setlibelle(String libelle){
	this.libelle=libelle;
    }
    public void setdescription(String description){
	this.description=description;
    }
}