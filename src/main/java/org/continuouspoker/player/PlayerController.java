package org.continuouspoker.player;

import org.continuouspoker.player.api.DefaultApiDelegate;
import org.continuouspoker.player.model.Bet;
import org.continuouspoker.player.model.Table;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import org.continuouspoker.player.logic.Strategy;

@Service
public class PlayerController implements DefaultApiDelegate {

   @Override
   public ResponseEntity<Bet> getBet(final Table table) {
      final Strategy player = new Strategy();
      return ResponseEntity.ok(player.decide(table));
   }

}