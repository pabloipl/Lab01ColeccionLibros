import java.util.Scanner;

public class ColeccionLibros {
    public static void main(String[] args) {
        String libros[][]=new String[100][3];
        menu();
    }

    public static void menu(){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {

            System.out.println("1. AGREGAR LIBRO");
            System.out.println("2. BUSCAR LIBRO");
            System.out.println("3. MOSTRAR ESPACIOS USADOS");
            System.out.println("4. MOSTRAR ESPACIOS DISPONIBLES");
            System.out.println("5. MOSTRAR COLECCION");
            System.out.println("6. SALIR");
            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");

                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
                        System.out.println("Has seleccionado la opcion 4");
                        break;
                    case 5:
                        System.out.println("Has seleccionado la opcion 5");
                        break;
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Escriba sólo números entre 1 y 6");
                }
            } catch (Exception e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }





    }

