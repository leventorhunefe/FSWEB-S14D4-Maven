package org.example.rpg;

/*
bu şekilde de yazılabilir
abstract public class Monster {
}
 */
public abstract class Monster {
    private String name;
    private int hitPoints;
    private double damage;

    public Monster(String name, int hitPoints, double damage){
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public abstract double attack();

    public String getName(){
        return name;
    }
    public int getHitPoints(){
        return hitPoints;
    }

    public double getDamage() {
        return damage;
    }
}
