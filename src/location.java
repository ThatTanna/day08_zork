import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class location {

    private final String name;
    private final String description;
    private String direction;

    public location (String name, String description, String direction) {
        this.name = name;
        this.description = description;
        this.direction = direction;
    }

    HashMap<String, String> myLocation = new HashMap<String, String>();

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String getDirection() {
        return direction;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "location [name=" + name + ", description=" + description + ", direction=" + direction + "]";
    }
    

}