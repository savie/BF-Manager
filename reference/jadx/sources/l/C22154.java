package l;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.ProtectionDomain;

/* JADX INFO: renamed from: l.᩷ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 86PR */
/* JADX INFO: loaded from: classes.dex */
public final class C22154 extends C10965 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final ThreadGroup f71362 = (ThreadGroup) AccessController.doPrivileged(new C5000());

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final AccessControlContext f71363 = new AccessControlContext(new ProtectionDomain[]{new ProtectionDomain(null, null)});

    @Override // java.lang.Thread
    public final void setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
    }

    public C22154(C10263 c10263) {
        super(c10263, ClassLoader.getSystemClassLoader(), f71362, f71363);
    }

    @Override // l.C10965
    /* JADX INFO: renamed from: ۙ */
    public final void mo27796() {
        C13203.m32714(this);
    }

    @Override // java.lang.Thread
    public final void setContextClassLoader(ClassLoader classLoader) {
        if (classLoader != null && ClassLoader.getSystemClassLoader() != classLoader) {
            throw new SecurityException("setContextClassLoader");
        }
    }
}
