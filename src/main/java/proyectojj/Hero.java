package proyectojj;

public class Hero extends Meta {
    int exp = 0;
    int nextlv = 100;

    public Hero (){
        super();
    }

    public Hero(String name, int str, int def, int hp, int lv, int crit, int ev, int exp, int nextlv) {
        this.name = name;
        this.str = str;
        this.def = def;
        this.hp = hp;
        this.lv = lv;
        this.crit = crit;
        this.ev = ev;
        this.exp = exp;
        this.nextlv = nextlv;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getNextlv() {
        return nextlv;
    }

    public void setNextlv(int nextlv) {
        this.nextlv = nextlv;
    }
}


