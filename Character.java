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
public class Character {
    private int id;
    private int hp;
    private int attack;
    private int deffense;
    private Inventory inventory;
    
    public Character(int id,int hp,int attack,int deffense){
        //still need inventory
        this.id=id;
        this.hp=hp;
        this.attack=attack;
        this.deffense=deffense;
    }
    
    
}
