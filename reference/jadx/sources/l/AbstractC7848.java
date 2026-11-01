package l;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicInteger;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.۠֨ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BMB */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7848 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f25809 = new AtomicInteger();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public volatile int f25810;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile boolean f25811;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public volatile int f25812;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f25813;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f25814;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f25815;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C3073 f25816;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public byte[] f25817;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile boolean f25818;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile int f25819;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile int f25820;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public volatile int f25821 = -1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile int f25822;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public volatile long f25823;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public Thread f25824;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile int f25825;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C7930 f25826;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public volatile boolean f25827;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized void m20732(long j) {
        this.f25823 += j;
        if (this.f25815 > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ۬ */
    public void mo12933() {
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m20738(int i) {
        this.f25821 = i;
        if (this.f25815 > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final synchronized void m20739(long j) {
        this.f25823 = j;
    }

    /* JADX INFO: renamed from: ᩴ */
    public void mo12936() {
    }

    /* JADX INFO: renamed from: ᩺ */
    public abstract void mo19047();

    public AbstractC7848() {
        byte[] bArr = C8491.f29422;
        this.f25817 = "foo".getBytes(StandardCharsets.UTF_8);
        this.f25812 = 1048576;
        this.f25819 = this.f25812;
        this.f25810 = 16384;
        this.f25823 = 0L;
        this.f25822 = 0;
        this.f25826 = null;
        this.f25824 = null;
        this.f25811 = false;
        this.f25813 = false;
        this.f25818 = false;
        this.f25827 = false;
        this.f25825 = 0;
        this.f25820 = 0;
        this.f25815 = 0;
        this.f25814 = f25809.getAndIncrement() & Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo19045(int i) {
        this.f25820 = i;
        try {
            m20740();
            mo12936();
        } catch (Exception e) {
            this.f25818 = false;
            m20737();
            if (e instanceof C5813) {
                throw ((C5813) e);
            }
            throw new C5813(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo20733(C14904 c14904) {
        m20738(c14904.m35638());
        m20739(c14904.m35637());
        this.f25822 = c14904.m35638();
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InputStream m20743() {
        int i;
        C3073 c3073 = this.f25816;
        if (c3073 != null && m20735()) {
            c3073.f11634.m1333().getClass();
        }
        try {
            i = Integer.parseInt(m20728().m9231("max_input_buffer_size"));
        } catch (Exception unused) {
            i = 32768;
        }
        C21253 c21253 = new C21253(i);
        this.f25826.f26045 = new C18431(c21253, 32768 < i);
        return c21253;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo20734(byte[] bArr, int i, int i2) throws IOException {
        try {
            C7930 c7930 = this.f25826;
            c7930.f26045.write(bArr, i, i2);
            c7930.f26045.flush();
        } catch (NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void mo20729() {
        try {
            this.f25826.m20936();
        } catch (NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m20736() {
        if (this.f25811) {
            return;
        }
        this.f25811 = true;
        int i = this.f25821;
        if (i == -1) {
            return;
        }
        try {
            C14904 c14904 = new C14904(100);
            C7307 c7307 = new C7307(c14904);
            c7307.m19501();
            c14904.m35630(UTF8.S_P4B);
            c14904.m35644(i);
            synchronized (this) {
                try {
                    if (!this.f25813) {
                        m20728().m9249(c7307);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20731() {
        if (this.f25813) {
            return;
        }
        this.f25813 = true;
        this.f25811 = true;
        int i = this.f25821;
        if (i == -1) {
            return;
        }
        try {
            C14904 c14904 = new C14904(100);
            C7307 c7307 = new C7307(c14904);
            c7307.m19501();
            c14904.m35630((byte) 97);
            c14904.m35644(i);
            synchronized (this) {
                try {
                    m20728().m9249(c7307);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m20730() {
        return this.f25813;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m20737() {
        try {
            synchronized (this) {
                if (this.f25818) {
                    this.f25818 = false;
                    m20731();
                    this.f25811 = true;
                    this.f25824 = null;
                    try {
                        C7930 c7930 = this.f25826;
                        if (c7930 != null) {
                            c7930.m20932();
                        }
                    } catch (Exception unused) {
                    }
                    C3073 c3073 = this.f25816;
                    if (c3073 != null) {
                        c3073.m9238(this);
                        return;
                    }
                    return;
                }
                C3073 c3074 = this.f25816;
                if (c3074 != null) {
                    c3074.m9238(this);
                }
            }
        } catch (Throwable th) {
            C3073 c3075 = this.f25816;
            if (c3075 != null) {
                c3075.m9238(this);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m20735() {
        C3073 c3073 = this.f25816;
        return c3073 != null && c3073.m9242() && this.f25818;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C3073 m20728() {
        C3073 c3073 = this.f25816;
        if (c3073 != null) {
            return c3073;
        }
        throw new C5813("session is not available");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m20742() throws C5813 {
        C14904 c14904 = new C14904(200);
        C7307 c7307 = new C7307(c14904);
        c7307.m19501();
        c14904.m35630((byte) 91);
        c14904.m35644(this.f25821);
        c14904.m35644(this.f25814);
        c14904.m35644(this.f25819);
        c14904.m35644(this.f25810);
        m20728().m9249(c7307);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m20741() {
        try {
            C14904 c14904 = new C14904(200);
            C7307 c7307 = new C7307(c14904);
            c7307.m19501();
            c14904.m35630((byte) 92);
            c14904.m35644(this.f25821);
            c14904.m35644(1);
            byte[] bArr = C8491.f29422;
            c14904.m35627("open failed".getBytes(StandardCharsets.UTF_8));
            c14904.m35627(C8491.f29422);
            m20728().m9249(c7307);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۚ */
    public C7307 mo19046() {
        C14904 c14904 = new C14904(200);
        C7307 c7307 = new C7307(c14904);
        c7307.m19501();
        c14904.m35630((byte) 90);
        c14904.m35627(this.f25817);
        c14904.m35644(this.f25814);
        c14904.m35644(this.f25819);
        c14904.m35644(this.f25810);
        return c7307;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m20740() throws C5813 {
        C3073 c3073M20728 = m20728();
        if (!c3073M20728.m9242()) {
            throw new C5813("session is down");
        }
        c3073M20728.m9249(mo19046());
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f25820;
        int i = j != 0 ? 1 : 2000;
        synchronized (this) {
            while (this.f25821 == -1 && c3073M20728.m9242() && i > 0) {
                if (j <= 0 || System.currentTimeMillis() - jCurrentTimeMillis <= j) {
                    long j2 = j == 0 ? 10L : j;
                    try {
                        this.f25815 = 1;
                        wait(j2);
                    } catch (InterruptedException unused) {
                    } catch (Throwable th) {
                        this.f25815 = 0;
                        throw th;
                    }
                    this.f25815 = 0;
                    i--;
                } else {
                    i = 0;
                }
            }
        }
        if (!c3073M20728.m9242()) {
            throw new C5813("session is down");
        }
        if (this.f25821 == -1) {
            throw new C5813("channel is not opened.");
        }
        if (!this.f25827) {
            throw new C5813("channel is not opened.");
        }
        this.f25818 = true;
    }
}
