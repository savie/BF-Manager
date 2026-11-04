package l;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۧۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11399 extends AbstractC15128 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f35862;

    public C11399(C16620 c16620, long j) {
        super(c16620);
        this.f35862 = j;
        if (j == 0) {
            m36402(true, null);
        }
    }

    @Override // l.AbstractC15128, l.InterfaceC13810
    /* JADX INFO: renamed from: ᩷ */
    public final long mo4186(C1879 c1879, long j) throws IOException {
        if (this.f49364) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.f35862;
        if (j2 == 0) {
            return -1L;
        }
        long jMo4186 = super.mo4186(c1879, Math.min(j2, 8192L));
        if (jMo4186 == -1) {
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m36402(false, protocolException);
            throw protocolException;
        }
        long j3 = this.f35862 - jMo4186;
        this.f35862 = j3;
        if (j3 == 0) {
            m36402(true, null);
        }
        return jMo4186;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM45606;
        if (this.f49364) {
            return;
        }
        if (this.f35862 != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                zM45606 = C19822.m45606(this, 100);
            } catch (IOException unused) {
                zM45606 = false;
            }
            if (!zM45606) {
                m36402(false, null);
            }
        }
        this.f49364 = true;
    }
}
