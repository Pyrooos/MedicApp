package med.voll.API.medico;

import med.voll.API.direccion.DatosDireccion;

public record DatosRegistroMedico(String nombre, String email, String documento, Especialidad especialidad, DatosDireccion direccion, String telefono) {
}
