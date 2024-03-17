public class BasicAttackStrategy implements AttackStrategy {
  @Override
  public void attack(Character attacker, Character defender) {
      int damage = attacker.getAttackPower();
      defender.setHp(defender.getHp() - damage);
      System.out.println(attacker.getName() + "の攻撃！" + defender.getName() + "に" + damage + "のダメージ");
  }
}