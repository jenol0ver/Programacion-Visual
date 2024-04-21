package ar.edu.unju.fi.ejercicio18.main;

public class menu {
	/*

		   
		            case 1:

	                    System.out.print("Ingrese el nombre del destino turístico: ");
	                    String nombreDestino = scanner.next();
	                    System.out.print("Ingrese el código del país asociado: ");
	                    int codigoPais = scanner.nextInt();
	                    Pais paisAsociado = null;
	                    for (Pais pais : paises) {
	                        if (pais.getCodigo() == codigoPais) {
	                            paisAsociado = pais;
	                            break;
	                        }
	                    }
	                    if (paisAsociado != null) {
	                        destinos.add(new DestinoTuristico(destinos.size() + 1, nombreDestino, codigoPais, paisAsociado, 0));
	                        System.out.println("Destino turístico agregado con éxito.");
	                    } else {
	                        System.out.println("El código de país ingresado no es válido.");
	                    }
	                    break;

	                case 3:

	                    System.out.print("Ingrese el código del destino turístico a modificar: ");
	                    int codigoDestino = scanner.nextInt();
	                    System.out.print("Ingrese el nuevo código de país: ");
	                    int nuevoCodigoPais = scanner.nextInt();
	                    for (DestinoTuristico destino : destinos) {
	                        if (destino.getCodigo() == codigoDestino) {
	                            for (Pais pais : paises) {
	                                if (pais.getCodigo() == nuevoCodigoPais) {
	                                    destino.setPais(pais);
	                                    System.out.println("País modificado con éxito.");
	                                    break;
	                                }
	                            }
	                            break;
	                        }
	                    }
	                    break;

	                case 4:

	                    destinos.clear();
	                    System.out.println("Lista de destinos turísticos vaciada.");
	                    break;

	                case 5:

	                    System.out.print("Ingrese el código del destino turístico a eliminar: ");
	                    int codigoEliminar = scanner.nextInt();
	                    Iterator<DestinoTuristico> iterator = destinos.iterator();
	                    while (iterator.hasNext()) {
	                        DestinoTuristico destino = iterator.next();
	                        if (destino.getCodigo() == codigoEliminar) {
	                            iterator.remove();
	                            System.out.println("Destino turístico eliminado con éxito.");
	                            break;
	                        }
	                    }
	                    break;

	                case 6:

	                    Collections.sort(destinos, (d1, d2) -> d1.getNombre().compareTo(d2.getNombre()));
	                    for (DestinoTuristico destino : destinos) {
	                        System.out.println(destino.getNombre());
	                    }
	                    break;

	                case 7:

	                    for (Pais pais : paises) {
	                        System.out.println(pais.getNombre());
	                    }
	                    break;

	                case 8:

	                    System.out.print("Ingrese el código del país: ");
	                    int codigoPaisMostrar = scanner.nextInt();
	                    for (DestinoTuristico destino : destinos) {
	                        if (destino.getPais().getCodigo() == codigoPaisMostrar) {
	                            System.out.println(destino.getNombre());
	                        }
	                    }
	                    break;

	                case 9:
	                    System.out.println("Saliendo del programa...");
	                    break;

	                default:
	                    System.out.println("Opción no válida. Inténtelo de nuevo.");
	            }

	        } while (opcion != 9);
		        	} catch (Exception e) {
		            System.out.println("Ha ocurrido un error inesperado. Detalles: " + e.getMessage());
		        
		            scanner.close();
		            }
		        }
		    }
		    
		   

    public static void main(String[] args) {
        try {
            inicializarPaises();

            int opcion;
            do {
                mostrarMenu();
                opcion = solicitarEntero("Ingrese una opción: ");
                switch (opcion) {
                    case 1:
                        altaDestino();
                        break;
                    case 2:
                        mostrarDestinos();
                        break;
                    case 3:
                        modificarPaisDestino();
                        break;
                    case 4:
                        limpiarDestinos();
                        break;
                    case 5:
                        eliminarDestino();
                        break;
                    case 6:
                        mostrarDestinosOrdenados();
                        break;
                    case 7:
                        mostrarPaises();
                        break;
                    case 8:
                        mostrarDestinosPorPais();
                        break;
                    case 9:
                        System.out.println("Fin del programa");
                        break;
                    default:
                        System.out.println("Opción fuera del rango");
                        break;
                }
            } while (opcion != 9);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void inicializarPaises() {
        for (String codigo : CODIGOS_PAISES) {
            paises.add(new Pais(codigo, obtenerNombrePais(codigo)));
        }
    }

    private static String obtenerNombrePais(String codigoPais) {
        switch (codigoPais) {
            case "Ar-0000":
                return "Argentina";
            case "Br-0001":
                return "Brasil";
            case "Mx-0002":
                return "México";
            case "EC-0003":
                return "Ecuador";
            case "PE-0004":
                return "Perú";
            case "UR-0005":
                return "Uruguay";
            default:
                return "Nombre del país";
        }
    }

    private static int solicitarEntero(String mensaje) {
        int numero = 0;
        boolean entradaValida = false;
        do {
            try {
                System.out.print(mensaje);
                numero = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: entrada no válida. Por favor, ingrese un número entero.");
                scanner.next(); // Limpiar el buffer del Scanner
            }
        } while (!entradaValida);
        return numero;
    }
    
    private static void altaDestino() {
        DestinoTuristico destino = new DestinoTuristico();

        try {
            System.out.println("Ingrese el nombre del destino turístico: ");
            scanner.nextLine(); // Consumir el salto de línea pendiente
            destino.setNombre(scanner.nextLine());

            System.out.println("Ingrese el código del destino turístico: ");
            destino.setCodigo(scanner.nextLine());

            System.out.println("Ingrese el precio del destino turístico: ");
            destino.setPrecio(scanner.nextDouble());
            scanner.nextLine(); // Consumir el salto de línea pendiente

            System.out.println("Seleccione el país del destino turístico: ");
            mostrarPaises();
            int indexPais = solicitarEntero("Ingrese el número correspondiente al país: ");
            destino.setPais(paises.get(indexPais - 1));

            boolean entradaValida = false;
            do {
                try {
                    System.out.println("Ingrese la cantidad de días del destino turístico: ");
                    scanner.nextLine(); // Consumir el salto de línea pendiente
                    int cantDias = Integer.parseInt(scanner.nextLine());
                    destino.setCantDias(cantDias);
                    entradaValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("Error: entrada no válida. Por favor, ingrese un valor entero válido.");
                }
            } while (!entradaValida);

            destinos.add(destino);
            System.out.println("Destino turístico agregado correctamente.");
        } catch (InputMismatchException e) {
            System.out.println("Error: entrada no válida. Por favor, ingrese un valor válido.");
        }
    }


    private static void mostrarDestinos() {
        if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para mostrar.");
        } else {
            System.out.println("Destinos Turísticos:");
            for (int i = 0; i < destinos.size(); i++) {
                System.out.println((i + 1) + ". " + destinos.get(i).getNombre());
            }
        }
    }

    private static void modificarPaisDestino() {
        if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para modificar.");
        } else {
            mostrarDestinos();
            int indexDestino = solicitarEntero("Ingrese el número correspondiente al destino turístico a modificar: ");
            DestinoTuristico destino = destinos.get(indexDestino - 1);

            System.out.println("Seleccione el nuevo país del destino turístico: ");
            mostrarPaises();
            int indexPais = solicitarEntero("Ingrese el número correspondiente al país: ");
            destino.setPais(paises.get(indexPais - 1));

            System.out.println("País modificado correctamente para el destino turístico " + destino.getNombre());
        }
    }

    private static void limpiarDestinos() {
        destinos.clear();
        System.out.println("Lista de destinos turísticos limpiada correctamente.");
    }

    private static void eliminarDestino() {
        if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para eliminar.");
        } else {
            mostrarDestinos();
            int indexDestino = solicitarEntero("Ingrese el número correspondiente al destino turístico a eliminar: ");
            DestinoTuristico destino = destinos.remove(indexDestino - 1);
            System.out.println("Destino turístico \"" + destino.getNombre() + "\" eliminado correctamente.");
        }
    }

    private static void mostrarDestinosOrdenados() {
        if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para mostrar.");
        } else {
            destinos.sort(Comparator.comparing(DestinoTuristico::getNombre));
            System.out.println("Destinos Turísticos Ordenados por Nombre:");
            for (DestinoTuristico destino : destinos) {
                System.out.println("- " + destino.getNombre());
            }
        }
    }

    private static void mostrarPaises() {
        if (paises.isEmpty()) {
            System.out.println("No hay países para mostrar.");
        } else {
            System.out.println("Países Disponibles:");
            for (int i = 0; i < paises.size(); i++) {
                System.out.println((i + 1) + ". " + paises.get(i).getNombre());
            }
        }
    }

    private static void mostrarDestinosPorPais() {
        if (paises.isEmpty() || destinos.isEmpty()) {
            System.out.println("No hay países o destinos turísticos para mostrar.");
        } else {
            mostrarPaises();
            int indexPais = solicitarEntero("Ingrese el número correspondiente al país: ");
            Pais pais = paises.get(indexPais - 1);

            System.out.println("Destinos Turísticos en " + pais.getNombre() + ":");
            for (DestinoTuristico destino : destinos) {
                if (destino.getPais().equals(pais)) {
                    System.out.println("- " + destino.getNombre());
                }
            }
            
            List <Pais> paises = new ArrayList(); 
		
		
		paises.add(new Pais("c1","argentina"));
		paises.add(new Pais("c2","brasil"));
		
		List<DestinoTuristico> destinos = new ArrayList();
		int op=0;
		do {
			op=menu();
			switch(op) {
			case 1:System.out.println("---- ALTA DESTINO TURISTICO ---- :");
					
					DestinoTuristico dt = crearDt();
						if(destinos.add(dt)) {
							System.out.println("Destino agregado con exito !");
						}
						else {
							System.out.println("error al agregar destino");
						}
				break;
			case 2:System.out.println("---- DESTINOS TURISTICOS ----");
					mostrarDestinosT(destinos);
				break;
			case 3:System.out.println("MODIFICAR EL PAIS DE UN DESTINO TURISTICO");
				if(modificarPaisDestino(destinos)) {
					System.out.println(" INFORMACION MODIFICADA CON EXITO !");
				}
				else {
					System.out.println("ERROR AL MODIFICAR !");
				}
				break;
			case 4:System.out.println("LIMPIAR EL ARRAYS DE DESTINOS TURISTICOS :");
					destinos.clear();
				break;
			case 5:System.out.println("ELIMINAR UN DESTINO TURISTICO");
					if(eliminarDestino(destinos)) {
						System.out.println("SE ELIMINO EXITOSAMENTE");
					}
					else {
						System.out.println("ERROR AL BORRAR ");
					}
				break;
			case 6:System.out.println("DESTINOS TURISTICOS ORDENADOS POR NOMBRE ");
					mostrarOrdenado(destinos);
				break;
			case 7:System.out.println("TODOS LOS PAISES ");
				mostrarPaises(paises);
				break;
			case 8:System.out.println("DESTINOS TURISTICOS DE UN PAIS ");
					System.out.println("INGRESE CODIGO DE PAIS ");
					String cod = scanner.nextLine();
					destinosPorPais(destinos,cod);
				break;
			case 9:System.out.println("FIN DEL PROGRAMA  ! ! !");
				break;
			default: System.out.println("ERROR DE OPCION");
			}
		}while(op != 9);
		
	}
	
	}
	
	static String codigo() {
		System.out.println("-------INGRESE CODIGO DEL DESTINO TURISTICO :");
		return scanner.nextLine();
	}
	static String nombre() {
		System.out.println("-------INGRESE NOMBRE DEL DESTINO TURISTICO :");
		return scanner.nextLine();
	}
	static Float precio() {
		float p=0;
		try {
			System.out.println("-------INGRESE PRECIO : ");
			p = scanner.nextFloat();
		}
		catch(java.util.InputMismatchException e) {
			System.out.println("DATO INGRESADO NO VALIDO !");
		}
		scanner.nextLine();
		return p;
	}
	static Pais pais() {
		boolean band=false;
		String c,p="";
		do {
			System.out.println("------INGRESE CODIGO DE PAIS ");
			System.out.println(" c1 - ARGENTINA");
			System.out.println(" c2 - BRASIL");
			 c = scanner.nextLine();
			if(c.equals("c1")) {
				p = "argentina ";
			}
			if(c.equals("c2")) {
				 p = "brasil ";
			}
			if(c.equals("c1") == true || c.equals("c2") == true) {
				band=true;
			}
			else {
				System.out.println("ERROR DE CODIGO");
			}
		}while(!band);
		
		
		return new Pais(c,p);
	}
	static int dias() {
		int d=0;
		try {
			System.out.println("---------INGRESE DIAS");
			d = scanner.nextInt();
		}
		catch(java.util.InputMismatchException e) {
			System.out.println("DATO INGRESADO NO VALIDO ");
		}
		scanner.nextLine();
		return d;
	}
	static DestinoTuristico crearDt() {
		return new DestinoTuristico(codigo(),nombre(),precio(),pais(),dias());
	}
	static void mostrarDestinosT(List<DestinoTuristico> destinos) {
		for (DestinoTuristico destinoTuristico : destinos) {
			System.out.println(" DESTINO TURISTICO : "+destinoTuristico.getNombre());
		}
	}
	
	static boolean modificarPaisDestino (List<DestinoTuristico> destinos) {
		boolean encontrado = false;
		System.out.println("INGRESE CODIGO DEL DESTINO TURISTICO:");
		String codigo = scanner.nextLine();
			for(int i=0; i< destinos.size(); i++) {
				if(codigo.equals(destinos.get(i).getCodigo())) {
					encontrado = true ;
					destinos.get(i).setPais(pais());
				}
			}
	
		return encontrado;
	}
	static boolean eliminarDestino (List<DestinoTuristico> destinos) {
		boolean encontrado = false;
		System.out.println("INGRESE CODIGO DEL DESTINO TURISTICO :");
		String codigo = scanner.nextLine();
			for(int i=0; i< destinos.size(); i++) {
				if(codigo.equals(destinos.get(i).getCodigo())) {
					encontrado = true ;
					destinos.remove(i);
				}
			}
		return encontrado;
	}
	static void mostrarOrdenado(List<DestinoTuristico> destinos) { //MUESTRA LOS APELLIDOS ORDENADOS
		Collections.sort(destinos,Comparator.comparing(DestinoTuristico::getNombre));
		for (DestinoTuristico destinoTuristico : destinos) {
			System.out.println("Destino Turistico : "+destinoTuristico.getNombre());
		}
	}
	static void mostrarPaises(List <Pais> paises) {
		for (Pais pais : paises) {
			System.out.println("PAIS : "+pais.getNombre()+ " CODIGO : "+pais.getCodigo());
		}
	}
	
	static void destinosPorPais(List<DestinoTuristico> destinos,String cod) {
		for(int i=0; i < destinos.size() ; i++) {
			if(cod.equals(destinos.get(i).getPais().getCodigo())) {
			System.out.println("Pais : "+destinos.get(i).getPais().getNombre()+"Destino : "+destinos.get(i).getNombre());
				
			}
		}
		
		 private static void altaDestinoTuristico(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises, Scanner scanner) {
        System.out.println("Ingrese los datos del nuevo destino turístico:");
        System.out.print("Código: ");
        String codigo = scanner.next();
        System.out.print("Nombre: ");
        String nombre = scanner.next();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        System.out.print("País (código): ");
        String codigoPais = scanner.next();
        Pais pais = buscarPaisPorCodigo(paises, codigoPais);
        if (pais == null) {
            System.out.println("El país no existe. Por favor, ingrese un código de país válido.");
            return;
        }
        System.out.print("Cantidad de días: ");
        int cantidadDias = scanner.nextInt();
        destinos.add(new DestinoTuristico(codigo, nombre, precio, pais, cantidadDias));
        System.out.println("Destino turístico agregado con éxito.");
    }

    private static Pais buscarPaisPorCodigo(ArrayList<Pais> paises, String codigo) {
        for (Pais pais : paises) {
            if (pais.getCodigo().equals(codigo)) {
                return pais;
            }
        }
        return null;
    }

 

    private static void modificarPaisDestino(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises, Scanner scanner) {
        if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para modificar.");
            return;
        }
        System.out.print("Ingrese el código del destino turístico a modificar: ");
        String codigoDestino = scanner.next();
        Iterator<DestinoTuristico> iterator = destinos.iterator();
        while (iterator.hasNext()) {
            DestinoTuristico destino = iterator.next();
            if (destino.getCodigo().equals(codigoDestino)) {
                System.out.print("Nuevo código de país: ");
                String nuevoCodigoPais = scanner.next();
                Pais nuevoPais = buscarPaisPorCodigo(paises, nuevoCodigoPais);
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

    private static void limpiarDestinos(ArrayList<DestinoTuristico> destinos) {
        destinos.clear();
        System.out.println("Lista de destinos turísticos limpiada.");
    }

    private static void eliminarDestino(ArrayList<DestinoTuristico> destinos, Scanner scanner) {
        if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para eliminar.");
            return;
        }
        System.out.print("Ingrese el código del destino turístico a eliminar: ");
        String codigoDestino = scanner.next();
        Iterator<DestinoTuristico> iterator = destinos.iterator();
        while (iterator.hasNext()) {
            DestinoTuristico destino = iterator.next();
            if (destino.getCodigo().equals(codigoDestino)) {
                iterator.remove();
                System.out.println("Destino turístico eliminado con éxito.");
                return;
            }
        }
        System.out.println("No se encontró ningún destino turístico con ese código.");
    }

    private static void mostrarDestinosOrdenados(ArrayList<DestinoTuristico> destinos) {
        if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para mostrar.");
            return;
        }
        Collections.sort(destinos, Comparator.comparing(DestinoTuristico::getNombre));
        System.out.println("Destinos turísticos ordenados por nombre:");
        for (DestinoTuristico destino : destinos) {
            System.out.println(destino);
        }
    }

    private static void mostrarTodosLosPaises(ArrayList<Pais> paises) {
        if (paises.isEmpty()) {
            System.out.println("No hay países para mostrar.");
            return;
            
             private static void mostrarTodosLosPaises(ArrayList<Pais> paises) {
        if (paises.isEmpty()) {
            System.out.println("No hay países para mostrar.");
            return;
        }
        System.out.println("Lista de países:");
        for (Pais pais : paises) {
            System.out.println(pais);
        }
    }

    private static void mostrarDestinosPorPais(ArrayList<DestinoTuristico> destinos, Scanner scanner) {
        if (destinos.isEmpty()) {
            System.out.println("No hay destinos turísticos para mostrar.");
            return;
        }
        System.out.print("Ingrese el código del país para mostrar sus destinos turísticos: ");
        String codigoPais = scanner.next();
        System.out.println("Destinos turísticos para el país con código " + codigoPais + ":");
        for (DestinoTuristico destino : destinos) {
            if (destino.getPais().getCodigo().equals(codigoPais)) {
                System.out.println(destino);
            }
        }
    }
	 */
	
	
}
