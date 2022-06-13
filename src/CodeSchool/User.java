package CodeSchool;

public class User extends Human implements OnPostListener {

    @Override
    public void obtainPost(String content) {
        System.out.println(content + "\n");
    }

}
