package app.service;

import app.dao.FormateurDao;

public class PlanningServiceImpl implements PlanningService {

    private FormateurDao formateurDao;

    // Injection via setter
    public void setFormateurDao(FormateurDao formateurDao) {
        this.formateurDao = formateurDao;
    }

    @Override
    public String afficherFormateur(int id) {
        return "Cours assuré par : " + formateurDao.getNomFormateurById(id);
    }
}
