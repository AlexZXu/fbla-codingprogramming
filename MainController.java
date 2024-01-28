import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;  

public class MainController extends JFrame {
    public MainController () {
        JPanel panel = new JPanel();

        JLabel nameLabel = new JLabel("Name");
        JTextField nameField = new JTextField();
        nameField.setColumns(16);  
        
        JLabel emailLabel = new JLabel("Email");
        JTextField emailField = new JTextField();
        emailField.setColumns(16);    

        JButton b = new JButton("Click Here");  
        b.setBounds(50,100,95,30);  

        b.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                System.out.println("hello");
            }  
        });  
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(b);

        JPanel list = new JPanel();

        add(panel);
    }

    public void start() {
        setSize(500, 500);
        setVisible(true);
    }
}
