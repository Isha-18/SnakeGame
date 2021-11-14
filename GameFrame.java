import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.event.*;




public class GameFrame extends JFrame {

   GamePanel panel;
    GameFrame(){
        panel=new GamePanel();



        this.add(panel);
        this.setTitle("Snake game for snakes XD");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);

    }
}
