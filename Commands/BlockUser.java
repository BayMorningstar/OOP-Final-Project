package MainPackages.Commands;

import MainPackages.User;

import static MainPackages.User.CurrentLoginUser;
import static MainPackages.User.UserList;

public class BlockUser extends Command{

    public BlockUser() {
        keyword = "BLOCK";
    }

    @Override
    public void run(String[] args) {
        boolean check = true;
        if (CurrentLoginUser != null){//checking for user login or not.
            for(User users:UserList ){
                if(users.getUsername().equals(args[1])){
                    check= false;
                    CurrentLoginUser.addBlockList(users);
                    System.out.println(args[1] + " has been successfully blocked");
                    break;
                }

            }if (check){
                System.out.println("No such user!");
            }

        }else{
            System.out.println("Error: Please sign in and try again.");
        }


    }
}
