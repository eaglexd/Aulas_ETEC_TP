
package aula01;

import java.util.Scanner;

public class aula_0405 {


    public static void main(String[] args) {
        // EXERCICIO 1 ------------------------------------------------ //
        Scanner teclado = new Scanner(System.in);
        String nome,nome1;
        double nota1,nota2,nota3,nota4,media,basetri,alttri,areatri,qualado,quaarea,peso,alturaimc,imc,km,mi,meses,dias;
        int tabuada,x1,x2,x3,x4,x5,x6,x7,x8,x9,x10;
        
        System.out.println("Digite seu nome: ");
        nome = teclado.next();
        System.out.println("Olá "+nome+" seja bem vindo!!");
        
       // EXERCICIO 2 ------------------------------------------------ //
       
        System.out.println("Digite o nome do aluno: ");
        nome1 = teclado.next();
        System.out.println("Digite sua primeira nota: ");
        nota1 = teclado.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        nota2 = teclado.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        nota3 = teclado.nextDouble();
        System.out.println("Digite sua quarta nota: ");
        nota4 = teclado.nextDouble();
        
        media = (nota1+nota2+nota3+nota4)/4;
        
        System.out.println("Sua média geral é: "+media);
        
        // EXERCICIO 3 ------------------------------------------------ //
        
        System.out.println("Tabuada de qual número deseja saber? ");
        tabuada = teclado.nextInt();
        x1 = tabuada*1;
        x2 = tabuada*2;
        x3 = tabuada*3;
        x4 = tabuada*4;
        x5 = tabuada*5;
        x6 = tabuada*6;
        x7 = tabuada*7;
        x8 = tabuada*8;
        x9 = tabuada*9;
        x10 = tabuada*10;
        
        System.out.println("A Tabuada deste número é: ");
        System.out.println(tabuada+" X 1= "+x1);
        System.out.println(tabuada+" X 2= "+x2);
        System.out.println(tabuada+" X 3= "+x3);
        System.out.println(tabuada+" X 4= "+x4);
        System.out.println(tabuada+" X 5= "+x5);
        System.out.println(tabuada+" X 6= "+x6);
        System.out.println(tabuada+" X 7= "+x7);
        System.out.println(tabuada+" X 8= "+x8);
        System.out.println(tabuada+" X 9= "+x9);
        System.out.println(tabuada+" X 10= "+x10);
        
    // EXERCICIO 4A ------------------------------------------------ //    
    
        System.out.println("Qual a medida da base do triangulo?");
        basetri = teclado.nextDouble();
        System.out.println("Qual a medida da altura do triangulo?");
        alttri = teclado.nextDouble();
        
        areatri = (basetri*alttri)/2;
        System.out.println("A área do triangulo é: "+areatri);
    
    // EXERCICIO 4B ------------------------------------------------ // 
    
        System.out.println("Qual a medida do lado do quadrado?");
        qualado = teclado.nextDouble();
        
        quaarea = Math.pow(qualado, 2);
        System.out.println("A área do quadrado é: "+quaarea);
        
    
    // EXERCICIO 4C ------------------------------------------------ // 
        
        System.out.println("Qual seu peso?");
        peso = teclado.nextDouble();
        System.out.println("Qual sua altura?");
        alturaimc = teclado.nextDouble();
        
        imc = peso/alturaimc;
        
        System.out.println("Seu IMC é : "+imc);
        
     // EXERCICIO 4D ------------------------------------------------ //
     
        System.out.println("Quantos KM você quer converter para MI?");
        km = teclado.nextDouble();
        
        mi= km/1.60934;
        
        System.out.println("São "+mi+" Milhas");
        
     // EXERCICIO 5 ------------------------------------------------ //
     
        System.out.println("Quantos meses você quer converter?");
        meses = teclado.nextDouble();
        
        dias = meses * 30.4167;
        
        System.out.println("São "+dias+" Dias");

        
        
    }
    
}
