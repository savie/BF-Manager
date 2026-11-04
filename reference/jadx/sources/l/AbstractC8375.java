package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.۠ۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BMB */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8375 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f27467 = new AtomicInteger();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public volatile int f27468;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C15723 f27469;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f27470;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public volatile int f27471;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile boolean f27472;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f27473;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f27474;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile int f27475;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8878 f27476;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public volatile int f27477;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile int f27478 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile int f27479;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f27480;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public Thread f27481;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile int f27482;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f27483;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile long f27484;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public volatile boolean f27485;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m22539(long j) {
        this.f27484 += j;
        if (this.f27473 > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۚ */
    public void mo13414() {
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m22549(int i) {
        this.f27478 = i;
        if (this.f27473 > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final synchronized void m22550(long j) {
        this.f27484 = j;
    }

    /* JADX INFO: renamed from: ᩹ */
    public void mo13415() {
    }

    /* JADX INFO: renamed from: ᩻ */
    public abstract void mo6777();

    public AbstractC8375() {
        byte[] bArr = C9011.f29358;
        this.f27474 = "foo".getBytes(StandardCharsets.UTF_8);
        this.f27468 = 1048576;
        this.f27471 = this.f27468;
        this.f27475 = 16384;
        this.f27484 = 0L;
        this.f27477 = 0;
        this.f27476 = null;
        this.f27481 = null;
        this.f27483 = false;
        this.f27470 = false;
        this.f27472 = false;
        this.f27485 = false;
        this.f27479 = 0;
        this.f27482 = 0;
        this.f27473 = 0;
        this.f27480 = f27467.getAndIncrement() & Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo22538(int i) throws C2079 {
        this.f27482 = i;
        try {
            m22545();
            mo13415();
        } catch (Exception e) {
            this.f27472 = false;
            m22548();
            if (e instanceof C2079) {
                throw ((C2079) e);
            }
            throw new C2079(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo16726(C9866 c9866) {
        m22549(c9866.m25658());
        m22550(c9866.m25662());
        this.f27477 = c9866.m25658();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InputStream m22543() {
        int i;
        C15723 c15723 = this.f27469;
        if (c15723 != null && m22541()) {
            c15723.f51127.m45899().getClass();
        }
        try {
            i = Integer.parseInt(m22542().m37607("max_input_buffer_size"));
        } catch (Exception unused) {
            i = 32768;
        }
        C0918 c0918 = new C0918(i);
        this.f27476.f29003 = new C2409(c0918, 32768 < i);
        return c0918;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo19148(byte[] bArr, int i, int i2) throws IOException {
        try {
            C8878 c8878 = this.f27476;
            c8878.f29003.write(bArr, i, i2);
            c8878.f29003.flush();
        } catch (NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩸ */
    public void mo19149() {
        try {
            this.f27476.m23761();
        } catch (NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m22540() {
        if (this.f27483) {
            return;
        }
        this.f27483 = true;
        int i = this.f27478;
        if (i == -1) {
            return;
        }
        try {
            C9866 c9866 = new C9866(100);
            C14010 c14010 = new C14010(c9866);
            c14010.m34100();
            c9866.m25651(UTF8.S_P4B);
            c9866.m25669(i);
            synchronized (this) {
                try {
                    if (!this.f27470) {
                        m22542().m37627(c14010);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22537() {
        if (this.f27470) {
            return;
        }
        this.f27470 = true;
        this.f27483 = true;
        int i = this.f27478;
        if (i == -1) {
            return;
        }
        try {
            C9866 c9866 = new C9866(100);
            C14010 c14010 = new C14010(c9866);
            c14010.m34100();
            c9866.m25651((byte) 97);
            c9866.m25669(i);
            synchronized (this) {
                try {
                    m22542().m37627(c14010);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22536() {
        return this.f27470;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m22548() {
        try {
            synchronized (this) {
                if (this.f27472) {
                    this.f27472 = false;
                    m22537();
                    this.f27483 = true;
                    this.f27481 = null;
                    try {
                        C8878 c8878 = this.f27476;
                        if (c8878 != null) {
                            c8878.m23757();
                        }
                    } catch (Exception unused) {
                    }
                    C15723 c15723 = this.f27469;
                    if (c15723 != null) {
                        c15723.m37612(this);
                        return;
                    }
                    return;
                }
                C15723 c15724 = this.f27469;
                if (c15724 != null) {
                    c15724.m37612(this);
                }
            }
        } catch (Throwable th) {
            C15723 c15725 = this.f27469;
            if (c15725 != null) {
                c15725.m37612(this);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m22541() {
        C15723 c15723 = this.f27469;
        return c15723 != null && c15723.m37620() && this.f27472;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C15723 m22542() {
        C15723 c15723 = this.f27469;
        if (c15723 != null) {
            return c15723;
        }
        throw new C2079("session is not available");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m22546() throws C2079 {
        C9866 c9866 = new C9866(200);
        C14010 c14010 = new C14010(c9866);
        c14010.m34100();
        c9866.m25651((byte) 91);
        c9866.m25669(this.f27478);
        c9866.m25669(this.f27480);
        c9866.m25669(this.f27471);
        c9866.m25669(this.f27475);
        m22542().m37627(c14010);
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m22544() {
        try {
            C9866 c9866 = new C9866(200);
            C14010 c14010 = new C14010(c9866);
            c14010.m34100();
            c9866.m25651((byte) 92);
            c9866.m25669(this.f27478);
            c9866.m25669(1);
            byte[] bArr = C9011.f29358;
            c9866.m25673("open failed".getBytes(StandardCharsets.UTF_8));
            c9866.m25673(C9011.f29358);
            m22542().m37627(c14010);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C14010 mo22547() {
        C9866 c9866 = new C9866(200);
        C14010 c14010 = new C14010(c9866);
        c14010.m34100();
        c9866.m25651((byte) 90);
        c9866.m25673(this.f27474);
        c9866.m25669(this.f27480);
        c9866.m25669(this.f27471);
        c9866.m25669(this.f27475);
        return c14010;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m22545() throws C2079 {
        C15723 c15723M22542 = m22542();
        if (!c15723M22542.m37620()) {
            throw new C2079("session is down");
        }
        c15723M22542.m37627(mo22547());
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f27482;
        int i = j != 0 ? 1 : 2000;
        synchronized (this) {
            while (this.f27478 == -1 && c15723M22542.m37620() && i > 0) {
                if (j <= 0 || System.currentTimeMillis() - jCurrentTimeMillis <= j) {
                    long j2 = j == 0 ? 10L : j;
                    try {
                        this.f27473 = 1;
                        wait(j2);
                    } catch (InterruptedException unused) {
                    } catch (Throwable th) {
                        this.f27473 = 0;
                        throw th;
                    }
                    this.f27473 = 0;
                    i--;
                } else {
                    i = 0;
                }
            }
        }
        if (!c15723M22542.m37620()) {
            throw new C2079("session is down");
        }
        if (this.f27478 == -1) {
            throw new C2079("channel is not opened.");
        }
        if (!this.f27485) {
            throw new C2079("channel is not opened.");
        }
        this.f27472 = true;
    }
}
