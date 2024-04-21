package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List <Pais> paises = new ArrayList<Pais>();
		List <DestinoTuristico> destinos = new ArrayList<DestinoTuristico>();
		
		paises.add(new Pais("dt01", "Mexico"));
        paises.add(new Pais("dt02", "Estados Unidos"));
        paises.add(new Pais("dt03", "Argentina"));
        int opcion = 0;
        
        do {
        	System.out.println("\n\tMENU DESTINOS TURISTICOS");
            System.out.println("1-Alta de destino turístico");
            System.out.println("2-Mostrar todos los destinos turísticos.");
            System.out.println("3-Modificar el país de un destino turístico.");
            System.out.println("4-Limpiar el ArrayList de destino turísticos");
            System.out.println("5-Eliminar un destino turístico");
            System.out.println("6-Mostrar los destinos turísticos ordenados por nombre");
            System.out.println("7-Mostrar todos los países");
            System.out.println("8-Mostrar los destinos turísticos que pertenecen a un país");
            System.out.println("9-Salir");
            System.out.print("Ingrese una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                	case 1:
                		altaDestino(scanner, destinos, paises);
                		break;
                	case 2:
                		mostrarDestinos(destinos);
                		break;
                	case 3:
                		modificarPais(scanner, destinos, paises);
                		break;
                	case 4:
                		limpiarDestinos(destinos);
                		break;
                	case 5:
                		eliminarDestino(scanner, destinos);
                		break;
                	case 6:
                		mostrarDestinosOrdenados(destinos);
                		break;
                	case 7:
                		mostrarPaises(paises);
                		break;
                	case 8:
                		mostrarDestinosPais(scanner, destinos);
                		break;
                	case 9:
                		System.out.println("Fin del programa");
                    break;
                    
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero.");
                scanner.nextLine(); 
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado. Motivo: " + e.getMessage());
            }
        } while (opcion != 9);

        scanner.close();
	}
	
	private static void altaDestino(Scanner scanner, List<DestinoTuristico> destinos, List<Pais> paises) {
        try {
            System.out.print("Ingrese el nombre del destino: ");
            String nombre =scanner.nextLine();

            System.out.print("Ingrese el codigo: ");
            String codigo = scanner.nextLine();

            System.out.print("Ingrese el precio: ");
            double precio = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.print("Ingrese el codigo del pais: ");
            String codigoPais = scanner.nextLine();
            Pais pais = buscarPaisCodigo(paises, codigoPais);

            System.out.print("Ingrese la cantidad de dias: ");
            int cantidadDias = scanner.nextInt();
            scanner.nextLine();

            DestinoTuristico destino = new DestinoTuristico(codigo, nombre, precio, pais, cantidadDias);
            destinos.add(destino);
            
            
            System.out.println("Destino agregado correctamente.");
        } catch (Exception e) {
            System.out.println("Error al dar de alta al destino. Motivo: " + e.getMessage());
        }
    }
	
	private static void mostrarDestinos(List<DestinoTuristico> destinos) {
		 if (destinos.isEmpty()) {
	            System.out.println("No hay destinos turísticos para mostrar.");
	            return;
	     }else {
			for (DestinoTuristico dT : destinos) {
				System.out.println(dT.getNombre() + ", " + dT.getPais());
			}
		}
	}
	
	private static void modificarPais(Scanner scanner, List<DestinoTuristico> destinos, List<Pais> paises) {
    	System.out.print("Ingrese el codigo del destino turistico: ");
        String codigo = scanner.nextLine();
        
        Iterator<DestinoTuristico> iterator = destinos.iterator();
        while (iterator.hasNext()) {
            DestinoTuristico destino = iterator.next();
            if (destino.getCodigo().equals(codigo)) {
                System.out.print("Nuevo código de país: ");
                String nuevoCodigoPais = scanner.next();
                Pais nuevoPais = buscarPaisCodigo(paises, nuevoCodigoPais);
                if (nuevoPais == null) {
                    System.out.println("El país no existe. No se puede modificar el destino turístico.");
                    return;
                }
                destino.setPais(nuevoPais);
                System.out.println("País modificado con éxito.");
                return;
            }
        }
        System.out.println("No se encontró ningún destino turístico con ese código.");

    }
	
	private static void limpiarDestinos(List<DestinoTuristico> destinos) {
        destinos.clear();
        System.out.println("Lista de destinos turísticos limpiada.");
    }
	
	private static void eliminarDestino(Scanner scanner, List<DestinoTuristico> destinos) {
		try {
            System.out.print("Ingrese el codigo del destino: ");
            String codigo = scanner.nextLine();

            Iterator<DestinoTuristico> iterator = destinos.iterator();
            boolean encontrado = false;

            while (iterator.hasNext()) {
                DestinoTuristico destino = iterator.next();
                if (destino.getCodigo().equalsIgnoreCase(codigo)) {
                    iterator.remove();
                    System.out.println("Destino eliminado correctamente.");
                    encontrado = true;               
                }
                if (!encontrado) {
                    System.out.println("No se encontró ningun destino turistico con el codigo ingresado.");
                }
            }
                   	          
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
		
	}
		
	private static void mostrarDestinosOrdenados(List<DestinoTuristico> destinos) {		        
		    ArrayList<DestinoTuristico> destinosOrdenados = new ArrayList<>(destinos);
		    Collections.sort(destinosOrdenados, Comparator.comparing(DestinoTuristico::getNombre));

		    for (DestinoTuristico destino : destinos) {
		            System.out.println(destino.getNombre() + ", " + destino.getPais());
		        }
		 	
	    
	}
	
	private static void mostrarPaises(List<Pais> paises) {
        if (paises.isEmpty()) {
            System.out.println("No hay países.");
            
        } else {
        System.out.println("Lista de países:");
        for (Pais pais : paises) {
            System.out.println(pais);
        	}
        }
    }
	
	private static void mostrarDestinosPais(Scanner scanner, List<DestinoTuristico> destinos) {
        if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos.");
        }else {
        System.out.print("Ingrese el código del país: ");
        String codigoPais = scanner.next();
        System.out.println("Destinos turísticos para " + codigoPais);
        for (DestinoTuristico destino : destinos) {
            if (destino.getPais().getCodigo().equals(codigoPais)) {
                System.out.println(destino);
            }
        }
       }
	}
	
	 private static Pais buscarPaisCodigo(List<Pais> paises, String codigo) {
	        for (Pais buscado : paises) {
	            if (buscado.getCodigo().equals(codigo)) {
	                return buscado;
	            }
	            
	        }
	        return null;
	    }
}

