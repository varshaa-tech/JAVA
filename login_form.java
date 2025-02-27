import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class login{
    public void login(){
        JFrame frame=new JFrame();
        JLabel name= new JLabel("Name:");
        JTextField x1=new JTextField(20);
        JLabel password= new JLabel("PASSWORD:");
        JTextField x2=new JTextField(20);
        frame.setTitle("USER AUTHENTICATION");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 1));
        frame.setLayout(new FlowLayout());
        frame.add(name);
        x1.setSize(100,20);
        frame.add(x1);
        frame.add(password);
        frame.add(x2);
        frame.setVisible(true);
        x1.setSize(100,20);
    }
}
public class login_form {
    public static void main(String[] args) {
        JFrame frame1=new JFrame();
        JButton b1=new JButton("Login");
        JButton b2=new JButton("Signup");
        frame1.setSize(400, 200);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setLayout(new GridLayout(4, 1));
        frame1.setLayout(new FlowLayout());
        frame1.add(b1);
        frame1.add(b2);
        frame1.setVisible(true);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login l1=new login();
                l1.login();
            }
        });
    }
}
