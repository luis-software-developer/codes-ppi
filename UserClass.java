class usuario{
    protected String nombre;
    protected String correo;
    protected int id;
    protected String contraseña;

    public usuario(String nombre, String correo, int id, String contraseña){
        this.nombre = nombre;
        this.correo = correo;
        this.id = id;
        this.contraseña = contraseña;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("ID: " + id);
    }
}