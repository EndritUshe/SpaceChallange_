import java.util.List;

public class Main {
    public static void main(String[] args) {
        Simulation firstSimulation = new Simulation();
        String filePath = "Phase-1.txt";
        List<Item> itemList = firstSimulation.loadItems(filePath);
        List<U1> u1List = firstSimulation.u1RocketList(itemList);
        System.out.println("The first Phase of Loading items in U1 & U2 rockets: ");
        for (U1 u1 : u1List) {

            System.out.println(u1);
        }
        System.out.println();
        System.out.println("The number of U1 ships loaded for the first Phase is: " + u1List.size());
        System.out.println();
        List<U2> u2List = firstSimulation.u2RocketList(itemList);
        for (U2 u2 : u2List) {
            System.out.println(u2);
        }
        System.out.println();
        System.out.println("The number of U2 ships loaded for the first Phase is: " + u2List.size());
        System.out.println();
        System.out.println();

        System.out.println("The second Phase of Loading items in U1 & U2 rockets: ");
        String filePath2 = "Phase-2.txt";
        List<Item> itemList2 = firstSimulation.loadItems(filePath2);
        List<U1> u1SecondList = firstSimulation.u1RocketList(itemList2);
        for (U1 u1 : u1SecondList) {

            System.out.println(u1);
        }
        System.out.println();
        System.out.println("The number of U1 ships loaded for the second Phase is: " + u1SecondList.size());
        System.out.println();
        List<U2> u2SecondList = firstSimulation.u2RocketList(itemList2);
        for (U2 u2 : u2SecondList) {
            System.out.println(u2);
        }
        System.out.println();
        System.out.println("The number of U2 ships loaded for the Second Phase is: " + u2SecondList.size());

    }

}