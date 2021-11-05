package com.dio.concessionaria.concessionariaapi;


import com.dio.concessionaria.concessionariaapi.fiat.Fiat;
import com.dio.concessionaria.concessionariaapi.repositorio.FiatRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.awt.print.Pageable;


@RestController
@RequestMapping("/fiat")
public class FiatResourse {

    @Autowired                            //Desse jeito ou criando o construtor dele
    private FiatRepositorio repository;

    //Lá no Postman (localhost:8080/fiat?page=0&size=10&sort=name,asc) como exemplo
    @GetMapping
    public Page<Fiat> fiat(Pageable page) {                                   //Mudar de Lista para formato de página
        return repository
                .findAll((org.springframework.data.domain.Pageable) page);     //caso não funcione, deixar só (page)
    }

//    @GetMapping
//    public List<Fiat> fiat() {
//        return repository.findAll();
//    }
}
