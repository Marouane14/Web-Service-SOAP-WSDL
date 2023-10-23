import proxy.BanqueService;
import proxy.BanqueServiceService;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueServiceService().getBanqueServicePort();
        System.out.println("Conversion : "+stub.conversion(11000));
        Compte cp = stub.getCompte(5);
        System.out.println("Solde : "+cp.getSolde());
        System.out.println("Date : "+cp.getDate());

    }
}
