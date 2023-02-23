
package exercicio1poo;


public class Principal {


    public static void main(String[] args) {
        Promotor inovation = new Promotor();
        inovation.nomeEvento = "Casamento";
        inovation.nomePromotor = "Everson";
        inovation.localEvento = "Chacaras Mamamia";
        inovation.dataEvento = "10/03/2023";
        inovation.atracoes = "KennyG";
        inovation.valorIngresso = 0.00;
        
        System.out.println(inovation.informacoes());
        System.out.println("\n");
        
        Promotor cellebration = new Promotor();
        cellebration.nomeEvento = "Formatura";
        cellebration.nomePromotor = "Isabela";
        cellebration.localEvento = "Espaco Cultural";
        cellebration.dataEvento = "18/12/2023";
        cellebration.atracoes = "Biquini Cavadao";
        cellebration.valorIngresso = 300.00;
        
        System.out.println(cellebration.informacoes());
        System.out.println("\n");
        
        Promotor festive = new Promotor();
        festive.nomeEvento = "Batizado";
        festive.nomePromotor = "Renato";
        festive.localEvento = "Igreja Matriz";
        festive.dataEvento = "19/06/2023";
        festive.atracoes = "Coral da Igreja";
        festive.valorIngresso = 10.00;
        
        System.out.println(festive.informacoes());
        System.out.println("\n");
        
    }
    
}
