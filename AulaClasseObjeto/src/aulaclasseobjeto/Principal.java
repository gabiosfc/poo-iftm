
package aulaclasseobjeto;


public class Principal {


    public static void main(String[] args) {
        
        Carro gol = new Carro();
        gol.marca = "VolksWagem";
        gol.modelo = "G4";
        gol.chassi = 988945516;
        gol.ano = 2014;
        
        gol.partida();
        String resposta = gol.revisao() ? "Realizar revisao" : 
                                          "Revisao está em dia";
        System.out.println("Revisao: " + resposta);
        
        System.out.println("Informacoes do carro: \n" + gol.informacoes());
        gol.parada();
        
    }
    
}
