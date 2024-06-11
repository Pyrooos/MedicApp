package med.voll.API.controller;

import med.voll.API.medico.DatosRegistroMedico;
import med.voll.API.paciente.DatosRegistroPaciente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @PostMapping
    public void registrar(@RequestBody DatosRegistroPaciente datos){}
}
