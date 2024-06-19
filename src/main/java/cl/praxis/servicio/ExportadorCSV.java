package cl.praxis.servicio;

import cl.praxis.modelo.CategoriaEnum;
import cl.praxis.modelo.Cliente;

import java.io.*;
import java.util.List;

public class ExportadorCSV extends Exportador{
    @Override
    public void exportar(String fileName, List<Cliente> listaClientes) {
        //implementar  PrintWriter y Filewriter
        File newFile = new File("C:/Users/GarciaRojas/Desktop/"+fileName+".csv");
        try {
            if (!newFile.exists()) {
                newFile.createNewFile();
            }
            int contador = 0;
            FileWriter fr = new FileWriter(newFile);
            PrintWriter br = new PrintWriter(fr,true);
            boolean comprobar = false;
            String data;
            for (int i = 0; i < listaClientes.size(); i++) {
                Cliente c = listaClientes.get(i);
                data = c.getRunCliente()+","+c.getNombreCliente()+","+c.getApellidoCliente()+","+c.getAniosCliente()+","+c.getNombreCategoria()+"\n";
                fr.write(data);
            }
            fr.close();
            br.close();
            System.out.println("CSV exportado con éxito en " + newFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
