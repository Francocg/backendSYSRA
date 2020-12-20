package pe.G3_SISRASOC.Service;

import java.util.List;
import java.util.Map;

import pe.G3_SISRASOC.Entity.Asociacion;
import pe.G3_SISRASOC.Entity.Tipo_Asociacion;

public interface AsociacionService {
	int create(Asociacion a);
	int delete (int id);
	List<Map<String, Object>> readAll();
}
