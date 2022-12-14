package Entities;

public class Champion {
    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void takeDamage(Champion champion){
        if (armor >= champion.getAttack()){
            life -= 1;
        }else {
            life -= (champion.getAttack() - armor);
        }
    }

    public String status(){
        if (life <= 0){
            return name
                    + ": 0 of life (DEAD)";
        }
        return name
                + ": "
                + life
                + " of life";

    }
}
