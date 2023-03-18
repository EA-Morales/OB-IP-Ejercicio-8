import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setName("Jhon Doe");
        persona.setEdad(45);
        persona.setTelefono("12345678");
        System.out.println("Nombre: " + persona.getName() + "\n" + "Edad: " + persona.getEdad() + "\n" + "Telefono: "+ persona.getTelefono());
    }
}

class Persona{
    private String name;
    private int edad;
    private String telefono;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        String numeroFormateado = this.telefono.substring(0, 4) + "-"
                + this.telefono.substring(4);
        return numeroFormateado;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


}