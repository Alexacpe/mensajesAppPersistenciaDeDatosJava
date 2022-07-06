//Capa con la estructura base para realizar las operaciones
public class MensajeModelo {
    int idMensaje;
    String mensaje;
    String autorMensaje;
    String fechaMensaje;

    //constructor vacio para las operaciones que se puedan necesitar
    public MensajeModelo() {
    }

    //constructor para instanciar la clase
    public MensajeModelo(String mensaje, String autorMensaje, String fechaMensaje) {
        this.mensaje = mensaje;
        this.autorMensaje = autorMensaje;
        this.fechaMensaje = fechaMensaje;
    }


    //getters y setters: funciones para guardar y obtener los datos

    public int getIdMensaje() {
        return idMensaje;
    }

    public void setIdMensaje(int idMensaje) {
        this.idMensaje = idMensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutorMensaje() {
        return autorMensaje;
    }

    public void setAutorMensaje(String autorMensaje) {
        this.autorMensaje = autorMensaje;
    }

    public String getFechaMensaje() {
        return fechaMensaje;
    }

    public void setFechaMensaje(String fechaMensaje) {
        this.fechaMensaje = fechaMensaje;
    }
}
