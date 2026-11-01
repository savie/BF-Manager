package l;

import android.content.Context;
import android.os.Build;
import com.alipay.sdk.m.y.k;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ۜۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: E68Y */
/* JADX INFO: loaded from: classes2.dex */
public final class C6696 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static Future f22575;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f22576;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static long f22577;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10890 f22578;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final boolean f22579;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static EnumC3873 f22580;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final boolean f22581;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static C0219 f22582;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long f22583;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final boolean f22584;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static boolean f22585;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static synchronized void m18101() {
        if (f22580 != EnumC3873.FAILED) {
            return;
        }
        f22580 = EnumC3873.NONE;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static synchronized EnumC3873 m18108() {
        return f22580;
    }

    static {
        f22581 = new File("/system/bin/busybox").exists() || new File("/system/xbin/busybox").exists();
        f22579 = new File("/system/bin/toolbox").exists() || new File("/system/xbin/toolbox").exists();
        f22584 = new File("/system/bin/toybox").exists() || new File("/system/xbin/toybox").exists();
        f22578 = null;
        f22580 = EnumC3873.NONE;
        f22577 = 0L;
        f22583 = -1L;
        f22582 = new C0219();
        f22585 = true;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static boolean m18082() {
        InterfaceC10890 interfaceC10890 = f22578;
        return interfaceC10890 != null && interfaceC10890.mo2029();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static void m18105() {
        EnumC1051 enumC1051;
        synchronized (C6696.class) {
            boolean z = f22576;
            if (z && m18082()) {
                return;
            }
            if (!z) {
                m18104();
                return;
            }
            if (m18098() || m18106()) {
                return;
            }
            synchronized (C6696.class) {
                if (f22576 && !m18082()) {
                    C13047 c13047M18099 = m18099();
                    if (c13047M18099 != null) {
                        f22583 = c13047M18099.f43500;
                    }
                    if (c13047M18099 == null) {
                        m18102(-1L, true);
                        return;
                    }
                    try {
                        c13047M18099.f43499.get(1200L, TimeUnit.MILLISECONDS);
                        enumC1051 = EnumC1051.COMPLETED;
                    } catch (InterruptedException e) {
                        C0577.m2742("Shell.auto recovery shizuku interrupted, generation=" + c13047M18099.f43500, e);
                        enumC1051 = EnumC1051.INTERRUPTED;
                    } catch (CancellationException unused) {
                        C0577.m2746("Shell.auto recovery shizuku canceled, generation=" + c13047M18099.f43500);
                        enumC1051 = EnumC1051.CANCELED;
                    } catch (ExecutionException e2) {
                        C0577.m2742("Shell.auto recovery shizuku error, generation=" + c13047M18099.f43500, e2);
                        enumC1051 = EnumC1051.FAILED;
                    } catch (TimeoutException unused2) {
                        C0577.m2746("Shell.auto recovery shizuku timeout, generation=" + c13047M18099.f43500);
                        enumC1051 = EnumC1051.TIMEOUT;
                    }
                    if (enumC1051 == EnumC1051.COMPLETED && m18092(c13047M18099.f43500)) {
                        return;
                    }
                    m18102(c13047M18099.f43500, enumC1051 != EnumC1051.TIMEOUT);
                    if (enumC1051 == EnumC1051.INTERRUPTED) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:118:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x00ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x019c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00d5 A[PHI: r5
      0x00d5: PHI (r5v2 l.ۧۡۜ) = (r5v1 l.ۧۡۜ), (r5v1 l.ۧۡۜ), (r5v1 l.ۧۡۜ), (r5v1 l.ۧۡۜ), (r5v10 l.ۧۡۜ), (r5v1 l.ۧۡۜ) binds: [B:27:0x0051, B:28:0x0053, B:30:0x005d, B:39:0x007f, B:37:0x007c, B:52:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2 A[Catch: all -> 0x01aa, TryCatch #6 {, blocks: (B:4:0x0004, B:6:0x000a, B:8:0x000d, B:10:0x0015, B:16:0x0023, B:29:0x0055, B:31:0x005f, B:33:0x0067, B:34:0x006c, B:40:0x0085, B:42:0x0089, B:58:0x00e2, B:62:0x00f4, B:64:0x00f9, B:63:0x00f7, B:65:0x00fc, B:43:0x00a5, B:45:0x00a9, B:47:0x00ad, B:52:0x00d0, B:39:0x007f, B:24:0x0049, B:18:0x002d, B:20:0x0033, B:21:0x0039, B:36:0x0072, B:49:0x00c4), top: B:123:0x0004, inners: #4, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7 A[Catch: all -> 0x01aa, TryCatch #6 {, blocks: (B:4:0x0004, B:6:0x000a, B:8:0x000d, B:10:0x0015, B:16:0x0023, B:29:0x0055, B:31:0x005f, B:33:0x0067, B:34:0x006c, B:40:0x0085, B:42:0x0089, B:58:0x00e2, B:62:0x00f4, B:64:0x00f9, B:63:0x00f7, B:65:0x00fc, B:43:0x00a5, B:45:0x00a9, B:47:0x00ad, B:52:0x00d0, B:39:0x007f, B:24:0x0049, B:18:0x002d, B:20:0x0033, B:21:0x0039, B:36:0x0072, B:49:0x00c4), top: B:123:0x0004, inners: #4, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0142  */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m18104() {
        InterfaceC10890 c17239;
        long j;
        InterfaceC10890 c172310;
        long j2;
        Future future;
        boolean z;
        boolean z2;
        C0346 c0346;
        do {
            synchronized (C6696.class) {
                if (m18082()) {
                    return;
                }
                boolean z3 = true;
                boolean z4 = !C15198.m36412() && ApplicationC0716.m3135();
                if (z4 && ApplicationC0716.f2988.getBoolean("get_root", true)) {
                    try {
                        String strM41209 = C17687.m41209(false);
                        if (strM41209 == null) {
                            C0577.m2746("Shell.create su: Permission denied");
                            c17239 = null;
                        } else {
                            C0577.m2746("Shell.create ".concat(strM41209));
                            c17239 = new C17239(strM41209, true);
                        }
                    } catch (Throwable th) {
                        C0577.m2742("Shell.error", th);
                    }
                    if (c17239 != null) {
                        Future future2 = null;
                        j = -1;
                        c172310 = c17239;
                        j2 = -1;
                        future = future2;
                        z = true;
                    } else {
                        Future future3 = null;
                        j = -1;
                        c172310 = c17239;
                        j2 = -1;
                        future = future3;
                        z = true;
                    }
                    if (future == null) {
                        if (c172310 == null) {
                            C0577.m2746("Shell.create sh");
                            c172310 = new C17239("sh", false);
                        }
                        if (z) {
                            f22583 = -1L;
                        } else {
                            f22583 = -1L;
                        }
                        m18090(c172310, z);
                    }
                    if (future != null) {
                        future.get();
                        z2 = false;
                        z3 = false;
                        if (z3) {
                            synchronized (C6696.class) {
                                if (j == f22577) {
                                }
                            }
                        }
                    } else {
                        C12051.m29952();
                        C14418.m34686();
                        if (j2 >= 0) {
                            m18092(j2);
                            return;
                        }
                        return;
                    }
                } else {
                    c17239 = null;
                    if (c17239 != null && z4 && ApplicationC0716.f2988.getBoolean("get_adb", true)) {
                        EnumC3873 enumC3873M18108 = m18108();
                        if (enumC3873M18108 == EnumC3873.FAILED) {
                            m18101();
                            enumC3873M18108 = EnumC3873.NONE;
                        }
                        if (C0346.m2016()) {
                            try {
                                C0577.m2746("Shell.create shizuku (reuse prewarm)");
                                c0346 = new C0346(true, false);
                                c17239 = c0346;
                            } catch (Throwable th2) {
                                C0577.m2742("Shell.error", th2);
                            }
                            Future future4 = null;
                            j = -1;
                            c172310 = c17239;
                            j2 = -1;
                            future = future4;
                            z = true;
                        } else if (enumC3873M18108 == EnumC3873.WAITING_BINDER) {
                            long j3 = f22577;
                            C0577.m2746("Shell.skip shizuku while prewarm waiting binder, generation=" + j3);
                            z = false;
                            j2 = j3;
                            c172310 = c17239;
                            future = null;
                            j = -1;
                        } else {
                            if (enumC3873M18108 == EnumC3873.WAITING_PERMISSION_OR_SERVICE && (future4 = f22575) != null) {
                                j = f22577;
                                C0577.m2746("Shell.wait shizuku prewarm, generation=" + j);
                            } else {
                                try {
                                    C0577.m2746("Shell.create shizuku (no wait binder)");
                                    c0346 = new C0346(true, false);
                                    c17239 = c0346;
                                } catch (Throwable th3) {
                                    C0577.m2742("Shell.error", th3);
                                }
                                Future future5 = null;
                                j = -1;
                            }
                            c172310 = c17239;
                            j2 = -1;
                            future = future5;
                            z = true;
                        }
                    } else {
                        Future future6 = null;
                        j = -1;
                        c172310 = c17239;
                        j2 = -1;
                        future = future6;
                        z = true;
                    }
                    if (future == null) {
                        if (c172310 == null) {
                            C0577.m2746("Shell.create sh");
                            c172310 = new C17239("sh", false);
                        }
                        if (z && j2 >= 0) {
                            f22583 = j2;
                        } else {
                            f22583 = -1L;
                        }
                        m18090(c172310, z);
                    }
                    if (future != null) {
                        try {
                            future.get();
                        } catch (InterruptedException e) {
                            C0577.m2742("Shell.wait shizuku prewarm interrupted, generation=" + j, e);
                            z2 = true;
                        } catch (CancellationException unused) {
                            C0577.m2746("Shell.wait shizuku prewarm canceled, generation=" + j);
                            z2 = false;
                        } catch (ExecutionException e2) {
                            C0577.m2742("Shell.wait shizuku prewarm error, generation=" + j, e2);
                        }
                        z2 = false;
                        z3 = false;
                        if (z3) {
                            synchronized (C6696.class) {
                                if (j == f22577 && f22575 == null && f22578 == null) {
                                    return;
                                }
                            }
                        }
                    } else {
                        C12051.m29952();
                        C14418.m34686();
                        if (j2 >= 0) {
                            m18092(j2);
                            return;
                        }
                        return;
                    }
                }
                throw th;
            }
        } while (!z2);
        synchronized (C6696.class) {
            if (m18082()) {
                Thread.currentThread().interrupt();
                return;
            }
            C0577.m2746("Shell.create sh");
            f22583 = j;
            m18090((InterfaceC10890) new C17239("sh", false), false);
            C12051.m29952();
            C14418.m34686();
            if (j >= 0) {
                m18092(j);
            }
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static void m18103() {
        synchronized (C6696.class) {
            if (m18082()) {
                return;
            }
            if (!C15198.m36412() && ApplicationC0716.m3135()) {
                boolean zEquals = true;
                if (ApplicationC0716.f2988.getBoolean("get_adb", true)) {
                    Future future = f22575;
                    if (future == null || future.isDone()) {
                        boolean z = ApplicationC0716.f2988.getBoolean("get_root", true);
                        String string = ApplicationC0716.f2988.getString("last_shell_backend", "app");
                        if (z) {
                            zEquals = "shizuku".equals(string);
                        }
                        if (zEquals) {
                            m18107();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C13047 m18099() {
        if (C15198.m36412() || !ApplicationC0716.m3135()) {
            return null;
        }
        if (!ApplicationC0716.f2988.getBoolean("get_adb", true)) {
            return null;
        }
        Future future = f22575;
        if (future != null && !future.isDone()) {
            return new C13047(f22577, future);
        }
        InterfaceC10890 interfaceC10890 = f22578;
        boolean z = (interfaceC10890 instanceof C0346) && !((C0346) interfaceC10890).mo2029();
        boolean z2 = ApplicationC0716.f2988.getBoolean("get_root", true);
        String string = ApplicationC0716.f2988.getString("last_shell_backend", "app");
        if (!z) {
            if (!(z2 ? "shizuku".equals(string) : true)) {
                return null;
            }
        }
        return m18107();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C13047 m18107() {
        final long j = f22577 + 1;
        f22577 = j;
        EnumC3873 enumC3873 = EnumC3873.WAITING_BINDER;
        f22580 = enumC3873;
        C0577.m2746("Shell.prewarm start, generation=" + j + ", state=" + enumC3873);
        f22582.getClass();
        Future<?> futureSubmit = C4716.f16636.submit(new Runnable() { // from class: l.ۚۤۜ
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = j;
                try {
                    C0577.m2746("Shell.prewarm shizuku, generation=" + j2);
                    C0346.m2013(new C22219(j2));
                    C6696.m18088(j2, true);
                } catch (Throwable th) {
                    try {
                        C0577.m2742("Shell.prewarm error, generation=" + j2, th);
                    } finally {
                        C6696.m18088(j2, false);
                    }
                }
            }
        });
        f22575 = futureSubmit;
        return new C13047(j, futureSubmit);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18087(long j, EnumC17280 enumC17280) {
        EnumC3873 enumC3873;
        synchronized (C6696.class) {
            if (j != f22577) {
                return;
            }
            if (enumC17280 == EnumC17280.WAITING_BINDER) {
                enumC3873 = EnumC3873.WAITING_BINDER;
            } else {
                enumC3873 = EnumC3873.WAITING_PERMISSION_OR_SERVICE;
            }
            if (f22580 == enumC3873) {
                return;
            }
            f22580 = enumC3873;
            C0577.m2746("Shell.prewarm stage=" + enumC3873 + ", generation=" + j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00af  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18088(long j, boolean z) {
        String str;
        InterfaceC10890 interfaceC10890;
        synchronized (C6696.class) {
            if (j != f22577) {
                C0577.m2746("Shell.prewarm result ignored: stale generation=" + j);
                return;
            }
            f22575 = null;
            f22580 = z ? EnumC3873.NONE : EnumC3873.FAILED;
            boolean z2 = (!z || (interfaceC10890 = f22578) == null || interfaceC10890.mo2032()) ? false : true;
            if (z2 && m18092(j)) {
                return;
            }
            synchronized (C6696.class) {
                if (f22583 != j) {
                    StringBuilder sb = new StringBuilder("Shell.prewarm result: ");
                    sb.append(z ? "success" : k.j);
                    sb.append(", generation=");
                    sb.append(j);
                    C0577.m2746(sb.toString());
                    return;
                }
                f22583 = -1L;
                InterfaceC10890 interfaceC10891 = f22578;
                if (interfaceC10891 != null) {
                    m18089(interfaceC10891);
                    StringBuilder sb2 = new StringBuilder("Shell.prewarm result: ");
                    sb2.append(z ? "success" : k.j);
                    sb2.append(", generation=");
                    sb2.append(j);
                    sb2.append(", backend=");
                    InterfaceC10890 interfaceC10892 = f22578;
                    if (interfaceC10892 == null) {
                        str = "app";
                    } else if (interfaceC10892.mo2031()) {
                        str = "root";
                    } else if (interfaceC10892.mo2025()) {
                        str = "shizuku";
                    } else {
                        str = "app";
                    }
                    sb2.append(str);
                    C0577.m2746(sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder("Shell.prewarm result: ");
                    sb3.append(z ? "success" : k.j);
                    sb3.append(", generation=");
                    sb3.append(j);
                    sb3.append(", backend=app");
                    C0577.m2746(sb3.toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m18092(long j) {
        InterfaceC10890 interfaceC10890;
        synchronized (C6696.class) {
            if (j == f22577 && (interfaceC10890 = f22578) != null && !interfaceC10890.mo2032()) {
                if (!C0346.m2016()) {
                    return false;
                }
                try {
                    return m18093(j, new C0346(false, false), new RunnableC3575(2));
                } catch (IOException e) {
                    C0577.m2742("Shell.prewarm take over error, generation=" + j, e);
                    return false;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m18093(long j, C0346 c0346, RunnableC3575 runnableC3575) {
        InterfaceC10890 interfaceC10890;
        boolean zM18095 = false;
        try {
            synchronized (C6696.class) {
                if (j == f22577 && (interfaceC10890 = f22578) != null && !interfaceC10890.mo2032()) {
                    zM18095 = m18095(c0346);
                    if (zM18095) {
                        synchronized (C6696.class) {
                            if (f22583 == j) {
                                f22583 = -1L;
                            }
                        }
                        C0577.m2746("Shell.prewarm result: success, generation=" + j + ", backend=shizuku");
                        runnableC3575.run();
                    }
                    if (!zM18095) {
                        c0346.close();
                    }
                    return zM18095;
                }
                c0346.close();
                return false;
            }
        } catch (Throwable th) {
            if (!zM18095) {
                c0346.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static boolean m18098() {
        C17239 c17239;
        synchronized (C6696.class) {
            if (f22576 && !m18082()) {
                boolean z = !C15198.m36412() && ApplicationC0716.m3135() && ApplicationC0716.f2988.getBoolean("get_root", true);
                if (z) {
                    try {
                        String strM41209 = C17687.m41209(false);
                        if (strM41209 == null) {
                            C0577.m2746("Shell.create su: Permission denied");
                            c17239 = null;
                        } else {
                            C0577.m2746("Shell.create ".concat(strM41209));
                            c17239 = new C17239(strM41209, true);
                        }
                    } catch (Throwable th) {
                        C0577.m2742("Shell.error", th);
                    }
                    if (c17239 != null) {
                        synchronized (C6696.class) {
                            if (f22576 && !m18082()) {
                                m18090((InterfaceC10890) c17239, true);
                                C12051.m29952();
                                C14418.m34686();
                                return true;
                            }
                            c17239.close();
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static boolean m18106() {
        synchronized (C6696.class) {
            if (f22576 && !m18082()) {
                if (!C15198.m36412() && ApplicationC0716.m3135() && ApplicationC0716.f2988.getBoolean("get_adb", true)) {
                    if (!C0346.m2016()) {
                        return false;
                    }
                    try {
                        C0346 c0346 = new C0346(false, false);
                        synchronized (C6696.class) {
                            if (f22576 && !m18082()) {
                                m18090((InterfaceC10890) c0346, true);
                                C12051.m29952();
                                C14418.m34686();
                                return true;
                            }
                            c0346.close();
                            return true;
                        }
                    } catch (IOException e) {
                        C0577.m2742("Shell.reuse shizuku error", e);
                        return false;
                    }
                }
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m18102(long j, boolean z) {
        synchronized (C6696.class) {
            if (f22576 && !m18082() && (j < 0 || j == f22577)) {
                if (!z) {
                    f22583 = j;
                } else if (f22583 == j) {
                    f22583 = -1L;
                }
                C0577.m2746("Shell.create sh");
                m18090(new C17239("sh", false), z);
                C12051.m29952();
                C14418.m34686();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m18095(C0346 c0346) {
        boolean z;
        synchronized (C6696.class) {
            InterfaceC10890 interfaceC10890 = f22578;
            if (interfaceC10890 == null || !interfaceC10890.mo2032()) {
                m18090((InterfaceC10890) c0346, true);
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            C12051.m29952();
            C14418.m34686();
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007d A[Catch: IOException -> 0x0092, TRY_LEAVE, TryCatch #1 {IOException -> 0x0092, blocks: (B:9:0x003a, B:11:0x0061, B:13:0x0067, B:15:0x0071, B:16:0x0074, B:18:0x007d, B:24:0x009e, B:26:0x010f, B:30:0x0149), top: B:36:0x0035 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x007d, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18090(InterfaceC10890 interfaceC10890, boolean z) {
        InterfaceC10890 interfaceC10891 = f22578;
        if (interfaceC10891 != null && interfaceC10891 != interfaceC10890) {
            interfaceC10891.close();
        }
        f22578 = interfaceC10890;
        f22576 = true;
        C0577.m2746("Shell.create success, uid=" + interfaceC10890.getUid());
        try {
            if (interfaceC10890.mo2031()) {
                C0577.m2746("Writing mtio");
                byte[] bArrM19433 = C7291.m19433("/assets/" + String.valueOf(m18083()));
                File file = new File(C16737.m39285(), "mtio");
                if (file.exists() && file.canExecute()) {
                    if (!Arrays.equals(bArrM19433, C3907.m11363(file))) {
                        C15071.m36110(file);
                        C15071.m36108(file, bArrM19433);
                        if (!file.setExecutable(true)) {
                            interfaceC10890.mo2027("chmod 755 " + file.getPath());
                        }
                    }
                } else {
                    C15071.m36108(file, bArrM19433);
                    if (!file.setExecutable(true)) {
                        interfaceC10890.mo2027("chmod 755 " + file.getPath());
                    }
                }
            } else if (interfaceC10890.mo2025()) {
                C0577.m2746("Writing mtio");
                byte[] bArrM19434 = C7291.m19433("/assets/" + String.valueOf(m18083()));
                File file2 = new File(C16737.f53614.getExternalCacheDir(), "mtio");
                C15071.m36108(file2, bArrM19434);
                String strConcat = "/data/local/tmp/".concat(C16737.m39293());
                String str = strConcat + "/mtio";
                C5950 c5950Mo2027 = interfaceC10890.mo2027("mkdir -p " + strConcat + " && cp -f " + file2.getAbsolutePath() + " " + str + " && chmod 711 " + str);
                if (c5950Mo2027.m16221()) {
                    C0577.m2746("Error: " + c5950Mo2027.f20238);
                    interfaceC10890.close();
                    C0577.m2746("Shell.create sh");
                    C17239 c17239 = new C17239("sh", false);
                    try {
                        f22578 = c17239;
                        C0577.m2746("Shell.create success, uid=" + c17239.getUid());
                        interfaceC10890 = c17239;
                        C15071.m36110(file2);
                    } catch (IOException unused) {
                        interfaceC10890 = c17239;
                    }
                } else {
                    C15071.m36110(file2);
                }
            }
        } catch (IOException unused2) {
        }
        if (z) {
            m18089(interfaceC10890);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18089(InterfaceC10890 interfaceC10890) {
        String str;
        if (ApplicationC0716.f2988 == null) {
            return;
        }
        if (interfaceC10890 == null) {
            str = "app";
        } else if (interfaceC10890.mo2031()) {
            str = "root";
        } else if (interfaceC10890.mo2025()) {
            str = "shizuku";
        } else {
            str = "app";
        }
        ApplicationC0716.f2988.edit().putString("last_shell_backend", str).apply();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static InterfaceC10890 m18096() {
        return f22578;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static boolean m18084() {
        InterfaceC10890 interfaceC10890 = f22578;
        return interfaceC10890 != null && interfaceC10890.mo2031();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m18097() {
        InterfaceC10890 interfaceC10890 = f22578;
        return interfaceC10890 != null && interfaceC10890.mo2025();
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static boolean m18100() {
        InterfaceC10890 interfaceC10890 = f22578;
        return interfaceC10890 != null && interfaceC10890.mo2032();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18091(C13753 c13753) {
        ArrayList arrayList = new ArrayList();
        if (f22581) {
            StringBuilder sbM30914 = C12441.m30914("busybox mount -o remount,", "rw", " ");
            sbM30914.append(c13753.f45347);
            sbM30914.append(" ");
            sbM30914.append(c13753.f45349);
            arrayList.add(sbM30914.toString());
            arrayList.add("busybox mount -o remount,rw " + c13753.f45349);
            arrayList.add("busybox mount -o rw,remount " + c13753.f45347);
            arrayList.add("busybox mount -o rw,remount " + c13753.f45349);
        }
        if (f22579) {
            StringBuilder sbM30915 = C12441.m30914("toolbox mount -o remount,", "rw", " ");
            sbM30915.append(c13753.f45347);
            sbM30915.append(" ");
            sbM30915.append(c13753.f45349);
            arrayList.add(sbM30915.toString());
            arrayList.add("toolbox mount -o remount,rw " + c13753.f45349);
            arrayList.add("toolbox mount -o rw,remount " + c13753.f45347);
            arrayList.add("toolbox mount -o rw,remount " + c13753.f45349);
        }
        if (f22584) {
            StringBuilder sbM30916 = C12441.m30914("toybox mount -o remount,", "rw", " ");
            sbM30916.append(c13753.f45347);
            sbM30916.append(" ");
            sbM30916.append(c13753.f45349);
            arrayList.add(sbM30916.toString());
            arrayList.add("toybox mount -o remount,rw " + c13753.f45349);
            arrayList.add("toybox mount -o rw,remount " + c13753.f45347);
            arrayList.add("toybox mount -o rw,remount " + c13753.f45349);
        }
        StringBuilder sbM30917 = C12441.m30914("mount -o remount,", "rw", " ");
        sbM30917.append(c13753.f45347);
        sbM30917.append(" ");
        sbM30917.append(c13753.f45349);
        arrayList.add(sbM30917.toString());
        arrayList.add("mount -o remount,rw " + c13753.f45349);
        arrayList.add("mount -o rw,remount " + c13753.f45347);
        arrayList.add("mount -o rw,remount " + c13753.f45349);
        f22578.mo2027(C6851.m18456(arrayList, "\n"));
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static C5950 m18109() {
        if (m18084()) {
            return f22578.mo2027("cat /proc/mounts");
        }
        try {
            File file = new File("/proc/mounts");
            Charset charset = StandardCharsets.UTF_8;
            return new C5950("", (String[]) C15071.m36105(file).toArray(new String[0]));
        } catch (IOException e) {
            return new C5950(e);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m18083() {
        ArrayList<String> arrayList = new ArrayList();
        Collections.addAll(arrayList, Build.SUPPORTED_ABIS);
        for (String str : arrayList) {
            str.getClass();
            switch (str) {
                case "x86_64":
                    return 4;
                case "x86":
                    return 3;
                case "armeabi-v7a":
                    return 0;
                case "arm64-v8a":
                    return 2;
                default:
                    break;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m18085(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if ("`!#$&*(){}|[]\\ ;\"'<>?".indexOf(c) != -1) {
                sb.append('\\');
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18086() {
        Future future;
        InterfaceC10890 interfaceC10890;
        synchronized (C6696.class) {
            future = f22575;
            f22575 = null;
            f22580 = EnumC3873.NONE;
            interfaceC10890 = f22578;
            if (f22583 >= 0 && interfaceC10890 != null) {
                m18089(interfaceC10890);
            }
            f22583 = -1L;
            f22577++;
            f22578 = null;
            f22576 = false;
        }
        if (future != null) {
            future.cancel(true);
        }
        if (interfaceC10890 != null) {
            interfaceC10890.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m18094(Context context) {
        if (C16125.m38170(context)) {
            return true;
        }
        if (!m18100()) {
            return false;
        }
        String str = "pm grant " + context.getPackageName() + " android.permission.SYSTEM_ALERT_WINDOW";
        if (f22585) {
            if (f22578.mo2026(2000L, str).f20238.isEmpty() && C16125.m38170(context)) {
                return true;
            }
            f22585 = false;
        }
        return false;
    }
}
