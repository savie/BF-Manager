package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.RemoteException;
import com.alipay.sdk.m.n.c;
import com.umeng.analytics.pro.d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.֡ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19AV */
/* JADX INFO: loaded from: classes2.dex */
public final class C0346 implements InterfaceC10890 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C14170 f1761;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final ServiceConnection f1762;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static volatile C20808 f1764;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f1767;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC20103 f1768;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f1770;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Object f1763 = new Object();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final ArrayList f1760 = new ArrayList();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final CountDownLatch f1769 = new CountDownLatch(1);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f1766 = true;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f1765 = 0;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private synchronized void m2019() {
        this.f1765 = 0;
    }

    @Override // l.InterfaceC10890
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5950 mo2027(String str) {
        return mo2028(str, false);
    }

    @Override // l.InterfaceC10890
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5950 mo2028(String str, boolean z) {
        return mo2026(z ? 0L : 8000L, str);
    }

    @Override // l.InterfaceC10890
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo2031() {
        return mo2029() && getUid() == 0;
    }

    @Override // l.InterfaceC10890
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean mo2025() {
        return mo2029() && getUid() == 2000;
    }

    @Override // l.InterfaceC10890
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo2032() {
        if (!mo2029()) {
            return false;
        }
        int uid = getUid();
        return uid == 0 || uid == 2000;
    }

    static {
        C14170 c14170 = new C14170(new ComponentName("bin.mt.plus", BinderC15164.class.getName()));
        c14170.m34255();
        c14170.m34256();
        f1761 = c14170;
        f1762 = new ServiceConnectionC7402();
    }

    public C0346() {
    }

    public C0346(boolean z, boolean z2) throws Throwable {
        boolean zM27413;
        if (C13890.m33726()) {
            C4716.f16636.execute(new RunnableC21513(0));
            throw new IOException("Shizuku can not init in main thread");
        }
        if (m2030()) {
            C0577.m2746("Shizuku reuse shared service, uid=" + this.f1767);
            return;
        }
        if (z2) {
            zM27413 = C10931.m27413(true, null);
        } else {
            zM27413 = C10931.m27413(false, null);
        }
        if (!zM27413) {
            throw new IOException("Shizuku permission denied");
        }
        try {
            if (m2030()) {
                C0577.m2746("Shizuku reuse shared service after permission, uid=" + this.f1767);
                return;
            }
            synchronized (f1763) {
                ArrayList arrayList = f1760;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            C1468.m5100(f1761, f1762);
            this.f1770 = true;
            m2014(z);
            if (this.f1768 == null) {
                throw new IOException("Shizuku service unavailable");
            }
            this.f1767 = ((C20808) this.f1768).f67644.mo5712();
            C0577.m2746("Shizuku init success, uid=" + this.f1767);
        } catch (IOException e) {
            e = e;
            m2018(true);
            C0577.m2742("Shizuku init error", e);
            throw e;
        } catch (Error e2) {
            e = e2;
            m2018(true);
            C0577.m2742("Shizuku init error", e);
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            m2018(true);
            C0577.m2742("Shizuku init error", e);
            throw e;
        } catch (Exception e4) {
            m2018(true);
            C0577.m2742("Shizuku init error", e4);
            throw new IOException(e4);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static void m2023() {
        try {
            C0346 c0346 = new C0346(false, true);
            if (C6696.m18095(c0346)) {
                return;
            }
            c0346.m2018(false);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2013(final C22219 c22219) throws IOException {
        if (C13890.m33726()) {
            C4716.f16636.execute(new Runnable() { // from class: l.ۤۤۜ
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C0346.m2013(c22219);
                    } catch (IOException e) {
                        C0577.m2742("Shizuku prewarm error", e);
                    }
                }
            });
            return;
        }
        if (f1764 != null) {
            return;
        }
        if (!C10931.m27413(true, c22219)) {
            throw new IOException("Shizuku permission denied");
        }
        if (f1764 != null) {
            return;
        }
        C1468.m5100(f1761, f1762);
        try {
            if (m2021()) {
            } else {
                throw new IOException("Shizuku prewarm timeout");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Shizuku prewarm interrupted", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2011(C17485 c17485) {
        RunnableC1774 runnableC1774;
        try {
            C0577.m2746("Shell.create shizuku (try again)");
            boolean z = true;
            C0346 c0346 = new C0346(true, true);
            if (!C6696.m18095(c0346)) {
                z = false;
                c0346.m2018(false);
            }
            if (z) {
                C16737.m39273(new RunnableC15163(0));
            }
            runnableC1774 = new RunnableC1774(3, c17485);
        } catch (Throwable th) {
            try {
                C0577.m2742("Shell.error", th);
                runnableC1774 = new RunnableC1774(3, c17485);
            } catch (Throwable th2) {
                C16737.m39273(new RunnableC1774(3, c17485));
                throw th2;
            }
        }
        C16737.m39273(runnableC1774);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m2014(boolean z) throws IOException {
        CountDownLatch countDownLatch = this.f1769;
        if (countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
            return;
        }
        C0577.m2746("Shizuku bind callback timeout");
        long jMax = Math.max(0L, 10000L) + m2024();
        boolean z2 = false;
        while (true) {
            long jM2024 = jMax - m2024();
            if (jM2024 <= 0) {
                if (z2) {
                    C0577.m2746("Shizuku callback still pending, request connected callback again");
                    C1468.m5100(f1761, f1762);
                    this.f1770 = true;
                    long jMax2 = Math.max(0L, 10000L) + m2024();
                    while (m2015(this)) {
                        long jM2025 = jMax2 - m2024();
                        if (jM2025 <= 0) {
                            break;
                        } else if (countDownLatch.await(Math.min(Math.max(1L, 200L), jM2025), TimeUnit.MILLISECONDS)) {
                            return;
                        }
                    }
                }
                C0577.m2746("Shizuku timeout");
                if (z) {
                    C16737.m39273(new RunnableC8108());
                }
                throw new IOException("Shizuku timeout");
            }
            if (countDownLatch.await(Math.min(Math.max(1L, 200L), jM2024), TimeUnit.MILLISECONDS)) {
                return;
            }
            if (!z2 && m2015(this)) {
                z2 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m2015(C0346 c0346) {
        try {
            return C1468.m5096(f1761) >= 0;
        } catch (RuntimeException e) {
            C0577.m2742("Shizuku peek user service error", e);
            return false;
        }
    }

    @Override // l.InterfaceC10890
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5950 mo2026(long j, String str) {
        long j2;
        InterfaceC20103 interfaceC20103 = this.f1768;
        if (interfaceC20103 != null) {
            final C17985 c17985 = new C17985(interfaceC20103, str, j);
            Future futureSubmit = C4716.f16636.submit(new Callable() { // from class: l.ᩴۤۜ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return (C15870) c17985.get();
                }
            });
            if (j <= 0) {
                j2 = 0;
            } else {
                try {
                    long jMax = Math.max(300L, Math.min(1500L, j / 4));
                    j2 = C17492.FOREVER_NS;
                    if (j < C17492.FOREVER_NS - jMax) {
                        j2 = j + jMax;
                    }
                } catch (InterruptedException e) {
                    futureSubmit.cancel(true);
                    Thread.currentThread().interrupt();
                    return new C5950(e.toString(), new String[0]);
                } catch (ExecutionException e2) {
                    throw new RuntimeException(e2);
                } catch (TimeoutException unused) {
                    futureSubmit.cancel(true);
                    m2018(true);
                    return new C5950("Binder response timeout", new String[0]);
                }
            }
            return m2007((C15870) (j2 > 0 ? futureSubmit.get(j2, TimeUnit.MILLISECONDS) : futureSubmit.get()));
        }
        return new C5950("Closed", new String[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15870 m2009(InterfaceC20103 interfaceC20103, String str, long j) {
        try {
            return m2008(((C20808) interfaceC20103).f67644.mo5713(j > 2147483647L ? Integer.MAX_VALUE : (int) j, "sh", str + "\nexit\n"));
        } catch (RemoteException e) {
            return new C15870(2, new C5950(e.toString(), new String[0]), true);
        } catch (IOException e2) {
            return new C15870(2, new C5950(e2.toString(), new String[0]), true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C5950 m2007(C15870 c15870) {
        if (c15870.f51350) {
            m2018(true);
            return c15870.f51349;
        }
        if (c15870.f51351 != 1) {
            m2019();
            return c15870.f51349;
        }
        synchronized (this) {
            int i = this.f1765 + 1;
            this.f1765 = i;
            if (i >= 3) {
                m2018(true);
            }
        }
        return c15870.f51349;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static long m2024() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15870 m2008(Bundle bundle) throws IOException {
        if (bundle == null) {
            return new C15870(2, new C5950("Empty result", new String[0]), false);
        }
        return new C15870(bundle.getInt(c.a, 2), new C5950(m2006(d.O, "error_gzip", bundle), m2006("output", "output_gzip", bundle).split("\n")), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m2006(String str, String str2, Bundle bundle) throws IOException {
        byte[] byteArray = bundle.getByteArray(str2);
        if (byteArray == null) {
            String string = bundle.getString(str);
            return string != null ? string : "";
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = gZIPInputStream.read(bArr);
                        if (i != -1) {
                            byteArrayOutputStream.write(bArr, 0, i);
                        } else {
                            String string2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                            byteArrayOutputStream.close();
                            gZIPInputStream.close();
                            byteArrayInputStream.close();
                            return string2;
                        }
                        try {
                            gZIPInputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                gZIPInputStream.close();
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    @Override // l.InterfaceC10890
    public final int getUid() {
        return this.f1767;
    }

    @Override // l.InterfaceC10890
    public final void close() {
        m2018(false);
    }

    @Override // l.InterfaceC10890
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo2029() {
        return this.f1766 && this.f1768 != null;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m2030() {
        C20808 c20808 = f1764;
        if (c20808 == null) {
            return false;
        }
        try {
            this.f1767 = c20808.f67644.mo5712();
            this.f1768 = c20808;
            this.f1770 = true;
            synchronized (f1763) {
                ArrayList arrayList = f1760;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            this.f1769.countDown();
            return true;
        } catch (RemoteException unused) {
            m2005();
            return false;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m2016() {
        C20808 c20808 = f1764;
        if (c20808 == null) {
            return false;
        }
        try {
            c20808.f67644.mo5712();
            return true;
        } catch (RemoteException unused) {
            m2005();
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m2021() throws InterruptedException {
        long jM2024 = m2024() + 5000;
        while (f1764 == null) {
            long jM2025 = jM2024 - m2024();
            if (jM2025 > 0) {
                Thread.sleep(Math.min(200L, jM2025));
            } else {
                try {
                    C14170 c14170 = f1761;
                    if (C1468.m5096(c14170) >= 0) {
                        C0577.m2746("Shizuku shared callback still pending, request connected callback again");
                        C1468.m5100(c14170, f1762);
                        long jM2026 = m2024() + 10000;
                        while (C1468.m5096(f1761) >= 0) {
                            try {
                                if (f1764 != null) {
                                    return true;
                                }
                                long jM2027 = jM2026 - m2024();
                                if (jM2027 <= 0) {
                                    break;
                                }
                                Thread.sleep(Math.min(200L, jM2027));
                            } catch (RuntimeException e) {
                                C0577.m2742("Shizuku peek shared user service error", e);
                            }
                        }
                        if (f1764 != null) {
                            return true;
                        }
                    }
                    return false;
                } catch (RuntimeException e2) {
                    C0577.m2742("Shizuku peek shared user service error", e2);
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000d  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private synchronized void m2018(boolean z) {
        boolean z2;
        if (z) {
            try {
                if (this.f1770) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z2 = false;
        }
        this.f1766 = false;
        m2020();
        this.f1770 = false;
        this.f1768 = null;
        if (z2) {
            try {
                C1468.m5111(f1761);
            } catch (RuntimeException unused) {
            }
            m2005();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2012(C20808 c20808) {
        f1764 = c20808;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static void m2005() {
        f1764 = null;
        for (C0346 c0346 : m2022()) {
            if (c0346.f1766) {
                c0346.f1770 = false;
                c0346.f1768 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m2020() {
        synchronized (f1763) {
            f1760.remove(this);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C0346[] m2022() {
        C0346[] c0346Arr;
        synchronized (f1763) {
            c0346Arr = (C0346[]) f1760.toArray(new C0346[0]);
        }
        return c0346Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m2010(C0346 c0346, C20808 c20808) {
        if (c0346.f1766) {
            c0346.f1768 = c20808;
            c0346.f1770 = true;
            c0346.f1769.countDown();
        }
    }
}
