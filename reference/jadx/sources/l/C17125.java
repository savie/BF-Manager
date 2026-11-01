package l;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܿۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4E9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17125 extends AbstractC16420 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14304 f54610;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14440 f54611;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f54612;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f54613;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17125(C14304 c14304, C14440 c14440) {
        super(c14304);
        this.f54610 = c14304;
        this.f54612 = -1L;
        this.f54613 = true;
        this.f54611 = c14440;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        if (r10.f54613 == false) goto L32;
     */
    @Override // l.AbstractC16420, l.InterfaceC10008
    /* JADX INFO: renamed from: ܰ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo2293(l.C6043 r11, long r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17125.mo2293(l.ۛۨ᩵, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM1236;
        if (this.f52837) {
            return;
        }
        if (this.f54613) {
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
