public class Pet {
    private int age;
    private Color color;
    private Shelter shelter;

    public Pet(Color color, Shelter shelter) {
        this.age = generateDefaultAge();
        this.color = color;
        this.shelter = shelter;
    }

    private int generateDefaultAge() {
        // Implementation of age generation logic
        return 1; // For simplicity, using a constant value
    }

    public int getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public String getInfo() {
        return "Pet: Age=" + age + ", Color=" + color + ", Shelter=" + shelter.getName();
    }
}
