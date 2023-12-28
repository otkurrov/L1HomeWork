public class Main {
    public static void main(String[] args) {
        Shelter shelterA = new Shelter("Shelter A", "Address A");
        Dog dogA = new Dog();
        Dog dogB = new Dog("Buddy", "Labrador", Color.BLACK, shelterA);
        Dog dogC = new Dog("Max", "Golden Retriever", Color.WHITE, shelterA, new String[]{"Sit", "Stay"});

        System.out.println(dogA.getInfo());
        System.out.println(dogB.getInfo());
        System.out.println(dogC.getInfo());

        dogA.makeVoice("Woof!", 3);
        dogB.makeVoice("Bark!", 2);
        dogC.makeVoice("Speak!", 1);

        // Attempting to call the method that cannot be overridden
        dogC.cannotOverride();
    }
}