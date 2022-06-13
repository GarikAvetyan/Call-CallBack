package CodeSchool;

import java.util.ArrayList;

public class NewsPage {

    OnPostListener onPostListener;
    //Userneri(Lsoxneri) ArrayList
    ArrayList<User> users = new ArrayList<User>();

    public void setOnPostListener(OnPostListener onPostListener) {
        this.onPostListener = onPostListener;
    }


    public void post(String content) {
        //Amen post aneluc hetevoxin uxarkuma posty
        if (onPostListener != null) {
            onPostListener.obtainPost(content);
        }

        //Amen post aneluc bolor hetevordnerin uxarkuma posty
        for (int i = 0; i < users.size(); i++) {
            users.get(i).obtainPost(content);
        }
    }

}
