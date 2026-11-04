package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩺ۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: U4FJ */
/* JADX INFO: loaded from: classes.dex */
public final class C24080 extends AbstractC16048 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3942 f77862;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f77863;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f77864;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24080(C3942 c3942, InterfaceC13810 interfaceC13810) {
        super(interfaceC13810);
        this.f77862 = c3942;
        this.f77863 = false;
        this.f77864 = 0L;
    }

    @Override // l.AbstractC16048, l.InterfaceC13810
    /* JADX INFO: renamed from: ᩷ */
    public final long mo4186(C1879 c1879, long j) throws IOException {
        try {
            long jMo4186 = m38210().mo4186(c1879, 8192L);
            if (jMo4186 > 0) {
                this.f77864 += jMo4186;
            }
            return jMo4186;
        } catch (IOException e) {
            if (!this.f77863) {
                this.f77863 = true;
                C3942 c3942 = this.f77862;
                c3942.f13449.m44181(false, (InterfaceC2668) c3942, e);
            }
            throw e;
        }
    }

    @Override // l.AbstractC16048, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.f77863) {
            return;
        }
        this.f77863 = true;
        C3942 c3942 = this.f77862;
        c3942.f13449.m44181(false, (InterfaceC2668) c3942, (IOException) null);
    }
}
