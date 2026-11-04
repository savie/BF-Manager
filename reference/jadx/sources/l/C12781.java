package l;

import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.۫֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4F2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12781 implements InterfaceC7099 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11289 f40885;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f40886;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C1879 f40887 = new C1879();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f40888;

    public C12781(C11289 c11289) {
        this.f40885 = c11289;
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۙ */
    public final void mo6066(C1879 c1879, long j) throws IOException {
        C1879 c18710 = this.f40887;
        c18710.mo6066(c1879, j);
        while (c18710.size() >= 16384) {
            m31669(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m31669(boolean z) throws IOException {
        C11289 c11289;
        long jMin;
        C11289 c112810;
        synchronized (this.f40885) {
            this.f40885.f35606.m36749();
            while (true) {
                try {
                    c11289 = this.f40885;
                    if (c11289.f35597 > 0 || this.f40888 || this.f40886 || c11289.f35599 != null) {
                        break;
                    }
                    try {
                        c11289.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    this.f40885.f35606.m5608();
                    throw th;
                }
            }
            c11289.f35606.m5608();
            this.f40885.m28544();
            jMin = Math.min(this.f40885.f35597, this.f40887.size());
            c112810 = this.f40885;
            c112810.f35597 -= jMin;
        }
        c112810.f35606.m36749();
        try {
            C11289 c112811 = this.f40885;
            c112811.f35604.m50697(c112811.f35602, z && jMin == this.f40887.size(), this.f40887, jMin);
        } finally {
            this.f40885.f35606.m5608();
        }
    }

    @Override // l.InterfaceC7099, java.io.Flushable
    public final void flush() throws IOException {
        synchronized (this.f40885) {
            this.f40885.m28544();
        }
        while (this.f40887.size() > 0) {
            m31669(false);
            this.f40885.f35604.f72736.flush();
        }
    }

    @Override // l.InterfaceC7099
    /* JADX INFO: renamed from: ۧ */
    public final C22411 mo6067() {
        return this.f40885.f35606;
    }

    @Override // l.InterfaceC7099, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.f40885) {
            if (this.f40886) {
                return;
            }
            if (!this.f40885.f35598.f40888) {
                if (this.f40887.size() > 0) {
                    while (this.f40887.size() > 0) {
                        m31669(true);
                    }
                } else {
                    C11289 c11289 = this.f40885;
                    c11289.f35604.m50697(c11289.f35602, true, (C1879) null, 0L);
                }
            }
            synchronized (this.f40885) {
                this.f40886 = true;
            }
            this.f40885.f35604.f72736.flush();
            this.f40885.m28534();
        }
    }
}
