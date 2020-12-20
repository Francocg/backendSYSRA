package pe.G3_SISRASOC.DaoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import oracle.jdbc.internal.OracleTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import pe.G3_SISRASOC.Dao.Tipo_AsociacionDao;
import pe.G3_SISRASOC.Entity.Tipo_Asociacion;
@Component
public class Tipo_AsociacionDaoImpl implements Tipo_AsociacionDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;
	
	@Override
	public int create(Tipo_Asociacion t) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call pk_tipo_as.sp_create_tipo_as(?)", t.getNom_tipo());
	}
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> tipo = new ArrayList<>();
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("PKG_T_ASOCIACION") //nombre del paquete
				.withProcedureName("SP_LIS_T_ASOCIACION") //nombre del procedimiento
				.declareParameters(new SqlOutParameter("CURSOR_T_ASOCIACION", OracleTypes.REF_CURSOR, new ColumnMapRowMapper()));	
				Map<String, Object> map = simpleJdbcCall.execute();
				tipo.add(map);
		return tipo;
	}
	
	
	
	
	/*@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> lista= new ArrayList<>();
		simpleJdbcCall =new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_tipo_as")
				.withProcedureName("sp_listar_tipo_as")
				.declareParameters(new SqlOutParameter("cursor_tipo_as", OracleTypes.REF_CURSOR, new ColumnMapRowMapper()));
		        Map<String, Object> map = simpleJdbcCall.execute();
		        lista.add(map);
		return lista;
		String sql ="select * from tipo_asociacion";
		return jdbcTemplate.queryForList(sql);
	}*/

}
