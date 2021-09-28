/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise8_1;

/**
 *
 * @author admin
 */
public class Item {

    char color;

    // Declare and code the setColor method.
    public boolean setColor(char colorCode) {
        if (colorCode == ' ') {
            return false;
        } else {
            this.color = colorCode;
            return true;
        }
    }
}
