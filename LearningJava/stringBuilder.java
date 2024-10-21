package LearningJava;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Bhutiya");
        System.out.println(sb);

        //! char at index 0

        System.out.println(sb.charAt(0));  

        //! set char at index 0

        sb.setCharAt(0, 'C');
        System.out.println(sb);

        //! to insert 

        sb.insert(7,'p');
        System.out.println(sb);

        //! to delete

        sb.delete(4, 8);
        System.out.println(sb);

        //! to append - to add element at last of the string

        sb.append(" C");
        sb.append("h");
        sb.append("a");
        sb.append("i");
        sb.append("y");
        sb.append("e");
        System.out.println(sb);
        //!  print length
        System.out.println(sb.length());
    }
}
