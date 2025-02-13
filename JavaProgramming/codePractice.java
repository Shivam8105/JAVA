package JavaProgramming;

public class codePractice {
    private String name;
    private int age;

    public String getName(){
       return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
    }

    public static void main(String[] args) {
        codePractice obj1 = new codePractice();
        obj1.setName("Shivam kumar");
        System.out.println(obj1.getName());
        obj1.setAge(20);
        System.out.println(obj1.getAge());
    }
}

