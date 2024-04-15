package p1;

import java.util.HashSet;
import java.util.Set;

class Patient {
  private String nom;
  private Set<String> listeDeMedicaments = new HashSet<String>();

  public Patient(String nom) {
    this.nom = nom;
  }

  public String getNom() {
    return this.nom;
  }

  public boolean ordonnanceVide() {
    return this.listeDeMedicaments.size() == 0;
  }

  public boolean contientMedicament(String med) {
    return this.listeDeMedicaments.contains(med);
  }

  public void ajoutMedicament(String medicament) {
    if (this.contientMedicament(medicament))
      return;
    this.listeDeMedicaments.add(medicament);
  }

  public void afficherOrdannance() {
    this.listeDeMedicaments.stream().forEach((medicament) -> System.out.println(medicament));
  }

  public void afficherPatient() {
    System.out.println("Nom du patient: ");
    System.out.println(this.nom);
    System.out.println("Ordannance: ");
    this.afficherOrdannance();
  }

  @Override
  public boolean equals(Object obj) {
    return ((Patient) obj).nom == this.nom;
  }
}
