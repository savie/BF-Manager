package l;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۧۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10776 extends AbstractC16420 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f36725;

    public C10776(C14304 c14304, long j) {
        super(c14304);
        this.f36725 = j;
        if (j == 0) {
            m38677(true, null);
        }
    }

    @Override // l.AbstractC16420, l.InterfaceC10008
    /* JADX INFO: renamed from: ܰ */
    public final long mo2293(C6043 c6043, long j) throws IOException {
        if (this.f52837) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.f36725;
        if (j2 == 0) {
            return -1L;
        }
        long jMo2293 = super.mo2293(c6043, Math.min(j2, 8192L));
        if (jMo2293 == -1) {
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m38677(false, protocolException);
            throw protocolException;
        }
        long j3 = this.f36725 - jMo2293;
        this.f36725 = j3;
        if (j3 == 0) {
            m38677(true, null);
        }
        return jMo2293;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM1236;
        if (this.f52837) {
            return;
        }
        if (this.f36725 != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zM1236 = C0140.m1236(this, 100);
            } catch (IOException unused) {
                zM1236 = false;
            }
            if (!zM1236) {
                m38677(false, null);
            }
        }
        this.f52837 = true;
    }
}
