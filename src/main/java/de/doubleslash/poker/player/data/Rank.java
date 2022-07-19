package de.doubleslash.poker.player.data;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Rank {
   ACE("A"),
   KING("K"),
   QUEEN("Q"),
   JACK("J"),
   TEN("10"),
   NINE("9"),
   EIGHT("8"),
   SEVEN("7"),
   SIX("6"),
   FIVE("5"),
   FOUR("4"),
   THREE("3"),
   TWO("2");

   private final String token;

   Rank(final String token) {
      this.token = token;
   }

   public String getToken() {
      return token;
   }

   @JsonCreator
   public static Rank forToken(final String token) {
      return Arrays.stream(Rank.values()).filter(r -> r.getToken().equals(token)).findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Token not allowed: " + token));
   }
}
