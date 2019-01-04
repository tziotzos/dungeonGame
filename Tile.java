/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonsgame;

/**
 *
 * @author ΔΗΜΗΤΡΗΣ
 */
public class Tile {
    //the txt is id-1forAccessible
    private int id;
    private boolean accesible;
    
    
    
    public Tile(int id,boolean accesible){
        this.id=id;
        this.accesible=accesible;
        
        
    }
    
    public boolean isAccesible(){
        return accesible;
    }
    public int getId(){
        return id;
    }
}
