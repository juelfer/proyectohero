package proyectojj;

public class Meta {
    protected String name = "Capitán Obvio";
    protected int str = 10;
    protected int def = 10;
    protected int hp = 50;
    protected int lv = 1;
    protected int crit = 5;
    protected int ev = 5;

//    Getters + Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStr()
    {
        return str;
    }

    public void setStr(int str)
    {
        this.str = str;
    }

    public int getDef()
    {
        return def;
    }

    public void setDef(int def)
    {
        this.def = def;
    }

    public int getHp()
    {
        return hp;
    }

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public int getLv()
    {
        return lv;
    }

    public void setLv(int lv)
    {
        this.lv = lv;
    }

    public int getCrit()
    {
        return crit;
    }

    public void setCrit(int crit)
    {
        this.crit = crit;
    }

    public int getEv()
    {
        return ev;
    }

    public void setEv(int ev)
    {
        this.ev = ev;
    }

//    Constructor

    public Meta(String name, int str, int def, int hp, int lv, int crit, int ev) {
        this.name = name;
        this.str = str;
        this.def = def;
        this.hp = hp;
        this.lv = lv;
        this.crit = crit;
        this.ev = ev;
    }

    public Meta() {}
}
