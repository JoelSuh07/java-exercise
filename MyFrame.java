import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
    
    JButton button,button2,button3,button4,button5,button6,button7,button8;

    MyFrame(){

        button = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button.setBounds(200, 100, 100, 50);
        button2.setBounds(200, 100, 100, 50);
        button3.setBounds(200, 100, 100, 50);
        button4.setBounds(200, 100, 100, 50);
        button5.setBounds(200, 100, 100, 50);
        button6.setBounds(200, 100, 100, 50);
        button7.setBounds(200, 100, 100, 50);
        button8.setBounds(200, 100, 100, 50);
        button.setText("Button");
        button2.setText("Button2");
        button3.setText("Button3");
        button4.setText("Button4");
        button5.setText("Button5");
        button6.setText("Button6");
        button7.setText("Button7");
        button8.setText("Button8");
        button.setFocusable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        this.add(button6);
        this.add(button7);
        this.add(button8);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println("Spinach");
        }
    }
}
