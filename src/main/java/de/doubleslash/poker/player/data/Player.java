package de.doubleslash.poker.player.data;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Player {
   @JsonProperty
   private final String name;
   @JsonProperty
   private final Status status;
   @JsonProperty
   private final int stack;
   @JsonProperty
   private final int bet;
   @JsonProperty
   private final List<Card> cards;

   @JsonCreator
   public Player(@JsonProperty("name") final String name, @JsonProperty("status") final Status status,
         @JsonProperty("stack") final int stack, @JsonProperty("bet") final int bet,
         @JsonProperty("cards") final List<Card> cards) {
      this.name = name;
      this.status = status;
      this.stack = stack;
      this.bet = bet;
      this.cards = cards;
   }

   public String getName() {
      return name;
   }

   public Status getStatus() {
      return status;
   }

   public int getStack() {
      return stack;
   }

   public int getBet() {
      return bet;
   }

   public List<Card> getCards() {
      return Collections.unmodifiableList(cards);
   }

   @Override
   public String toString() {
      return ToStringBuilder.reflectionToString(this);
   }
}
