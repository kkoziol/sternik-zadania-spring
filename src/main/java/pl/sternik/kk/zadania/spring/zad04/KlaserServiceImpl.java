package pl.sternik.kk.zadania.spring.zad04;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//import pl.sternik.kk.zadania.spring.zad05.DrugieDao;


public class KlaserServiceImpl {

	private MonetaDao monetaDao;

	public KlaserServiceImpl() {
	}
	public KlaserServiceImpl(MonetaDao monetaDao) {
		this.monetaDao = monetaDao;
	}
	
	public List<Moneta> getDoSprzedania(){
		List<Moneta> all = monetaDao.getAll();
		List<Moneta> tmp = new ArrayList<Moneta>();
		for (Moneta moneta : all) {
			if(moneta.getStatus().equals(Status.DO_SPRZEDANIA)){
				tmp.add(moneta);
			}
		}
		return tmp;
	}

}