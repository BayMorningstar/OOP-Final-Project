package MainPackages.Commands;

import MainPackages.User;

import java.util.ArrayList;

import static MainPackages.User.CurrentLoginUser;

public class ShowBlockedUsers extends Command{
    public ShowBlockedUsers() {
        keyword = "SHOWBLOCKEDUSERS";
    }

    @Override
    public void run(String[] args) {
        boolean checkInForFriend = false;
        ArrayList<User> blockedUsers = new ArrayList<>();
        if (CurrentLoginUser != null) {
        for (User blockedUser:CurrentLoginUser.getCollectionOfBlockedUsers() ) {
            for (User friends:CurrentLoginUser.getCollectionOfFriends() ) {
                checkInForFriend = false;
                if (blockedUser.equals(friends)) {
                    checkInForFriend = true;
                    break;
                }

            }
            if(!checkInForFriend){
                blockedUsers.add(blockedUser);
            }

        }
        if (blockedUsers.isEmpty()){
                System.out.println("You haven't blocked any user yet!");
            }
        for (User showUser:blockedUsers) {
            System.out.println(showUser.toString());
        }

    }else {
            System.out.println("Error: Please sign in and try again.");
        }
    }
}
