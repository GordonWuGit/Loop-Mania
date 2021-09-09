package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.javatuples.Pair;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.junit.Test;

import javafx.beans.property.SimpleIntegerProperty;
import test.testHelpers.CreateGoal;
import unsw.loopmania.LoopManiaWorld;
import unsw.loopmania.entity.moving.PathPosition;
import unsw.loopmania.entity.moving.enemy.Enemy;
import unsw.loopmania.entity.notmoving.building.HerosCastle;
import unsw.loopmania.entity.notmoving.item.Sword;
import unsw.loopmania.goal.Goal;
import unsw.loopmania.entity.Entity;
import unsw.loopmania.entity.moving.Character;


public class LoopManiaWorldTest {
//    Goal goal = (new CreateGoal()).DummyGoal();
//
//
//    @Test
//    public void TestRunBattles() {
//        /**
//         * Making sure that spawning enemies works
//         */
//        List<Pair<Integer,Integer>> orderedPath = new ArrayList<>();
//        orderedPath.add(new Pair<Integer, Integer>(0,0));
//        orderedPath.add(new Pair<Integer, Integer>(1,0));
//        orderedPath.add(new Pair<Integer, Integer>(2,0));
//        orderedPath.add(new Pair<Integer, Integer>(3,0));
//        orderedPath.add(new Pair<Integer, Integer>(4,0));
//        orderedPath.add(new Pair<Integer, Integer>(5,0));
//        orderedPath.add(new Pair<Integer, Integer>(5,1));
//        orderedPath.add(new Pair<Integer, Integer>(5,2));
//        orderedPath.add(new Pair<Integer, Integer>(5,3));
//
//        int width = 8;
//        int height = 14;
//        LoopManiaWorld world = new LoopManiaWorld(width, height, orderedPath, goal);
//
//        Character character = new Character(new PathPosition(0, orderedPath));
//
//        world.setCharacter(character);
//
//        world.loadCard("ZombiePit");
//        world.convertCardToBuildingByCoordinates(0, 0, 1, 1);
//
//        world.loadCard("ZombiePit");
//        world.convertCardToBuildingByCoordinates(0, 0, 1, 2);
//
//        world.loadCard("Campfire");
//        world.convertCardToBuildingByCoordinates(0, 0, 1, 1);
//
//        world.loadCard("Tower");
//        world.convertCardToBuildingByCoordinates(0, 0, 1, 2);
//
//        world.possiblySpawnEnemies();
//
//        List<Enemy> defeatedEnemies = world.runBattles();
//
//        character.addAlliedSoldier();
//        assertEquals(character.getAlliedSoldiers().get(0), 40);
//
//        assertEquals(defeatedEnemies.get(0).getEnemyType(), "Zombie");
//    }
//
//    @Test
//    public void TestRunBattlesTwo() {
//        /**
//         * Making sure that spawning enemies works
//         */
//        List<Pair<Integer,Integer>> orderedPath = new ArrayList<>();
//        orderedPath.add(new Pair<Integer, Integer>(0,0));
//        orderedPath.add(new Pair<Integer, Integer>(1,0));
//        orderedPath.add(new Pair<Integer, Integer>(2,0));
//        orderedPath.add(new Pair<Integer, Integer>(3,0));
//        orderedPath.add(new Pair<Integer, Integer>(4,0));
//        orderedPath.add(new Pair<Integer, Integer>(5,0));
//        orderedPath.add(new Pair<Integer, Integer>(5,1));
//        orderedPath.add(new Pair<Integer, Integer>(5,2));
//        orderedPath.add(new Pair<Integer, Integer>(5,3));
//
//        int width = 8;
//        int height = 14;
//        LoopManiaWorld world = new LoopManiaWorld(width, height, orderedPath, goal);
//
//        Character character = new Character(new PathPosition(0, orderedPath));
//
//        world.setCharacter(character);
//
//        world.loadCard("ZombiePit");
//        world.convertCardToBuildingByCoordinates(0, 0, 1, 2);
//
//        world.loadCard("Tower");
//        world.convertCardToBuildingByCoordinates(0, 0, 1, 1);
//
//        world.possiblySpawnEnemies();
//
//        List<Enemy> defeatedEnemies = world.runBattles();
//
//        assertEquals(defeatedEnemies.get(0).getEnemyType(), "Zombie");
//    }
//
//    @Test
//    public void TestSpawnEnemies() {
//        /**
//         * Making sure that spawning enemies works
//         */
//        List<Pair<Integer,Integer>> orderedPath = new ArrayList<>();
//        orderedPath.add(new Pair<Integer, Integer>(0,0));
//        orderedPath.add(new Pair<Integer, Integer>(1,0));
//        orderedPath.add(new Pair<Integer, Integer>(2,0));
//        orderedPath.add(new Pair<Integer, Integer>(3,0));
//        orderedPath.add(new Pair<Integer, Integer>(4,0));
//        orderedPath.add(new Pair<Integer, Integer>(5,0));
//        orderedPath.add(new Pair<Integer, Integer>(5,1));
//        orderedPath.add(new Pair<Integer, Integer>(5,2));
//        orderedPath.add(new Pair<Integer, Integer>(5,3));
//
//        int width = 8;
//        int height = 14;
//        LoopManiaWorld world = new LoopManiaWorld(width, height, orderedPath, goal);
//
//        Character character = new Character(new PathPosition(0, orderedPath));
//
//        world.setCharacter(character);
//        assertTrue(world.possiblySpawnEnemies().size() > 3);
//
//        for (int i = 0; i <30; i++) {
//            world.possiblySpawnEnemies().size();
//        }
//        assertTrue(world.possiblySpawnEnemies().size() == 0);
//    }
//
//    @Test
//    public void TestSpawnGold() {
//        /**
//         * Testing to see the spawn behaviours of gold are working
//         */
//        List<Pair<Integer,Integer>> orderedPath = new ArrayList<>();
//        orderedPath.add(new Pair<Integer, Integer>(0,0));
//        orderedPath.add(new Pair<Integer, Integer>(1,0));
//        orderedPath.add(new Pair<Integer, Integer>(2,0));
//        orderedPath.add(new Pair<Integer, Integer>(3,0));
//        orderedPath.add(new Pair<Integer, Integer>(4,0));
//        orderedPath.add(new Pair<Integer, Integer>(5,0));
//        orderedPath.add(new Pair<Integer, Integer>(5,1));
//        orderedPath.add(new Pair<Integer, Integer>(5,2));
//        orderedPath.add(new Pair<Integer, Integer>(5,3));
//
//        int width = 8;
//        int height = 14;
//        LoopManiaWorld world = new LoopManiaWorld(width, height, orderedPath, goal);
//
//        Character character = new Character(new PathPosition(0, orderedPath));
//        world.setHerosCastle(new HerosCastle(new SimpleIntegerProperty(0), new SimpleIntegerProperty(0)));
//
//        world.setCharacter(character);
//        assertTrue(world.spawnGoldDropOnGround().getGoldAmount() >= 5);
//        for (int i = 0; i <30; i++) {
//            world.spawnGoldDropOnGround();
//        }
//
//        // If its full dont spawn any
//        assertTrue(world.spawnGoldDropOnGround() == null);
//    }
//
//    @Test
//    public void TestSpawnHealthPots() {
//        /**
//         * Testing to see the spawn behaviours of HP Pots are working
//         */
//        List<Pair<Integer,Integer>> orderedPath = new ArrayList<>();
//        orderedPath.add(new Pair<Integer, Integer>(0,0));
//        orderedPath.add(new Pair<Integer, Integer>(1,0));
//        orderedPath.add(new Pair<Integer, Integer>(2,0));
//        orderedPath.add(new Pair<Integer, Integer>(3,0));
//        orderedPath.add(new Pair<Integer, Integer>(4,0));
//        orderedPath.add(new Pair<Integer, Integer>(5,0));
//        orderedPath.add(new Pair<Integer, Integer>(5,1));
//        orderedPath.add(new Pair<Integer, Integer>(5,2));
//        orderedPath.add(new Pair<Integer, Integer>(5,3));
//
//        int width = 8;
//        int height = 14;
//        LoopManiaWorld world = new LoopManiaWorld(width, height, orderedPath, goal);
//
//        Character character = new Character(new PathPosition(0, orderedPath));
//        world.setHerosCastle(new HerosCastle(new SimpleIntegerProperty(0), new SimpleIntegerProperty(0)));
//
//        world.setCharacter(character);
//        assertTrue(world.spawnHealthPotionDropOnGround() != null);
//        for (int i = 0; i <30; i++) {
//            world.spawnHealthPotionDropOnGround();
//        }
//
//        // If its full dont spawn any
//        assertTrue(world.spawnHealthPotionDropOnGround() == null);
//    }
//
//    @Test
//    public void Overfillingcards() {
//        /**
//         * Testing to see if it is full it would delete oldest one and shift down
//         */
//        List<Pair<Integer,Integer>> orderedPath = new ArrayList<>();
//        orderedPath.add(new Pair<Integer, Integer>(0,0));
//        orderedPath.add(new Pair<Integer, Integer>(1,0));
//        orderedPath.add(new Pair<Integer, Integer>(2,0));
//        orderedPath.add(new Pair<Integer, Integer>(3,0));
//        orderedPath.add(new Pair<Integer, Integer>(4,0));
//        orderedPath.add(new Pair<Integer, Integer>(5,0));
//        orderedPath.add(new Pair<Integer, Integer>(5,1));
//        orderedPath.add(new Pair<Integer, Integer>(5,2));
//        orderedPath.add(new Pair<Integer, Integer>(5,3));
//
//        int width = 8;
//        int height = 14;
//        LoopManiaWorld world = new LoopManiaWorld(width, height, orderedPath, goal);
//
//        Character character = new Character(new PathPosition(0, orderedPath));
//        world.setHerosCastle(new HerosCastle(new SimpleIntegerProperty(0), new SimpleIntegerProperty(0)));
//
//        world.setCharacter(character);
//        world.loadCard("VampireCastle");
//        world.loadCard("VampireCastle");
//        world.loadCard("VampireCastle");
//        world.loadCard("VampireCastle");
//        world.loadCard("VampireCastle");
//        world.loadCard("VampireCastle");
//        world.loadCard("VampireCastle");
//        world.loadCard("VampireCastle");
//        world.loadCard("Tower");
//        world.loadCard("Trap");
//        world.loadCard("Trap");
//        world.loadCard("Trap");
//        world.loadCard("Trap");
//        world.loadCard("Trap");
//        world.loadCard("Trap");
//        world.loadCard("Trap"); 
//
//        assertEquals("Tower", world.getCardEntities().get(0).getType());
//        assertEquals("Trap", world.getCardEntities().get(1).getType());
//        assertEquals("Trap", world.getCardEntities().get(2).getType());
//        assertEquals("Trap", world.getCardEntities().get(3).getType());
//        assertEquals("Trap", world.getCardEntities().get(4).getType());
//        assertEquals("Trap", world.getCardEntities().get(5).getType());
//        assertEquals("Trap", world.getCardEntities().get(6).getType());
//        assertEquals("Trap", world.getCardEntities().get(7).getType());
//    }
//
//    @Test
//    public void Reset() {
//        /**
//         * Resetting
//         */
//        List<Pair<Integer,Integer>> orderedPath = new ArrayList<>();
//        orderedPath.add(new Pair<Integer, Integer>(0,0));
//        orderedPath.add(new Pair<Integer, Integer>(1,0));
//        orderedPath.add(new Pair<Integer, Integer>(2,0));
//        orderedPath.add(new Pair<Integer, Integer>(3,0));
//        orderedPath.add(new Pair<Integer, Integer>(4,0));
//        orderedPath.add(new Pair<Integer, Integer>(5,0));
//        orderedPath.add(new Pair<Integer, Integer>(5,1));
//        orderedPath.add(new Pair<Integer, Integer>(5,2));
//        orderedPath.add(new Pair<Integer, Integer>(5,3));
//
//        int width = 8;
//        int height = 14;
//        LoopManiaWorld world = new LoopManiaWorld(width, height, orderedPath, goal);
//
//        Character character = new Character(new PathPosition(0, orderedPath));
//        world.setHerosCastle(new HerosCastle(new SimpleIntegerProperty(0), new SimpleIntegerProperty(0)));
//        character.moveDownPath();
//        world.setCharacter(character);
//        world.loadCard("VampireCastle");
//        world.loadCard("VampireCastle");
//        world.loadCard("VampireCastle");
//        world.loadCard("VampireCastle");
//        world.loadCard("VampireCastle");
//        world.loadCard("VampireCastle");
//        world.loadCard("VampireCastle");
//        world.loadCard("VampireCastle");
//        world.loadCard("Tower");
//        world.loadCard("Trap");
//        world.loadCard("Trap");
//        world.loadCard("Trap");
//        world.loadCard("Trap");
//        world.loadCard("Trap");
//        world.loadCard("Trap");
//        world.loadCard("Trap"); 
//
//        assertEquals("Tower", world.getCardEntities().get(0).getType());
//        assertEquals("Trap", world.getCardEntities().get(1).getType());
//        assertEquals("Trap", world.getCardEntities().get(2).getType());
//        assertEquals("Trap", world.getCardEntities().get(3).getType());
//        assertEquals("Trap", world.getCardEntities().get(4).getType());
//        assertEquals("Trap", world.getCardEntities().get(5).getType());
//        assertEquals("Trap", world.getCardEntities().get(6).getType());
//        assertEquals("Trap", world.getCardEntities().get(7).getType());
//
//        world.possiblySpawnEnemies();
//        world.convertCardToBuildingByCoordinates(0, 0, 0, 1);
//        world.spawnGoldDropOnGround();
//        world.spawnHealthPotionDropOnGround();
//        world.addEntity(new Sword(new SimpleIntegerProperty(0), new SimpleIntegerProperty(0)));
//
//        world.reset();
//
//        assertEquals(new ArrayList<>(), world.getCardEntities());
//        assertEquals(new ArrayList<>(), world.getGoldDrops());
//        assertEquals(0, world.getCycle());
//        assertEquals(new ArrayList<>(), world.getHealthPotionDrops());
//        assertEquals(new ArrayList<>(), world.getUnequippedItems());
//        
//    }
//
//    @Test
//    public void RunTick() {
//        /**
//         * Resetting
//         */
//        List<Pair<Integer,Integer>> orderedPath = new ArrayList<>();
//        orderedPath.add(new Pair<Integer, Integer>(0,0));
//        orderedPath.add(new Pair<Integer, Integer>(1,0));
//        orderedPath.add(new Pair<Integer, Integer>(2,0));
//        orderedPath.add(new Pair<Integer, Integer>(3,0));
//        orderedPath.add(new Pair<Integer, Integer>(4,0));
//        orderedPath.add(new Pair<Integer, Integer>(5,0));
//        orderedPath.add(new Pair<Integer, Integer>(5,1));
//        orderedPath.add(new Pair<Integer, Integer>(5,2));
//        orderedPath.add(new Pair<Integer, Integer>(5,3));
//
//        int width = 8;
//        int height = 14;
//        LoopManiaWorld world = new LoopManiaWorld(width, height, orderedPath, goal);
//
//        Character character = new Character(new PathPosition(0, orderedPath));
//        world.setHerosCastle(new HerosCastle(new SimpleIntegerProperty(0), new SimpleIntegerProperty(0)));
//        character.moveDownPath();
//        world.setCharacter(character);
//        world.loadCard("VampireCastle");
//        world.loadCard("VampireCastle");
//        
//
//        world.possiblySpawnEnemies();
//        world.convertCardToBuildingByCoordinates(0, 0, 0, 1);
//        world.spawnGoldDropOnGround();
//        world.spawnHealthPotionDropOnGround();
//        world.addEntity(new Sword(new SimpleIntegerProperty(0), new SimpleIntegerProperty(0)));
//
//        world.runTickMoves();
//        assertEquals(1, character.getX());
//        assertEquals(0, character.getY());
//    }
}