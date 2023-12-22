public class Medic extends Hero{
    private int healPoints;

    public Medic(int health, int damage, String superAbility, int healPoints) {
        super(health, damage, superAbility);
        this.healPoints = healPoints;
    }

    public void increaseExperience(){
        int increaseHealPoint = (int) (healPoints*1.1);
        System.out.println("Experience get: "+ increaseHealPoint);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic used ability: + 10HP");
    }
}
