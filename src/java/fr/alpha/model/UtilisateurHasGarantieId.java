package fr.alpha.model;
// Generated 11 f�vr. 2015 15:14:00 by Hibernate Tools 4.3.1



/**
 * UtilisateurHasGarantieId generated by hbm2java
 */
public class UtilisateurHasGarantieId  implements java.io.Serializable {


     private int utilisateurIdutilisateur;
     private int garantieIdgarantie;

    public UtilisateurHasGarantieId() {
    }

    public UtilisateurHasGarantieId(int utilisateurIdutilisateur, int garantieIdgarantie) {
       this.utilisateurIdutilisateur = utilisateurIdutilisateur;
       this.garantieIdgarantie = garantieIdgarantie;
    }
   
    public int getUtilisateurIdutilisateur() {
        return this.utilisateurIdutilisateur;
    }
    
    public void setUtilisateurIdutilisateur(int utilisateurIdutilisateur) {
        this.utilisateurIdutilisateur = utilisateurIdutilisateur;
    }
    public int getGarantieIdgarantie() {
        return this.garantieIdgarantie;
    }
    
    public void setGarantieIdgarantie(int garantieIdgarantie) {
        this.garantieIdgarantie = garantieIdgarantie;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UtilisateurHasGarantieId) ) return false;
		 UtilisateurHasGarantieId castOther = ( UtilisateurHasGarantieId ) other; 
         
		 return (this.getUtilisateurIdutilisateur()==castOther.getUtilisateurIdutilisateur())
 && (this.getGarantieIdgarantie()==castOther.getGarantieIdgarantie());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getUtilisateurIdutilisateur();
         result = 37 * result + this.getGarantieIdgarantie();
         return result;
   }   


}

