package dao;

import dao.interfaces.DAOWorkTask;
import entity.WorkTask;

import javax.persistence.EntityManager;

public class WorkTaskDAOImpl extends DAOImpl<WorkTask> implements DAOWorkTask {


    public WorkTaskDAOImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public void create(WorkTask obj) {
        super.create(obj);
    }

    @Override
    public WorkTask read(int id) {
        return super.read(id);
    }

    @Override
    public WorkTask update(int id, WorkTask obj) {
        return super.update(id, obj);
    }

    @Override
    public void delete(int id) {
        super.delete(id);
    }


    @Override
    public Class<WorkTask> getEntityClass() {
        return WorkTask.class;
    }
}