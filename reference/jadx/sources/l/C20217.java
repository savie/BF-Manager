package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.᩶ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20217 implements Closeable {

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f65601 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C0140.m1229("OkHttp Http2Connection", true));

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f65602;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final Socket f65603;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f65604;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3282 f65605;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f65606;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C4631 f65608;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final C15984 f65609;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public final C23745 f65611;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC19511 f65612;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f65613;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final ThreadPoolExecutor f65614;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C4631 f65617;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f65620;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f65622;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public boolean f65623;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final ScheduledThreadPoolExecutor f65624;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f65616 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f65625 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f65618 = 0;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f65615 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f65610 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f65619 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f65621 = 0;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public long f65607 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m45680(AbstractRunnableC20602 abstractRunnableC20602) {
        if (!this.f65623) {
            this.f65614.execute(abstractRunnableC20602);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final synchronized void m45689(long j) {
        long j2 = this.f65607 + j;
        this.f65607 = j2;
        if (j2 >= this.f65608.m12788() / 2) {
            m45694(0, this.f65607);
            this.f65607 = 0L;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized int m45690() {
        return this.f65617.m12786();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C11045 m45691(int i) {
        return (C11045) this.f65616.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized C11045 m45703(int i) {
        C11045 c11045;
        c11045 = (C11045) this.f65616.remove(Integer.valueOf(i));
        notifyAll();
        return c11045;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m45705(long j) {
        if (this.f65623) {
            return false;
        }
        return this.f65610 >= this.f65615 || j < this.f65621;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45678(C20217 c20217) {
        c20217.f65610++;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45681(C20217 c20217) {
        c20217.f65625++;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45682(C20217 c20217) {
        c20217.f65619++;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45683(C20217 c20217) {
        c20217.f65618++;
    }

    public C20217(C18099 c18099) {
        C4631 c4631 = new C4631();
        this.f65608 = c4631;
        C4631 c4632 = new C4631();
        this.f65617 = c4632;
        this.f65620 = new LinkedHashSet();
        this.f65605 = InterfaceC3282.f12167;
        this.f65602 = true;
        this.f65612 = c18099.f57870;
        this.f65606 = 3;
        c4631.m12784(7, 16777216);
        String str = c18099.f57867;
        this.f65613 = str;
        Locale locale = Locale.US;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C0140.m1229("OkHttp " + str + " Writer", false));
        this.f65624 = scheduledThreadPoolExecutor;
        if (c18099.f57869 != 0) {
            C18805 c18805 = new C18805(this);
            long j = c18099.f57869;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(c18805, j, j, TimeUnit.MILLISECONDS);
        }
        this.f65614 = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C0140.m1229("OkHttp " + str + " Push Observer", true));
        c4632.m12784(7, 65535);
        c4632.m12784(5, 16384);
        this.f65622 = (long) c4632.m12788();
        this.f65603 = c18099.f57868;
        this.f65611 = new C23745(c18099.f57866);
        this.f65609 = new C15984(this, new C16689(c18099.f57871));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11045 m45692(ArrayList arrayList, boolean z) {
        int i;
        C11045 c11045;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.f65611) {
            synchronized (this) {
                try {
                    if (this.f65606 > 1073741823) {
                        m45700(EnumC9365.REFUSED_STREAM);
                    }
                    if (this.f65623) {
                        throw new C1602();
                    }
                    i = this.f65606;
                    this.f65606 = i + 2;
                    c11045 = new C11045(i, this, z3, false, null);
                    z2 = !z || this.f65622 == 0 || c11045.f37511 == 0;
                    if (c11045.m27864()) {
                        this.f65616.put(Integer.valueOf(i), c11045);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f65611.m52283(arrayList, i, z3);
        }
        if (z2) {
            this.f65611.flush();
        }
        return c11045;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45697(int i, boolean z, C6043 c6043, long j) {
        long j2;
        int iMin;
        long j3;
        if (j == 0) {
            this.f65611.m52281(z, i, c6043, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j2 = this.f65622;
                        if (j2 <= 0) {
                            if (!this.f65616.containsKey(Integer.valueOf(i))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                iMin = Math.min((int) Math.min(j, j2), this.f65611.m52282());
                j3 = iMin;
                this.f65622 -= j3;
            }
            j -= j3;
            this.f65611.m52281(z && j == 0, i, c6043, iMin);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m45704(int i, EnumC9365 enumC9365) {
        try {
            this.f65624.execute(new C1165(this, new Object[]{this.f65613, Integer.valueOf(i)}, i, enumC9365));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45694(int i, long j) {
        try {
            this.f65624.execute(new C13161(this, new Object[]{this.f65613, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45693(int i, int i2, boolean z) {
        try {
            try {
                this.f65611.m52275(i, i2, z);
            } catch (IOException unused) {
                EnumC9365 enumC9365 = EnumC9365.PROTOCOL_ERROR;
                m45701(enumC9365, enumC9365);
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45700(EnumC9365 enumC9365) {
        synchronized (this.f65611) {
            synchronized (this) {
                if (this.f65623) {
                    return;
                }
                this.f65623 = true;
                this.f65611.m52278(this.f65604, enumC9365, C0140.f1168);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        m45701(EnumC9365.NO_ERROR, EnumC9365.CANCEL);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45701(EnumC9365 enumC9365, EnumC9365 enumC9366) throws IOException {
        C11045[] c11045Arr = null;
        try {
            m45700(enumC9365);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.f65616.isEmpty()) {
                c11045Arr = (C11045[]) this.f65616.values().toArray(new C11045[this.f65616.size()]);
                this.f65616.clear();
            }
        }
        if (c11045Arr != null) {
            for (C11045 c11045 : c11045Arr) {
                try {
                    c11045.m27856(enumC9366);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.f65611.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f65603.close();
        } catch (IOException e4) {
            e = e4;
        }
        this.f65624.shutdown();
        this.f65614.shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45679(C20217 c20217) {
        try {
            EnumC9365 enumC9365 = EnumC9365.PROTOCOL_ERROR;
            c20217.m45701(enumC9365, enumC9365);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m45688() {
        C23745 c23745 = this.f65611;
        c23745.m52273();
        C4631 c4631 = this.f65608;
        c23745.m52284(c4631);
        int iM12788 = c4631.m12788();
        if (iM12788 != 65535) {
            c23745.m52276(0, iM12788 - 65535);
        }
        new Thread(this.f65609).start();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m45702() {
        synchronized (this) {
            long j = this.f65610;
            long j2 = this.f65615;
            if (j < j2) {
                return;
            }
            this.f65615 = j2 + 1;
            this.f65621 = System.nanoTime() + 1000000000;
            try {
                this.f65624.execute(new C3987(this, this.f65613));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45698(ArrayList arrayList, int i) {
        synchronized (this) {
            if (this.f65620.contains(Integer.valueOf(i))) {
                m45704(i, EnumC9365.PROTOCOL_ERROR);
                return;
            }
            this.f65620.add(Integer.valueOf(i));
            try {
                m45680(new C6810(this, new Object[]{this.f65613, Integer.valueOf(i)}, i, arrayList));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45699(ArrayList arrayList, int i, boolean z) {
        try {
            m45680(new C23039(this, new Object[]{this.f65613, Integer.valueOf(i)}, i, arrayList, z));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45696(int i, InterfaceC23683 interfaceC23683, int i2, boolean z) throws IOException {
        C6043 c6043 = new C6043();
        long j = i2;
        interfaceC23683.mo16413(j);
        interfaceC23683.mo2293(c6043, j);
        if (c6043.size() != j) {
            throw new IOException(c6043.size() + " != " + i2);
        }
        m45680(new C15278(this, new Object[]{this.f65613, Integer.valueOf(i)}, i, c6043, i2, z));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45695(int i, EnumC9365 enumC9365) {
        m45680(new C21627(this, new Object[]{this.f65613, Integer.valueOf(i)}, i, enumC9365));
    }
}
