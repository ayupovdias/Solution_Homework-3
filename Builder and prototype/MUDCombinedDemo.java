public class MUDCombinedDemo {
    public static void main(String[] args){
        NPC prototypeNPC=new NPC("Ork","He is very dangerous",500);
        Room prototypeRoom=new Room("Forest","There are a lot of orks in this forest");
        Dungeon dungeon =new SimpleDungeonBuilder().setDungeonName("First dungeon")
                .addNPC(prototypeNPC.cloneNPC())
                .addNPC(prototypeNPC.cloneNPC())
                .addNPC(prototypeNPC.cloneNPC())
                .addNPC(prototypeNPC.cloneNPC())
                .addNPC(prototypeNPC.cloneNPC())
                .addRoom(prototypeRoom.cloneRoom())
                .addRoom(prototypeRoom.cloneRoom())
                .build();
        System.out.println(dungeon);
        System.out.println(dungeon.getName());
        System.out.println(dungeon.getNPCs().size());
        System.out.println(dungeon.getRooms());
    }
}
