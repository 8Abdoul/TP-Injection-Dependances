package app.dao;

public class FormateurDaoImpl implements FormateurDao {
    @Override
    public String getNomFormateurById(int id) {
        if (id == 1) return "Dr. Dia";
        if (id == 2) return "Mme Sow";
        return "Formateur inconnu";
    }
}
