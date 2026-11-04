package l;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۚۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5434 extends AbstractC15128 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C16903 f18929;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f18930;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16620 f18931;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f18932;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5434(C16620 c16620, C16903 c16903) {
        super(c16620);
        this.f18931 = c16620;
        this.f18930 = -1L;
        this.f18932 = true;
        this.f18929 = c16903;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if (r10.f18932 == false) goto L32;
     */
    @Override // l.AbstractC15128, l.InterfaceC13810
    /* JADX INFO: renamed from: ᩷ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo4186(l.C1879 r11, long r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5434.mo4186(l.֫ۧۨ, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM45606;
        if (this.f49364) {
            return;
        }
        if (this.f18932) {
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
