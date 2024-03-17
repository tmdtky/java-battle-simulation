public class CriticalAttackStrategy implements AttackStrategy {
  @Override
  public void attack(Character attacker, Character defender) {
      int damage = (int)(attacker.getAttackPower() * 1.5);
      defender.setHp(defender.getHp() - damage);
      System.out.println("クリティカルヒット！" + attacker.getName() + "は" + defender.getName() + "に" + damage + "のダメージを与えた");
  }
}