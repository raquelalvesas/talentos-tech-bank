package dia12.Interfaces;

public interface Veiculo {

    default void metodoConcreto() {
        System.out.println("Método Concreto na Interface");
    }
}
