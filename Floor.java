/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonsgame;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ΔΗΜΗΤΡΗΣ
 */
public class Floor {
   private int sizeX;
   private int sizeY;
   private Tile[][] map;
   private int floorNumber;
   
   public Floor(int sizeX,int sizeY,int floorNumber){
        
       this.sizeX=sizeX;
       this.sizeY=sizeY;
       this.floorNumber=floorNumber;
       map=new Tile[sizeX][sizeY];
       
       readFloor();
   }
   
   private void readFloor()  {  
       try {
           FileManager fileManager=new FileManager();
           fileManager.readFile("floor" + floorNumber + ".txt");
           fileManager.readFloor(map,sizeX,sizeY);
       } catch (IOException ex) {
           System.out.println(ex.toString());
//           Logger.getLogger(Floor.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   }
   
   public Tile[][] getMap(){
       return map;
   }
}
