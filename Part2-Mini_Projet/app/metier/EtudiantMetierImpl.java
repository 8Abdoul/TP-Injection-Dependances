package app.metier;
import app.dao.EtudiantDao;

public class EtudiantMetierImpl implements EtudiantMetier {

    private EtudiantDao etudiantDao;

    public void setEtudiantDao(EtudiantDao etudiantDao) {
        this.etudiantDao = etudiantDao;
    }

    @Override
    public String afficherNomEtudiant(int id) {
        return "Nom de l'étudiant : " + etudiantDao.getEtudiantNomById(id);
    }
}