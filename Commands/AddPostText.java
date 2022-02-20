package MainPackages.Commands;
import MainPackages.TextPost;

import java.util.Date;

import static MainPackages.User.CurrentLoginUser;

public class AddPostText extends Command {
    public AddPostText() {
        keyword = "ADDPOST-TEXT";
    }

    @Override
    public void run(String[] args) {
        if (CurrentLoginUser != null) {
            Date currentDate = new Date();
            TextPost textPost = new TextPost(currentDate, args[1], Double.parseDouble(args[2]), Double.parseDouble(args[3]),args[4]);
            CurrentLoginUser.addPost(textPost);
            System.out.println("The post has been successfully added.");
        }else{
            System.out.println("Error: Please sign in and try again.");
        }
    }
}
