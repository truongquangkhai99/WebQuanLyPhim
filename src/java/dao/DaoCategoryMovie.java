/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import imp.IAction;
import java.util.List;
import model.CategoryMoive;
import org.hibernate.Session;

/**
 *
 * @author gaone
 */
public class DaoCategoryMovie implements IAction<CategoryMoive> {

    private Session session;

    public DaoCategoryMovie(Session session) {
        this.session = session;
    }

    @Override
    public List<CategoryMoive> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CategoryMoive findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(CategoryMoive object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(CategoryMoive object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(CategoryMoive object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

}
