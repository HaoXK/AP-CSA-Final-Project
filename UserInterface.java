import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import javax.swing.Timer;

public class UserInterface implements ActionListener
{
    int instance = 0;
    int questionNum;
    String topic;
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton button1 = new JButton("SAT Vocabulary");
    JButton button2 = new JButton("SAT Grammar");
    JLabel label = new JLabel("Pick a topic");
    JLabel response1 = new JLabel("");
    //^ Created with the help of an online tutorial
    public UserInterface() 
    {
    button1.addActionListener(this);
    button2.addActionListener(this);
    panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 300, 300));
    panel.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints(); //found with the help of StackOverflow
    c.weightx = 1;
    c.weighty = 1;
    c.insets = new Insets(2, 0, 2, 0);
    c.gridwidth = GridBagConstraints.REMAINDER;
    c.fill = GridBagConstraints.BOTH;

    panel.add(label, c);
    panel.add(button1, c);
    panel.add(button2, c);
    response1.setPreferredSize(new Dimension(300, 30));
    panel.add(response1);
    frame.add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Button 1");
    frame.pack();
    frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (instance == 0) { //instance is used to keep track of how many times the user clicks a button
        if (source == button1) topic = "Vocabulary";
        else topic = "Grammar";
        label.setText("How many questions would you like in your quiz?");
        button1.setText("5");
        button2.setText("10");
        instance++;
        return; //stops the code from registering one button click as two button clicks
        }

        if (instance == 1) {
            if (source == button1) questionNum = 5;
            else questionNum = 10;
            response1.setText("Generating a " + topic + " quiz with " + questionNum + " questions..."); 
            new javax.swing.Timer(2000, new ActionListener() {
                public void actionPerformed(ActionEvent timer) {
                ((Timer) timer.getSource()).stop();

                
                } 
            }).start();

        }
        }
}



       //if (e.getSource() == button1) response1.setText("Generating an SAT vocabulary quiz...");
       //else  if (e.getSource() == button2) response1.setText("<html>Generating an SAT Grammar quiz...<html>");
