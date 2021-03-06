package GUI;

import environments.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * The GUI of the game.
 */
public class GameWindow extends JFrame {

  //static Toolkit tk = Toolkit.getDefaultToolkit();
  private static Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

  /**
   * Default constructor for a GameWindow.
   */
  public GameWindow () {
    setLayout(new BorderLayout());

    JTextArea console;
    TitledBorder consoleBorder;

    JTextArea input;
    TitledBorder inputBorder;

    //Initialize console text area
    console = new JTextArea();
    console.setPreferredSize(new Dimension(screen.width / 2, screen.height / 4));
    console.setEditable(false);

    consoleBorder = new TitledBorder("Console:");
    consoleBorder.setTitleColor(Color.WHITE);

    console.setBorder(consoleBorder);
    console.setBackground(Color.BLACK);
    console.setLineWrap(true);

    //Initialize input text area
    input = new JTextArea();
    input.setPreferredSize(new Dimension(screen.width / 2, screen.height / 6));

    inputBorder = new TitledBorder("Input:");
    inputBorder.setTitleColor(Color.WHITE);

    input.setBorder(inputBorder);
    input.setBackground(Color.BLACK);
    input.setLineWrap(true);

    add(console, BorderLayout.NORTH);
    add(input, BorderLayout.SOUTH);

    try {
      BufferedInputStream in = new BufferedInputStream(new FileInputStream("src\\resources\\beginningTortureRoom.rm"));
      ObjectInputStream objectInputStream = new ObjectInputStream(in);

      BeginningRoom room = (BeginningRoom) objectInputStream.readObject();

      console.setText(room.getDescription());


    } catch (IOException | ClassNotFoundException e) {
      System.out.println(e.getMessage() + " : " + e.getClass());
    }

    setLocation((screen.width / 2) - (screen.width / 4), (screen.height / 2) - (int)(screen.height * (5 / 24.0)));
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    pack();
    setVisible(true);
  }
}
