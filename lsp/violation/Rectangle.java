package lsp.violation;

public class Rectangle {

	protected int width;
	protected int height;

	public Rectangle(int height , int width){
		this.height=height;
		this.width=width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

}
