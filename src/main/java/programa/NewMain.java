package programa;

import java.util.Scanner;
public class NewMain {
    public static void main(String[] args) {
        double peso = 0, estatura = 0, imc =0;
        Scanner sc = new Scanner(System.in);        
        System.out.println("Ingrese su peso en Kg.");
        peso = sc.nextDouble();
        System.out.println("Ingrse la estatura en metros.");
        estatura = sc.nextDouble();        
        imc = peso / Math.pow(estatura,2);        
        System.out.println("Su IMC es: "+imc);
        if(imc <= 18.5){
            System.out.println("Peso bajo .");
        }else if(imc > 18.5 && imc <= 24.9){
            System.out.println("Peso normal");
        }else if(imc >=25.0 && imc <= 29.9){
            System.out.println("Sobrepeso");
        }else if(imc > 30){
            System.out.println("Obeso");
        }
    }
}
