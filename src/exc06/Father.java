package exc06;

public class Father extends Man {
	
	public String exibeJovemOuIdoso(String idade){
		String edad = super.isOld(Integer.valueOf(idade))? "Idoso":"Jovem";
		return edad;
		
	}

}
