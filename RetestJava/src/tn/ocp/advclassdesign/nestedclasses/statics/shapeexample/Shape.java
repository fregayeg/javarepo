package tn.ocp.advclassdesign.nestedclasses.statics.shapeexample;

import java.util.HashSet;
import java.util.Set;

public class Shape {
	
	private static class Color {
		
		int m_red, m_green, m_blue;
		
		public Color() {
			this(0,0,0);
		}

		public Color(int red, int green, int blue) {
			m_red = red;
			m_green = green;
			m_blue = blue;
		}

		@Override
		public String toString() {
			return "Color [m_red=" + m_red + ", m_green=" + m_green + ", m_blue=" + m_blue + "]";
		}
	}
	
	private static class Flag extends Shape {

		public Flag(Set<Color> pColors, String pName) {
			super(pColors, pName);
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Flag [name = " + name + ", colors = " + colors + "]";
		}		
	}
	
	// FIELDS
	protected final Set<Color> colors;
	protected final String name;
	
	public Shape(Set<Color> pColors, String pName) {
		colors = pColors;
		name = pName;
	}
	
	
	@Override
	public String toString() {
		return "Shape [colors=" + colors + ", name=" + name + "]";
	}


	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args) {
				
		Shape.Color white = new Color(255,255,255);
		//System.out.println("White color has values: " + white);
		
		Shape.Color black = new Color();
		//System.out.println("White color has values: " + black);	
		
		Set<Color> colors = new HashSet<>();
		colors.add(white);
		colors.add(black);
		
		Flag flag = new Flag(colors, "CSS");
		System.out.println(flag);
	}
}
