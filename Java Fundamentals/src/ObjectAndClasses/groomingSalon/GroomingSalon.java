package ObjectAndClasses.groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private int capacity;
    private List<Pet> data;

    public GroomingSalon (int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet){
        if (this.data.size() < this.capacity){
            this.data.add(pet);
        }
    }

    public boolean remove(String name) {
        return  this.data.removeIf(p -> p.getName().equals(name));
    }

    public Pet getPet(String name, String owner){
        for (Pet pet : data) {
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)){
                return pet;
            }
        }
        return null;
    }

    public int getCount(){
        return this.data.size();
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder("The grooming salon has the following clients:\n");
        for (Pet pet : data) {
            sb.append(pet.getName()).append(" ").append(pet.getOwner()).append("\n");
        }

        return sb.toString().trim();
    }
}
