package pe.G3_SISRASOC.DaoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.ColumnMapRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import oracle.jdbc.internal.OracleTypes;
import pe.G3_SISRASOC.Dao.AsociacionDao;
import pe.G3_SISRASOC.Entity.Asociacion;
import pe.G3_SISRASOC.Entity.Tipo_Asociacion;
@Component
public class AsociacionDaoImpl implements AsociacionDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		List<Map<String,Object>> lista= new ArrayList<>();
		simpleJdbcCall =new SimpleJdbcCall(jdbcTemplate)
				.withCatalogName("pk_asociacion")
				.withProcedureName("sp_listar_asociacion")
				.declareParameters(new SqlOutParameter("cursor_asociacion", OracleTypes.REF_CURSOR, new ColumnMapRowMapper()));
		        Map<String, Object> map = simpleJdbcCall.execute();
		        lista.add(map);
		return lista;
	
	}

	@Override
	public int create(Asociacion a) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("call PKG_ASOCIACION.SP_CREATE_ASOCIACIONES(?,?,?,?,?,?,?,?)",
				//return jdbcTemplate.update("call PK_ASOCIACION.SP_ins_ASOCIACION(?,?,?,?,?,?,?,?)",
		a.getEstado(),
		a.getNom_asc(),
		a.getImf_adicional(),
		a.getN_mienbros(),
		a.getF_constitucion(),
		a.getTipo_asociacion_id_asc_tipo(),
		a.getCasa_vecinal_id_asc_cv(),
		a.getUbicacion());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from asociacion where id_asoc=?";
		return jdbcTemplate.update(SQL,id);
	}

	

}
