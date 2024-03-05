package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{
    //INJECTION DES DEPENDANCE AVEC SPRING
    //@Autowired
    private IDao dao;
   public MetierImpl(@Qualifier("dao") IDao dao) {
        this.dao = dao;
    }
    @Override
    public double calcul()
    {
        double data=dao.getData();
        double res=data*11.4;
        return res;
    }
    public void setDao(IDao dao)
    {
        this.dao=dao;
    }
}
