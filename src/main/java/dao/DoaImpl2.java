package dao;

import org.springframework.stereotype.Component;

@Component("dao2")
public class DoaImpl2 implements IDao{
    public double getData()
    {
        System.out.println("Version SERVICE WEB");
        double data=55;
        return data;

    }
}
