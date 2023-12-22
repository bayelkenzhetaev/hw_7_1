public class Main {
    public static void main(String[] args) {
        Hero [] heroes = {
                new Magic(100000,758494,"Zero"),
                new Medic(68947,28495,"Heal",50),
                new Warrior(2984,4567,"bayel,")
        };
        for (Hero hero:heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic){
                ((Medic) hero).increaseExperience();
            }
        }
    }
}