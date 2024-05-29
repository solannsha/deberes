import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        //Inicializamos los objetos
        Persona objetoPersona = new Persona();
        Usuario objetoUsuario = new Usuario();
        Scanner leer = new Scanner(System.in);

        //Declaramos variables
        String nombre;
        String apellido;
        String id;
        String clave;

        //Pedimos los valores de las variables
        System.out.println("Ingrese el nombre: ");
        nombre = leer.next();
        System.out.println("Ingrese el apellido: ");
        apellido = leer.next();
        System.out.println("Ingrese el id: ");
        id = leer.next();

        //Asignamos los valores a los atributos
        objetoPersona.setNombre(nombre);
        objetoPersona.setApellido(apellido);
        objetoPersona.setIdpersona(id);

        //Creación del usuario (Usuario y Clave)
        int cont = 1;
        String usuarioAuto = nombre.substring(0,2) + apellido;
        if(objetoUsuario.getUsuario() == nombre){
            objetoUsuario.setUsuario((usuarioAuto + cont).toLowerCase());
            cont++;
        }else{
            objetoUsuario.setUsuario(usuarioAuto.toLowerCase());
        }

        System.out.println("Ingrese una clave para la creación de su usuario: ");
        clave = leer.next();
        objetoUsuario.setClave(clave);

        //Imprimir los datos del usuario
        System.out.println("Datos generados: \n" + "Usuario: " + objetoUsuario.getUsuario() + "\nClave: "+ objetoUsuario.getClave());
    }
}