


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JavaG_ShowColors2JFrame extends JFrame {

    private JButton changeColorJButton;
    private Color color = Color.LIGHT_GRAY;
    private JPanel colorJPanel;
    
    //set up GUI
    public JavaG_ShowColors2JFrame()
    {
        super ( "Using JColorChooser" );
        
        //create JPanel for display color
        colorJPanel = new JPanel();
        colorJPanel.setBackground(color);
        
        //set up changeColorJButton and register its event handler
        changeColorJButton = new JButton("Change Color");
        changeColorJButton.addActionListener(new ActionListener() //anonymous inner class
        {
            //dissplay JColorChooser when user clicks button
            @Override
            public void actionPerformed(ActionEvent event) 
            {
                color = JColorChooser.showDialog(JavaG_ShowColors2JFrame.this, "Coose a color" , color);
                
                if ( color == null )
                color = Color.LIGHT_GRAY;
                
                //change content pane's backgound color
                colorJPanel.setBackground(color);
                
            }
        }
    );
        
        add(colorJPanel, BorderLayout.CENTER); //add colorJPanel
        add(changeColorJButton, BorderLayout.SOUTH); //add button
        
        setSize(400, 300);//set frame size
        setVisible(true); //display frame
          
    }
    
        public static void main(String[] args) 
        {
            JavaG_ShowColors2JFrame application = new JavaG_ShowColors2JFrame();
            application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
        }
    }
