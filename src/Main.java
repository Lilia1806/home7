public class Main {
    public static Hero heroes[];

    public static void main(String[] args) {

        Magic magic = new Magic();
        magic.setHealth(500);
        magic.setDamage(50);
        magic.setTypeOfSuperpower("Magic применил суперспособность Energy rays");

        Medic medic = new Medic();
        medic.setHealth(300);
        medic.setDamage(0);
        medic.setTypeOfSuperpower("Medic применил суперспособность Treatment");

        Warrior warrior = new Warrior();
        warrior.setHealth(400);
        warrior.setDamage(40);
        warrior.setTypeOfSuperpower("Warrior применил суперспособность Critical damage");


        heroes = new Hero[]{magic, medic, warrior};
        for (Hero hero : heroes) {
            hero.applySuperAbility(hero.getTypeOfSuperpower());
        }
    }
}