public class Animal{
	private String name;
	
	public Animal()
	{
		
	}
	
	public Animal(String name)
	{
		this.name = name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void makeSound() {
		System.out.println(name+"is an animal");
	}
	
	
}
