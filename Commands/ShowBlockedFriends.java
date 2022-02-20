package MainPackages.Commands;

import MainPackages.User;

import java.util.ArrayList;

import static MainPackages.User.CurrentLoginUser;

public class ShowBlockedFriends extends Command{
    public ShowBlockedFriends() {
        keyword = "SHOWBLOCKEDFRIENDS";
    }

    @Override
    public void run(String[] args) {
        ArrayList<User> blockedFriends = new ArrayList<>();
        if (CurrentLoginUser != null) {


            for (User friends:CurrentLoginUser.getCollectionOfFriends()) {
                for (User blockedUser:CurrentLoginUser.getCollectionOfBlockedUsers()) {
                    if (blockedUser.equals(friends)){
                        blockedFriends.add(friends);
                    }

                }

            }if (blockedFriends.isEmpty()){
                System.out.println("You haven't blocked any friend yet!");
            }
            for (User showUser:blockedFriends) {
                System.out.println(showUser.toString());
            }

        }else {
            System.out.println("Error: Please sign in and try again.");
        }

        }
    }
