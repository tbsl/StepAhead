package util;

import java.io.IOException;

public class util2 {

	public static void main(String[] args) throws IOException {
		String data=Excelhandler.readCell(12,7);
		String[] outputvalues = data.split(",");
		String raw_row=outputvalues[0];
		System.out.println("RAW_ROW"+raw_row);
		String raw_col=outputvalues[1];
		
		/*int a=Integer.parseInt(raw_row);
		int b=Integer.parseInt(raw_col);*/
		
		int a=Integer.parseInt(outputvalues[0]);
		int b=Integer.parseInt(outputvalues[1]);
		System.out.println("dp"+a);
		System.out.println("dp"+b);
	}

}
