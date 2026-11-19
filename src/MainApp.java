import javax.swing.*;

public class MainApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("RRQ.exe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Form Input", new PanelForm());
        tabbedPane.addTab("Button Demo", new PanelButton());

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}