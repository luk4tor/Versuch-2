package main;

import java.awt.Dimension;
import java.awt.Color;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
  //ist wie ein Spielbildschirm
  //SCREEN SETTINGS
  final int originalTileSize = 16;
  //Originalgröße einzelner Bausteine, für moderne Bildschirme etwas klein
  final int scale = 3;
  //Die Bausteine wirken größer(48*48)
  final int tileSize = originalTileSize * scale;
  //erzeugt einen Retro Look
  final int maxScreenCol = 16;
  //Anzahl der Bausteine die nebeneinander sind 
  final int maxScreenRow = 12;
  //Anzahl der Bausteine die untereinander sind
  final screenWidth = tileSize * maxScreenCol;
  //Weite des Bildschirms = 768 pixel
  final screenHeight = tileSize * maxScreenRow;
  //Höhe des Bildschirms = 576 pixel


  public GamePanel(){
    this.setPreferredSize(new Dimension(screenWidth, screenHeight);
    //Größe des Spielbildschirms wird festgelegt
    this.setBackground(Color.black);
    //Hintergrund erstmal schwarz
    this.setDoubleBuffered(true);
    //Er malt im Hintergrund hilft mit rendering performance
    
  }

}
