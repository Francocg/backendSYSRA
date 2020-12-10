package pe.G3_SISRASOC.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HommeController {
	@GetMapping
	public String mensaje() {
		return "Spring Oracle";
	}
}

