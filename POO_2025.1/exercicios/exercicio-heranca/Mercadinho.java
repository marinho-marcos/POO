public class Mercadinho {
    private Cliente[] clientes;
    private int index;

    public Mercadinho(){
        clientes = new Cliente[3];
    }

    public void adicionarCliente(Cliente cliente){
        if(index < clientes.length){
            clientes[index++] = cliente;
        } else{
            System.out.println("\nImpossivel adicionar novo cliente");
        }
    }

    public void imprimirClientes(){
        for(int i = 0; i < index; i++){
            System.out.println(clientes[i].toString());
        }
    }

    public double CalcularTotal(){
        double total = 0;
        for(int i = 0; i < index; i++){
            total += clientes[i].calcularPagamento();
        }

        return total;
    }
}
