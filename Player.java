package entity;

import main.GamePanel;
import main.Keyhandler;

public class Player extends Entity {

  GamePanel gp;
  KeyHandler keyH;

  setDefaultValues();

  public Player(GamePanel gp, Keyhandle keyH) {

    this.gp = gp;
    this.keyH = keyH;

    setDefaultValues();
    
  }

  public void setDefaultValues() {

    x = 100;
    y = 100;
    speed = 4;
  }

  public void getPlayerImage() {
    
    try {


    }catch(IOException e) {
      e.printStackTrace();
    }
    
  




  }

  public void update() {

    if(keyH.upPressed == true) {
      y -= speed;
    }
    if(keyH.downPressed == true) {
      y += speed;
    }
    if(keyH.leftPressed == true) {
      x -= speed;
    }
    if(keyH.rightPressed == true) {
      x += speed;
    }

  }

  public void draw(Graphics2D g2) {

    g2.setColor(Color.white);
    g2.fillRect(x, y, gp.tileSize, gp.tileSize);
  }















}
