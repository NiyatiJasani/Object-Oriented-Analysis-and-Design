package lsp.violationtest;

import lsp.violation.Rectangle;
import lsp.violation.Square;

public class TestShape {
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(30, 20);
		Square square = new Square(25);
		
		ShouldNotChangWidthWhen_HeightChanges(rectangle);
		ShouldNotChangWidthWhen_HeightChanges(square);;
			
		}

	private static void ShouldNotChangWidthWhen_HeightChanges(Rectangle rectangle) {
	int currentwidth = rectangle.getWidth();
	System.out.println("Before the width is: "+currentwidth);
		rectangle.setHeight(21);
		
		int widthAfterChange = rectangle.getWidth();
		System.out.println("After change width is: " + widthAfterChange);
		
	}
		
		

		
		
	}


