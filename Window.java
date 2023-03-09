
package com.mycompany.calculadorar;

import javax.swing.JFrame;


public class Window extends JFrame {
    
    public Window(){
        setSize(380, 550);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new Panel());
        setVisible(true);
    }
}
