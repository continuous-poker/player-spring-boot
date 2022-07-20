package de.doubleslash.poker.player;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import de.doubleslash.poker.player.data.Table;
import de.doubleslash.poker.player.logic.Strategy;

@RestController
public class PlayerController {

   @PostMapping(value = "/", produces = "text/plain", consumes = "application/json")
   @ResponseBody
   public int action(@RequestBody final Table table) {
      final Strategy player = new Strategy();
      return player.decide(table);
   }

}