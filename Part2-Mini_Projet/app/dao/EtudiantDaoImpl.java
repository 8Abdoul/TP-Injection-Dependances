package app.dao;


public class EtudiantDaoImpl implements EtudiantDao {
    @Override
    public String getEtudiantNomById(int id) {
        if (id == 1) return "Amadou";
        if (id == 2) return "Nadia";
        return "Inconnu";
    }
}
