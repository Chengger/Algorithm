
public class Clone implements Cloneable {
	  
	public static void main(String[] args) throws CloneNotSupportedException {
		person p = new person(20, "tom");
		person p1 = (person) p.clone();
		p1.setAge(22);
		p1.setName("jerry");
		System.out.println("p.age:"+p.age+"---"+"p.name:"+p.name);
 	}
}
class person implements Cloneable{
	int age;
	String name;
	@Override  

    public Object clone() throws CloneNotSupportedException {  

        return super.clone();  

     }
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	public person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
}