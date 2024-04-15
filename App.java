package p1;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
  public static void main( String[] args )
    {
      Pharamacie ph = new Pharamacie("pharma");

      ph.ajoutPatient("p1", new String[]{"m1", "m2", "m3", "m4"});
      ph.ajoutPatient("p2", new String[]{"m1", "m2", "m3", "m4"});
      ph.ajoutPatient("p3", new String[]{"m1", "m2", "m3", "m4"});
      ph.ajoutPatient("p4", new String[]{"m1", "m2", "m3", "m4"});
      ph.ajoutPatient("p5", new String[]{"m1", "m2", "m3", "m4"});
      ph.ajoutPatient("p6", new String[]{"m1", "m2", "m3", "m4"});
      ph.ajoutPatient("p7", new String[]{"m1", "m2", "m3", "m4"});
      ph.ajoutPatient("p8", new String[]{"m1", "m2", "m3", "m4"});
      ph.ajoutPatient("p9", new String[]{"m1", "m2", "m3", "m4"});
      ph.ajoutPatient("p10", new String[]{"m1", "m2", "m3", "m4"});
      ph.ajoutPatient("p11", new String[]{"m1", "m2", "m3", "m4"});

      ph.affiche();
    }
}
