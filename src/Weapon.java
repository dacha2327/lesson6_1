public class Weapon {
    public Weapon(String gun , String gunName){
        super();
        this.setGun(gun);
        this.setGunName(gunName);
    }
    private String gun;
    private String gunName;
    public void setGunName(String gunName) {
        this.gunName = gunName;
    }
    public String getGunName() {
        return gunName;
    }

    public String getGun() {
        return gun;
    }

    public void setGun(String gun) {
        this.gun = gun;}

    }

