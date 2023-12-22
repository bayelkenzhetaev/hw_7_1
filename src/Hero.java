public abstract class Hero implements PACKAGE_NAME.HavingSuperAbility {
    private int health;
    private int damage;
    private String superAbility;

    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    @Override
    public void applySuperAbility() {
    }
}
