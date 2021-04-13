import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int quantidadeDvd;
        int tipoAssociado;
        int quantidadeCupons=0;
        int finalSemana;
        float total;
        float acrescimoFimSemana=0;
        float descontoAssociado=0;
        float descontoCupons=0;
        float imposto;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quantos DVDs");
        quantidadeDvd = teclado.nextInt();

        total = quantidadeDvd * 4.25f;
        System.out.printf("Total %5.2f\n", total);// formatando com duas casas depois so separador e 5 números antes

        System.out.println("É final de semana?");
        System.out.println("1 = SIM");
        System.out.println("2 = NÃO");
        finalSemana=teclado.nextInt();

        // se for final de semana devemos acrescentar
        // .25 por DVD
        if (finalSemana == 1) {
            acrescimoFimSemana = quantidadeDvd * 0.25f;
        }

        total = total + acrescimoFimSemana;
        System.out.printf("Total %5.2f\n", total);// formatando com duas casas depois so separador e 5 números antes

        System.out.println("Qual tipo de Associado");
        System.out.println("1 = Elite");
        System.out.println("2 = VVIP");
        System.out.println("3 = VIP");
        System.out.println("4 = Regular.");
        tipoAssociado = teclado.nextInt();

        // vamos identificar o desconto de membro
        switch (tipoAssociado) {
            case 1:
                descontoAssociado = 0.25f * quantidadeDvd;
                break;
            case 2:
                descontoAssociado = 0.20f * quantidadeDvd;
                break;
            case 3:
                descontoAssociado = 0.15f * quantidadeDvd;
                break;
            case 4:
                descontoAssociado = 0.10f * quantidadeDvd;
                break;
            default:
            System.out.println("Opção inválida");
        }
        total = total - descontoAssociado;
        System.out.printf("Total %5.2f\n", total);// formatando com duas casas depois so separador e 5 números antes

        System.out.println("Quantos cupons?");
        quantidadeCupons = teclado.nextInt();
        //calcular o desconto dos cupons
        if(quantidadeCupons<=10){
            descontoCupons = quantidadeCupons * 0.05f;
        }else if(quantidadeCupons>10){
            descontoCupons = 10 * 0.05f;
        }
        total = total - descontoCupons;
        System.out.printf("Total....: %5.2f\n",total);//formatando com duas casas depois so separador e 5 números antes
        
        imposto = total * 0.1f;
        System.out.printf("Imposto..: %5.2f\n", imposto);// formatando com duas casas depois so separador e 5 números antes        

        total = total + imposto;
        System.out.printf("Total....: %5.2f\n", total);// formatando com duas casas depois so separador e 5 números antes

        teclado.close();
    }
}