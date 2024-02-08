package java1;
import java.util.*;
public class Java1 {

    public static void main(String[] args) {
        // TODO code application logic here
       Scanner pregunta = new Scanner(System.in);
		int num_inicio, num_final;
                
		System.out.println("¿En que numero quieres iniciar?");
			num_inicio = pregunta.nextInt();
		System.out.println("¿En qué numero quieres finalizar?");
			num_final = pregunta.nextInt();
		muestra_numeros(num_inicio,num_final);
		pregunta.close();
	}

	static void muestra_numeros (int inicio, int ultimo) {
		for (int num = inicio; num!=ultimo+1; num++){
			System.out.print(num + ",");    
                }             
        }

    }