public class BlackJackDemo {

   public static void main(String [] args){

      Dealer dealer = new Dealer();

      for(Deck deck: dealer.getDecks()){

      System.out.println(deck.getDeck());
      }




   }

}
