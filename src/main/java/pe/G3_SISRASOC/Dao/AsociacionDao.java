package pe.G3_SISRASOC.Dao;

import java.util.List;
import java.util.Map;

import pe.G3_SISRASOC.Entity.Asociacion;
import pe.G3_SISRASOC.Entity.Tipo_Asociacion;

public interface AsociacionDao {
	int create(Asociacion a);
	List<Map<String, Object>> readAll();
}
