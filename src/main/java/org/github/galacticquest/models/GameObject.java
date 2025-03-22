package org.github.galacticquest.models;

public abstract class GameObject {

    private int positionX;
    private int positionY;

    abstract void update();
    abstract void draw();

    public int getPositionX(){
        return this.positionX;
    }

    public void setPositionX(int positionX){
        this.positionX = positionX;
    }

    public int getPositionY(){
        return this.positionY;
    }

    public void setPositionY(int positionY){
        this.positionY = positionY;
    }
}
