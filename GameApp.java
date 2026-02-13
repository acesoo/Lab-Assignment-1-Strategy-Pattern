public class GameApp {
    public static void main(String[] args) {
        // 1. Knight: Sword + Shield, Dodge, Magic Barrier
        Character knight = new Character("Knight", new SwingSword());
        knight.addDefenseStrategy(new Shield());
        knight.addDefenseStrategy(new Dodge());
        knight.addDefenseStrategy(new CreateMagic());

        // 2. Wizard: Spell + Magic Barrier
        Character wizard = new Character("Wizard", new CastSpell());
        wizard.addDefenseStrategy(new CreateMagic());

        // 3. Archer: Arrows + Dodge
        Character archer = new Character("Archer", new ShootArrow());
        archer.addDefenseStrategy(new Dodge());

        // Test the characters
        knight.performAttack();
        knight.performDefend();
        
        System.out.println("--------------------");
        
        wizard.performAttack();
        wizard.performDefend();
    }
}