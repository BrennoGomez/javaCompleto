package polimorfismo.classes;

public class DatabaseDAO implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Salvando dados no banco de dados");
    }
}
