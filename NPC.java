public class NPC{
    private String name;
    private String description;
    private int health;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }
    public NPC(){

    }
    public NPC(String name,String description,int health){
        this.name=name;
        this.description=description;
        this.health=health;
    }

    @Override
    public String toString() {
        return "NPC{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", health=" + health +
                '}';
    }
}
