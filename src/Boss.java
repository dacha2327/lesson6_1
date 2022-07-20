public class Boss extends  GameEntity {
    private Weapon w1;

    public Boss() {
        super();
    }


    public Weapon getW1() {
        return w1;
    }

    public void setW1(Weapon w1) {
        this.w1 = w1;
    }

    public Boss(int health, int damage) {
        super(health , damage);
    }

    public String info() {
        return "Boss health: " + getHealth()+ "; " + "Boss damage: " + getDamage()+ "; " + "Boss weapon name: "+ w1.getGunName()+ "; " + "Boss weapon: "+ w1.getGun();
    }
}
