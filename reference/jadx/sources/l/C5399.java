package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۚܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: U4FJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5399 extends AbstractC9572 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f18633;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22333 f18634;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f18635;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5399(C22333 c22333, InterfaceC10008 interfaceC10008) {
        super(interfaceC10008);
        this.f18634 = c22333;
        this.f18633 = false;
        this.f18635 = 0L;
    }

    @Override // l.AbstractC9572, l.InterfaceC10008
    /* JADX INFO: renamed from: ܰ */
    public final long mo2293(C6043 c6043, long j) throws IOException {
        try {
            long jMo2293 = m24438().mo2293(c6043, 8192L);
            if (jMo2293 > 0) {
                this.f18635 += jMo2293;
            }
            return jMo2293;
        } catch (IOException e) {
            if (!this.f18633) {
                this.f18633 = true;
                C22333 c22333 = this.f18634;
                c22333.f72917.m36001(false, (InterfaceC7953) c22333, e);
            }
            throw e;
        }
    }

    @Override // l.AbstractC9572, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f18633) {
            return;
        }
        this.f18633 = true;
        C22333 c22333 = this.f18634;
        c22333.f72917.m36001(false, (InterfaceC7953) c22333, (IOException) null);
    }
}
