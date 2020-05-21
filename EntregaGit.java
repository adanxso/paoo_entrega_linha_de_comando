import javax.javax.swing.*;
import javax.swing.JOptionPane;
public class EntregaGit{
    //TESTEEEEE
    public static void main(String[] args) {
        System.out.println("Entregando com o Git na linha de comando... ");
        String none = JOptionPane.showOptionDialog('Qual o seu nome?');
        JOptionPane.showMessageDialog(null, String.format ('Oi, %s', none));
    }
}