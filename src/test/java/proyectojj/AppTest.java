package proyectojj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import proyectojj.modelos.Hero;
import proyectojj.modelos.Meta;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void shouldCreateAMetaObject() {
        Meta metahuman = new Meta("Spiderman",20, 18, 70, 3, 10, 20);
        assertTrue("true",metahuman instanceof Meta);
    }

    @Test
    public void shouldGetName() {
        Meta metahuman = new Meta();
        String name = metahuman.name;
        assertEquals("Captain Obvious", name);
    }

    @Test
    public void shouldSetName() {
        Meta metahuman = new Meta();
        metahuman.setName("Spiderman"
        );
        assertEquals("Spiderman", metahuman.name);
    }

    @Test
    public void shouldGetStr() {
        Meta metahuman = new Meta("Spiderman",20, 18, 70, 3, 10, 20);
        int str = metahuman.getStr();
        assertEquals(20, str);
    }

    @Test
    public void shouldGetDef() {
        Meta metahuman = new Meta("Spiderman", 20, 18, 70, 3, 10, 20);
        int def = metahuman.getDef();
        assertEquals(18, def);
    }

    @Test
    public void shouldGetHp() {
        Meta metahuman = new Meta("Spiderman",20, 18, 70, 3, 10, 20);
        int hp = metahuman.getHp();
        assertEquals(70, hp);
    }

    @Test
    public void shouldGetLv() {
        Meta metahuman = new Meta("Spiderman",20, 18, 70, 3, 10, 20);
        int lv = metahuman.getLv();
        assertEquals(3, lv);
    }

    @Test
    public void shouldGetCrit() {
        Meta metahuman = new Meta("Spiderman",20, 18, 70, 3, 10, 20);
        int crit = metahuman.getCrit();
        assertEquals(10, crit);
    }

    @Test
    public void shouldGetEv() {
        Meta metahuman = new Meta("Spiderman",20, 18, 70, 3, 10, 20);
        int ev = metahuman.getEv();
        assertEquals(20, ev);
    }

    @Test
    public void shouldSetStr() {
        Meta metahuman = new Meta("Spiderman",20, 18, 70, 3, 10, 20);
        metahuman.setStr(22);
        assertEquals(22, metahuman.str);
    }

    @Test
    public void shouldSetDef() {
        Meta metahuman = new Meta("Spiderman",20, 18, 70, 3, 10, 20);
        metahuman.setDef(22);
        assertEquals(22, metahuman.def);
    }

    @Test
    public void shouldSetHp() {
        Meta metahuman = new Meta("Spiderman",20, 18, 70, 3, 10, 20);
        metahuman.setHp(100);
        assertEquals(100, metahuman.hp);
    }

    @Test
    public void shouldSetLv() {
        Meta metahuman = new Meta("Spiderman",20, 18, 70, 3, 10, 20);
        metahuman.setLv(5);
        assertEquals(5, metahuman.lv);
    }

    @Test
    public void shouldSetCrit() {
        Meta metahuman = new Meta("Spiderman",20, 18, 70, 3, 10, 20);
        metahuman.setCrit(30);
        assertEquals(30, metahuman.crit);
    }

    @Test
    public void shouldSetEv() {
        Meta metahuman = new Meta("Spiderman",20, 18, 70, 3, 10, 20);
        metahuman.setEv(30);
        assertEquals(30, metahuman.ev);
    }

    @Test
    public void shouldCreateAHero() {
        Hero superhero = new Hero ("Spiderman",20,20,100,5,20,20,100,1000);
        assertTrue("true", superhero instanceof Hero);
    }

    @Test
    public void shouldGetExp() {
        Hero superhero = new Hero();
        int exp = superhero.getExp();
        assertEquals(0, exp);
    }

    @Test
    public void shouldGetNextLv() {
        Hero superhero = new Hero();
        int nextlv = superhero.getNextlv();
        assertEquals(100, nextlv);
    }

    @Test
    public void shouldSetExp() {
        Hero superhero = new Hero();
        superhero.setExp(5);
        assertEquals(5, superhero.exp);
    }

    @Test
    public void shouldSetNextLv() {
        Hero superhero = new Hero();
        superhero.setNextlv(5);
        assertEquals(5, superhero.nextlv);
    }
}