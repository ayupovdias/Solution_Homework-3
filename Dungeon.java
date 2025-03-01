import java.util.ArrayList;
public class Dungeon {
    private String name;
    private ArrayList<Room> rooms;
    private ArrayList<NPC> NPCs;

    public String getName() {
        return name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public ArrayList<NPC> getNPCs() {
        return NPCs;
    }

    public Dungeon(String name,ArrayList<Room> rooms, ArrayList<NPC> NPCs) {
        this.name =  name;
        this.rooms = rooms;
        this.NPCs = NPCs;

    }

    @Override
    public String toString() {
        return "Dungeon{" +
                "name='" + name + '\'' +
                ", rooms=" + rooms +
                ", NPCs=" + NPCs +
                '}';
    }
}
class Room{
    private String name;
    private String description;
    public Room(){

    }
    public Room(String name,String description){
        this.name=name;
        this.description=description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
class NPC{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public NPC(){

    }
    public NPC(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "NPC{" +
                "name='" + name + '\'' +
                '}';
    }
}
interface IDungeonBuilder{
    IDungeonBuilder setDungeonName(String name);
    IDungeonBuilder addRoom(Room room);
    IDungeonBuilder addNPC(NPC npc);
    Dungeon build();
    String getName();
    ArrayList<Room> getRooms();
    ArrayList<NPC> getNPCs();
}
class SimpleDungeonBuilder implements IDungeonBuilder{
    private String name;
    private ArrayList<Room> rooms=new ArrayList<>();
    private ArrayList<NPC> NPCs=new ArrayList<>();



    public IDungeonBuilder setDungeonName(String name){
        this.name=name;
        return this;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public ArrayList<NPC> getNPCs() {
        return NPCs;
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
class MUDBuilderDemo {
    public static void main(String[] args){
         IDungeonBuilder builder=new SimpleDungeonBuilder();
         NPC npc=new NPC("Goblin");
         NPC npcOne=new NPC("Golem");
         builder.setDungeonName("First Dungeon");
         builder.addNPC(npc);
         builder.addNPC(npcOne);
         Room room=new Room("Cafe","The cafe is dark");
         Room roomOne=new Room("Tunnel", "There are lots of dangerous NPCs in this place");
         builder.addRoom(room);
         builder.addRoom(roomOne);
         Dungeon dungeon=builder.build();
        System.out.println(dungeon);

    }
}
