package l;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ۡ۬۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G6PO */
/* JADX INFO: loaded from: classes3.dex */
public final class C8898 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f30528;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final boolean f30529;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f30530;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final long f30531;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final long f30532;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final long f30533;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f30534;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final long f30535;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Unsafe f30536;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final void m23155() {
        int iAddAndGet = f30534.addAndGet(-1640531527);
        if (iAddAndGet == 0) {
            iAddAndGet = 1;
        }
        ((C19481) f30528.get()).f62701 = iAddAndGet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int m23148() {
        return ((C19481) f30528.get()).f62701;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int m23149(int i) {
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        ((C19481) f30528.get()).f62701 = i4;
        return i4;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final int m23154() {
        int i;
        ThreadLocal threadLocal = f30528;
        int i2 = ((C19481) threadLocal.get()).f62702;
        if (i2 != 0) {
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >>> 17);
            i = i4 ^ (i4 << 5);
        } else {
            long andAdd = f30530.getAndAdd(-4942790177534073029L);
            long j = (andAdd ^ (andAdd >>> 33)) * (-49064778989728563L);
            i = (int) (((j ^ (j >>> 33)) * (-4265267296055464877L)) >>> 32);
            if (i == 0) {
                i = 1;
            }
        }
        ((C19481) threadLocal.get()).f62702 = i;
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m23150(Thread thread) {
        if (f30529) {
            return;
        }
        Unsafe unsafe = f30536;
        unsafe.putObject(thread, f30532, (Object) null);
        unsafe.putObject(thread, f30535, (Object) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m23152(Thread thread, AccessControlContext accessControlContext) {
        if (f30529) {
            return;
        }
        f30536.putOrderedObject(thread, f30533, accessControlContext);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m23151(Thread thread, ClassLoader classLoader) {
        if (f30529) {
            return;
        }
        f30536.putObject(thread, f30531, classLoader);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m23153(String str) {
        Class<?> cls;
        try {
            cls = Class.forName(str, false, C8898.class.getClassLoader());
        } catch (Throwable unused) {
            cls = null;
        }
        return cls != null;
    }

    static {
        String property;
        Unsafe unsafe = C10309.f35350;
        f30536 = unsafe;
        try {
            boolean z = m23153("com.ibm.misc.JarVersion") && (property = System.getProperty("java.class.version", "45")) != null && property.length() >= 2 && "52".compareTo(property.substring(0, 2)) > 0;
            boolean zM23153 = m23153("android.util.DisplayMetrics") ? true : m23153("org.robovm.rt.bro.Bro");
            f30529 = zM23153;
            if (!zM23153) {
                f30532 = unsafe.objectFieldOffset(Thread.class.getDeclaredField("threadLocals"));
                f30535 = unsafe.objectFieldOffset(Thread.class.getDeclaredField("inheritableThreadLocals"));
                f30533 = unsafe.objectFieldOffset(Thread.class.getDeclaredField(z ? "accessControlContext" : "inheritedAccessControlContext"));
                f30531 = unsafe.objectFieldOffset(Thread.class.getDeclaredField("contextClassLoader"));
            } else {
                f30532 = 0L;
                f30535 = 0L;
                f30533 = 0L;
                f30531 = 0L;
            }
            f30528 = new C18775();
            f30534 = new AtomicInteger();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = (jCurrentTimeMillis ^ (jCurrentTimeMillis >>> 33)) * (-49064778989728563L);
            long j2 = (j ^ (j >>> 33)) * (-4265267296055464877L);
            long jNanoTime = System.nanoTime();
            long j3 = (jNanoTime ^ (jNanoTime >>> 33)) * (-49064778989728563L);
            long j4 = ((j3 >>> 33) ^ j3) * (-4265267296055464877L);
            f30530 = new AtomicLong((j2 ^ (j2 >>> 33)) ^ (j4 ^ (j4 >>> 33)));
            if (((Boolean) AccessController.doPrivileged(new C8192())).booleanValue()) {
                byte[] seed = SecureRandom.getSeed(8);
                long j5 = ((long) seed[0]) & 255;
                for (int i = 1; i < 8; i++) {
                    j5 = (j5 << 8) | (((long) seed[i]) & 255);
                }
                f30530.set(j5);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
