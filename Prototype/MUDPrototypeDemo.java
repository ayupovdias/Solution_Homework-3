
public class MUDPrototypeDemo {
    public static void main(String[] args) {
        NPC prototype = new NPC("Goblin", "He is weak", 100);
        NPC cloneOne = prototype.cloneEntity();
        NPC cloneTwo=prototype.cloneEntity();
        System.out.println(prototype);
        System.out.println(cloneOne);
        System.out.println(cloneTwo);
        cloneOne.setName("Ork");
        cloneOne.setHealth(500);
        cloneOne.setDescription("Dangerous");
        System.out.println(cloneOne);
    }
}
