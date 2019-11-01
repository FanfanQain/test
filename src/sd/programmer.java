package sd;
abstract class employee {
	public abstract void info();
}
public class programmer extends employee{
		public void info(){
			System.out.println("he is a programmer");
		}
	public static void main(String[] args) {
		employee e=new programmer();
		e.info();
	}
}