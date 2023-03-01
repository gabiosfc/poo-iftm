/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulagettersetter;

public class Teclado {
    
    private String modelo;
    private boolean wireless;
    private String tipo;
    
    //Método de retorno de variável
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    //Para gerar Getter e Setter caminho: source --> Insert Code (Alt + Insert) --> Selecionar opção desejada
    public String getWireless() {
        String resposta = wireless == true ? "Possui Wireless" : "Nao possui Wireless";
        return resposta;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public String getTipo() {
        if (tipo.equals("Mecânico")){
            return tipo + " regulamentado pela ANATEL";
        }
        
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equals("Membrana") || tipo.equals("Mecânico") || tipo.equals("Magnético")){
            this.tipo = tipo;
        } else {
            System.out.println("Tipo inexistente");
            System.out.println("Sistema se autodestruirá");
            System.exit(0);
        }
    }

    /*
    public Teclado(String modelo, boolean wireless, String tipo) {
        this.modelo = modelo;
        this.wireless = wireless;
        this.tipo = tipo;
    }
    */
    
    
}
