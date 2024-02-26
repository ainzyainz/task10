package dao;

import dao.interfaces.DAOTask;
import entity.Task;

import javax.persistence.EntityManager;

public class TaskDAOImpl extends DAOImpl<Task> implements DAOTask {


    public TaskDAOImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public void create(Task obj) {
        super.create(obj);
    }

    @Override
    public Task read(int id) {
        return super.read(id);
    }

    @Override
    public Task update(int id, Task obj) {
        return super.update(id, obj);
    }

    @Override
    public void delete(int id) {
        super.delete(id);
    }


    @Override
    public Class<Task> getEntityClass() {
        return Task.class;
    }
}
