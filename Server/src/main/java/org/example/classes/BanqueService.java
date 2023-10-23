package org.example.classes;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService
public class BanqueService {

    @WebMethod
    public double Conversion(@WebParam(name = "montant") double mt){
        return Math.random()*mt;
    }

    @WebMethod
    public List<Compte> listComptes(){
        return List.of(
                new Compte(1,Math.random(),new Date()),
                new Compte(2,Math.random(),new Date()),
                new Compte(3,Math.random(),new Date())
        );
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code,Math.random(),new Date());
    }
}
