package main;

import java.awt.Dimension;
import java.awt.Color;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
//erweitert Graphics um mehr Kontrolle über Geometrie, Koordinatenänderungen, Farben und Texte zu bekommen

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

  //FPS
  int FPS = 60;
  //sonst wird der Bildschrim zu oft geupdatet und eeine Tastendrückung sorgt für den Verlust des Spielers
  
  KeyHandler keyH = new KeyHandler();
  Thread gameThread;
  //hilft dabei wiederholende Sequenzen einzustellen, wie Charakter Animationen

  //Startposition des Spielers einstellen
  int PlayerX = 100;
  int playerY = 100;
  int playerSpeed = 4;


  public GamePanel(){
    this.setPreferredSize(new Dimension(screenWidth, screenHeight);
    //Größe des Spielbildschirms wird festgelegt
    this.setBackground(Color.black);
    //Hintergrund erstmal schwarz
    this.setDoubleBuffered(true);
    //Er malt im Hintergrund hilft mit rendering performance
    this.addKeyListener(keyH);
    this.setFocusable(true);
    //GamePanel fokusiert sich auf das Empfangen von Tasteneingaben
    
  }

  public void startGameThread(){
    gameThread = new Thread(this);
    //sorgt dafür, dass die GamePanel-Klasse zu Thread hinzugefügt wird
    gameThread.start();
  }

  @Override
  public void run(){
    //erzeugt einen GameLoop der Zentrum des Spiels ist

    double drawInterval = 1000000000/FPS;
    //eine Sekunde dargestellt als nanosekunden wird durch 60 getelit, somit entstehen 60 Frames per sekond
    //Bildschirm wird alle 0,017 Sekunden gemalt
    double nextDrawTime = System.nanoTime() + drawInterval;
    //die aktuelle Zeit wird in Nanosekunden bestimmt und dann wird nach 0,017 Sekunden erneut gemalt
    
    while(gameThread != null){
      //solange es gameThread gibt, wird wiederholt

      //1. UPDATE: updaten der infos, wie zB. Positionen
      update();
      
      //2. DRAw: Bildschirm wird mmit den aktuellen infos gemalt
      repaint();

      abgezogen wird

      try {
        double remainingTime = nextDrawTime - System.nanoTime();
        //fragt wie viel Zeit noch übring ist, indem die vergangene Zeit von der noch abzuwartenden 
        remainingTime = remainingTime/1000000);
        //umwandlund in millisekunden um sleep zu nutzen

        if(remainingTime <0){
          remaingTime = 0;
        }

        Thread.sleep((long) remainingTime);
        //Thread soll abwarten und remainingTime wurde zu anderem Datentyp um sleep-Methode zu nutzen
      }  catch (InterruptedException e){
        e.printStackTrace();
      }

      nextDrawTime += drawInterval;
      //um wieder abwarten zu können

    }
  }
  public void update{
    if (keyH.upPressed == true){
      playerY -= playerSpeed;
      //Charakter bewegt sich nach oben (weil obere linke Ecke hat Koordinaten 0,0)
    }
    else if (keyH.downPressed == true){
      playerY += playerSpeed;
      //Charakter bewegt sich nach unten
    }
    else if (keyH.leftPressed == true){
      playerX -= playerSpeed;
      //Charakter bewegt sich nach unten
    }
    else if (keyH.rightPressed == true){
      playerX += playerSpeed;
      //Charakter bewegt sich nach unten
    }
  }

  public void paintComponent(Graphics g){

    super.paintComponent(g);

    Graphics2D g2 = (Graphics2D)g;
    //g ändert Klasse

    g2.setColor(Color.white);
    //es wird in weiß gemalt

    g2.fillRect(playerX, playerY, tileSize, tileSize);
    //erstmal als Spielfigur

    g2.dispose();
    //die Grafik wird gelöscht, sodass das Programm noch funktioniert, aber Speicherplatz gesparrt wird
    
  }

}
