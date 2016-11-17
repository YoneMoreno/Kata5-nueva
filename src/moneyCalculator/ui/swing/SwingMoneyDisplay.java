/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package moneyCalculator.ui.swing;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.PopupMenu;
import javax.swing.JFrame;
import javax.swing.JLabel;
import moneyCalculator.model.Money;
import moneyCalculator.ui.MoneyDisplay;

/**
 *
 * @author usuario
 */
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.PopupMenu;
import javax.swing.JLabel;
import javax.swing.JPanel;
import moneyCalculator.model.Money;
import moneyCalculator.ui.MoneyDisplay;

public class SwingMoneyDisplay extends JPanel implements MoneyDisplay {

    public SwingMoneyDisplay() {
        setLayout(new FlowLayout());
        add(amount());
        add(currency());
    }

    private Component amount() {
        return new JLabel("300");
    }

    private Component currency() {
        return new JLabel("$");
    }

    @Override
    public void display(Money money) {
        
    }
    
    
    
}

