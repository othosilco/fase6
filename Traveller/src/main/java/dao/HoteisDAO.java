package dao;

import beans.Hoteis;


public class HoteisDAO implements DAO<Hoteis>{

	private DataSource dataSource;
	
	public HoteisDAO(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public DataSource getDataSource() {
		return this.dataSource;
	}

	@Override
	public void create(Hoteis object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Hoteis read(Hoteis object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Hoteis object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Hoteis object) {
		// TODO Auto-generated method stub
		
	}
}
