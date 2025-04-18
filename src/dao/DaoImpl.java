package dao;

public class DaoImpl implements IDao {
    public double getData() {
        return Math.random() * 100; // ou Math.random() * 100;
    }
}
