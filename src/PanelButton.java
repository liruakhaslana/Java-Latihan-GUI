import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class PanelButton extends JPanel {
    private JLabel lblStatus;

    public PanelButton() {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 15, 15));
        JButton btnMerah = new JButton("Merah");
        JButton btnBiru = new JButton("Biru");
        JButton btnHijau = new JButton("Hijau");

        centerPanel.add(btnMerah);
        centerPanel.add(btnBiru);
        centerPanel.add(btnHijau);

        lblStatus = new JLabel("Klik tombol untuk mengubah warna background", SwingConstants.CENTER);
        add(centerPanel, BorderLayout.CENTER);
        add(lblStatus, BorderLayout.SOUTH);

        btnMerah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.RED.brighter());
                lblStatus.setText("Warna diubah menjadi: Merah");
            }
        });

        btnBiru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.BLUE.brighter());
                lblStatus.setText("Warna diubah menjadi: Biru");
            }
        });

        btnHijau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.GREEN.brighter());
                lblStatus.setText("Warna diubah menjadi: Hijau");
            }
        });

        MouseAdapter hoverEffect = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JButton tombol = (JButton) e.getSource();
                tombol.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        };

        btnMerah.addMouseListener(hoverEffect);
        btnBiru.addMouseListener(hoverEffect);
        btnHijau.addMouseListener(hoverEffect);
    }
}