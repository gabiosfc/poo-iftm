package famarcia;

public class Farmacia {
    
    public String nomeMedicamento;
    public String tarja;
    public String concentracao;
    public int quantidade;
    public double valor;
 
    public String mostrarInformacoes(){
		
        String informacoes = 
        "\nNome do medicamento: " + nomeMedicamento +
        "\nTarja: " + tarja +
        "\nConcentracao: " + concentracao +
        "\nQuantidade: " + quantidade + 
		"\nValor Unitario: R$ " + valor;
        
        return informacoes;
       
    }
	
    public boolean receita() {
        boolean resposta = tarja.equals("preta") || tarja.equals("vermelha") ? true : false;
        return resposta;
    }
	
	
	public double calcularValorTotal(int quantidade, double valor){
		
		double valorTotal = valor * quantidade;
		
		return valorTotal;
	}
	
}