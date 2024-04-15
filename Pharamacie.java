package p1;

import java.util.HashMap;
import java.util.TreeSet;

class Pharamacie {
  private String nom_pharmacie;
  private HashMap<String, Patient> patients_clients = new HashMap<String, Patient>();

  Pharamacie(String nom_pharmacie) {
    this.nom_pharmacie = nom_pharmacie;
  }
  
  public String getNom() {
    return this.nom_pharmacie;
  }
  public boolean ajoutPatient(String nom_patient, String[] liste_des_medicaments) {
    if (this.patients_clients.containsKey(nom_patient))
      return false;

    Patient nv_Patient = new Patient(nom_patient);
    for (String medicament : liste_des_medicaments)
      nv_Patient.ajoutMedicament(medicament);

    this.patients_clients.put(nom_patient, nv_Patient);

    return true;
  }

  public void ajoutMedicament(String nom_patient, String medicament) {
    if (!this.patients_clients.containsKey(nom_patient))
      return;
    this.patients_clients.get(nom_patient).ajoutMedicament(medicament);
  }

  public void affichePatient(String np) {
    if (this.patients_clients.containsKey(np))
      this.patients_clients.get(np).afficherPatient();
    System.out.println("patient doesn't exist my friend");
  }

  public TreeSet<String> PatientAvecMedicament(String medicament) {
    TreeSet<String> result = new TreeSet<String>();

    this.patients_clients.forEach((nom_patient, patient) -> {
      if (patient.contientMedicament(medicament))
        patient.afficherPatient();
    });

    return result;
  }

  public void enleverOrdonnanceVide() {
    this.patients_clients.forEach((nom_patient, patient) -> {
      if (patient.ordonnanceVide()) {
        this.patients_clients.remove(nom_patient);
      }
    });
  }

  public void affiche() {
    // or foreach madame :)
    this.patients_clients
        .values()
        .stream()
        .forEach((patient) -> patient.afficherPatient());

  }

}
