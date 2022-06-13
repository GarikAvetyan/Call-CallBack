package CodeSchool;

public class Chief {
    Human[] workers = new Human[10];

    //Tpuma bolor ashxatoxnerin
    public void printWorkers() {
        System.out.println("Workers");
        for (int i = 0; i < workers.length; i++) {
            System.out.println(workers[i].name + ", " + workers[i].age);
        }
        System.out.println();
    }

    //Tpuma bolor toshakarunerin
    public void printPensioners() {
        System.out.println("Pensioners");
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].age > 40) {
                System.out.println(workers[i].name + ", " + workers[i].age);
            }
        }
        System.out.println();
    }

}
