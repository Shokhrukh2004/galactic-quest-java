package org.github.galacticquest.models;

public class Spaceship {

    private int health;
    private int speed;
    private int positionX;
    private int positionY;
    Spaceship(int health, int speed, int positionX, int positionY){
        this.health = health;
        this.speed = speed;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public void move(){
        this.positionY += this.speed;
    }

    public void takeDamage(int damage){
        this.health -= damage;
    }

    public int getHealth(){
        return this.health;
    }

    public int getSpeed(){
        return this.speed;
    }
}
