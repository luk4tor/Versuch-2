//Anna
package main;

import javax.swing.JFrame;

public class Main{
  
  public static void Main(String[] args){
    //TODO Auto-generated method stub
    JFrame window = new JFrame();
    window.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
    //Fenster kann geschlossen werden
    window.setResizable(false);
    //größe des Fensters kann nicht geändert werden
    window.setTitle("Hasenhunt");
    //Unser Spiel heißt Hasenhunt
    window.setLocationRelativeTo(null);
    //Keine genaue Plazierung des Fensters sondern in der Mitte des Bildschirms
    window.setVisible(true);
    //Fenster ist sichtbar

  }
  
}
