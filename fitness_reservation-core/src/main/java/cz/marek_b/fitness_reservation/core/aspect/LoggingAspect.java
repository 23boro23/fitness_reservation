package cz.marek_b.fitness_reservation.core.aspect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
    
    private static final Log LOG = LogFactory.getLog(LoggingAspect.class);
    
    @Before("annotations(cz.marek_b.fitness_reservation.core.aspect.Loggable)")
    public Object logAdvice(final ProceedingJoinPoint joinPoint, final Loggable loggable) {
        Object val = null;
        
        LOG.info(loggable.message());
        try {
            val = joinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        
        return val;
    }
    
}
