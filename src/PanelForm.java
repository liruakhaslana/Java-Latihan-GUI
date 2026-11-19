import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PanelForm extends JPanel {

    private JTextField txtNama;
    private JTextField txtPanggilan;
    private JLabel lblHasil;

    public PanelForm() {
        setLayout(new GridLayout(4, 2, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        add(new JLabel("Nama Panjag:"));
        txtNama = new JTextField();
        add(txtNama);

        add(new JLabel("panggilan:"));
        txtPanggilan = new JTextField();
        add(txtPanggilan);

        JButton btnTampil = new JButton("Tampilkan");
        add(btnTampil);

        lblHasil = new JLabel("-");
        add(lblHasil);

        btnTampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = txtNama.getText();
                String panggilan = txtPanggilan.getText();
                if (nama.isEmpty() || panggilan.isEmpty()) {
                    lblHasil.setText("Data belum lengkap!");
                    lblHasil.setForeground(Color.RED);
                } else {
                    lblHasil.setText(nama + " (" + panggilan + ")");
                    lblHasil.setForeground(new Color(0, 128, 0));
                }
            }
        });
    }
}