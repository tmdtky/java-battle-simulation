public class MissAttackStrategy implements AttackStrategy {
  @Override
  public void attack(Character attacker, Character defender) {
      System.out.println(attacker.getName() + "の攻撃がミス！" + defender.getName() + "はダメージを受けない");
  }
}