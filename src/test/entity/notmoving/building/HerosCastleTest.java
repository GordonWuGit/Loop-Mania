package test.entity.notmoving.building;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import javafx.beans.property.SimpleIntegerProperty;
import test.testHelpers.CreateGoal;

import org.javatuples.Pair;
import unsw.loopmania.LoopManiaWorld;
import unsw.loopmania.entity.notmoving.building.*;
import unsw.loopmania.entity.notmoving.item.HealthPotion;
import unsw.loopmania.entity.notmoving.item.Sword;
import unsw.loopmania.goal.Goal;

public class HerosCastleTest {

    Goal goal = (new CreateGoal()).DummyGoal();

    // Testing for Vampire Building loading properly
    @Test
    public void HerosCastleLoaderTest() {
        List<Pair<Integer,Integer>> orderedPath = new ArrayList<>();
        orderedPath.add(new Pair<Integer, Integer>(0,0));
        orderedPath.add(new Pair<Integer, Integer>(1,0));
        orderedPath.add(new Pair<Integer, Integer>(2,0));

        int width = 8;
        int height = 14;
        LoopManiaWorld world = new LoopManiaWorld(width, height, orderedPath, goal);
        HerosCastle hCastle = new HerosCastle(new SimpleIntegerProperty(0), new SimpleIntegerProperty(0));
        world.setHerosCastle(hCastle);
        for (int i = 0; i < 90; i++) assertTrue(world.getShop().size() >= 2);
        assertSame(new Sword(new SimpleIntegerProperty(0), new SimpleIntegerProperty(0)).getType(), world.getShop().get(0).getType());
        assertSame(new HealthPotion(new SimpleIntegerProperty(0), new SimpleIntegerProperty(0)).getType(), world.getShop().get(1).getType());
    }
}