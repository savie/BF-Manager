package l;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.ProtectionDomain;

/* JADX INFO: renamed from: l.᩸۬۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 86PR */
/* JADX INFO: loaded from: classes5.dex */
public final class C21597 extends C18069 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final ThreadGroup f70061 = (ThreadGroup) AccessController.doPrivileged(new C15248());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final AccessControlContext f70060 = new AccessControlContext(new ProtectionDomain[]{new ProtectionDomain(null, null)});

    @Override // java.lang.Thread
    public final void setUncaughtExceptionHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
    }

    public C21597(C5369 c5369) {
        super(c5369, ClassLoader.getSystemClassLoader(), f70061, f70060);
    }

    @Override // l.C18069
    /* JADX INFO: renamed from: ۙ */
    public final void mo42065() {
        C8898.m23150(this);
    }

    @Override // java.lang.Thread
    public final void setContextClassLoader(ClassLoader classLoader) {
        if (classLoader != null && ClassLoader.getSystemClassLoader() != classLoader) {
            throw new SecurityException("setContextClassLoader");
        }
    }
}
