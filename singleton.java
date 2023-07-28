package arrays;

public class singleton {
    private singleton()// private constructor so that it is not called by other
    {

    }

    private static singleton instance;

    public static singleton getinstance()// due to static we can acces this method
    // directly with the class name
    {
        // when this method is called 1st check whether only 1 object is created or not
        if (instance == null)// means no object created
        {
            // as object not created hence we will create object in this block
            instance = new singleton();// here object is created
            // and stord in instance variable private constructor can be called bcoz we are
            // in same file
        }

        return instance;
    }

    public static void main(String[] args) {
        singleton obj1 = singleton.getinstance();
        singleton obj2 = singleton.getinstance();
        // as we r not allowed to call the constructor therefore we cannot create object
        // here reference variable obj1 and obj2 is pointing to the same single object

    }
}
