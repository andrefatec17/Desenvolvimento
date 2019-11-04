package exc11;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex11 {
	public static void main(String[] args) {
		double num = 1.999;
		BigDecimal x = BigDecimal.valueOf(num);
		//x.setScale(2, RoundingMode.DOWN);
		//System.out.println(x);
		System.out.println(x.setScale(2, RoundingMode.DOWN));
		
	}	

}
