import java.util.Random;

public class Character {
  private String name;
  private int hp;
  private int attackPower;
  private AttackStrategy attackStrategy;

  public Character(String name, int hp, int attackPower, AttackStrategy strategy) {
      this.name = name;
      this.hp = hp;
      this.attackPower = attackPower;
      this.attackStrategy = strategy;
  }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public AttackStrategy getAttackStrategy() {
        return attackStrategy;
    }

    public void setAttackStrategy(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public boolean isAlive() {
      return this.hp > 0;
  }

  public void attack(Character opponent) {
      this.attackStrategy.attack(this, opponent);
  }
}