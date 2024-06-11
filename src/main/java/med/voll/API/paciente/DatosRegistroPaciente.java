package med.voll.API.paciente;

import med.voll.API.direccion.DatosDireccion;

public record DatosRegistroPaciente(
        String nombre,
        String email,
        String telefono,
        String documentoIdentidad,
        DatosDireccion direccion
                                    ) {
}
