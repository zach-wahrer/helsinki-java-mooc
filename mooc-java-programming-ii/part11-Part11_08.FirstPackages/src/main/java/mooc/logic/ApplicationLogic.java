/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mooc.logic;

/**
 *
 * @author zachtheclimber
 */
import mooc.ui.UserInterface;
import mooc.ui.TextInterface;

public class ApplicationLogic {
    private UserInterface ui;
    
    public ApplicationLogic(UserInterface ui) {
        this.ui = new TextInterface();
    }
    
    public void execute(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Application logic is working");
            this.ui.update();
        }
    }
}
