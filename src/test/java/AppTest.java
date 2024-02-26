
import Util.HibernateUtils;
import dao.HomeTaskDAOImpl;
import dao.WorkTaskDAOImpl;
import entity.HomeTask;
import entity.WorkTask;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public class AppTest {


    private EntityManager entityManager = HibernateUtils.getEntityManager();

    private WorkTaskDAOImpl workTaskDAO = new WorkTaskDAOImpl(entityManager);
    private HomeTaskDAOImpl homeTaskDAO = new HomeTaskDAOImpl(entityManager);




    @Test
    public void createHomeTaskTest(){
        HomeTask testHomeTask = MockUtils.getHomeTask();
        long before = getDataBaseCount(entityManager,testHomeTask);
        homeTaskDAO.create(testHomeTask);
        long after = getDataBaseCount(entityManager,testHomeTask);

        Assert.assertNotEquals(before,after);
    }
    @Test
    public void deleteHomeTaskTest(){
        HomeTask testHomeTask = MockUtils.getHomeTask();
        homeTaskDAO.create(testHomeTask);
        long before = getDataBaseCount(entityManager,testHomeTask);
        homeTaskDAO.delete(testHomeTask.getId());
        long after = getDataBaseCount(entityManager,testHomeTask);

        Assert.assertNotEquals(before,after);
    }


    @Test
    public void createWorkTaskTest(){
        WorkTask testWorkTask = MockUtils.getWorkTask();
        long before = getDataBaseCount(entityManager,testWorkTask);
        workTaskDAO.create(testWorkTask);
        long after = getDataBaseCount(entityManager,testWorkTask);

        Assert.assertNotEquals(before,after);
    }
    @Test
    public void deleteWorkTaskTest(){
        WorkTask testWorkTask = MockUtils.getWorkTask();
        workTaskDAO.create(testWorkTask);
        long before = getDataBaseCount(entityManager,testWorkTask);
        workTaskDAO.delete(testWorkTask.getId());
        long after = getDataBaseCount(entityManager,testWorkTask);

        Assert.assertNotEquals(before,after);
    }



    public static long getDataBaseCount(EntityManager entityManager, Object obj) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Long> criteriaQuery = criteriaBuilder.createQuery(Long.class);
        criteriaQuery.select(criteriaBuilder.count(criteriaQuery.from(obj.getClass())));
        return entityManager.createQuery(criteriaQuery).getSingleResult();
    }

}
