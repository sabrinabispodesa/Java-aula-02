import java.util.Scanner;

public class receita {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Para fazer uma macarronada servida em um prato ");

        String ingrediente1 = "1/2 Pacote de macarrão";
        String ingrediente2 = "1 pacote de molho de tomate";
        String ingrediente3 = "1 Litro de água";
        String ingrediente4 = "1 fio de óleo";
        String ingrediente5 = "1 colher de sal";
        String ingrediente6 = "1/4 de cebola ";
        String ingrediente7 = "1 dente de alho";
        String ingrediente8 = "1 pacote de queijo ralado";

        String utensilio1 = "Fogão";
        String utensilio2 = "Panela";
        String utensilio3 = "Concha";
        String utensilio4 = "Escorredor";
        String utensilio5 = "Faca";
        String utensilio6 = "Prato";

        System.out.println("É preciso ter em mãos os ingredientes seguinte: " + "\n" + ingrediente1 + "\n" + ingrediente2 +  "\n" + ingrediente3 + "\n" + ingrediente4 + "\n" + ingrediente5 +"\n" + ingrediente6 +  "\n" + ingrediente7 +  "\n" + ingrediente2  );

        System.out.println( "\n" + "                             " + "Com os igredientes em mãos, seguir a seguinte ordem:" + "                             " +  "\n");
        System.out.println("1 - Pegar a " + utensilio2 );
        System.out.println("2 - Colocar " + ingrediente3 + " na panela" );
        System.out.println ("3 - Adicionar " + ingrediente4 + " na panela");
        System.out.println ("4 - Adicionar " + ingrediente5 + " na panela");
        System.out.println ("5 - Ligar o " + utensilio1);
        System.out.println ("6 - Colocar a " + utensilio2 + " no " + utensilio1 + " até ferver " );
        System.out.println ("7 - Cortar " + ingrediente6 + " com a " + utensilio5);
        System.out.println ("8 - Cortar " + ingrediente7 + " com a " + utensilio5 );
        System.out.println ("9 - Adicionar " + ingrediente1 + " na panela");
        System.out.println ("10 - Aguardar o cozimento do macarrão por 15 minutos");
        System.out.println ("11 - Desligar o " + utensilio1);
        System.out.println ("12 - Escorrer " + ingrediente1);
        System.out.println ("13 - Colocar " + ingrediente1 + " no " + utensilio6);
        System.out.println ("14 - Ligar novamente o " + utensilio1);
        System.out.println ("15 - Colocar " + utensilio2 + " no " + utensilio1);
        System.out.println ("16 - Adicionar " + ingrediente4 + " na " + utensilio2);
        System.out.println ("17 - Refogar " + ingrediente6 + " na " + utensilio2);
        System.out.println ("18 - Refogar " + ingrediente7 + " na " + utensilio2 );
        System.out.println ("19 - Adicionar " + ingrediente2 + " na " + utensilio2);
        System.out.println ("20 - Desligar o fogo");
        System.out.println ("21 - Adicionar uma " + utensilio3 + " do molho do " + utensilio6 + " de macarrão" );

        System.out.println("\n" + " Quer queijo ralado? " + "\n");
            String queijo = scanner.nextLine();

        if (queijo.equalsIgnoreCase("sim")){
            System.out.println("Pegar " + ingrediente8);
            System.out.println("Abrir " + ingrediente8 + " com a " + utensilio5);
            System.out.println("Despejar " + ingrediente8);
             System.out.println("Sabrina " + ingrediente8);

        } else{
            System.out.println("Não adicionar" + ingrediente8);

        }




    }
}


// \n pula linha no print