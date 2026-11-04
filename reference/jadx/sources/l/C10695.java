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

/* JADX INFO: renamed from: l.ۤۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19AV */
/* JADX INFO: loaded from: classes4.dex */
public final class C10695 implements InterfaceC24911 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C15034 f33936;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ServiceConnection f33938;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static volatile C13721 f33940;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile InterfaceC21884 f33942;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f33943;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f33944;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Object f33937 = new Object();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final ArrayList f33939 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CountDownLatch f33945 = new CountDownLatch(1);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f33941 = true;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f33946 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private synchronized void m27260() {
        this.f33946 = 0;
    }

    @Override // l.InterfaceC24911
    /* JADX INFO: renamed from: ۙ */
    public final C11484 mo6262(String str) {
        return mo6263(str, false);
    }

    @Override // l.InterfaceC24911
    /* JADX INFO: renamed from: ۙ */
    public final C11484 mo6263(String str, boolean z) {
        return mo6261(z ? 0L : 8000L, str);
    }

    @Override // l.InterfaceC24911
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo6265() {
        return mo6264() && getUid() == 0;
    }

    @Override // l.InterfaceC24911
    /* JADX INFO: renamed from: ᩸ */
    public final boolean mo6267() {
        return mo6264() && getUid() == 2000;
    }

    @Override // l.InterfaceC24911
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo6266() {
        if (!mo6264()) {
            return false;
        }
        int uid = getUid();
        return uid == 0 || uid == 2000;
    }

    static {
        C15034 c15034 = new C15034(new ComponentName("bin.mt.plus", BinderC9992.class.getName()));
        c15034.m36189();
        c15034.m36190();
        f33936 = c15034;
        f33938 = new ServiceConnectionC7010();
    }

    public C10695() {
    }

    public C10695(boolean z, boolean z2) throws Throwable {
        boolean zM16301;
        if (C22415.m50555()) {
            C5261.f18540.execute(new RunnableC22951(2));
            throw new IOException("Shizuku can not init in main thread");
        }
        if (m27265()) {
            C20653.m47271("Shizuku reuse shared service, uid=" + this.f33944);
            return;
        }
        if (z2) {
            zM16301 = C5476.m16301(true, null);
        } else {
            zM16301 = C5476.m16301(false, null);
        }
        if (!zM16301) {
            throw new IOException("Shizuku permission denied");
        }
        try {
            if (m27265()) {
                C20653.m47271("Shizuku reuse shared service after permission, uid=" + this.f33944);
                return;
            }
            synchronized (f33937) {
                ArrayList arrayList = f33939;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            C12797.m31689(f33936, f33938);
            this.f33943 = true;
            m27253(z);
            if (this.f33942 == null) {
                throw new IOException("Shizuku service unavailable");
            }
            this.f33944 = ((C13721) this.f33942).f43551.mo25846();
            C20653.m47271("Shizuku init success, uid=" + this.f33944);
        } catch (IOException e) {
            e = e;
            m27262(true);
            C20653.m47267("Shizuku init error", e);
            throw e;
        } catch (Error e2) {
            e = e2;
            m27262(true);
            C20653.m47267("Shizuku init error", e);
            throw e;
        } catch (RuntimeException e3) {
            e = e3;
            m27262(true);
            C20653.m47267("Shizuku init error", e);
            throw e;
        } catch (Exception e4) {
            m27262(true);
            C20653.m47267("Shizuku init error", e4);
            throw new IOException(e4);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static void m27258() {
        try {
            C10695 c10695 = new C10695(false, true);
            if (C7756.m21108(c10695)) {
                return;
            }
            c10695.m27262(false);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27252(final C14467 c14467) throws IOException {
        if (C22415.m50555()) {
            C5261.f18540.execute(new Runnable() { // from class: l.ۖ۠ۧ
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C10695.m27252(c14467);
                    } catch (IOException e) {
                        C20653.m47267("Shizuku prewarm error", e);
                    }
                }
            });
            return;
        }
        if (f33940 != null) {
            return;
        }
        if (!C5476.m16301(true, c14467)) {
            throw new IOException("Shizuku permission denied");
        }
        if (f33940 != null) {
            return;
        }
        C12797.m31689(f33936, f33938);
        try {
            if (m27263()) {
            } else {
                throw new IOException("Shizuku prewarm timeout");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Shizuku prewarm interrupted", e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27250(C13511 c13511) {
        RunnableC22836 runnableC22836;
        try {
            C20653.m47271("Shell.create shizuku (try again)");
            boolean z = true;
            C10695 c10695 = new C10695(true, true);
            if (!C7756.m21108(c10695)) {
                z = false;
                c10695.m27262(false);
            }
            if (z) {
                C21576.m49068(new RunnableC22951(1));
            }
            runnableC22836 = new RunnableC22836(5, c13511);
        } catch (Throwable th) {
            try {
                C20653.m47267("Shell.error", th);
                runnableC22836 = new RunnableC22836(5, c13511);
            } catch (Throwable th2) {
                C21576.m49068(new RunnableC22836(5, c13511));
                throw th2;
            }
        }
        C21576.m49068(runnableC22836);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27253(boolean z) throws IOException {
        CountDownLatch countDownLatch = this.f33945;
        if (countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
            return;
        }
        C20653.m47271("Shizuku bind callback timeout");
        long jMax = Math.max(0L, 10000L) + m27264();
        boolean z2 = false;
        while (true) {
            long jM27264 = jMax - m27264();
            if (jM27264 <= 0) {
                if (z2) {
                    C20653.m47271("Shizuku callback still pending, request connected callback again");
                    C12797.m31689(f33936, f33938);
                    this.f33943 = true;
                    long jMax2 = Math.max(0L, 10000L) + m27264();
                    while (m27254(this)) {
                        long jM27265 = jMax2 - m27264();
                        if (jM27265 <= 0) {
                            break;
                        } else if (countDownLatch.await(Math.min(Math.max(1L, 200L), jM27265), TimeUnit.MILLISECONDS)) {
                            return;
                        }
                    }
                }
                C20653.m47271("Shizuku timeout");
                if (z) {
                    C21576.m49068(new RunnableC13254(4));
                }
                throw new IOException("Shizuku timeout");
            }
            if (countDownLatch.await(Math.min(Math.max(1L, 200L), jM27264), TimeUnit.MILLISECONDS)) {
                return;
            }
            if (!z2 && m27254(this)) {
                z2 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m27254(C10695 c10695) {
        try {
            return C12797.m31685(f33936) >= 0;
        } catch (RuntimeException e) {
            C20653.m47267("Shizuku peek user service error", e);
            return false;
        }
    }

    @Override // l.InterfaceC24911
    /* JADX INFO: renamed from: ۙ */
    public final C11484 mo6261(long j, String str) {
        long j2;
        InterfaceC21884 interfaceC21884 = this.f33942;
        if (interfaceC21884 != null) {
            final C1044 c1044 = new C1044(interfaceC21884, str, j);
            Future futureSubmit = C5261.f18540.submit(new Callable() { // from class: l.ۡ۠ۧ
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return (C4730) c1044.get();
                }
            });
            if (j <= 0) {
                j2 = 0;
            } else {
                try {
                    long jMax = Math.max(300L, Math.min(1500L, j / 4));
                    j2 = C25227.FOREVER_NS;
                    if (j < C25227.FOREVER_NS - jMax) {
                        j2 = j + jMax;
                    }
                } catch (InterruptedException e) {
                    futureSubmit.cancel(true);
                    Thread.currentThread().interrupt();
                    return new C11484(e.toString(), new String[0]);
                } catch (ExecutionException e2) {
                    throw new RuntimeException(e2);
                } catch (TimeoutException unused) {
                    futureSubmit.cancel(true);
                    m27262(true);
                    return new C11484("Binder response timeout", new String[0]);
                }
            }
            return m27248((C4730) (j2 > 0 ? futureSubmit.get(j2, TimeUnit.MILLISECONDS) : futureSubmit.get()));
        }
        return new C11484("Closed", new String[0]);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4730 m27247(InterfaceC21884 interfaceC21884, String str, long j) {
        try {
            return m27246(((C13721) interfaceC21884).f43551.mo25847(j > 2147483647L ? Integer.MAX_VALUE : (int) j, "sh", str + "\nexit\n"));
        } catch (RemoteException e) {
            return new C4730(2, new C11484(e.toString(), new String[0]), true);
        } catch (IOException e2) {
            return new C4730(2, new C11484(e2.toString(), new String[0]), true);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C11484 m27248(C4730 c4730) {
        if (c4730.f16657) {
            m27262(true);
            return c4730.f16656;
        }
        if (c4730.f16658 != 1) {
            m27260();
            return c4730.f16656;
        }
        synchronized (this) {
            int i = this.f33946 + 1;
            this.f33946 = i;
            if (i >= 3) {
                m27262(true);
            }
        }
        return c4730.f16656;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static long m27264() {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4730 m27246(Bundle bundle) throws IOException {
        if (bundle == null) {
            return new C4730(2, new C11484("Empty result", new String[0]), false);
        }
        return new C4730(bundle.getInt(c.a, 2), new C11484(m27245(d.O, "error_gzip", bundle), m27245("output", "output_gzip", bundle).split("\n")), false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m27245(String str, String str2, Bundle bundle) throws IOException {
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

    @Override // l.InterfaceC24911
    public final int getUid() {
        return this.f33944;
    }

    @Override // l.InterfaceC24911
    public final void close() {
        m27262(false);
    }

    @Override // l.InterfaceC24911
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo6264() {
        return this.f33941 && this.f33942 != null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m27265() {
        C13721 c13721 = f33940;
        if (c13721 == null) {
            return false;
        }
        try {
            this.f33944 = c13721.f43551.mo25846();
            this.f33942 = c13721;
            this.f33943 = true;
            synchronized (f33937) {
                ArrayList arrayList = f33939;
                if (!arrayList.contains(this)) {
                    arrayList.add(this);
                }
            }
            this.f33945.countDown();
            return true;
        } catch (RemoteException unused) {
            m27244();
            return false;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m27256() {
        C13721 c13721 = f33940;
        if (c13721 == null) {
            return false;
        }
        try {
            c13721.f43551.mo25846();
            return true;
        } catch (RemoteException unused) {
            m27244();
            return false;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m27263() throws InterruptedException {
        long jM27264 = m27264() + 5000;
        while (f33940 == null) {
            long jM27265 = jM27264 - m27264();
            if (jM27265 > 0) {
                Thread.sleep(Math.min(200L, jM27265));
            } else {
                try {
                    C15034 c15034 = f33936;
                    if (C12797.m31685(c15034) >= 0) {
                        C20653.m47271("Shizuku shared callback still pending, request connected callback again");
                        C12797.m31689(c15034, f33938);
                        long jM27266 = m27264() + 10000;
                        while (C12797.m31685(f33936) >= 0) {
                            try {
                                if (f33940 != null) {
                                    return true;
                                }
                                long jM27267 = jM27266 - m27264();
                                if (jM27267 <= 0) {
                                    break;
                                }
                                Thread.sleep(Math.min(200L, jM27267));
                            } catch (RuntimeException e) {
                                C20653.m47267("Shizuku peek shared user service error", e);
                            }
                        }
                        if (f33940 != null) {
                            return true;
                        }
                    }
                    return false;
                } catch (RuntimeException e2) {
                    C20653.m47267("Shizuku peek shared user service error", e2);
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x000d  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private synchronized void m27262(boolean z) {
        boolean z2;
        if (z) {
            try {
                if (this.f33943) {
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
        this.f33941 = false;
        m27259();
        this.f33943 = false;
        this.f33942 = null;
        if (z2) {
            try {
                C12797.m31702(f33936);
            } catch (RuntimeException unused) {
            }
            m27244();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27251(C13721 c13721) {
        f33940 = c13721;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27244() {
        f33940 = null;
        for (C10695 c10695 : m27261()) {
            if (c10695.f33941) {
                c10695.f33943 = false;
                c10695.f33942 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m27259() {
        synchronized (f33937) {
            f33939.remove(this);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C10695[] m27261() {
        C10695[] c10695Arr;
        synchronized (f33937) {
            c10695Arr = (C10695[]) f33939.toArray(new C10695[0]);
        }
        return c10695Arr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27249(C10695 c10695, C13721 c13721) {
        if (c10695.f33941) {
            c10695.f33942 = c13721;
            c10695.f33943 = true;
            c10695.f33945.countDown();
        }
    }
}
