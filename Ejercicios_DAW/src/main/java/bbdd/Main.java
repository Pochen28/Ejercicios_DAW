package bbdd;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        Connection bd = conexion();
        System.out.println("Realizando consultas...");
        consulta(bd);
        desconectar(bd);

    }


    public static Connection conexion() {
        Connection conexion;
        String host = "jdbc:mariadb://localhost:3307/";
        String user = "root";
        String psw = "";
        String bd = "instituto";
        System.out.println("Conectando...");

        try {
            conexion = DriverManager.getConnection(host+bd,user,psw);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        System.out.println("Conexión realizada con éxito.");
        return conexion;
    }

    public static void desconectar(Connection conexion){

        System.out.println("Desconectando...");

        try {
            conexion.close();
            System.out.println("Conexión finalizada.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void consulta (Connection conexion){

        String query = "SELECT * FROM estudiante";

        //necesitamos dos variables de tipo Statement y ResultSet para realizar la consulta y guardar la respuesta
        Statement stmt;

        try {
            stmt = conexion().createStatement();
            ResultSet resultados = stmt.executeQuery(query);

            while (resultados.next()){
                Integer nia = resultados.getInt("nia");
                String nombre = resultados.getString("nombre");
                Date fecha = resultados.getDate("fecha_nacimiento");
                System.out.println("Estudiamte con nia " + nia + " nombre " + nombre + " fecha de nacimiento " + fecha );
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }
        ResultSet respuesta;
        try {
            stmt = conexion.createStatement();
            respuesta = stmt.executeQuery(query);

            while (respuesta.next()){ //recorremos todas las filas existentes en la tabla y las imprimimos
                int nia = respuesta.getInt("nia");
                String nombre = respuesta.getString("nombre");
                Date fecha_nacimiento = respuesta.getDate("fecha_nacimiento");
                System.out.println("NIA: " + nia + " - Nombre: " + nombre + " - Fecha de nacimiento: " + fecha_nacimiento);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void modificar (Connection conexion){

        String update = "UPDATE estudiante SET = nombre = 'Ivan' WHERE nombre 0 'Silvia'";
        Statement stmt;

        try{
            stmt = conexion.createStatement();
        }catch (SQLException e){
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

}