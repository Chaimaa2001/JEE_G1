package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData()
    {
        System.out.println("Version Base De Donnée");
        double date=34;
        return date;
    }
}
