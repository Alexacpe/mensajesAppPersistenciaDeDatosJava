import java.sql.Connection;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();

        //menu para ejecutar las operaciones CRUD
        Scanner sc = new Scanner(System.in);
        //valor numerico para el menu inicilizado en 0
        int opcion =0;

        do {
            System.out.println("-.-.-.-.-.-.-.-.-.-.-");
            System.out.println(":: Aplicacion de mensajes ::");
            System.out.println("1. Crear mensaje");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Editar mensaje");
            System.out.println("4. Eliminar mensaje");
            System.out.println("5. Salir");

            //leer la seleccion del usuario y guardarla en la variable opcion
            opcion = sc.nextInt();

            //Segun la seleccion del usuario se realiza un caso llamando a una operacion de la capa service
            switch (opcion){

                case 1:
                    MensajeService.crearMensaje();
                    break;
                case 2:
                    MensajeService.listarMensajes();
                    break;
                case 3:
                    MensajeService.editarMensaje();
                    break;
                case 4:
                    MensajeService.eliminarMensaje();
                    break;
                default: //por si el usuario selecciona algo diferente a los case
                    break;
            }
        }while (opcion !=5); //seguir en el ciclo mientras la opcion seleccionada es diferente a 5

       /* try {
            Connection cnx = conexion.get_connection();
        }catch (Exception e){
            System.out.println(e);
        }*/
    }
}
