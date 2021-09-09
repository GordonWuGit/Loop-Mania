package test.goals;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import test.testHelpers.CreateGoal;

import org.javatuples.Pair;
import unsw.loopmania.*;
import unsw.loopmania.entity.moving.Character;
import unsw.loopmania.goal.Goal;
import unsw.loopmania.entity.moving.*;

public class TestGoal {

    Goal goal = (new CreateGoal()).actualGoal();

    private List<Pair<Integer, Integer>> createOrderedPath() {
        List<Pair<Integer, Integer>> orderedPath = new ArrayList<>();
        for (int x = 1; x < 5; x++) { // Go right 4 tiles (1 to 4)
            Pair<Integer, Integer> route = new Pair<>(x, 1);
            orderedPath.add(route);
        }
        for (int y = 1; y < 5; y++) { // Go down 4 tiles (1 to 4)
            Pair<Integer, Integer> route = new Pair<>(4, y);
            orderedPath.add(route);
        }
        for (int x = 4; x > 0; x--) { // Go left 4 tiles (4 to 1)
            Pair<Integer, Integer> route = new Pair<>(x, 4);
            orderedPath.add(route);
        }
        for (int y = 4; y > 0; y--) { // Go up 4 tiles (4 to 1)
            Pair<Integer, Integer> route = new Pair<>(1, y);
            orderedPath.add(route);
        } 

        return orderedPath;
    }

    @Test
    public void edgeCaseGoalsCompleted() throws IOException {
        List<Pair<Integer, Integer>> path = createOrderedPath();
        PathPosition pos = new PathPosition(0, path);
        LoopManiaWorld world = new LoopManiaWorld(8, 14, path, goal);
        Character character = new Character(pos);
        world.setDoggieBeat();
        world.setElanBeat();
        character.setGold(10000);
        character.setExp(406);
        world.setCharacter(character);
        assertEquals(world.gameWon(), true);
    }
    
    @Test
    public void edgeCaseGoalsNotCompleted() throws IOException{
        List<Pair<Integer, Integer>> path = createOrderedPath();
        PathPosition pos = new PathPosition(0, path);
        LoopManiaWorld world = new LoopManiaWorld(8, 14, path, goal);
        Character character = new Character(pos);
        character.setGold(9999);
        character.setExp(405);
        world.setDoggieBeat();
        world.setElanBeat();
        world.setCharacter(character);
        assertEquals(world.gameWon(), false);
    }

    @Test
    public void goldGoalCompleted() throws IOException{
        List<Pair<Integer, Integer>> path = createOrderedPath();
        PathPosition pos = new PathPosition(0, path);
        LoopManiaWorld world = new LoopManiaWorld(8, 14, path, goal);
        Character character = new Character(pos);
        character.setGold(10000);
        character.setExp(405);
        world.setCharacter(character);
        assertEquals(world.gameWon(), false);
    }

    @Test
    public void expGoalCompleted() throws IOException{
        List<Pair<Integer, Integer>> path = createOrderedPath();
        PathPosition pos = new PathPosition(0, path);
        LoopManiaWorld world = new LoopManiaWorld(8, 14, path, goal);
        Character character = new Character(pos);
        character.setGold(9999);
        character.setExp(406);
        world.setCharacter(character);
        assertEquals(world.gameWon(), false);
    }

    @Test
    public void bossGoalCompleted() throws IOException{
        List<Pair<Integer, Integer>> path = createOrderedPath();
        PathPosition pos = new PathPosition(0, path);
        LoopManiaWorld world = new LoopManiaWorld(8, 14, path, goal);
        Character character = new Character(pos);
        world.setDoggieBeat();
        world.setElanBeat();
        character.setGold(90);
        character.setExp(406);
        world.setCharacter(character);
        assertEquals(world.gameWon(), false);
    }

    @Test
    public void testGoalCycles() throws IOException{
        List<Pair<Integer, Integer>> path = createOrderedPath();
        PathPosition pos = new PathPosition(0, path);
        LoopManiaWorld world = new LoopManiaWorld(8, 14, path, goal);
        Character character = new Character(pos);
        world.setCharacter(character);
        assertEquals(world.gameWon(), false);
    }
}
