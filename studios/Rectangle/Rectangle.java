package Rectangle;

public class Rectangle {
	private int length;
	private int width;
	
	//constructor
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	//get width
	public int getWidth()
	{
		return this.width;
	}
	//get length
	public int getLength()
	{
		return this.length;
	}
	//calculate area
	public int getArea()
	{
		return this.length * this.width;
	}
	//calculate perimeter
	public int getPeri()
	{
		return this.length * 2 + this.width * 2;
	}
	//compare size to another rectangle, given area
	public boolean isLarger(int area)
	{
		if(this.getArea() > area)
		{
			return true; 
		}
		else
		{
			return false;
		}
	}
	//indicate whether square
	public boolean isSquare()
	{
		if(this.width == this.length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//toString
	public String toString()
	{
		return "Width: " + this.width + " Length: " + this.length;
	}
	
	public static void main(String args[])
	{
		Rectangle Rectangle1 = new Rectangle(4, 4);
		Rectangle Rectangle2 = new Rectangle(4, 9);
		System.out.println(Rectangle1.isLarger(Rectangle2.getArea()));
		System.out.println(Rectangle1.isSquare());
	}
}
