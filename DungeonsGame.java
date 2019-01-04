/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dungeonsgame;



import java.awt.Dimension;
import java.awt.Toolkit;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;

/**
 *
 * @author ΔΗΜΗΤΡΗΣ
 */
public class DungeonsGame extends Application  {

    Button newGameBtn,continueBtn,optionsBtn,exitBtn ;
    static double  screenWidth;
    static double  screenHeight;
    GridPane layout;
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        screenWidth = screenSize.getWidth();
        screenHeight = screenSize.getHeight();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("DungeonGame");
//        primaryStage.setFullScreen(true);
        primaryStage.setMaximized(true);
        
        setLayout();
        addButtons();
        addButtonsListeners();
        
      
        
        Scene scene = new Scene(layout);         
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    private void addButtons(){
        //new game button
        newGameBtn =new Button( );    
        newGameBtn.setText("New Game");
        newGameBtn.setMinSize(200, 20);
        layout.add(newGameBtn,0,0);
        
        
        
        //end of new game button
        
        //continue button
        continueBtn = new Button( );
        continueBtn.setText("Continue");
        continueBtn.setMinSize(200, 20);
        layout.add(continueBtn,0,1);
        //end of continue button
        
        //options button
        optionsBtn=new Button( );
        optionsBtn.setText("Options");
        optionsBtn.setMinSize(200, 20);
        layout.add(optionsBtn,0,2);
        //end of options button
        
        //exit button
        exitBtn=new Button();
        exitBtn.setText("Exit");
        exitBtn.setMinSize(200, 20);
        layout.add(exitBtn,0,3);
        //end of exit button
        
        
    }
    
    private void addButtonsListeners(){
       newGameBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("newGame");
                changeScene(new Scene(new GridPane()));
            }
        }); 
       
       continueBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("continue");
            }
        });
       
       optionsBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("options");
            }
        });
       
       exitBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("exit");
            }
        });
    }
    
    private void setLayout(){
        layout = new GridPane();
        layout.setVgap(30);
        layout.setHgap(50);
        layout.setAlignment(Pos.CENTER);
        layout.setStyle("-fx-background-color: #C0C0C0;");
    }
            
    private void changeScene(Scene scene){
        
    }
            
    
}
