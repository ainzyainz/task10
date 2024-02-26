package dao;

import dao.interfaces.DAOHomeTask;
import entity.HomeTask;

import javax.persistence.EntityManager;

public class HomeTaskDAOImpl extends DAOImpl<HomeTask> implements DAOHomeTask {


    public HomeTaskDAOImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public void create(HomeTask obj) {
        super.create(obj);
    }

    @Override
    public HomeTask read(int id) {
        return super.read(id);
    }

    @Override
    public HomeTask update(int id, HomeTask obj) {
        return super.update(id, obj);
    }

    @Override
    public void delete(int id) {
        super.delete(id);
    }


    @Override
    public Class<HomeTask> getEntityClass() {
        return HomeTask.class;
    }
}
