package pe.G3_SISRASOC.ServiceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.G3_SISRASOC.Dao.AsociacionDao;
import pe.G3_SISRASOC.Entity.Asociacion;
import pe.G3_SISRASOC.Entity.Tipo_Asociacion;
import pe.G3_SISRASOC.Service.AsociacionService;
@Service
public class AsociacionServiceImpl implements AsociacionService {
	@Autowired
	private AsociacionDao as;

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return as.readAll();
	}

	@Override
	public int create(Asociacion a) {
		// TODO Auto-generated method stub
		return as.create(a);
	}

	
}
