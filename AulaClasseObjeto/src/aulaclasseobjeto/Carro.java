
package aulaclasseobjeto;


public class Carro {
    //Variáveis da classe (Atributos)
    //public = nível de acesso público, ou seja, de qualquer outra classe.
    //String = classe java que manipula um conjunto de caracteres.
    public String marca;
    public String modelo;
    public int chassi;
    public int ano;
    
    //Método da Classe
    public void partida() {
        System.out.println("Carro andando...");
    }
    
    public void parada() {
        System.out.println("Carro parado!");
    }
    
    public boolean revisao() {
        boolean resposta = ano < 2018 ? true : false;
        return resposta;
    }
    
    // '+' em Java tem 2 funcionalidades: concatenar (juntar) e soma:
    // String + int || String + String || String + double ... --> concatena
    // int + int --> soma (2 valores numéricos - long, double)
    public String informacoes() {
        String resposta = 
            "- Marca: " + marca +
            "\n- Modelo: " + modelo +
            "\n- Chassi: " + chassi +
            "\n- Ano: " + ano;
        
        return resposta;
    }
}
