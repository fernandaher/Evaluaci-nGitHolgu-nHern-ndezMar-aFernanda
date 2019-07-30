package main;

import static mess.Mess.*;
import javax.swing.JOptionPane;

public class Main {

        public static void main (String[] args) {



            String name = JOptionPane.showInputDialog(null, "Write the name");

            JOptionPane.showMessageDialog(null, MENSAJE_NOMBRE.getMess() + (name));



        }
}
