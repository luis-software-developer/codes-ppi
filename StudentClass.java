class estudiante extends usuario{
    public estudiante(String nombre, String correo, int id, String contraseña){
        super(nombre, correo, id, contraseña);
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("===ESTUDIANTE===");
        System.out.println("Nombre: " + nombre);
    }

    public void verHorario(){
        System.out.println("Mostrando horario...");
    }

    public void verMapa(){
        System.out.println("Mostrando mapa...");
    }

    public void editarInformacion(){
        System.out.println("Editando información...");
    }
}