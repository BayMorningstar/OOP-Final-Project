package MainPackages;
import java.util.Date;
public class ImagePost extends TextPost{

    private final String imageFilename;
    private final String imageResolution;

    public ImagePost(Date date, String text, double x, double y, String args, String imageFilename, String imageResolution) {
        super(date, text, x, y, args);
        this.imageFilename = imageFilename;
        this.imageResolution = imageResolution;
    }

    public void printFormat() {
        System.out.println( text + '\n' +
                "date:" + date + '\n' +
                "location:" + location.getLongitude() + "," + location.getLatitude() + '\n' +
                "friends tagged in this post:" + taggedFriends.toString() + '\n' +
                "Image:"+ imageFilename + '\n' +
                "Image resolution" + imageResolution+ '\n');

    }
}
