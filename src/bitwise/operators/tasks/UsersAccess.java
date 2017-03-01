package bitwise.operators.tasks;

public class UsersAccess {

    final static int CREATE = 1; //0001
    final static int READ = 2;   //0010
    final static int UPDATE = 4; //0100
    final static int DELETE = 8; //1000

    public static void main(String[] args) {

        int mykolaAccessSet = CREATE | READ;
        int olegAccessSet = READ | UPDATE | DELETE;
        System.out.println(getUsersAccessSet(mykolaAccessSet));
        System.out.println(getUsersAccessSet(olegAccessSet));
    }

    private static String getUsersAccessSet(int usersAccessSet) {
        String result = "";

        if((usersAccessSet & CREATE) == CREATE)
            result += "CREATE ";
        if((usersAccessSet & READ) == READ)
            result += "READ ";
        if((usersAccessSet & UPDATE) == UPDATE)
            result += "UPDATE ";
        if((usersAccessSet & DELETE) == DELETE)
            result += "DELETE ";

        return result;
    }
}
