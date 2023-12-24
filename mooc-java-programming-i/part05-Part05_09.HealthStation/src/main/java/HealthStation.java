
public class HealthStation {
    private int counter;

    public int weigh(Person person) {
        counter++;
        return person.getWeight();
    }

    public void feed(Person person) {
        counter++;
        person.setWeight(person.getWeight() + 1);
    }
    
    public int weighings() {
        return getCounter();
    }
    
    public int getCounter() {
        return this.counter;
    }
}
