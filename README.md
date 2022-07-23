# Poker Player (Spring Boot)

Your task is to implement the best poker player logic! :)

## Preparation
1. Choose a team name (PokerPenguins?)
2. Fork this repository
3. Add the following secrets (values will be provided by the facilitator):
   * TOKEN
   * PORT
   * TEAMNAME (your team name - only lowercase letters, digits and dashes)
4. Run the main workflow in GitHub - it will be deployed automatically  
   Note: check your GitHub name - it is used for the Docker image name and must
   conform with the regulations (only lowercase letters, digits, "." and "-").
   If your GitHub name contains uppercase letters, just replace the variable 
   ```${{ github.repository_owner }}``` in the workflow file with a lowercase version
   of your name.
5. Notify the facilitator once you are done :)


## How it works
### Run it locally
```mvn spring-boot:run```

### Your player bot
Your application provides a single endpoint at the root path (/).
This endpoint accepts a table object, which gives you an overview about the
current state of the game.
You will be able to see the other players and their bets. You can also see
the community cards as well as your own cards. Using this information and given
your current stack of chips, you have to decide how much you want to bet.

### Poker game
If all players have successfully deployed their application and registered it
with the game, the dealer service will start playing tournaments over and over.
Each player has a starting stack of 100 chips. The blinds will start low but increase over time in each tournament.
The player who wins the tournament receives 1 point on the total scoreboard.
After that, the next tournament starts automatically.

### Betting round
Each time a betting round starts, the dealer application will call the player bots one by one and
retrieve their bets. This is a sample JSON of the table information provided to you:
```
{
	"round": 1,
	"smallBlind": 10,
	"minimumBet": 20,
	"minimumRaise": 40,
	"pot": 0,
	"activePlayer": 2,
	"communityCards": [{
		"rank": "10",
		"suit": "hearts"
	},{
		"rank": "5",
		"suit": "clubs"
	},{
		"rank": "A",
		"suit": "diamonds"
	}],
	"players": [{
		"name": "Beep bop, i'm a bot!",
		"status": "active",
		"stack": 990,
		"bet": 10
	},{
		"name": "Beep bop, i'm a bot too!",
		"status": "active",
		"stack": 980,
		"bet": 20
	},{
		"name": "Beep bop, i'm a bot as well!",
		"status": "active",
		"stack": 1000,
		"bet": 0,
		"cards": [{
			"rank": "2",
			"suit": "hearts"
		},{
			"rank": "J",
			"suit": "clubs"
		}]
	}]
}
```
## Start the game
Now it's your turn! Start implementing the Strategy class to do more than just fold every turn.
Or rework the whole application. You can do what you want, as long as you provide the endpoint that is registered in the game.
Have fun!