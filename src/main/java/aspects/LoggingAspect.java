package aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
    long t1,t2;
    @Pointcut("execution(* metier.IMetierBanqueImpl.*(..))")
    public void pc1(){}
    @Before("pc1()")
    public void avant(JoinPoint joinPoint){
        t1=System.currentTimeMillis();
        System.out.println("Avant l'exécution de la méthode "+joinPoint.getSignature());
    }
    @After("pc1()")
    public void apres(JoinPoint joinPoint){
        System.out.println("Aprés l'exécution de la méthode "+joinPoint.getSignature());
        t2=System.currentTimeMillis();
        System.out.println("Durée d'exécution de la méthode "+(t2-t1));
    }
}
