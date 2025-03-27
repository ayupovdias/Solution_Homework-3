import java.util.ArrayList;

public class SimpleDungeonBuilder implements IDungeonBuilder{
    private String name;
    private ArrayList<Room> rooms=new ArrayList<>();
    private ArrayList<NPC> NPCs=new ArrayList<>();



    public IDungeonBuilder setDungeonName(String name){
        this.name=name;
        return this;
    }


    public IDungeonBuilder addRoom(Room room){
        rooms.add(room);
        return this;
    }
    public IDungeonBuilder addNPC(NPC npc){
        NPCs.add(npc);
        return this;
    }
    public Dungeon build(){
        return new Dungeon(name,rooms,NPCs);
    }

}
