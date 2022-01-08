package source;

import java.util.ArrayList;

import source.model.Cliente;
import source.model.EnumTipo;
import source.model.Quarto;
import source.model.Recepcionista;

public class App {
    public static void main(String[] args) {
        System.out.println("Hotel Java\n");

        Cliente cliente1 = new Cliente("Manoel", "24992345262", "03001924701", 42);
        
        Recepcionista recepcionista1 = new Recepcionista("Valéria", "22999998888", "123456789");
        recepcionista1.atenderTelefone();
        recepcionista1.falarIngles();
        Quarto quarto1 = new Quarto("306A", 100.0, EnumTipo.BASICO);
        System.out.println(quarto1.getTipo()); //BASICO
        System.out.println(quarto1.getTipo().getValor()); //Básico

        Cliente cliente2 = new Cliente("Fulano de Tal", "24992345262", "03001924701",21);
        Cliente cliente3 = new Cliente("Ciclano Rodrigues", "24992515262", "03054541701", 36);
        Cliente cliente4 = new Cliente("Beltrano Rodrigues", "242345125262", "0305824701", 56);

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);

        //retorna a quanbtidade de elementos presentes em uma stream/coleção
        clientes.stream().count();
        clientes.size();

        //retorna uma nova lista com apenas 2 elementos
        clientes.stream().limit(2).forEach(c-> System.out.println(c.getNome()));;

        clientes.stream()
        .filter(c -> c.getNome().contains("Rodrigues"))
        .forEach(c -> System.out.println(c.getNome()));

        //pula os dois primeiros
        clientes.stream().skip(2);

        //retorna uma nova stream ordenada
        clientes.stream().sorted();

        // clientes.stream().sorted(comparing(Cliente::getIdade));

        // retorna todas as idades maiores que 25
        clientes.stream().filter(c -> c.getIdade() > 25);


    }

    
}
