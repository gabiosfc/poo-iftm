package familia;

public class Principal {


    public static void main(String[] args) {
	
        Familia henrique = new Familia();
        henrique.pais = "Clerida e Wanderley";
        henrique.filhos = "Ana Luiza";
        henrique.nome = "Henrique";
        henrique.ano = 1996;
	
        System.out.println(henrique.mostrarInformacoes());
        System.out.println("Idade: " + (henrique.calcularIdade(henrique.ano)));

		
        Familia gabriela = new Familia();
        gabriela.pais = "Marcelo e Luiza";
        gabriela.filhos = "Ana Luiza";
        gabriela.nome = "Gabriela";
        gabriela.ano = 1993;
	
        System.out.println(gabriela.mostrarInformacoes());
        System.out.println("Idade: " + (gabriela.calcularIdade(gabriela.ano)));
		
		
        Familia marcelo = new Familia();
        marcelo.pais = "Miroel e Neide";
        marcelo.filhos = "Mariana e Gabriela";
        marcelo.nome = "Marcelo";
        marcelo.ano = 1967;
	
        System.out.println(marcelo.mostrarInformacoes());
        System.out.println("Idade: " + (marcelo.calcularIdade(marcelo.ano)));
	
        
    }
    
}