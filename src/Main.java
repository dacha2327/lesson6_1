public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(23 , 23);
        Weapon w2 = new Weapon("garef" , "killon");
        boss.setW1(w2);
        System.out.println(boss.info());
        Skeleton s1 = new Skeleton(23 , 23 ,23);
        Weapon w3 = new Weapon("lower" , "dar");
        s1.setW2(w3);
        System.out.println(s1.info());
        Skeleton s2 = new Skeleton(56 , 67 , 34);
        Weapon w4 = new Weapon("bow" , "Eagle");
        s2.setW2(w4);
        System.out.println(s2.info());



    }
}