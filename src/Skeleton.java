public class Skeleton extends Boss{
    private int numberOfArrows;
    private Weapon w2;

    public Weapon getW2() {
        return w2;
    }

    public void setW2(Weapon w2) {
        this.w2 = w2;
    }

    public Skeleton(int health, int damage , int numberOfArrows ) {
        super();
        this.setHealth(health);
        this.setDamage(damage);
        this.setNumberOfArrows(numberOfArrows);
    }


    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    public String info(){
        return "Skeleton health: " + getHealth() + "; " + "Skeleton damage: " + getDamage() + "; " + "numberOfArrows: " + getNumberOfArrows() +"; "+ "Skeleton weapon: "
                + w2.getGun() + "; " + "Skeleton weapon is name: " + w2.getGunName()  ;

    }
}
