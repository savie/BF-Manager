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

/* JADX INFO: renamed from: l.۟۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E68Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C7756 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long f25524;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC24911 f25525;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static C13921 f25526;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final boolean f25527;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static EnumC0298 f25528;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static Future f25529;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final boolean f25530;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final boolean f25531;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long f25532;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f25533;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean f25534;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static synchronized EnumC0298 m21113() {
        return f25528;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static synchronized void m21119() {
        if (f25528 != EnumC0298.FAILED) {
            return;
        }
        f25528 = EnumC0298.NONE;
    }

    static {
        f25527 = new File("/system/bin/busybox").exists() || new File("/system/xbin/busybox").exists();
        f25531 = new File("/system/bin/toolbox").exists() || new File("/system/xbin/toolbox").exists();
        f25530 = new File("/system/bin/toybox").exists() || new File("/system/xbin/toybox").exists();
        f25525 = null;
        f25528 = EnumC0298.NONE;
        f25524 = 0L;
        f25532 = -1L;
        f25526 = new C13921(1);
        f25534 = true;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean m21112() {
        InterfaceC24911 interfaceC24911 = f25525;
        return interfaceC24911 != null && interfaceC24911.mo6264();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m21122() {
        EnumC21181 enumC21181;
        synchronized (C7756.class) {
            boolean z = f25533;
            if (z && m21112()) {
                return;
            }
            if (!z) {
                m21114();
                return;
            }
            if (m21097() || m21118()) {
                return;
            }
            synchronized (C7756.class) {
                if (f25533 && !m21112()) {
                    C18197 c18197M21110 = m21110();
                    if (c18197M21110 != null) {
                        f25532 = c18197M21110.f59439;
                    }
                    if (c18197M21110 == null) {
                        m21120(-1L, true);
                        return;
                    }
                    try {
                        c18197M21110.f59438.get(1200L, TimeUnit.MILLISECONDS);
                        enumC21181 = EnumC21181.COMPLETED;
                    } catch (InterruptedException e) {
                        C20653.m47267("Shell.auto recovery shizuku interrupted, generation=" + c18197M21110.f59439, e);
                        enumC21181 = EnumC21181.INTERRUPTED;
                    } catch (CancellationException unused) {
                        C20653.m47271("Shell.auto recovery shizuku canceled, generation=" + c18197M21110.f59439);
                        enumC21181 = EnumC21181.CANCELED;
                    } catch (ExecutionException e2) {
                        C20653.m47267("Shell.auto recovery shizuku error, generation=" + c18197M21110.f59439, e2);
                        enumC21181 = EnumC21181.FAILED;
                    } catch (TimeoutException unused2) {
                        C20653.m47271("Shell.auto recovery shizuku timeout, generation=" + c18197M21110.f59439);
                        enumC21181 = EnumC21181.TIMEOUT;
                    }
                    if (enumC21181 == EnumC21181.COMPLETED && m21105(c18197M21110.f59439)) {
                        return;
                    }
                    m21120(c18197M21110.f59439, enumC21181 != EnumC21181.TIMEOUT);
                    if (enumC21181 == EnumC21181.INTERRUPTED) {
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
      0x00d5: PHI (r5v2 l.᩻۠ۧ) = (r5v1 l.᩻۠ۧ), (r5v1 l.᩻۠ۧ), (r5v1 l.᩻۠ۧ), (r5v1 l.᩻۠ۧ), (r5v10 l.᩻۠ۧ), (r5v1 l.᩻۠ۧ) binds: [B:27:0x0051, B:28:0x0053, B:30:0x005d, B:39:0x007f, B:37:0x007c, B:52:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2 A[Catch: all -> 0x01aa, TryCatch #6 {, blocks: (B:4:0x0004, B:6:0x000a, B:8:0x000d, B:10:0x0015, B:16:0x0023, B:29:0x0055, B:31:0x005f, B:33:0x0067, B:34:0x006c, B:40:0x0085, B:42:0x0089, B:58:0x00e2, B:62:0x00f4, B:64:0x00f9, B:63:0x00f7, B:65:0x00fc, B:43:0x00a5, B:45:0x00a9, B:47:0x00ad, B:52:0x00d0, B:39:0x007f, B:24:0x0049, B:18:0x002d, B:20:0x0033, B:21:0x0039, B:36:0x0072, B:49:0x00c4), top: B:123:0x0004, inners: #4, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7 A[Catch: all -> 0x01aa, TryCatch #6 {, blocks: (B:4:0x0004, B:6:0x000a, B:8:0x000d, B:10:0x0015, B:16:0x0023, B:29:0x0055, B:31:0x005f, B:33:0x0067, B:34:0x006c, B:40:0x0085, B:42:0x0089, B:58:0x00e2, B:62:0x00f4, B:64:0x00f9, B:63:0x00f7, B:65:0x00fc, B:43:0x00a5, B:45:0x00a9, B:47:0x00ad, B:52:0x00d0, B:39:0x007f, B:24:0x0049, B:18:0x002d, B:20:0x0033, B:21:0x0039, B:36:0x0072, B:49:0x00c4), top: B:123:0x0004, inners: #4, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0142  */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static void m21114() {
        InterfaceC24911 c1790;
        long j;
        InterfaceC24911 c1791;
        long j2;
        Future future;
        boolean z;
        boolean z2;
        C10695 c10695;
        do {
            synchronized (C7756.class) {
                if (m21112()) {
                    return;
                }
                boolean z3 = true;
                boolean z4 = !C16514.m39144() && ApplicationC17729.m41519();
                if (z4 && ApplicationC17729.f58262.getBoolean("get_root", true)) {
                    try {
                        String strM44123 = C19036.m44123(false);
                        if (strM44123 == null) {
                            C20653.m47271("Shell.create su: Permission denied");
                            c1790 = null;
                        } else {
                            C20653.m47271("Shell.create ".concat(strM44123));
                            c1790 = new C1790(strM44123, true);
                        }
                    } catch (Throwable th) {
                        C20653.m47267("Shell.error", th);
                    }
                    if (c1790 != null) {
                        Future future2 = null;
                        j = -1;
                        c1791 = c1790;
                        j2 = -1;
                        future = future2;
                        z = true;
                    } else {
                        Future future3 = null;
                        j = -1;
                        c1791 = c1790;
                        j2 = -1;
                        future = future3;
                        z = true;
                    }
                    if (future == null) {
                        if (c1791 == null) {
                            C20653.m47271("Shell.create sh");
                            c1791 = new C1790("sh", false);
                        }
                        if (z) {
                            f25532 = -1L;
                        } else {
                            f25532 = -1L;
                        }
                        m21104(c1791, z);
                    }
                    if (future != null) {
                        future.get();
                        z2 = false;
                        z3 = false;
                        if (z3) {
                            synchronized (C7756.class) {
                                if (j == f25524) {
                                }
                            }
                        }
                    } else {
                        C7742.m21082();
                        C16705.m39472();
                        if (j2 >= 0) {
                            m21105(j2);
                            return;
                        }
                        return;
                    }
                } else {
                    c1790 = null;
                    if (c1790 != null && z4 && ApplicationC17729.f58262.getBoolean("get_adb", true)) {
                        EnumC0298 enumC0298M21113 = m21113();
                        if (enumC0298M21113 == EnumC0298.FAILED) {
                            m21119();
                            enumC0298M21113 = EnumC0298.NONE;
                        }
                        if (C10695.m27256()) {
                            try {
                                C20653.m47271("Shell.create shizuku (reuse prewarm)");
                                c10695 = new C10695(true, false);
                                c1790 = c10695;
                            } catch (Throwable th2) {
                                C20653.m47267("Shell.error", th2);
                            }
                            Future future4 = null;
                            j = -1;
                            c1791 = c1790;
                            j2 = -1;
                            future = future4;
                            z = true;
                        } else if (enumC0298M21113 == EnumC0298.WAITING_BINDER) {
                            long j3 = f25524;
                            C20653.m47271("Shell.skip shizuku while prewarm waiting binder, generation=" + j3);
                            z = false;
                            j2 = j3;
                            c1791 = c1790;
                            future = null;
                            j = -1;
                        } else {
                            if (enumC0298M21113 == EnumC0298.WAITING_PERMISSION_OR_SERVICE && (future4 = f25529) != null) {
                                j = f25524;
                                C20653.m47271("Shell.wait shizuku prewarm, generation=" + j);
                            } else {
                                try {
                                    C20653.m47271("Shell.create shizuku (no wait binder)");
                                    c10695 = new C10695(true, false);
                                    c1790 = c10695;
                                } catch (Throwable th3) {
                                    C20653.m47267("Shell.error", th3);
                                }
                                Future future5 = null;
                                j = -1;
                            }
                            c1791 = c1790;
                            j2 = -1;
                            future = future5;
                            z = true;
                        }
                    } else {
                        Future future6 = null;
                        j = -1;
                        c1791 = c1790;
                        j2 = -1;
                        future = future6;
                        z = true;
                    }
                    if (future == null) {
                        if (c1791 == null) {
                            C20653.m47271("Shell.create sh");
                            c1791 = new C1790("sh", false);
                        }
                        if (z && j2 >= 0) {
                            f25532 = j2;
                        } else {
                            f25532 = -1L;
                        }
                        m21104(c1791, z);
                    }
                    if (future != null) {
                        try {
                            future.get();
                        } catch (InterruptedException e) {
                            C20653.m47267("Shell.wait shizuku prewarm interrupted, generation=" + j, e);
                            z2 = true;
                        } catch (CancellationException unused) {
                            C20653.m47271("Shell.wait shizuku prewarm canceled, generation=" + j);
                            z2 = false;
                        } catch (ExecutionException e2) {
                            C20653.m47267("Shell.wait shizuku prewarm error, generation=" + j, e2);
                        }
                        z2 = false;
                        z3 = false;
                        if (z3) {
                            synchronized (C7756.class) {
                                if (j == f25524 && f25529 == null && f25525 == null) {
                                    return;
                                }
                            }
                        }
                    } else {
                        C7742.m21082();
                        C16705.m39472();
                        if (j2 >= 0) {
                            m21105(j2);
                            return;
                        }
                        return;
                    }
                }
                throw th;
            }
        } while (!z2);
        synchronized (C7756.class) {
            if (m21112()) {
                Thread.currentThread().interrupt();
                return;
            }
            C20653.m47271("Shell.create sh");
            f25532 = j;
            m21104((InterfaceC24911) new C1790("sh", false), false);
            C7742.m21082();
            C16705.m39472();
            if (j >= 0) {
                m21105(j);
            }
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m21115() {
        synchronized (C7756.class) {
            if (m21112()) {
                return;
            }
            if (!C16514.m39144() && ApplicationC17729.m41519()) {
                boolean zEquals = true;
                if (ApplicationC17729.f58262.getBoolean("get_adb", true)) {
                    Future future = f25529;
                    if (future == null || future.isDone()) {
                        boolean z = ApplicationC17729.f58262.getBoolean("get_root", true);
                        String string = ApplicationC17729.f58262.getString("last_shell_backend", "app");
                        if (z) {
                            zEquals = "shizuku".equals(string);
                        }
                        if (zEquals) {
                            m21116();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C18197 m21110() {
        if (C16514.m39144() || !ApplicationC17729.m41519()) {
            return null;
        }
        if (!ApplicationC17729.f58262.getBoolean("get_adb", true)) {
            return null;
        }
        Future future = f25529;
        if (future != null && !future.isDone()) {
            return new C18197(f25524, future);
        }
        InterfaceC24911 interfaceC24911 = f25525;
        boolean z = (interfaceC24911 instanceof C10695) && !((C10695) interfaceC24911).mo6264();
        boolean z2 = ApplicationC17729.f58262.getBoolean("get_root", true);
        String string = ApplicationC17729.f58262.getString("last_shell_backend", "app");
        if (!z) {
            if (!(z2 ? "shizuku".equals(string) : true)) {
                return null;
            }
        }
        return m21116();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C18197 m21116() {
        final long j = f25524 + 1;
        f25524 = j;
        EnumC0298 enumC0298 = EnumC0298.WAITING_BINDER;
        f25528 = enumC0298;
        C20653.m47271("Shell.prewarm start, generation=" + j + ", state=" + enumC0298);
        f25526.getClass();
        Future<?> futureSubmit = C5261.f18540.submit(new Runnable() { // from class: l.᩺۠ۧ
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = j;
                try {
                    C20653.m47271("Shell.prewarm shizuku, generation=" + j2);
                    C10695.m27252(new C14467(j2));
                    C7756.m21101(j2, true);
                } catch (Throwable th) {
                    try {
                        C20653.m47267("Shell.prewarm error, generation=" + j2, th);
                    } finally {
                        C7756.m21101(j2, false);
                    }
                }
            }
        });
        f25529 = futureSubmit;
        return new C18197(j, futureSubmit);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21100(long j, EnumC15170 enumC15170) {
        EnumC0298 enumC0298;
        synchronized (C7756.class) {
            if (j != f25524) {
                return;
            }
            if (enumC15170 == EnumC15170.WAITING_BINDER) {
                enumC0298 = EnumC0298.WAITING_BINDER;
            } else {
                enumC0298 = EnumC0298.WAITING_PERMISSION_OR_SERVICE;
            }
            if (f25528 == enumC0298) {
                return;
            }
            f25528 = enumC0298;
            C20653.m47271("Shell.prewarm stage=" + enumC0298 + ", generation=" + j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00af  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21101(long j, boolean z) {
        String str;
        InterfaceC24911 interfaceC24911;
        synchronized (C7756.class) {
            if (j != f25524) {
                C20653.m47271("Shell.prewarm result ignored: stale generation=" + j);
                return;
            }
            f25529 = null;
            f25528 = z ? EnumC0298.NONE : EnumC0298.FAILED;
            boolean z2 = (!z || (interfaceC24911 = f25525) == null || interfaceC24911.mo6266()) ? false : true;
            if (z2 && m21105(j)) {
                return;
            }
            synchronized (C7756.class) {
                if (f25532 != j) {
                    StringBuilder sb = new StringBuilder("Shell.prewarm result: ");
                    sb.append(z ? "success" : k.j);
                    sb.append(", generation=");
                    sb.append(j);
                    C20653.m47271(sb.toString());
                    return;
                }
                f25532 = -1L;
                InterfaceC24911 interfaceC24912 = f25525;
                if (interfaceC24912 != null) {
                    m21103(interfaceC24912);
                    StringBuilder sb2 = new StringBuilder("Shell.prewarm result: ");
                    sb2.append(z ? "success" : k.j);
                    sb2.append(", generation=");
                    sb2.append(j);
                    sb2.append(", backend=");
                    InterfaceC24911 interfaceC24913 = f25525;
                    if (interfaceC24913 == null) {
                        str = "app";
                    } else if (interfaceC24913.mo6265()) {
                        str = "root";
                    } else if (interfaceC24913.mo6267()) {
                        str = "shizuku";
                    } else {
                        str = "app";
                    }
                    sb2.append(str);
                    C20653.m47271(sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder("Shell.prewarm result: ");
                    sb3.append(z ? "success" : k.j);
                    sb3.append(", generation=");
                    sb3.append(j);
                    sb3.append(", backend=app");
                    C20653.m47271(sb3.toString());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m21105(long j) {
        InterfaceC24911 interfaceC24911;
        synchronized (C7756.class) {
            if (j == f25524 && (interfaceC24911 = f25525) != null && !interfaceC24911.mo6266()) {
                if (!C10695.m27256()) {
                    return false;
                }
                try {
                    return m21106(j, new C10695(false, false), new RunnableC4027());
                } catch (IOException e) {
                    C20653.m47267("Shell.prewarm take over error, generation=" + j, e);
                    return false;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m21106(long j, C10695 c10695, RunnableC4027 runnableC4027) {
        InterfaceC24911 interfaceC24911;
        boolean zM21108 = false;
        try {
            synchronized (C7756.class) {
                if (j == f25524 && (interfaceC24911 = f25525) != null && !interfaceC24911.mo6266()) {
                    zM21108 = m21108(c10695);
                    if (zM21108) {
                        synchronized (C7756.class) {
                            if (f25532 == j) {
                                f25532 = -1L;
                            }
                        }
                        C20653.m47271("Shell.prewarm result: success, generation=" + j + ", backend=shizuku");
                        runnableC4027.run();
                    }
                    if (!zM21108) {
                        c10695.close();
                    }
                    return zM21108;
                }
                c10695.close();
                return false;
            }
        } catch (Throwable th) {
            if (!zM21108) {
                c10695.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static boolean m21097() {
        C1790 c1790;
        synchronized (C7756.class) {
            if (f25533 && !m21112()) {
                boolean z = !C16514.m39144() && ApplicationC17729.m41519() && ApplicationC17729.f58262.getBoolean("get_root", true);
                if (z) {
                    try {
                        String strM44123 = C19036.m44123(false);
                        if (strM44123 == null) {
                            C20653.m47271("Shell.create su: Permission denied");
                            c1790 = null;
                        } else {
                            C20653.m47271("Shell.create ".concat(strM44123));
                            c1790 = new C1790(strM44123, true);
                        }
                    } catch (Throwable th) {
                        C20653.m47267("Shell.error", th);
                    }
                    if (c1790 != null) {
                        synchronized (C7756.class) {
                            if (f25533 && !m21112()) {
                                m21104((InterfaceC24911) c1790, true);
                                C7742.m21082();
                                C16705.m39472();
                                return true;
                            }
                            c1790.close();
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
    public static boolean m21118() {
        synchronized (C7756.class) {
            if (f25533 && !m21112()) {
                if (!C16514.m39144() && ApplicationC17729.m41519() && ApplicationC17729.f58262.getBoolean("get_adb", true)) {
                    if (!C10695.m27256()) {
                        return false;
                    }
                    try {
                        C10695 c10695 = new C10695(false, false);
                        synchronized (C7756.class) {
                            if (f25533 && !m21112()) {
                                m21104((InterfaceC24911) c10695, true);
                                C7742.m21082();
                                C16705.m39472();
                                return true;
                            }
                            c10695.close();
                            return true;
                        }
                    } catch (IOException e) {
                        C20653.m47267("Shell.reuse shizuku error", e);
                        return false;
                    }
                }
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m21120(long j, boolean z) {
        synchronized (C7756.class) {
            if (f25533 && !m21112() && (j < 0 || j == f25524)) {
                if (!z) {
                    f25532 = j;
                } else if (f25532 == j) {
                    f25532 = -1L;
                }
                C20653.m47271("Shell.create sh");
                m21104(new C1790("sh", false), z);
                C7742.m21082();
                C16705.m39472();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m21108(C10695 c10695) {
        boolean z;
        synchronized (C7756.class) {
            InterfaceC24911 interfaceC24911 = f25525;
            if (interfaceC24911 == null || !interfaceC24911.mo6266()) {
                m21104((InterfaceC24911) c10695, true);
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            C7742.m21082();
            C16705.m39472();
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007d A[Catch: IOException -> 0x0092, TRY_LEAVE, TryCatch #1 {IOException -> 0x0092, blocks: (B:9:0x003a, B:11:0x0061, B:13:0x0067, B:15:0x0071, B:16:0x0074, B:18:0x007d, B:24:0x009e, B:26:0x010f, B:30:0x0149), top: B:36:0x0035 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:18:0x007d, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21104(InterfaceC24911 interfaceC24911, boolean z) {
        InterfaceC24911 interfaceC24912 = f25525;
        if (interfaceC24912 != null && interfaceC24912 != interfaceC24911) {
            interfaceC24912.close();
        }
        f25525 = interfaceC24911;
        f25533 = true;
        C20653.m47271("Shell.create success, uid=" + interfaceC24911.getUid());
        try {
            if (interfaceC24911.mo6265()) {
                C20653.m47271("Writing mtio");
                byte[] bArrM30355 = C12149.m30355("/assets/" + String.valueOf(m21121()));
                File file = new File(C21576.m49072(), "mtio");
                if (file.exists() && file.canExecute()) {
                    if (!Arrays.equals(bArrM30355, C1599.m5612(file))) {
                        C0147.m1307(file);
                        C0147.m1306(file, bArrM30355);
                        if (!file.setExecutable(true)) {
                            interfaceC24911.mo6262("chmod 755 " + file.getPath());
                        }
                    }
                } else {
                    C0147.m1306(file, bArrM30355);
                    if (!file.setExecutable(true)) {
                        interfaceC24911.mo6262("chmod 755 " + file.getPath());
                    }
                }
            } else if (interfaceC24911.mo6267()) {
                C20653.m47271("Writing mtio");
                byte[] bArrM30356 = C12149.m30355("/assets/" + String.valueOf(m21121()));
                File file2 = new File(C21576.f68934.getExternalCacheDir(), "mtio");
                C0147.m1306(file2, bArrM30356);
                String strConcat = "/data/local/tmp/".concat(C21576.m49092());
                String str = strConcat + "/mtio";
                C11484 c11484Mo6262 = interfaceC24911.mo6262("mkdir -p " + strConcat + " && cp -f " + file2.getAbsolutePath() + " " + str + " && chmod 711 " + str);
                if (c11484Mo6262.m28855()) {
                    C20653.m47271("Error: " + c11484Mo6262.f36124);
                    interfaceC24911.close();
                    C20653.m47271("Shell.create sh");
                    C1790 c1790 = new C1790("sh", false);
                    try {
                        f25525 = c1790;
                        C20653.m47271("Shell.create success, uid=" + c1790.getUid());
                        interfaceC24911 = c1790;
                        C0147.m1307(file2);
                    } catch (IOException unused) {
                        interfaceC24911 = c1790;
                    }
                } else {
                    C0147.m1307(file2);
                }
            }
        } catch (IOException unused2) {
        }
        if (z) {
            m21103(interfaceC24911);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0019  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21103(InterfaceC24911 interfaceC24911) {
        String str;
        if (ApplicationC17729.f58262 == null) {
            return;
        }
        if (interfaceC24911 == null) {
            str = "app";
        } else if (interfaceC24911.mo6265()) {
            str = "root";
        } else if (interfaceC24911.mo6267()) {
            str = "shizuku";
        } else {
            str = "app";
        }
        ApplicationC17729.f58262.edit().putString("last_shell_backend", str).apply();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static InterfaceC24911 m21117() {
        return f25525;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m21096() {
        InterfaceC24911 interfaceC24911 = f25525;
        return interfaceC24911 != null && interfaceC24911.mo6265();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m21111() {
        InterfaceC24911 interfaceC24911 = f25525;
        return interfaceC24911 != null && interfaceC24911.mo6267();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m21109() {
        InterfaceC24911 interfaceC24911 = f25525;
        return interfaceC24911 != null && interfaceC24911.mo6266();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21102(C20435 c20435) {
        ArrayList arrayList = new ArrayList();
        if (f25527) {
            StringBuilder sbM51387 = C22783.m51387("busybox mount -o remount,", "rw", " ");
            sbM51387.append(c20435.f65451);
            sbM51387.append(" ");
            sbM51387.append(c20435.f65453);
            arrayList.add(sbM51387.toString());
            arrayList.add("busybox mount -o remount,rw " + c20435.f65453);
            arrayList.add("busybox mount -o rw,remount " + c20435.f65451);
            arrayList.add("busybox mount -o rw,remount " + c20435.f65453);
        }
        if (f25531) {
            StringBuilder sbM51388 = C22783.m51387("toolbox mount -o remount,", "rw", " ");
            sbM51388.append(c20435.f65451);
            sbM51388.append(" ");
            sbM51388.append(c20435.f65453);
            arrayList.add(sbM51388.toString());
            arrayList.add("toolbox mount -o remount,rw " + c20435.f65453);
            arrayList.add("toolbox mount -o rw,remount " + c20435.f65451);
            arrayList.add("toolbox mount -o rw,remount " + c20435.f65453);
        }
        if (f25530) {
            StringBuilder sbM51389 = C22783.m51387("toybox mount -o remount,", "rw", " ");
            sbM51389.append(c20435.f65451);
            sbM51389.append(" ");
            sbM51389.append(c20435.f65453);
            arrayList.add(sbM51389.toString());
            arrayList.add("toybox mount -o remount,rw " + c20435.f65453);
            arrayList.add("toybox mount -o rw,remount " + c20435.f65451);
            arrayList.add("toybox mount -o rw,remount " + c20435.f65453);
        }
        StringBuilder sbM513810 = C22783.m51387("mount -o remount,", "rw", " ");
        sbM513810.append(c20435.f65451);
        sbM513810.append(" ");
        sbM513810.append(c20435.f65453);
        arrayList.add(sbM513810.toString());
        arrayList.add("mount -o remount,rw " + c20435.f65453);
        arrayList.add("mount -o rw,remount " + c20435.f65451);
        arrayList.add("mount -o rw,remount " + c20435.f65453);
        f25525.mo6262(C24276.m54283(arrayList, "\n"));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C11484 m21123() {
        if (m21096()) {
            return f25525.mo6262("cat /proc/mounts");
        }
        try {
            File file = new File("/proc/mounts");
            Charset charset = StandardCharsets.UTF_8;
            return new C11484("", (String[]) C0147.m1308(file).toArray(new String[0]));
        } catch (IOException e) {
            return new C11484(e);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m21121() {
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
    public static String m21098(String str) {
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
    public static void m21099() {
        Future future;
        InterfaceC24911 interfaceC24911;
        synchronized (C7756.class) {
            future = f25529;
            f25529 = null;
            f25528 = EnumC0298.NONE;
            interfaceC24911 = f25525;
            if (f25532 >= 0 && interfaceC24911 != null) {
                m21103(interfaceC24911);
            }
            f25532 = -1L;
            f25524++;
            f25525 = null;
            f25533 = false;
        }
        if (future != null) {
            future.cancel(true);
        }
        if (interfaceC24911 != null) {
            interfaceC24911.close();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m21107(Context context) {
        if (C7543.m20616(context)) {
            return true;
        }
        if (!m21109()) {
            return false;
        }
        String str = "pm grant " + context.getPackageName() + " android.permission.SYSTEM_ALERT_WINDOW";
        if (f25534) {
            if (f25525.mo6261(2000L, str).f36124.isEmpty() && C7543.m20616(context)) {
                return true;
            }
            f25534 = false;
        }
        return false;
    }
}
