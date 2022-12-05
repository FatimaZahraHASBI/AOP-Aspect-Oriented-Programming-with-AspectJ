package aspects;

import metier.Compte;
import metier.IMetierBanqueImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class PatchAspect {
    @Around("execution(* metier.IMetierBanqueImpl.retirer(..))&&args(code,mt)")
    public void patch(Long code, double mt, JoinPoint joinPoint, ProceedingJoinPoint
            proceedingJoinPoint) throws Throwable {
        IMetierBanqueImpl metier=(IMetierBanqueImpl) joinPoint.getTarget();
        Compte cp=metier.consulter(code);
        if(cp.getSolde()>mt) {
            Object o = proceedingJoinPoint.proceed();
        }
        else
            throw new RuntimeException("Solde insuffisant");
    }
}
