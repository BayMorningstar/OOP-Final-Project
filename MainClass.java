package MainPackages;

import MainPackages.Commands.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class MainClass {

    static Command[] avaliableCommands = new Command[]{
            new AddUser(),
            new RemoveUser(),
            new ListUser(),
            new SignIn(),
            new SignOut(),
            new UpdateProfile(),
            new Chpass(),
            new AddFriend(),
            new RemoveFriend(),
            new ListFriend(),
            new BlockUser(),
            new UnblockUser(),
            new ShowBlockedFriends(),
            new ShowBlockedUsers(),
            new AddPostText(),
            new AddPostImage(),
            new ShowPosts(),
            new AddPostVideo(),
            new RemoveLastPost(),
    };

    public static void readUserfromFile(String filename) throws FileNotFoundException {
        File fil = new File("users.txt");
        Scanner myObj = new Scanner(fil);
        while(myObj.hasNextLine()){
            String cLine = myObj.nextLine();
            cLine = "ADDUSER\t" + cLine;
            (new AddUser()).run(cLine.split("\t"));
        }

    }
    public static void main(String[] args) throws FileNotFoundException {
        readUserfromFile(args[0]);
        File fil = new File(args[1]);
        Scanner myObj = new Scanner(fil);
        while (myObj.hasNextLine()){
            System.out.println("Enter command");
            String userName = myObj.nextLine();
            String[] x = userName.split("\t");
            String command;
            command = x[0];

            for (Command cCommand: avaliableCommands) {
                if(cCommand.isCorrect(command)){
                    cCommand.run(x);
                    break;
                }
            }
        }
    }
}
