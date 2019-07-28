package br.edu.ifpb.dac.projeto.cdi;

import br.edu.ifpb.dac.projeto.IFCalculadora;
import javax.annotation.Resource;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

/**
 * @author Ricardo Job
 */
@ApplicationScoped
public class ProducersResource {
    
    @Produces 
    @Resource(lookup = "java:global/dac-projeto-core/CalculadoraImpl")
    private IFCalculadora calculadora;

}
