package MainPackages.Commands;

import MainPackages.VideoPost;

import java.util.Date;

import static MainPackages.User.CurrentLoginUser;

public class AddPostVideo extends Command{


    public AddPostVideo() {
        keyword = "ADDPOST-VIDEO";
    }

    @Override
    public void run(String[] args) {
        if (CurrentLoginUser != null) {//checking for user login or not.
            if (Double.parseDouble(args[6]) < 10.0) { //check video duration.
                Date currentDate = new Date();//get current date
                VideoPost videopost = new VideoPost(currentDate, args[1], Double.parseDouble(args[2]), Double.parseDouble(args[3]),args[4],args[5],Double.parseDouble(args[6]) );//create object.
                CurrentLoginUser.addPost(videopost);
                System.out.println("The post has been successfully added.");
            }else {
                System.out.println("Error: Your video exceeds maximum allowed duration of 10 minutes.");
            }

        }else{
            System.out.println("Error: Please sign in and try again.");
        }

    }
}
