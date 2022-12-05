package aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

@Aspect
public class LoggingAspect {
    private long t1,t2;
    private Logger logger=Logger.getLogger(this.getClass().getName());
    public LoggingAspect() throws IOException {
        logger.addHandler(new FileHandler("log.xml"));
        logger.setUseParentHandlers(false);
    }
    @Pointcut("execution(* metier.IMetierBanqueImpl.*(..))")
    public void pc1(){}
    @Before("pc1()")
    public void before(JoinPoint joinPoint){
        logger.info("----------------------------");
        t1=System.currentTimeMillis();
        logger.info("Before "+joinPoint.getSignature());
    }
    @After("pc1()")
    public void after(JoinPoint joinPoint){
        t2=System.currentTimeMillis();
        logger.info("After "+joinPoint.getSignature());
        logger.info("Duration:"+(t2-t1));
        logger.info("********************************");
    }
//    long t1,t2;
//    @Pointcut("execution(* metier.IMetierBanqueImpl.*(..))")
//    public void pc1(){}
//    @Before("pc1()")
//    public void avant(JoinPoint joinPoint){
//        t1=System.currentTimeMillis();
//        System.out.println("Avant l'exécution de la méthode "+joinPoint.getSignature());
//    }
//    @After("pc1()")
//    public void apres(JoinPoint joinPoint){
//        System.out.println("Aprés l'exécution de la méthode "+joinPoint.getSignature());
//        t2=System.currentTimeMillis();
//        System.out.println("Durée d'exécution de la méthode "+(t2-t1));
//    }
}
