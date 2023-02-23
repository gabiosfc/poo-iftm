
package exercicio1poo;


public class Promotor {
    
    public String nomeEvento;
    public String nomePromotor;
    public String localEvento;
    public String dataEvento;
    public String atracoes;
    public double valorIngresso;
 
    public String informacoes(){
        
        String informacoes = 
        "            " + nomeEvento +
        "\nData de realizacao: " + dataEvento +
        "\nLocal: " + localEvento +
        "\nValor: R$ " + valorIngresso +
        "\nAtracoes: " + atracoes +
        "\nUma realizacao " + nomePromotor + " realizacoes";
        
        return informacoes;
    }
    
}
