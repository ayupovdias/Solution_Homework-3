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