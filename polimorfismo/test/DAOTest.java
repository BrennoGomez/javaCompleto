package polimorfismo.test;

import polimorfismo.classes.ArquivoDAOImpl;
import polimorfismo.classes.DatabaseDAO;
import polimorfismo.classes.GenericDAO;

import java.util.LinkedList;
import java.util.List;

public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new DatabaseDAO();
        arquivoDAO.save();

        List<String> listaDeNomes = new LinkedList<>();
        listaDeNomes.add("João");
        listaDeNomes.add("João Pedro");
        listaDeNomes.add("João Lucas");
        listaDeNomes.add("João Matheus");
        listaDeNomes.add("João Carlos");
        listaDeNomes.add("João Rodolfo");

        for (String nome : listaDeNomes){
            System.out.println(nome);
        }
    }
}
