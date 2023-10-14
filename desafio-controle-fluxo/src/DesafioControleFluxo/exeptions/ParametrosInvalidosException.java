package DesafioControleFluxo.exeptions;

import java.lang.Exception;

public class ParametrosInvalidosException extends Exception {
    //costrutor
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }

}
