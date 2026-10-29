class Invitado extends usuario{
    public Invitado(String nombre, int id){
        super(nombre, "", id, "");
    }

    @Override
    public void mostrarInformacion(){
        System.out.println("===INVITADO===");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
    }

    public void verMapa(){
        System.out.println("Mostrando mapa...");
    }
}