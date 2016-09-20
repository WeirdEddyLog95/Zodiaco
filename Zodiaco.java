package Proceso;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import javax.swing.*;

public class Zodiaco {
	
	 public static void main(String[] args) {
		 //Commit 1, En el proyecto desarrollamos los atributos
		String Nombre;
		String Apellidos;
		int Edad;
		int NoControl;
		LocalDate FechaNacimiento = null;
		String signoZodiacal;
	 
	//Commit 2, Agregamos unos datos para los atributos y sacamos resultados
			Nombre= "Edgar";
			Apellidos="Rangel Aguayo";
			Edad= 20;
			NoControl=13490941;
			FechaNacimiento = LocalDate.of( 1995 , Month.NOVEMBER , 8);
			System.out.println("El resutaldo de lo siguiente es... \n" + "Nombre: " + Nombre + "\n" + "Apeliidos: " + 
			Apellidos + "\n" + "Numero de Control: "+ NoControl + "\n" + "Fecha de Nacimiento: " + FechaNacimiento);
			
			//Commit 3, Desarrollamos un Swicth para sacar un signo zodiacal
			switch(FechaNacimiento.getMonth()){
			case JANUARY:
					signoZodiacal = "Acuario";
					System.out.println("El signo zodiacal de " + Nombre + " es..." + signoZodiacal);
				break;
			case FEBRUARY:
				signoZodiacal = "Piscis";
				System.out.println("El signo zodiacal de " + Nombre + " es..." + signoZodiacal);
				break;
			case MARCH:
				signoZodiacal = "Aries";
				System.out.println("El signo zodiacal de " + Nombre + " es..." + signoZodiacal);
				break;
			case APRIL:
				signoZodiacal = "Tauro";
				System.out.println("El signo zodiacal de " + Nombre + " es..." + signoZodiacal);
				break;
			case MAY:
				signoZodiacal = "Geminis";
				System.out.println("El signo zodiacal de " + Nombre + " es..." + signoZodiacal);
				break;				
			case JUNE:
				signoZodiacal = "Cancer";
				System.out.println("El signo zodiacal de " + Nombre + " es..." + signoZodiacal);
				break;
			case JULY:
				signoZodiacal = "Leo";
				System.out.println("El signo zodiacal de " + Nombre + " es..." + signoZodiacal);
				break;
			case AUGUST:
				signoZodiacal = "Virgo";
				System.out.println("El signo zodiacal de " + Nombre + " es..." + signoZodiacal);
				break;
			case SEPTEMBER:
				signoZodiacal = "Libra";
				System.out.println("El signo zodiacal de " + Nombre + " es..." + signoZodiacal);
				break;
			case OCTOBER:
				signoZodiacal = "Escorpio";
				System.out.println("El signo zodiacal de " + Nombre + " es..." + signoZodiacal);
				break;
			case NOVEMBER:
				signoZodiacal = "Sagitario";
				System.out.println("El signo zodiacal de " + Nombre + " es..." + signoZodiacal);
				break;
			case DECEMBER:
				signoZodiacal = "Capricornio";
				System.out.println("El signo zodiacal de " + Nombre + " es..." + signoZodiacal);
				break;			
			}
	 }
}
