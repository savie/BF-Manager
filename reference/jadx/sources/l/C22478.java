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

/* JADX INFO: renamed from: l.᩸֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes.dex */
public final class C22478 implements Closeable {

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f72723 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C19822.m45599("OkHttp Http2Connection", true));

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f72724;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f72725;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public C3086 f72728;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final AbstractC8416 f72730;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f72732;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final ThreadPoolExecutor f72735;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public final C24716 f72736;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final Socket f72737;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f72738;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f72740;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f72741;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final C10543 f72743;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f72744;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C3086 f72745;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23224 f72746;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final ScheduledThreadPoolExecutor f72747;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f72729 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f72733 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f72727 = 0;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f72731 = 0;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f72734 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f72739 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f72742 = 0;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public long f72726 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized void m50679(AbstractRunnableC22060 abstractRunnableC22060) {
        if (!this.f72740) {
            this.f72735.execute(abstractRunnableC22060);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized int m50690() {
        return this.f72745.m10058();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C11289 m50691(int i) {
        return (C11289) this.f72729.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized C11289 m50703(int i) {
        C11289 c11289;
        c11289 = (C11289) this.f72729.remove(Integer.valueOf(i));
        notifyAll();
        return c11289;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m50706(long j) {
        if (this.f72740) {
            return false;
        }
        return this.f72734 >= this.f72731 || j < this.f72742;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final synchronized void m50707(long j) {
        long j2 = this.f72726 + j;
        this.f72726 = j2;
        if (j2 >= this.f72728.m10060() / 2) {
            m50694(0, this.f72726);
            this.f72726 = 0L;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50678(C22478 c22478) {
        c22478.f72734++;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50682(C22478 c22478) {
        c22478.f72727++;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50683(C22478 c22478) {
        c22478.f72739++;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m50687(C22478 c22478) {
        c22478.f72733++;
    }

    public C22478(C0959 c0959) {
        C3086 c3086 = new C3086();
        this.f72728 = c3086;
        C3086 c3087 = new C3086();
        this.f72745 = c3087;
        this.f72724 = new LinkedHashSet();
        this.f72746 = InterfaceC23224.f75233;
        this.f72741 = true;
        this.f72730 = c0959.f3517;
        this.f72738 = 3;
        c3086.m10056(7, 16777216);
        String str = c0959.f3513;
        this.f72725 = str;
        Locale locale = Locale.US;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C19822.m45599("OkHttp " + str + " Writer", false));
        this.f72747 = scheduledThreadPoolExecutor;
        if (c0959.f3514 != 0) {
            C9161 c9161 = new C9161(this);
            long j = c0959.f3514;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(c9161, j, j, TimeUnit.MILLISECONDS);
        }
        this.f72735 = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C19822.m45599("OkHttp " + str + " Push Observer", true));
        c3087.m10056(7, 65535);
        c3087.m10056(5, 16384);
        this.f72744 = (long) c3087.m10060();
        this.f72737 = c0959.f3516;
        this.f72736 = new C24716(c0959.f3518);
        this.f72743 = new C10543(this, new C15018(c0959.f3515));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11289 m50692(ArrayList arrayList, boolean z) {
        int i;
        C11289 c11289;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.f72736) {
            synchronized (this) {
                try {
                    if (this.f72738 > 1073741823) {
                        m50700(EnumC15874.REFUSED_STREAM);
                    }
                    if (this.f72740) {
                        throw new C17366();
                    }
                    i = this.f72738;
                    this.f72738 = i + 2;
                    c11289 = new C11289(i, this, z3, false, null);
                    z2 = !z || this.f72744 == 0 || c11289.f35597 == 0;
                    if (c11289.m28542()) {
                        this.f72729.put(Integer.valueOf(i), c11289);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f72736.m55192(arrayList, i, z3);
        }
        if (z2) {
            this.f72736.flush();
        }
        return c11289;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50697(int i, boolean z, C1879 c1879, long j) {
        long j2;
        int iMin;
        long j3;
        if (j == 0) {
            this.f72736.m55190(z, i, c1879, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j2 = this.f72744;
                        if (j2 <= 0) {
                            if (!this.f72729.containsKey(Integer.valueOf(i))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                iMin = Math.min((int) Math.min(j, j2), this.f72736.m55191());
                j3 = iMin;
                this.f72744 -= j3;
            }
            j -= j3;
            this.f72736.m55190(z && j == 0, i, c1879, iMin);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50705(int i, EnumC15874 enumC15874) {
        try {
            this.f72747.execute(new C14382(this, new Object[]{this.f72725, Integer.valueOf(i)}, i, enumC15874));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50694(int i, long j) {
        try {
            this.f72747.execute(new C21096(this, new Object[]{this.f72725, Integer.valueOf(i)}, i, j));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50693(int i, int i2, boolean z) {
        try {
            try {
                this.f72736.m55184(i, i2, z);
            } catch (IOException unused) {
                EnumC15874 enumC15874 = EnumC15874.PROTOCOL_ERROR;
                m50701(enumC15874, enumC15874);
            }
        } catch (IOException unused2) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50700(EnumC15874 enumC15874) {
        synchronized (this.f72736) {
            synchronized (this) {
                if (this.f72740) {
                    return;
                }
                this.f72740 = true;
                this.f72736.m55187(this.f72732, enumC15874, C19822.f63715);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        m50701(EnumC15874.NO_ERROR, EnumC15874.CANCEL);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50701(EnumC15874 enumC15874, EnumC15874 enumC15875) throws IOException {
        C11289[] c11289Arr = null;
        try {
            m50700(enumC15874);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.f72729.isEmpty()) {
                c11289Arr = (C11289[]) this.f72729.values().toArray(new C11289[this.f72729.size()]);
                this.f72729.clear();
            }
        }
        if (c11289Arr != null) {
            for (C11289 c11289 : c11289Arr) {
                try {
                    c11289.m28536(enumC15875);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.f72736.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f72737.close();
        } catch (IOException e4) {
            e = e4;
        }
        this.f72747.shutdown();
        this.f72735.shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50680(C22478 c22478) {
        try {
            EnumC15874 enumC15874 = EnumC15874.PROTOCOL_ERROR;
            c22478.m50701(enumC15874, enumC15874);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m50702() {
        C24716 c24716 = this.f72736;
        c24716.m55182();
        C3086 c3086 = this.f72728;
        c24716.m55193(c3086);
        int iM10060 = c3086.m10060();
        if (iM10060 != 65535) {
            c24716.m55185(0, iM10060 - 65535);
        }
        new Thread(this.f72743).start();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50704() {
        synchronized (this) {
            long j = this.f72734;
            long j2 = this.f72731;
            if (j < j2) {
                return;
            }
            this.f72731 = j2 + 1;
            this.f72742 = System.nanoTime() + 1000000000;
            try {
                this.f72747.execute(new C18112(this, this.f72725));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50698(ArrayList arrayList, int i) {
        synchronized (this) {
            if (this.f72724.contains(Integer.valueOf(i))) {
                m50705(i, EnumC15874.PROTOCOL_ERROR);
                return;
            }
            this.f72724.add(Integer.valueOf(i));
            try {
                m50679(new C0213(this, new Object[]{this.f72725, Integer.valueOf(i)}, i, arrayList));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50699(ArrayList arrayList, int i, boolean z) {
        try {
            m50679(new C7671(this, new Object[]{this.f72725, Integer.valueOf(i)}, i, arrayList, z));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50696(int i, InterfaceC25000 interfaceC25000, int i2, boolean z) throws IOException {
        C1879 c1879 = new C1879();
        long j = i2;
        interfaceC25000.mo4184(j);
        interfaceC25000.mo4186(c1879, j);
        if (c1879.size() != j) {
            throw new IOException(c1879.size() + " != " + i2);
        }
        m50679(new C18858(this, new Object[]{this.f72725, Integer.valueOf(i)}, i, c1879, i2, z));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50695(int i, EnumC15874 enumC15874) {
        m50679(new C9907(this, new Object[]{this.f72725, Integer.valueOf(i)}, i, enumC15874));
    }
}
