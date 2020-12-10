package pe.G3_SISRASOC.Service;

import java.util.List;
import java.util.Map;

import pe.G3_SISRASOC.Entity.Tipo_Asociacion;



public interface Tipo_AsociacionService {
	

	int create(Tipo_Asociacion t);
	List<Map<String, Object>> readAll();

}
