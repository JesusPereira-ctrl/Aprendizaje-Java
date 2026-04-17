public class EjemploEjecutarProgramaSO {
    public static void main() {
        Runtime rt = Runtime.getRuntime();
        Process proceso;

        String[] notepadCMD = {"notepad"};
        String[] geditCMD = {"gedit"};
        String[] textEdit = {"textedit"};

        try {
            if (System.getProperty("os.name").toLowerCase().startsWith("Windows")) {
                proceso = rt.exec(notepadCMD);
            } else if (System.getProperty("os.name").toLowerCase().startsWith("Mac")) {
                proceso = rt.exec(textEdit);
            } else if (System.getProperty("os.name").toLowerCase().contains("linux") ||
                    System.getProperty("os.name").toLowerCase().contains("nix")) {
                proceso = rt.exec("gedit");
            } else {
                proceso = rt.exec(geditCMD);
            }
            proceso.waitFor();
         } catch (Exception e) {
            System.err.println("El comando es desconocido: " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
