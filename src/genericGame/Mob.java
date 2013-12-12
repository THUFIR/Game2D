/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package genericGame;

class Mob {

    int x;
    int y;
    boolean isMoving;
    String mobTypte;
    InputHandler input;

    Mob() {
    }

    Mob(String mobType, int x, int y) {
        this.mobTypte = mobType;
        this.x = x;
        this.y = y;
    }

    void move(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    @Override
    public String toString() {
       return "x\t" + x + "\ty\t" + y;
    }
}
