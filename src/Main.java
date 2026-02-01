import javax.swing.*;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int i = 1;
        Random random=new Random();
        int num= random.nextInt(10);
        while (true){
            String guess_num= JOptionPane.showInputDialog("Enter guess number ");
            int g_num=Integer.valueOf(guess_num);
            if (g_num == num) {
                String message= "Correct! You guessed it in " + i + " tries.";
                JOptionPane.showMessageDialog(null ,message);
                break;
            } else if (g_num<num) {
                String message= "Too low! Try a higher number.";
                JOptionPane.showMessageDialog(null ,message);
                i++;
            } else if (g_num>num) {
                String message= "Too high! Try a lower number.";
                JOptionPane.showMessageDialog(null ,message);
                i++;
            }

        }
    }
}