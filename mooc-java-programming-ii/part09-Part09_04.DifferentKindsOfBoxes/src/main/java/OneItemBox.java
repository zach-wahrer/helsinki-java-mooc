/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zachtheclimber
 */
public class OneItemBox extends Box {
    private Item contents;
    
    public OneItemBox() {
        this.contents = null;
    }
       
    @Override
    public void add(Item item) {
        if (this.contents == null) {
            this.contents = item;
        }
    }
    
    @Override
    public boolean isInBox(Item item) {
        if (this.contents != null) {
            return this.contents.equals(item);
        }
        return false;
    }
}
