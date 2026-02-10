class MyEmployee {
    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public void setId(int i) {
        this.id = i;
    }

    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }
}
public class GetterAndSetter {
    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee();
        // emp.id = 101;
        // emp.name = "Ashish Raj";
        emp.setId(101);
        emp.setName("Ashish Raj");


        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        
    }
}
