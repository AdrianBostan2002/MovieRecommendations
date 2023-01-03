package database.populate;

import database.dao.IDao;

public abstract class PopulateDb {
    protected IDao database;

    public PopulateDb(IDao database){
        this.database=database;
    }

    public abstract void readFromFile(String fileName);
}
