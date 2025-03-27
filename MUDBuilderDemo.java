public class MUDBuilderDemo {
public static void main(String[] args){
    NPC npcOne=new NPC("Goblin","He is weak",100);
    NPC npcTwo=new NPC("Golem","It is strong",450);
    Dungeon dungeon=new SimpleDungeonBuilder().setDungeonName("First dungeon")
            .addNPC(npcOne)
            .addNPC(npcTwo)
            .addRoom(new Room("Cafe","The cafe is very dark"))
            .addRoom(new Room("Forest","There are lots of NPCs in this place"))
            .addNPC(new NPC("Thief","He robs people",200))
            .build();
    System.out.println(dungeon);
    System.out.println(dungeon.getNPCs());
    System.out.println(dungeon.getRooms());
    System.out.println(dungeon.getName());
}
}