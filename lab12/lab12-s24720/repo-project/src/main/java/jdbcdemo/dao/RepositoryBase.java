package jdbcdemo.dao;
import jdbcdemo.domain.IHaveId;
import jdbcdemo.domain.Person;
import jdbcdemo.domain.mappers.ResultSetMapper;

import java.sql.*;

public abstract class RepositoryBase<TEntity extends IHaveId> {
    public void delete(TEntity entity) {
        try{
            delete.setInt(1, entity.getId());
            delete.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    protected Connection connection;
    protected Statement createTable;
    protected PreparedStatement insert;
    protected PreparedStatement selectAll;
    protected PreparedStatement update;
    protected PreparedStatement delete;

    protected RepositoryBase() {
        try {
            connection =
                    DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
            createTable = connection.createStatement();
            insert = connection.prepareStatement(insertSql());
            update = connection.prepareStatement(updateSql());
            delete = connection.prepareStatement(deleteSql());
            selectAll = connection.prepareStatement(selectAllSql());
        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    protected abstract String selectAllSql();

    protected abstract String deleteSql();

    protected abstract String updateSql();

    protected abstract String insertSql();

    public void createTable(){
        try {
            ResultSet rs = connection.getMetaData().getTables(null, null, null, null);
            boolean tableExists = false;
            while(rs.next()){
                if(rs.getString("TABLE_NAME").equalsIgnoreCase(tableName())){
                    tableExists=true;
                    break;
                }
            }
            if(!tableExists)
                createTable.executeUpdate(createTableSql());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected abstract String tableName();
    protected abstract String createTableSql();

    public void add(Person person){
        try{
            insert.setString(1, person.getName());
            insert.setString(2, person.getSurname());
            insert.setInt(3, person.getAge());
            insert.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    public void update(Person person) {

        try{
            update.setString(1, person.getName());
            update.setString(2, person.getSurname());
            update.setInt(3, person.getAge());
            update.setInt(4, person.getId());
            update.executeUpdate();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }

    ResultSetMapper<TEntity> mapper;
    protected RepositoryBase(ResultSetMapper<TEntity> mapper) {
        this.mapper = mapper;
        try {
            connection =
                    DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
            createTable = connection.createStatement();
            insert = connection.prepareStatement(insertSql());
            update = connection.prepareStatement(updateSql());
            delete = connection.prepareStatement(deleteSql());
            selectAll = connection.prepareStatement(selectAllSql());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}