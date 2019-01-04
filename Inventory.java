/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonsgame;

import java.util.ArrayList;

/**
 *
 * @author ΔΗΜΗΤΡΗΣ
 */
public class Inventory {
    private ArrayList<Item> items;
    
    public Inventory(){
        items=new ArrayList<>();
    }
    
    /**
     * test constructor 
     * @param x just a param for the polymorphism
     */
    public Inventory(int x){//test constructor
        items=new ArrayList<>();
        for(int i=0;i<10;i++){
           Item item = new Item(i,"testItem"+i);
           System.out.println("addItem=" + addItem(item));
        }
    }
    
    /**
     * This function adds 1 item to inventory.Returs the number 
     * of items after the insert
     * @return 
     */
    public int addItem(Item item){
        items.add(item);
        
        return items.size();
    }
}
