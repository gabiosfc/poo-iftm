package famarcia;


public class Principal {


    public static void main(String[] args) {
	
        Farmacia drogaLider = new Farmacia();
        drogaLider.nomeMedicamento = "DOSS vitamina D";
        drogaLider.tarja = "vermelha";
        drogaLider.concentracao = "15.000 UI";
        drogaLider.quantidade = 2;
        drogaLider.valor = 13.90;

        System.out.println(drogaLider.mostrarInformacoes());
        
        String resposta = drogaLider.receita() ? "Sim" : "Nao";
        System.out.println("Exigir receita? " + resposta);
		
        double valorTotal = drogaLider.calcularValorTotal(drogaLider.quantidade, drogaLider.valor);
        System.out.println("Valor Total = R$ " + valorTotal);
        System.out.println("\n");
		
		
		
        Farmacia nacional = new Farmacia();
        nacional.nomeMedicamento = "Dipirona";
        nacional.tarja = "branca";
        nacional.concentracao = "500 mg";
        nacional.quantidade = 3;
        nacional.valor = 5.69;

        System.out.println(nacional.mostrarInformacoes());
        
        String resposta1 = drogaLider.receita() ? "Sim" : "Nao";
        System.out.println("Exigir receita? " + resposta1);
		
        double valorTotal1 = nacional.calcularValorTotal(nacional.quantidade, nacional.valor);
	System.out.println("Valor Total = R$ " + valorTotal1);
        System.out.println("\n");
		
        
		
        Farmacia drogasil = new Farmacia();
        drogasil.nomeMedicamento = "Rivotril";
        drogasil.tarja = "preta";
        drogasil.concentracao = "0.25 mg";
        drogasil.quantidade = 1;
        drogasil.valor = 79.90;

        System.out.println(drogasil.mostrarInformacoes());
        
        String resposta2 = drogasil.receita() ? "Sim" : "Nao";
        System.out.println("Exigir receita? " + resposta2);
		
        double valorTotal2 = drogasil.calcularValorTotal(drogasil.quantidade, drogasil.valor);
        System.out.println("Valor Total = R$ " + valorTotal2);
        System.out.println("\n");

		
		
        Farmacia drogariaSaoPaulo = new Farmacia();
        drogariaSaoPaulo.nomeMedicamento = "Neosaldina";
        drogariaSaoPaulo.tarja = "branca";
        drogariaSaoPaulo.concentracao = "1 g";
        drogariaSaoPaulo.quantidade = 4;
        drogariaSaoPaulo.valor = 29.99;

        System.out.println(drogariaSaoPaulo.mostrarInformacoes());
        
        String resposta3 = drogariaSaoPaulo.receita() ? "Sim" : "Nao";
        System.out.println("Exigir receita? " + resposta3);
		
        double valorTotal3 = drogariaSaoPaulo.calcularValorTotal(drogariaSaoPaulo.quantidade, drogariaSaoPaulo.valor);
        System.out.println("Valor Total = R$ " + valorTotal3);
        System.out.println("\n");

  
    }
    
}
