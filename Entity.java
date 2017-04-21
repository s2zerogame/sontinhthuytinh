/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg;

/**
 *
 * @author Ong_Khac_Ngoc
 */
public class Entity {
    private int attack_base;
    private int HP_base,MP_base;
    private double x,y;
    private int DEF_base;
    private double speed_base;
    private boolean visible;
    public static enum Direction{LEFT,RIGHT,UP,DOWN}
    private Direction direction;

    public void setVisible(boolean visible)
    {
        this.visible = visible;
    }
    public int getAttack_base() {
        return attack_base;
    }
    
    
    
    public void setAttack_base(int attack_base) {
        this.attack_base = attack_base;
    }

    public int getHP_base() {
        return HP_base;
    }

    public void setHP_base(int HP_base) {
        this.HP_base = HP_base;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getDEF_base() {
        return DEF_base;
    }

    public void setDEF_base(int DEF_base) {
        this.DEF_base = DEF_base;
    }

    public double getSpeed_base() {
        return speed_base;
    }

    public double getSpeedY(){
        return speed_base*3/4;
    }
    
    public void setSpeed(int speed) {
        this.speed_base = speed;
    }


    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    
    

    
}
