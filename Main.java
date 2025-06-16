public class Main {
  public static void main(String[] args) {
    System.out.println("SEMONSTER GAME");
    System.out.println("Show a new monster!");
    Monster monster = new Monster();
    Player player = new Player();
    // System.out.println(monster.toString());
    player.drawMonsters();
    player.showDeck();
  }
}
