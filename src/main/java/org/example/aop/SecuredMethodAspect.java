package org.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SecuredMethodAspect {
  @Pointcut("@annotation(secured)")
  public void callAt(Secured secured) {
  }

  @Around("callAt(secured)")
  public Object around(ProceedingJoinPoint pjp, Secured secured) throws Throwable {
    System.out.println("[AOP] Around");
    return secured.isLocked() ? null : pjp.proceed();
  }

  @Before("callAt(secured)")
  public void before(JoinPoint joinPoint, Secured secured) {
    System.out.println("[AOP] Before");
  }

  @After("callAt(secured)")
  public void after(JoinPoint joinPoint, Secured secured) {
    System.out.println("[AOP] After");
  }
}
