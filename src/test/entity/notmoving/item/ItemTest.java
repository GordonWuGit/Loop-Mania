package test.entity.notmoving.item;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import unsw.loopmania.entity.moving.Character;

public class ItemTest {

    // Testing to see if unequipped inventory works and sword item loads properly
    @Test
    public void SwordItemLoaderTest(){
        
        Character character = new Character(null);
        character.addUnequippedItem("Sword", false);
        assertEquals("Sword", character.getUnequippedInventory().get(0).getType());
        assertEquals(0, character.getUnequippedInventory().get(0).getX());
        assertEquals(0, character.getUnequippedInventory().get(0).getY());
    }

    // Testing to see if unequipped inventory works and armour item loads properly
    @Test
    public void ArmourItemLoaderTest(){
        
        Character character = new Character(null);
        character.addUnequippedItem("Armour", false);
        assertEquals("Armour", character.getUnequippedInventory().get(0).getType());
        assertEquals(0, character.getUnequippedInventory().get(0).getX());
        assertEquals(0, character.getUnequippedInventory().get(0).getY());
    }

    // Testing to see if unequipped inventory works and HealthPotion item loads properly
    @Test
    public void HealthPotionItemLoaderTest(){
        
        Character character = new Character(null);
        character.addUnequippedItem("HealthPotion", false);
        assertEquals("HealthPotion", character.getUnequippedInventory().get(0).getType());
        assertEquals(0, character.getUnequippedInventory().get(0).getX());
        assertEquals(0, character.getUnequippedInventory().get(0).getY());
    }

    // Testing to see if unequipped inventory works and Shield item loads properly
    @Test
    public void ShieldItemLoaderTest(){
        
        Character character = new Character(null);
        character.addUnequippedItem("Shield", false);
        assertEquals("Shield", character.getUnequippedInventory().get(0).getType());
        assertEquals(0, character.getUnequippedInventory().get(0).getX());
        assertEquals(0, character.getUnequippedInventory().get(0).getY());
    }

    // Testing to see if unequipped inventory works and Staff item loads properly
    @Test
    public void StaffItemLoaderTest(){
        
        Character character = new Character(null);
        character.addUnequippedItem("Staff", false);
        assertEquals("Staff", character.getUnequippedInventory().get(0).getType());
        assertEquals(0, character.getUnequippedInventory().get(0).getX());
        assertEquals(0, character.getUnequippedInventory().get(0).getY());
    }

    // Testing to see if unequipped inventory works and Stake item loads properly
    @Test
    public void StakeItemLoaderTest(){
        
        Character character = new Character(null);
        character.addUnequippedItem("Stake", false);
        assertEquals("Stake", character.getUnequippedInventory().get(0).getType());
        assertEquals(0, character.getUnequippedInventory().get(0).getX());
        assertEquals(0, character.getUnequippedInventory().get(0).getY());
    }

    // Testing to see if unequipped inventory works and TheOneRing item loads properly
    @Test
    public void TheOneRingItemLoaderTest(){
        
        Character character = new Character(null);
        character.addUnequippedItem("TheOneRing", false);
        assertEquals("TheOneRing", character.getUnequippedInventory().get(0).getType());
        assertEquals(0, character.getUnequippedInventory().get(0).getX());
        assertEquals(0, character.getUnequippedInventory().get(0).getY());
    }

    // Testing to see if unequipped inventory works and multiple items loads properly
    @Test
    public void MultipleItemLoaderTest(){
        
        Character character = new Character(null);
        character.addUnequippedItem("Stake", false);
        character.addUnequippedItem("Sword", false);
        character.addUnequippedItem("TheOneRing", false);
        assertEquals("Stake", character.getUnequippedInventory().get(0).getType());
        assertEquals(0, character.getUnequippedInventory().get(0).getX());
        assertEquals(0, character.getUnequippedInventory().get(0).getY());

        assertEquals("Sword", character.getUnequippedInventory().get(1).getType());
        assertEquals(1, character.getUnequippedInventory().get(1).getX());
        assertEquals(0, character.getUnequippedInventory().get(1).getY());

        assertEquals("TheOneRing", character.getUnequippedInventory().get(2).getType());
        assertEquals(2, character.getUnequippedInventory().get(2).getX());
        assertEquals(0, character.getUnequippedInventory().get(2).getY());
    }

    // Testing to see if removing unequipped inventory works and multiple items loads properly
    @Test
    public void RemovingItemLoaderTest(){
        
        Character character = new Character(null);
        character.addUnequippedItem("Stake", false);
        character.addUnequippedItem("Sword", false);
        character.addUnequippedItem("TheOneRing", false);
        assertEquals("Stake", character.getUnequippedInventory().get(0).getType());
        assertEquals(0, character.getUnequippedInventory().get(0).getX());
        assertEquals(0, character.getUnequippedInventory().get(0).getY());

        assertEquals("Sword", character.getUnequippedInventory().get(1).getType());
        assertEquals(1, character.getUnequippedInventory().get(1).getX());
        assertEquals(0, character.getUnequippedInventory().get(1).getY());

        assertEquals("TheOneRing", character.getUnequippedInventory().get(2).getType());
        assertEquals(2, character.getUnequippedInventory().get(2).getX());
        assertEquals(0, character.getUnequippedInventory().get(2).getY());

        character.removeUnequippedInventoryItemByCoordinates(1, 0);
        assertEquals("TheOneRing", character.getUnequippedInventory().get(1).getType());
        assertEquals(2, character.getUnequippedInventory().get(1).getX());
        assertEquals(0, character.getUnequippedInventory().get(1).getY());

        assertEquals("Stake", character.getUnequippedInventory().get(0).getType());
        assertEquals(0, character.getUnequippedInventory().get(0).getX());
        assertEquals(0, character.getUnequippedInventory().get(0).getY());

        assertEquals(2, character.getUnequippedInventory().size());
    }

    // Testing to see if character has health pots
    @Test
    public void HealthPotsItemCheckerTest(){
        
        Character character = new Character(null);
        character.addUnequippedItem("Stake", false);
        character.addUnequippedItem("Sword", false);
        character.addUnequippedItem("TheOneRing", false);
        assertFalse(character.hasHealthPotion());
        
        character.addUnequippedItem("HealthPotion", false);
        assertTrue(character.hasHealthPotion());
    }

}
