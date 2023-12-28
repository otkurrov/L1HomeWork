public class Dog extends Pet{
    private String name;
    private String breed;
    private String[] commands;

    public Dog() {
        super(Color.BROWN, new Shelter("Default Shelter", "Default Address"));
    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        super(color, shelter);
        this.name = name;
        this.breed = breed;
    }

    public Dog(String name, String breed, Color color, Shelter shelter, String[] commands) {
        this(name, breed, color, shelter);
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void makeVoice(String voice, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }

    @Override
    public String getInfo() {
        return "Dog: Name=" + name + ", Breed=" + breed + ", " + super.getInfo();
    }

    public final void cannotOverride() {
        // This method cannot be overridden by subclasses
    }
}
