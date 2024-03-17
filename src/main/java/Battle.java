public class Battle {
  public static void main(String[] args) {
      // RandomAttackStrategyインスタンスを勇者と魔王に注入
      AttackStrategy randomStrategyForHero = new RandomAttackStrategy();
      AttackStrategy randomStrategyForDemonLord = new RandomAttackStrategy();

      Character hero = new Character("勇者", 30, 15, randomStrategyForHero);
      Character demonLord = new Character("魔王", 40, 9, randomStrategyForDemonLord);

      System.out.println("戦闘開始！\n");
      while (hero.isAlive() && demonLord.isAlive()) {
          hero.attack(demonLord);
          if (!demonLord.isAlive()) {
              System.out.println("\n魔王は倒れた。\n世界に平和が訪れた。");
              break;
          }

          demonLord.attack(hero);
          if (!hero.isAlive()) {
              System.out.println("\n勇者は倒れた。\n世界は闇に包まれた。");
              break;
          }
      }
  }
}