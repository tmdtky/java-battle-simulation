import java.util.Random;

public class RandomAttackStrategy implements AttackStrategy {
  private static final Random random = new Random();

  @Override
  public void attack(Character attacker, Character defender) {
      double chance = random.nextDouble();
      if (chance < 0.1) {
          new MissAttackStrategy().attack(attacker, defender);
      } else if (chance < 0.3) {
          new CriticalAttackStrategy().attack(attacker, defender);
      } else {
          new BasicAttackStrategy().attack(attacker, defender);
      }
  }
}