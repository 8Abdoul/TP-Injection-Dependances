package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; // ➤ Déclaration de IDao ici

    // Injection utilisant setter
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return dao.getData() * 2;
    }
}
