import java.util.ArrayList;

public class userDL {
    private static ArrayList<userBL> allUsers = new ArrayList();

    public static int getAllUsers() {
        return allUsers.size();
    }

    public static void ChangeAtIndex(int index, userBL obj){
        allUsers.set(index,obj);
    }
    public static void Create(userBL obj) {
        allUsers.add(obj);
    }


    public static int searchmail(String mail) {
        int counter = 0;
        int index=-1;

        for(int i = 0; i < allUsers.size(); ++i) {
            if (mail.equals(allUsers.get(i).getEmail())) {
                counter++;
                index = i;
            }
        }

        if (counter >= 0) {
            return index;
        } else {
            return index;
        }
    }

    public static int getIndex(String id){
        int index = -1;
        for(int i = 0; i < allUsers.size(); ++i) {
            if (id.equals(allUsers.get(i).getUserID())) {
                index = i;
            }
        }
        return index;
    }

    public static userBL retrieveFromIndex(int index)
    {
        return allUsers.get(index);
    }
}
