package cityofaaron;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.Game;
import model.Player;
import model.Storehouse;
import model.Map;
import view.StartProgramView;

/**
 *
 * @author Jeremy
 */
public class CityOfAaron {
   
   public static Game currentGame = null;
   
   public static Game getCurrentGame(){
      return currentGame;
   }
   
   public static void setCurrentGame(Game game){
      currentGame = game;
   }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game theGame = new Game();
        theGame.setThePlayer(new Player());
        theGame.setTheMap(new Map());
        theGame.setTheStorehouse(new Storehouse());
        theGame.setCurrentPopulation(105);
        theGame.setAcresOwned(2000);
        theGame.setWheatInStorage(15000);
        System.out.println(theGame.toString());
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayView();
        
    }

}