package br.edu.ifpb.dac.projeto.domain;

import java.io.Serializable;

public class Relatorio implements Serializable {
    
    private int codigo;
    private int quant_almoco;

    public Relatorio() {  }

    public Relatorio(int codigo, int quant_almoco) {
        this.codigo = codigo;
        this.quant_almoco = quant_almoco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuant_almoco() {
        return quant_almoco;
    }

    public void setQuant_almoco(int quant_almoco) {
        this.quant_almoco = quant_almoco;
    }
    
    
}
