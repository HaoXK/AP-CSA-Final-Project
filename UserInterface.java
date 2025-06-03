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
        String topic;
        Object source = e.getSource();
        if (source == button1) topic = "Vocabulary";
        else topic = "Grammar";
            response1.setText("Generating an SAT " + topic + " quiz...");
            new javax.swing.Timer(3000, new ActionListener() {
                @Override
            public void actionPerformed(ActionEvent event) 
                {
                    ((Timer) event.getSource()).stop();
                    response1.setText("");
                    label.setText(topic + " quiz ready! How many questions?");
                    button1.setText("1");
                    button2.setText("2");
                }
            }).start();   
        }



       //if (e.getSource() == button1) response1.setText("Generating an SAT vocabulary quiz...");
       //else  if (e.getSource() == button2) response1.setText("<html>Generating an SAT Grammar quiz...<html>");
        
    }
