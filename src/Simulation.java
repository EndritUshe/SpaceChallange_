import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Simulation extends Rocket {
    public List<Item> loadItems(String filePath) {
        List<Item> items = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = (line.split("="));
                Item item = new Item();
                item.setName(parts[0]);
                item.setWeight(Integer.parseInt(parts[1]));
                items.add(item);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return items;
    }

    public List<U1> u1RocketList(List<Item> items) {
        List<U1> rockets = new ArrayList<>();
        U1 rocket1 = new U1();
        for (Item item : items) {
            if (rocket1.canCarry(item)) {
                rocket1.carry(item);
            } else {
                rockets.add(rocket1);
                rocket1 = new U1();
                rocket1.carry(item);
            }
        }
        if (rocket1 != null) {
            rockets.add(rocket1);
        }
        return rockets;
    }

    public List<U2> u2RocketList(List<Item> items) {
        List<U2> u2RocketList = new ArrayList<>();
        U2 u2Rockets = new U2();
        for (Item item : items) {
            if (u2Rockets.canCarry(item)) {
                u2Rockets.carry(item);
            } else {
                u2RocketList.add(u2Rockets);
                u2Rockets = new U2();
                u2Rockets.carry(item);
            }
        }
        if (u2Rockets != null) {
            u2RocketList.add(u2Rockets);
        }
        return u2RocketList;
    }


}

