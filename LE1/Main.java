public class Main
{
    
    public class Car
    {
        int speed;
        String name;
        
        void setSpeed(int speed){
            this.speed=speed; }
        
        void setName(String name){
            this.name=name; }
        
        int getSpeed(){
            return this.speed; }
    
        String getName(){
            return this.name; }

        }
	public static void main(String[] args) {
	    Main m1=new Main();
    Car c1=m1.new Car();
    c1.setName("Honda");
	c1.setSpeed(100);
	System.out.println(c1.getName() + " " + c1.getSpeed()); 
	}
}