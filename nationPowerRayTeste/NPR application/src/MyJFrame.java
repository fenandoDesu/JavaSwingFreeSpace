import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJFrame extends JFrame implements ActionListener {
    JFrame jframe;
    Button button;
    Button button2;
    Label label1;
    JTextField textField1;

    MyJFrame(){
        jframe = new JFrame();
        jframe.setLayout(new FlowLayout());
        jframe.setTitle("Nation Power Ray");
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.getContentPane().setBackground(Color.gray);
        jframe.setSize(500, 500);
        jframe.setLayout(new FlowLayout());

        button = new Button();
        button.setBounds(100, 0, 150, 100);
        button.setSize(150, 100);
        jframe.add(button);
        button.setLabel("I'm a button");
        button.setBackground(Color.white);
        button.setForeground(Color.green);
        button.setFocusable(false);
        button.addActionListener(e -> button.setLabel("Wello!"));

        label1 = new Label();
        label1.setText("Nation Power Ray");
        jframe.add(label1);

        textField1 = new JTextField();
        textField1.setPreferredSize(new Dimension(100, 50));
        jframe.add(textField1);

        button2 = new Button();
        button2.setBounds(100, 0, 150, 100);
        button2.setSize(150, 100);
        jframe.add(button2);
        button2.setLabel("I'm a button");
        button2.setBackground(Color.white);
        button2.setForeground(Color.green);
        button2.setFocusable(false);
        button2.addActionListener(this);

        jframe.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button2){
            String string = textField1.getText();
            System.out.println(string);
            button2.setLabel(string);
        }
    }
}
