public class Hotel{
    Quarto[] quartos;
    
    public Hotel(){
        this.quartos = new Quarto[10];
    }
    
    public void addQuarto(Quarto q){
        boolean adicionado = false;
        for(int i = 0; i < quartos.length; i++){
            if(quartos[i] == null){
                quartos[i] = q;
                adicionado = true;
                System.out.println("\nQuarto " + q.getNumero() + " adicionado com sucesso!\n");
                break;
            }
        }
        
        if(!adicionado){
            System.out.println("\nNao é possivel adicionar mais quartos!\n");
        }
    }
    
    public void reservarQuarto(int n){
        for(int i = 0; i < quartos.length; i++){
            if(quartos[i] != null && quartos[i].getNumero() == n){
                boolean reservado = quartos[i].reservar();
                
                if(reservado){
                    System.out.println("Quarto " + n + " reservado com sucesso!\n");
                    break;    
                } else{
                    System.out.println("Quarto " + n + " não pode ser reservado!\n");
                    break;
                }
            }
            
            if(i == quartos.length - 1){
                System.out.println("\nNão foi encontrado um quarto com esse numero!\n");
            }
        }
    }
    
    public void cancelarReserva(int n){
        for(int i = 0; i < quartos.length; i++){
            if(quartos[i] != null && quartos[i].getNumero() == n){
                boolean cancelado = quartos[i].cancelar();
                
                if(cancelado){
                    System.out.println("Reserva do Quarto " + n + " cancelada com sucesso!\n");
                    break;
                } else{
                    System.out.println("Reserva do Quarto " + n + " nao pode ser cancelada!\n");
                    break;
                }
            }
            
            if(i == quartos.length - 1){
                System.out.println("\nNão foi encontrado um quarto com esse numero!\n");
            }
        }
    }
    
    public void exibirQuartos(){
        for(int i = 0; i < quartos.length; i++){
            if(quartos[i] != null){
                System.out.println("\nQuarto " + (i+1));
                System.out.println(quartos[i].toString());
            }
        }
    }
    
}