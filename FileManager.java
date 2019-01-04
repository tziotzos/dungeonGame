/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonsgame;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ΔΗΜΗΤΡΗΣ
 */
public class FileManager {
    
    public String readedString;
    
    public FileManager(){
        
    }
    
    public void readFile(String fileName) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            readedString=everything;
        } finally {
            br.close();
        }
    }
            
    public void printReadedString(){
        System.out.println("printReadedString");
        System.out.println(readedString);
    }
    
    public void readFloor(Tile[][] map,int sizeX,int sizeY){
        
        for (int i=0;i<sizeY;i++){
            for (int j=0;j<sizeX;j++){
  
                String idString=readedString.substring(i*41+j*4,i*41+j*4+1);
                String accessibleString=readedString.substring(i*41+j*4+2,i*41+j*4+3);
                boolean accesible;
//                System.out.println("idString="+idString);
//                System.out.println("accessibleString="+accessibleString);
                accesible = accessibleString.equals("1");
                Tile tile=new Tile(Integer.parseInt(idString),accesible);
                map[i][j]=tile;        
               
            }
            
        }
              
            
    }
}
