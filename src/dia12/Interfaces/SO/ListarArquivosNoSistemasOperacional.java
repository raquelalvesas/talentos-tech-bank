package dia12.Interfaces.SO;

public class ListarArquivosNoSistemasOperacional implements Linux, Windows {
    @Override
    public void runCommandOnLinux() {
        System.out.println("ls");
    }

    @Override
    public void runCommandOnWindows() {
        System.out.println("dir");
    }

}
