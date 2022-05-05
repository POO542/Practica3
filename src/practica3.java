public class practica3 {
    public static void main(String[] args) throws Exception {
        //Declaración del arreglo; dimensionamiento con el operador new
        Estudiante est[] = new Estudiante[10];

        est[0] = new Estudiante(1234567,"Luis","POO", 50, "541", 18);
        est[1] = new Estudiante(2345678,"Juan","Robotica", 40, "542", 19);
        est[2] = new Estudiante(8765432,"Karyme","Artes", 98, "543", 20);
        est[3] = new Estudiante(5436213,"Perla","Español", 78, "545", 22);
        est[4] = new Estudiante(1987654,"Marcos","Etica", 53, "546", 23);
        est[5] = new Estudiante(0,"-","-", 0, "-", 0);
        est[6] = new Estudiante(0,"-","-", 0, "-", 0);
        est[7] = new Estudiante(0,"-","-", 0, "-", 0);
        est[8] = new Estudiante(0,"-","-", 0, "-", 0);
        est[9] = new Estudiante(0,"-","-", 0, "-", 0);
        
        int opcion = 0;
        do {
            System.out.println("1. Capturar alumnos");
            System.out.println("2. Imprimir alumnos");
            System.out.println("3. Salir");
            opcion  = CapturaEntrada.capturarEntero("Ingrese opcion");
            switch(opcion)
            {
            case 1:
                //Incialización de elemento por elemento del arreglo; cada elemento del arreglo es un objeto del tipo Estudiante
                for(int i = 5; i < 10; i++){
                    System.out.println("Estudiante numero: " + (i+1));
                    est[i] = new Estudiante(CapturaEntrada.capturarEntero("Matricula"),CapturaEntrada.capturarString("Nombre"),CapturaEntrada.capturarString("Materia"),CapturaEntrada.capturarEntero("Calificacion"), CapturaEntrada.capturarString("Grupo"), CapturaEntrada.capturarEntero("Edad"));
                }
            break;
            case 2:
                for(int i = 0; i < 10; i++){
                    System.out.println("Estudiante " + (i+1));
                    System.out.println("Nombre: " + est[i].getNombre());
                    System.out.println("Matricula: " + est[i].getMatricula());
                    System.out.println("Edad: " + est[i].getEdad());
                    System.out.println("Grupo: " + est[i].getGrupo());
                    System.out.println("Materia: " + est[i].getMateria());
                    System.out.println("Calificacion: " + est[i].getCalificacion());
                    System.out.println("Estado: " + est[i].getEstado());
                }
            break;
            case 3:
            System.out.println("Saliendo...");
            break;
            }       
        }while(opcion != 3);
    }
}
