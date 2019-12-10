public class addingNamesLength {
    public static void main (String args []){

        addingNamesLength ahad=new addingNamesLength();

        ahad.length();
        ahad.name();


    }
    public void length(){
        String friends="people have good friends";
        System.out.println("length of string friends is "+friends.length());
    }

    public void name(){
        String lastName,firstName, fullName;
        lastName="khan";
        firstName="ali";
        fullName=lastName+firstName;
        System.out.println("full name of one of your friends is "+fullName);
    }
}
