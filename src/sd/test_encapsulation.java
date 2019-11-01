package sd;

class EncapsulationDemo {
	private int id;
    private String name;
    private int age;

    public int getid(){
        return id;
    }

    public String getname(){
        return name;
    }

    public int getage(){
        return age;
    }

    public void setage(int newValue){
        age = newValue;
    }

    public void setname(String newValue){
        name = newValue;
    }

    public void setid(int newValue){
        id = newValue;
    }
}
public class test_encapsulation{
    public static void main(String args[]){
         EncapsulationDemo obj = new EncapsulationDemo();
         obj.setname("KRISTI");
         obj.setage(23);
         obj.setid(661981008);
         System.out.println("Name: " + obj.getname()+"\n"+"age: " + obj.getage()+"\n"+"id: " + obj.getid());

    } 

}
