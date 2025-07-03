package main;

import java.awt.Dimension;
import java.awt.Color;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
  //ist wie ein Spielbildschirm
  //SCREEN SETTINGS
  final int originalTileSize = 16;
  //Originalgröße einzelner Bausteine, für moderne Bildschirme etwas klein
  final int scale = 3;
  //Die Bausteine wirken größer(48*48)
  public final int tileSize = originalTileSize * scale;
  //erzeugt einen Retro Look
  final int maxScreenCol = 16;
  //Anzahl der Bausteine die nebeneinander sind 
  final int maxScreenRow = 12;
  //Anzahl der Bausteine die untereinander sind
  final screenWidth = tileSize * maxScreenCol;
  //Weite des Bildschirms = 768 pixel
  final screenHeight = tileSize * maxScreenRow;
  //Höhe des Bildschirms = 576 pixel

  Thread gameThread;
  //hilft dabei wiederholende Sequenzen einzustellen, wie Charakter Animationen


  public GamePanel(){
    this.setPreferredSize(new Dimension(screenWidth, screenHeight);
    //Größe des Spielbildschirms wird festgelegt
    this.setBackground(Color.black);
    //Hintergrund erstmal schwarz
    this.setDoubleBuffered(true);
    //Er malt im Hintergrund hilft mit rendering performance
    
  }

  public void startGameThread(){
    gameThread = new Thread(this);
    //sorgt dafür, dass die GamePanel-Klasse zu Thread hinzugefügt wird
    gameThread.start();
  }

  @Override
  public void run(){
    //erzeugt einen GameLoop der Zentrum des Spiels ist
    while(gameThread != null){
      //solange es gameThread gibt, wird wiederholt
    }
  }

}
