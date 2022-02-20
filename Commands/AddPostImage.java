package MainPackages.Commands;

import MainPackages.ImagePost;

import java.util.Date;

import static MainPackages.User.CurrentLoginUser;

public class AddPostImage extends Command {

    public AddPostImage() {
        keyword = "ADDPOST-IMAGE";
    }

    @Override
    public void run(String[] args) {
        if (CurrentLoginUser != null) { //checking for user login or not.
            Date currentDate = new Date(); //get current time.
            ImagePost imagePost = new ImagePost(currentDate, args[1], Double.parseDouble(args[2]), Double.parseDouble(args[3]),args[4],args[5],args[6] );//create object.
            CurrentLoginUser.addPost(imagePost);
            System.out.println("The post has been successfully added.");
            imagePost.printFormat();
        }else{
            System.out.println("Error: Please sign in and try again.");
        }
    }
}
