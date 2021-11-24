package BorderControl;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Identifiable> identifiableList = new ArrayList<>();

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("End")) {
            if (command.length == 2) {
                Robot robot = new Robot(command[0],command[1]);
                identifiableList.add(robot);

            } else if (command.length == 3) {
                Citizen citizen = new Citizen(command[0],Integer.parseInt(command[1]), command[2]);
                identifiableList.add(citizen);
            }

            command = scanner.nextLine().split("\\s+");
        }
        String fakeId = scanner.nextLine();
        identifiableList.forEach(identifiable -> {
            if (identifiable.getId().endsWith(fakeId)){
                System.out.println(identifiable.getId());
            }
        });
    }
}