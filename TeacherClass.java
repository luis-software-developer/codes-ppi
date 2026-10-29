class maestro extends usuario{
    private String especialidad;

    public maestro(String nombre, String correo, int id, String contraseña, String especialidad){
        super(nombre, correo, id, contraseña);
        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("===MAESTRO===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
    }

    public void verHorario(){
        System.out.println("Mostrando el horario del maestro...");
    }

    public void verMapa(){
        System.out.println("Mostrando mapa...");
    }

    public void editarInformacion(){
        System.out.println("Editando informacion...");
    }
}