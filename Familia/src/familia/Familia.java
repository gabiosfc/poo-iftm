package familia;

public class Familia {
    public String pais;
    public String filhos;
    public String nome;
    public int ano;
 
    public String mostrarInformacoes(){
		
        String informacoes = 
        "\nNome: " + nome +
        "\nAno: " + ano +
        "\nPais: " + pais +
        "\nFilhos: " + filhos
        ;
           
        return informacoes;
    }
	
    public int calcularIdade(int ano){

        int idade = 2023 - ano;

        return idade;
    }
}
