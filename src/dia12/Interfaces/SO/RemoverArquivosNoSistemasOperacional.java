package dia12.Interfaces.SO;

public class RemoverArquivosNoSistemasOperacional implements Linux{
    @Override
    public void runCommandOnLinux() {
        System.out.println("rm");
    }

}

