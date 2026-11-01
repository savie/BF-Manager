package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: l.ۢ᩷ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: D739 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9828 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f33594;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12257 f33595;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16178 f33596;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f33597;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C17588 f33598;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final byte[] f33599 = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f33600;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f33601;

    public C9828(C17588 c17588, C12257 c12257) {
        this.f33598 = c17588;
        this.f33596 = c17588.m40887();
        this.f33595 = c12257;
        this.f33600 = c17588.m40886().mo7576(c12257);
        this.f33594 = c12257.f41009;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m24934() {
        this.f33601 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24933() throws Exception {
        long jMo9272;
        if (this.f33601) {
            throw new InterruptedIOException();
        }
        InterfaceC16178 interfaceC16178 = this.f33596;
        String str = this.f33600;
        C12257 c12257 = this.f33595;
        interfaceC16178.mo36706(str, c12257.f41009, c12257.f41017);
        long j = c12257.f41017;
        if (j != -1) {
            this.f33597 = c12257.f41009 + j;
        } else {
            long jM40151 = C17214.m40151(this.f33596.mo36698(this.f33600));
            if (jM40151 == -1) {
                jM40151 = -1;
            }
            this.f33597 = jM40151;
        }
        while (true) {
            long j2 = this.f33597;
            if (j2 != -1 && this.f33594 >= j2) {
                return;
            }
            if (this.f33601) {
                throw new InterruptedIOException();
            }
            long j3 = this.f33597;
            long jMo36696 = this.f33596.mo36696(this.f33600, this.f33594, j3 == -1 ? Long.MAX_VALUE : j3 - this.f33594);
            if (jMo36696 > 0) {
                this.f33594 += jMo36696;
            } else {
                long j4 = -jMo36696;
                if (j4 == C17492.FOREVER_NS) {
                    j4 = -1;
                }
                long j5 = this.f33594;
                C17588 c17588 = this.f33598;
                boolean z = true;
                boolean z2 = j5 + j4 == this.f33597 || j4 == -1;
                if (j4 != -1) {
                    C16490 c16490M30477 = c12257.m30477();
                    c16490M30477.m38762(j5);
                    c16490M30477.m38755(j4);
                    try {
                        jMo9272 = c17588.mo9272(c16490M30477.m38753());
                    } catch (Exception unused) {
                        C22851.m50584(c17588);
                        z = false;
                        jMo9272 = -1;
                    }
                } else {
                    z = false;
                    jMo9272 = -1;
                }
                if (!z) {
                    if (this.f33601) {
                        throw new InterruptedIOException();
                    }
                    C16490 c16490M30478 = c12257.m30477();
                    c16490M30478.m38762(j5);
                    c16490M30478.m38755(-1L);
                    try {
                        jMo9272 = c17588.mo9272(c16490M30478.m38753());
                    } catch (Exception e) {
                        C22851.m50584(c17588);
                        throw e;
                    }
                }
                if (z2 && jMo9272 != -1) {
                    long j6 = jMo9272 + j5;
                    try {
                        if (this.f33597 != j6) {
                            this.f33597 = j6;
                        }
                    } catch (Exception e2) {
                        C22851.m50584(c17588);
                        throw e2;
                    }
                }
                int i = 0;
                int i2 = 0;
                while (i != -1) {
                    if (this.f33601) {
                        throw new InterruptedIOException();
                    }
                    byte[] bArr = this.f33599;
                    i = c17588.read(bArr, 0, bArr.length);
                    if (i != -1) {
                        i2 += i;
                    }
                }
                if (z2) {
                    long j7 = ((long) i2) + j5;
                    if (this.f33597 != j7) {
                        this.f33597 = j7;
                    }
                }
                c17588.close();
                this.f33594 = j5 + ((long) i2);
            }
        }
    }
}
