package pe.G3_SISRASOC.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.G3_SISRASOC.Entity.Tipo_Asociacion;
import pe.G3_SISRASOC.Service.Tipo_AsociacionService;


@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/tipo")
public class Tipo_AsociacionController {
	
	@Autowired
	private Tipo_AsociacionService tipoas;
	
	@GetMapping("/all")
	public List<Map<String, Object>> readAll(){
		return tipoas.readAll();
	}
	@PostMapping("/add")
	public int create(@RequestBody Tipo_Asociacion t) {
		return tipoas.create(t);
	}

}
