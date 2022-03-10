# Blackjack
Java program that simulates the popular blackjack card game

## How It Works
Blackjack is a game that involves the player and the dealer. At the beginning of the round the player is asked to bet a certain amount of money. Once the bet is made, both the dealer and the player are dealt two cards. Once the player sees their hand, they are asked to hit (draw a card) or stay (keep hand).

<img width="464" alt="Screen Shot 2022-03-01 at 2 46 42 PM" src="https://user-images.githubusercontent.com/54502182/156238023-68da2121-123d-4e30-9d52-cd5d0fbfea22.png">

The objective of the game is to get as close to 21 without going over. The player whose card values in hand total higher than the other's without going over 21 is the winner. If the player decides to hit, another card is drawn from the deck and placed in that player's hand. If the player hits and their total hand goes over 21, they lose the round and the money they bet.

<img width="453" alt="Screen Shot 2022-03-01 at 7 55 39 PM" src="https://user-images.githubusercontent.com/54502182/156274146-64a1d1c0-fbb7-4071-8598-74b1a90dd815.png">

If the player decides to stay, then the dealer decides if they want to hit or not. The dealer will stay if the value total of their hand is greater than or equal to 17. If their hand value is 16 or less, they must hit. If the dealer busts, the player wins the bet.

<img width="480" alt="Screen Shot 2022-03-10 at 7 05 06 AM" src="https://user-images.githubusercontent.com/54502182/157658354-d6496fe3-e210-47bf-93a8-10ae16a7bd70.png">

The game goes on until the player loses all their money or they decide not to play anymore. Before each hand, all previously dealt cards are reshuffled back into the deck. If a player is naturally dealt a total value of 21, that is a Blackjack and the player receives 1.5x their original bet. If there is a tie, the bet is returned to the player. 

<img width="555" alt="Screen Shot 2022-03-10 at 7 38 46 AM" src="https://user-images.githubusercontent.com/54502182/157663588-3958ebbe-2364-45a4-965c-53c7e98aa04f.png">

This game assumes aces are low.
