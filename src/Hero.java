public abstract class Hero implements HavingSuperAbility {

    private int health;
    private int damage;
    private String typeOfSuperpower;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        damage = damage;
    }

    public String getTypeOfSuperpower() {
        return typeOfSuperpower;
    }

    public void setTypeOfSuperpower(String typeOfSuperpower) {
        this.typeOfSuperpower = typeOfSuperpower;
    }
}