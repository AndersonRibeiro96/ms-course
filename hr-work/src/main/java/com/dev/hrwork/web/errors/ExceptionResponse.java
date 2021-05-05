package com.dev.hrwork.web.errors;

public class ExceptionResponse {

    private String mensagem;

    public ExceptionResponse(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

}
