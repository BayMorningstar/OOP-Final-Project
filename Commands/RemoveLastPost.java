package MainPackages.Commands;

import static MainPackages.User.CurrentLoginUser;

public class RemoveLastPost extends Command{


    public RemoveLastPost() {
        keyword = "REMOVELASTPOST";
    }

    @Override
    public void run(String[] args) {
        if (CurrentLoginUser != null) {
            if (!CurrentLoginUser.getCollectionOfPosts().isEmpty()){
                CurrentLoginUser.removePost(CurrentLoginUser.getCollectionOfPosts().size() - 1);
                System.out.println("Your last post has been successfully removed.");
            }else {
                System.out.println("Error: You do not have any post.");
            }
        }else{
            System.out.println("Error: Please sign in and try again.");
        }
    }
}
