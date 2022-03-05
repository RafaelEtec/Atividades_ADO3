package ADO3_Atividades;
import java.util.Scanner;
/** Dados 3 valores (possíveis lados) verificar se eles formam um triângulo, e em caso
positivo, dizer se é equilátero, isósceles ou escaleno;
**/
public class Segunda {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Será pedido à você três valores\n"
                + "Para que seja formado um triângulo, É necessário inserir três valores positivos\n"
                + "Insira o Primeiro valor");
        double valUm = ent.nextDouble();
        System.out.println("Insira o Segundo valor");
        double valDois = ent.nextDouble();
        System.out.println("Insira o Terceiro valor");
        double valTres = ent.nextDouble();
        
        String tri = "É um Triângulo ";
        String angulo = "";
        if (valUm <= 0 || valDois <= 0 || valTres <= 0) {
            System.out.println("Não é um triângulo, pois um ou mais valores são negativos ou nulos");
        } else {
            if (valUm == valDois && valDois == valTres) {
                angulo = "Equilátero";
            } else if (valUm == valDois || valUm == valTres || valDois == valTres){
                angulo = "Isósceles";
            } else {
                angulo = "Escaleno";
            }
            System.out.println(tri+angulo);
        }
    }
}