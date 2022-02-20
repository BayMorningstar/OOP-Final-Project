package MainPackages.Commands;
import MainPackages.Post;
import MainPackages.User;
import static MainPackages.User.UserList;

public class ShowPosts extends Command{

    public ShowPosts() {
        keyword = "SHOWPOSTS";
    }

    @Override
    public void run(String[] args) {
        boolean check = true;
        for (User users:UserList) {
            if(users.getUsername().equals(args[1])){
                check = false;
                if (users.getCollectionOfPosts().isEmpty()){
                    System.out.println( users.getUsername() + " does not have any posts yet.");
                    break;
                }
                for (Post posts: users.getCollectionOfPosts()) {
                    posts.printFormat();
                }
            }
        }if(check){
            System.out.println("No such user!");
        }
    }
}
