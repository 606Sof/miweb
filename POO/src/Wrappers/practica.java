package Wrappers;

public class practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = " 6 ";
		int numero = Integer.parseInt(a.trim());
		int num = Integer.valueOf("65").intValue();
		System.out.println(numero);
		System.out.println(num);
		char pa = '2';
		char pe = '0';
		Double decimal = (double) Character.getNumericValue(pa);
		Double dec = Double.parseDouble("23");
		Double decdec = Double.valueOf(pe).doubleValue(); //da error no se porque :")
		System.out.println(decimal + " " + dec);
		System.out.println(decdec);
	}

}
