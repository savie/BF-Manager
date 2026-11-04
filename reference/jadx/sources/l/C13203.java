package l;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.۫ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G6PO */
/* JADX INFO: loaded from: classes4.dex */
public final class C13203 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AtomicLong f42160;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final long f42161;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f42162;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final long f42163;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f42164;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f42165;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final long f42166;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final long f42167;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final boolean f42168;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final void m32719() {
        int iAddAndGet = f42162.addAndGet(-1640531527);
        if (iAddAndGet == 0) {
            iAddAndGet = 1;
        }
        ((C15440) f42164.get()).f50294 = iAddAndGet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int m32712() {
        return ((C15440) f42164.get()).f50294;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int m32713(int i) {
        int i2 = i ^ (i << 13);
        int i3 = i2 ^ (i2 >>> 17);
        int i4 = i3 ^ (i3 << 5);
        ((C15440) f42164.get()).f50294 = i4;
        return i4;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final int m32718() {
        int i;
        ThreadLocal threadLocal = f42164;
        int i2 = ((C15440) threadLocal.get()).f50295;
        if (i2 != 0) {
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >>> 17);
            i = i4 ^ (i4 << 5);
        } else {
            long andAdd = f42160.getAndAdd(-4942790177534073029L);
            long j = (andAdd ^ (andAdd >>> 33)) * (-49064778989728563L);
            i = (int) (((j ^ (j >>> 33)) * (-4265267296055464877L)) >>> 32);
            if (i == 0) {
                i = 1;
            }
        }
        ((C15440) threadLocal.get()).f50295 = i;
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m32714(Thread thread) {
        if (f42168) {
            return;
        }
        Unsafe unsafe = f42165;
        unsafe.putObject(thread, f42166, (Object) null);
        unsafe.putObject(thread, f42167, (Object) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m32716(Thread thread, AccessControlContext accessControlContext) {
        if (f42168) {
            return;
        }
        f42165.putOrderedObject(thread, f42163, accessControlContext);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m32715(Thread thread, ClassLoader classLoader) {
        if (f42168) {
            return;
        }
        f42165.putObject(thread, f42161, classLoader);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m32717(String str) {
        Class<?> cls;
        try {
            cls = Class.forName(str, false, C13203.class.getClassLoader());
        } catch (Throwable unused) {
            cls = null;
        }
        return cls != null;
    }

    static {
        String property;
        Unsafe unsafe = C5746.f19778;
        f42165 = unsafe;
        try {
            boolean z = m32717("com.ibm.misc.JarVersion") && (property = System.getProperty("java.class.version", "45")) != null && property.length() >= 2 && "52".compareTo(property.substring(0, 2)) > 0;
            boolean zM32717 = m32717("android.util.DisplayMetrics") ? true : m32717("org.robovm.rt.bro.Bro");
            f42168 = zM32717;
            if (!zM32717) {
                f42166 = unsafe.objectFieldOffset(Thread.class.getDeclaredField("threadLocals"));
                f42167 = unsafe.objectFieldOffset(Thread.class.getDeclaredField("inheritableThreadLocals"));
                f42163 = unsafe.objectFieldOffset(Thread.class.getDeclaredField(z ? "accessControlContext" : "inheritedAccessControlContext"));
                f42161 = unsafe.objectFieldOffset(Thread.class.getDeclaredField("contextClassLoader"));
            } else {
                f42166 = 0L;
                f42167 = 0L;
                f42163 = 0L;
                f42161 = 0L;
            }
            f42164 = new C22900();
            f42162 = new AtomicInteger();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = (jCurrentTimeMillis ^ (jCurrentTimeMillis >>> 33)) * (-49064778989728563L);
            long j2 = (j ^ (j >>> 33)) * (-4265267296055464877L);
            long jNanoTime = System.nanoTime();
            long j3 = (jNanoTime ^ (jNanoTime >>> 33)) * (-49064778989728563L);
            long j4 = ((j3 >>> 33) ^ j3) * (-4265267296055464877L);
            f42160 = new AtomicLong((j2 ^ (j2 >>> 33)) ^ (j4 ^ (j4 >>> 33)));
            if (((Boolean) AccessController.doPrivileged(new C19916())).booleanValue()) {
                byte[] seed = SecureRandom.getSeed(8);
                long j5 = ((long) seed[0]) & 255;
                for (int i = 1; i < 8; i++) {
                    j5 = (j5 << 8) | (((long) seed[i]) & 255);
                }
                f42160.set(j5);
            }
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
