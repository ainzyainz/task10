import Util.HibernateUtils;
import dao.HomeTaskDAOImpl;
import dao.WorkTaskDAOImpl;
import entity.Address;
import entity.HomeTask;
import entity.WorkTask;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        Address address = Address.builder()
        .city("1")
        .street("1")
        .build();

        HomeTask homeTask = new HomeTask();

        homeTask.setName("1");
        homeTask.setDescription("1");
        homeTask.setAddress(address);

        EntityManager entityManager = HibernateUtils.getEntityManager();

        HomeTaskDAOImpl homeTaskDAO = new HomeTaskDAOImpl(entityManager);
        homeTaskDAO.create(homeTask);

        WorkTask workTask = new WorkTask();
        workTask.setName("2");
        workTask.setDescription("2");
        workTask.setCost(13);


        WorkTaskDAOImpl workTaskDAO = new WorkTaskDAOImpl(entityManager);

        workTaskDAO.create(workTask);



    }
}
