
class Meat extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "Meat: Add masala, cook and eat hot.";
    }
}
