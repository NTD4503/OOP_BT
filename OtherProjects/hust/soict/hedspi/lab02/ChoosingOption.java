package OtherProjects.hust.soict.hedspi.lab02;

import javax.swing.*;

public class ChoosingOption {
    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null,
                "Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null, "You 've chooen: " +
                (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
        System.exit(0);
    }
}
