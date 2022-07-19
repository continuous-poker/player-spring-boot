package de.doubleslash.poker.player.data;

import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Table {
   @JsonProperty
   private final List<Card> communityCards;
   @JsonProperty
   private final List<Player> players;
   @JsonProperty
   private final int round;
   @JsonProperty
   private final int smallBlind;
   @JsonProperty
   private final int minimumBet;
   @JsonProperty
   private final int minimumRaise;
   @JsonProperty
   private final int pot;
   @JsonProperty
   private final int activePlayer;
   @JsonProperty
   private final int currentDealer;

   @JsonCreator
   public Table(@JsonProperty("communityCards") final List<Card> communityCards,
         @JsonProperty("players") final List<Player> players, @JsonProperty("round") final int round,
         @JsonProperty("smallBlind") final int smallBlind, @JsonProperty("minimumBet") final int minimumBet,
         @JsonProperty("minimumRaise") final int minimumRaise, @JsonProperty("pot") final int pot,
         @JsonProperty("activePlayer") final int activePlayer, @JsonProperty("currentDealer") final int currentDealer) {
      this.communityCards = communityCards;
      this.players = players;
      this.round = round;
      this.smallBlind = smallBlind;
      this.minimumBet = minimumBet;
      this.minimumRaise = minimumRaise;
      this.pot = pot;
      this.activePlayer = activePlayer;
      this.currentDealer = currentDealer;
   }

   public List<Card> getCommunityCards() {
      return communityCards;
   }

   public List<Player> getPlayers() {
      return players;
   }

   public int getRound() {
      return round;
   }

   public int getSmallBlind() {
      return smallBlind;
   }

   public int getMinimumBet() {
      return minimumBet;
   }

   public int getMinimumRaise() {
      return minimumRaise;
   }

   public int getPot() {
      return pot;
   }

   public int getActivePlayer() {
      return activePlayer;
   }

   public Player getOwnPlayer() {
      return players.get(activePlayer);
   }

   @Override
   public String toString() {
      return ToStringBuilder.reflectionToString(this);
   }

   public int getCurrentDealer() {
      return currentDealer;
   }
}
