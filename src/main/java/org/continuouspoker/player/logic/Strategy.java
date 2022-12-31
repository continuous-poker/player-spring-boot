package org.continuouspoker.player.logic;

import org.continuouspoker.player.model.Bet;
import org.continuouspoker.player.model.Table;

public class Strategy {

   public Bet decide(final Table table) {
      System.out.println(table);
      return new Bet().bet(0);
   }

}
