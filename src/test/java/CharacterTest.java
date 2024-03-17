import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterTest {
    private Character attacker;
    private Character defender;

    @BeforeEach
    public void setUp() {
        // BasicAttackStrategyで初期化
        attacker = new Character("Attacker", 20, 5, new BasicAttackStrategy());
        defender = new Character("Defender", 15, 3, new BasicAttackStrategy());
    }

    @Test
    public void basicAttackReducesHpCorrectly() {
        attacker.setAttackStrategy(new BasicAttackStrategy());
        attacker.attack(defender);
        assertEquals(10, defender.getHp(), "基本攻撃後、防御者のHPは10に減少しているべき");
    }

    @Test
    public void missAttackDoesNotReduceHp() {
        attacker.setAttackStrategy(new MissAttackStrategy());
        attacker.attack(defender);
        assertEquals(15, defender.getHp(), "ミス攻撃後、防御者のHPは変わらず15であるべき");
    }

    @Test
    public void criticalAttackIncreasesDamageCorrectly() {
        attacker.setAttackStrategy(new CriticalAttackStrategy());
        attacker.attack(defender);
        // 攻撃力5の1.5倍は7.5ですが、整数にキャストされ7として計算されます。
        assertEquals(8, defender.getHp(), "クリティカル攻撃後、防御者のHPは8に減少しているべき");
    }
}