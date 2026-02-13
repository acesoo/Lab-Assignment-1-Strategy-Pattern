import java.util.ArrayList;
import java.util.List;

public class Character {
    private String type;
    private AttackStrategy attackStrategy;
    private List<DefenseStrategy> defenseStrategies;

    public Character(String type, AttackStrategy attackStrategy) {
        this.type = type;
        this.attackStrategy = attackStrategy;
        this.defenseStrategies = new ArrayList<>();
    }

    // Method to add multiple defense strategies
    public void addDefenseStrategy(DefenseStrategy strategy) {
        this.defenseStrategies.add(strategy);
    }

    public void performAttack() {
        System.out.print(type + ": ");
        attackStrategy.attack();
    }

    public void performDefend() {
        System.out.println(type + " is defending:");
        for (DefenseStrategy strategy : defenseStrategies) {
            strategy.defend();
        }
    }
}