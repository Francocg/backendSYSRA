package pe.G3_SISRASOC.ServiceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.G3_SISRASOC.Dao.Tipo_AsociacionDao;
import pe.G3_SISRASOC.Entity.Tipo_Asociacion;
import pe.G3_SISRASOC.Service.Tipo_AsociacionService;

@Service
public class Tipo_AsociacionServiceImpl implements Tipo_AsociacionService{
	@Autowired
	private Tipo_AsociacionDao ta;

	@Override
	public int create(Tipo_Asociacion t) {
		// TODO Auto-generated method stub
		return ta.create(t);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return ta.readAll();
	}

}
