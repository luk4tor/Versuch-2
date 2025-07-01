package main;

import java.awt.event.KeyEvent;
import java.awt.KeyListener;

public class Keyhandler implemnts KeyListener {

public boolean upPressed, downPressed, leftPressed, rightPressed;
  
  @override
    public void KeyTyped(KeyEvent e) {
    }

  @override
    public void KeyPressed(KeyEvent e) {

      int code = e.getKeyCode();

      if(code == KeyEvent.VK_W) {
        upPressed = true;
      }

      if(code == KeyEvent.VK_S) {
        downPressed = true;
      }

      if(code == KeyEvent.VK_A) {
        leftPressed = true;
      }

      if(code == KeyEvent.VK_D) {
        rightPressed = true;
      }

  }

  @override
  public void keyReleased(KeyEvent e) {

      int code = e.getKeycode();

      if(code == KeyEvent.VK_W) {
        upPressed = false;
      }

      if(code == KeyEvent.VK_S) {
        downPressed = false;
      }

      if(code == KeyEvent.VK_A) {
        leftPressed = false;
      }

      if(code == KeyEvent.VK_D) {
        rightPressed = false;
      }

    
    }

}
