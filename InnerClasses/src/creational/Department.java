package creational;

import java.util.ArrayList;

public class Department {
    private final String name;
    private final ArrayList<WorkPosition> positions;

    public String getName() {
        return name;
    }

    private static class WorkPosition {
        private final String name;
        private final ArrayList<String> workers;

        public WorkPosition(String name) {
            this.name = name;
            workers = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public ArrayList<String> getWorkers() {
            return workers;
        }

        public void addWorker(String name) {
            workers.add(name);
        }

        public String toString() {
            String result = "Должность: " + getName() + "\n";
            for (String worker : getWorkers()) {
                result += worker + "\n";
            }
            return result;
        }
    }

    public Department(String name) {
        this.name = name;
        positions = new ArrayList<>();
    }

    public void addPosition(String name) {
        if (positions.contains(new WorkPosition(name))) {
            System.out.println("Данная должность уже существует");
            return;
        }
        positions.add(new WorkPosition(name));
    }

    public void addWorker(String name, String position) {
        boolean workerAdded = false;
        int arrayIndex = 0;
        while (!workerAdded && arrayIndex < positions.size()) {
            if (positions.get(arrayIndex).getName().equals(position)) {
                positions.get(arrayIndex).addWorker(name);
                workerAdded = true;
            }
            arrayIndex++;
        }
        if (!workerAdded) {
            System.out.println("Данная должность не существует");
        }
    }

    public String toString() {
        String result = "Отдел: " + getName() + "\n";
        for (WorkPosition position : positions) {
            result += position.toString() + "\n";
        }
        return result;
    }
}
