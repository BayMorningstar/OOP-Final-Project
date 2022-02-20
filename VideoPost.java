package MainPackages;

import java.util.Date;

public class VideoPost extends TextPost{

    private String videoFilename;
    private double videoDuration;


    public VideoPost(Date date, String text, double x, double y, String args, String videoFilename, double videoDuration) {
        super(date, text, x, y, args);
        this.videoFilename = videoFilename;
        this.videoDuration = videoDuration;
    }
    public void printFormat() {
        System.out.println( text + '\n' +
                "date:" + date + '\n' +
                "location:" + location.getLongitude() + "," + location.getLatitude() + '\n' +
                "friends tagged in this post:" + taggedFriends.toString() + '\n' +
                "Video:"+ videoFilename + '\n' +
                "Video Duration" + videoDuration+ '\n');
    }

    }
