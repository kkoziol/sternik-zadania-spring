package pl.sternik.kk.zadania.spring.zad04;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.sternik.kk.zadania.spring.zad06.DrugieDao;


@Service
public class KlaserServiceImpl {

//	@Resource(name="prostaBazaDanych")
	@Autowired
	@DrugieDao
//	@Qualifier("druga")
//	@Inject
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
