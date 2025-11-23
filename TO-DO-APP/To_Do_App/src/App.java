import javax.swing.*;
import java.awt.*;


public class App {

    static final int WIDTH = 650;
    static final int HEIGHT = 400;
    static final int BTN_WIDTH = 125;
    static final int BTN_HEIGHT = 80;
    static final int INPUT_WIDTH = 250;
    static final int INPUT_HEIGHT = 65;
    static final int OUTPUT_WIDTH = 350;
    static final int OUTPUT_HEIGHT = 150;
    Color frame_color = new Color(80,80,80);
    Color button_color = new Color(28,28,28);
    Color button_foreground = new Color(0,125,0);
    JFrame frame = new JFrame("TO-DO");
    JLabel label = new JLabel("Task at hand");
    JButton add = new JButton("Add task");
    JButton delete = new JButton("Delete task");
    JTextField input = new JTextField("Type a task");
    JTextField output = new JTextField();


    App(){

        //Label of the app
        label.setBounds(250,20,300,50);
        label.setFont(new Font("Comic Sans",Font.BOLD,25));
        label.setForeground(new Color(28,28,28));

        input.setFont(new Font("Comic Sans",Font.PLAIN,25));
        input.setSize(new Dimension(INPUT_WIDTH,INPUT_HEIGHT));
        input.setBackground(new Color(28,28,28));
        input.setForeground(new Color(80,80,80));
        input.setLocation(50,90);
        input.setEnabled(true);
        input.setEditable(true);


        output.setFont(new Font("Comic Sans",Font.PLAIN,25));
        output.setSize(new Dimension(OUTPUT_WIDTH,OUTPUT_HEIGHT));
        output.setBackground(new Color(28,28,28));
        output.setForeground(new Color(80,80,80));
        output.setLocation(50,180);
        output.setEnabled(true);
        output.setEditable(false);




        add.setBackground(button_color);
        add.setForeground(button_foreground);
        add.setSize(new Dimension(BTN_WIDTH,BTN_HEIGHT));
        add.setLocation(500,125);
        add.setFocusable(false);
        add.setFont(new Font("Comic Sans",Font.PLAIN,15));
        add.addActionListener(e -> {

            String text = input.getText();
            output.setText(text);

            if(e.getSource() != add){
                input.setText("");
            }
            /*Above you can clearly see the code in order to add input via the add button
             *ActionListener is a very useful interface in Java
             * I don't know why so many people start hating on Java, however I really want to see such people scripting this in C/C++
             */

            System.out.println(e);

        });

        delete.setBackground(button_color);
        delete.setForeground(button_foreground);
        delete.setSize(new Dimension(BTN_WIDTH,BTN_HEIGHT));
        delete.setLocation(500,250);
        delete.setFocusable(false);
        delete.setFont(new Font("Comic Sans",Font.PLAIN,15));
        delete.addActionListener(e -> {

            output.setText("");
            input.setText("Add Task");//Code in order to change the input textfield via the delete button

            System.out.println(e);

        });



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(WIDTH,HEIGHT));
        frame.setLayout(null);
        frame.setResizable(false);
        frame.getContentPane().setBackground(frame_color);
        frame.setLocationRelativeTo(null);
        frame.add(label);
        frame.add(add);
        frame.add(delete);
        frame.add(input);
        frame.add(output);
        frame.setVisible(true);

    }


}
