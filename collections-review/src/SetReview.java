import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {

        //create a set
        Set<Student> mySet = new HashSet<>();

        // add element
        mySet.add(new Student(7,"Tim"));
        mySet.add(new Student(8,"Johny"));
        mySet.add(new Student(9,"muhammad"));
        mySet.add(new Student(9,"muhammad"));

        System.out.println(mySet);

        Set<Integer> numSet = new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        System.out.println(numSet);
        System.out.println(numSet.add(2));

        //Printing the Repeating char
        System.out.println("first repeating: " + firstRepeatingChar("java developer"));
    }

    public static Character firstRepeatingChar(String str){
        //Create a hashmap
        Set<Character> chars = new HashSet<>();

        //Iteration return char if add returns false
        for (Character ch:str.toCharArray()) if(!chars.add(ch)) return ch;
        return null;
    }

}
