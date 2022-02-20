package MainPackages.Commands;
import MainPackages.User;
import java.util.Date;

import static MainPackages.User.UserList;

public class AddUser  extends Command{
    public AddUser() {
        keyword = "ADDUSER";
    }

    @Override
    public void run(String[] args) {
        Date date = new Date(args[4]);
        User student = new User(args[1], args[2], args[3], date, args[5]);
        UserList.add(student);//add object to a static arraylist.
        System.out.println(args[1] + "has been successfully added.");
    }
}
