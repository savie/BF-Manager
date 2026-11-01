package l;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: l.֡ۜ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K6XC */
/* JADX INFO: loaded from: classes2.dex */
public final class C0248 implements InterfaceC18428 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16477 f1475;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16207 f1476;

    public C0248(C16207 c16207, C16477 c16477) {
        this.f1476 = c16207;
        this.f1475 = c16477;
    }

    @Override // l.InterfaceC18428
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long mo1684(OutputStream outputStream) {
        C16477 c16477 = this.f1475;
        C12244 c12244 = new C12244((FilterOutputStream) outputStream);
        try {
            long jM38316 = this.f1476.m38316(c12244);
            if (jM38316 != c12244.f40977) {
                throw C5893.m16125("Local source byte count does not match bytes written.");
            }
            C16477.m38743(c16477, c12244);
            return jM38316;
        } catch (Throwable th) {
            C16477.m38743(c16477, c12244);
            throw th;
        }
    }

    @Override // l.InterfaceC18428
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1685(long j) {
        this.f1476.m38317(j);
    }
}
