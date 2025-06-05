public class Main{
    public static void main(String[] args){
        Mercadinho mercadinho01 = new Mercadinho();

        ClienteRegular c1 = new ClienteRegular("Marcos", 500);
        ClienteVip c2 = new ClienteVip("pedro", 700, "1122334455");
        ClienteOuroVip c3 = new ClienteOuroVip("Ana", 1200, "0012345", "Avenida Brasil");

        mercadinho01.adicionarCliente(c1);
        mercadinho01.adicionarCliente(c2);
        mercadinho01.adicionarCliente(c3);
        mercadinho01.adicionarCliente(c1);

        mercadinho01.imprimirClientes();

        System.out.println("Valor total da compra: " + mercadinho01.CalcularTotal());

    }
}