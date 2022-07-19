package de.doubleslash.poker.player.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Card {

   @JsonProperty
   private final Rank rank;
   @JsonProperty
   private final Suit suit;

   @JsonCreator
   public Card(@JsonProperty("rank") final Rank rank, @JsonProperty("suit") final Suit suit) {
      this.rank = rank;
      this.suit = suit;
   }

   public Rank getRank() {
      return rank;
   }

   public Suit getSuit() {
      return suit;
   }

   @Override
   public String toString() {
      return capitalize(rank) + " of " + capitalize(suit);
   }

   private String capitalize(final Enum<?> e) {
      final String s = e.name().toLowerCase();
      return Character.toUpperCase(s.charAt(0)) + s.substring(1);
   }
}
