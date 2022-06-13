package CodeSchool;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        NewsPage mamul = new NewsPage();

        //Ananymouse class-ov
        /*
        String norutyun1 = "Norutyun 1";

        //Stex ananymous class-ov nkaragrum enq lsoxin
        mamul.setOnPostListener(new OnPostListener() {
            @Override
            public void obtainPost(String content) {
                System.out.println(content);
            }
        });

        mamul.post(norutyun1);
         */

        //Stex Userna stanum norutyuny, amen post aneluc usery stanuma
        User user = new User();
        String norutyun2 = "Norutyun 2";

        mamul.setOnPostListener(user);
        //norutyun2-y post aneluc heto user-y stanuma
        mamul.post(norutyun2);


        Chief chief = new Chief();

        //Chief object-in talisenq ashxatoxner
        for (int i = 0; i < chief.workers.length; i++) {
            Human human = new Human();
            human.name = "Human" + i;
            human.age = rn.nextInt(100);
            chief.workers[i] = human;
        }

        //Tpuma ashxatoxnerin ev arandzin tpuma ovqer toshakaruen
        chief.printWorkers();
        chief.printPensioners();

        //NewsPage bolor lsoxneric uxarkuma posty
        for (int i = 0; i < 10; i++) {
            mamul.users.add(new User());
        }

        //Ays posty aneluc heto bolorin uxarkuma posty
        mamul.post("NORUTYUN");


    }
}
