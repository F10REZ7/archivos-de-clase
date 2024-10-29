import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;

public class App extends JFrame{
    private static JLabel directionsJLabel = new JLabel("Pon tu nombre en el cuadro");
    private static JLabel outputJLabel = new JLabel();
    private static JTextField namebox=new JTextField(25);
    private static JButton nameButton=new JButton("hazme click");
    public static void main(String[] args) throws Exception {
        App window = new App();

        window.setSize(500,500);
        window.setVisible(true);
        window.setTitle("App de Juanse");
        window.setLayout(new FlowLayout(ERROR, ALLBITS, ABORT));
        window.getContentPane().add(directionsJLabel);
        window.getContentPane().add(outputJLabel);
        window.getContentPane().add(namebox);
        window.getContentPane().add(nameButton);
        //add an action listener = agregar un oyente de acción
        nameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonClick(e);//button that handles the event = botón que maneja el evento
            }
        });

        //add swing objects here = agregue objetos oscilantes aquí
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }// end of main = final del main
    public static void buttonClick(ActionEvent event){
        //Ponga código aquí para responder al botón
        //JOptionPane.showMessageDialog(null, "el boton funciona","buenas estimado caballero", JOptionPane.INFORMATION_MESSAGE);
        //hacer algo con la info obtenida
        String tunombre = namebox.getText();
        String outputmessage = "que onda: " + tunombre;
        outputJLabel.setText(outputmessage);
    }
}
