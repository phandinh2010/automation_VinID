package MyMath;

public class Vector {
	
	public Vector(float x, float y) {
		this.x = x;
		this.y = y;
	}
	public float x;
	public float y;
	
	@Override
	public String toString() {
		return "Vector [x=" + x + ", y=" + y + "]";
	}

}
