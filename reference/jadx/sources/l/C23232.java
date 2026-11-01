package l;

/* JADX INFO: renamed from: l.᩺᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final class C23232 implements AutoCloseable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C16881 f75387;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20409 f75388;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2916 f75389;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7522 f75390;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6111 f75391;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C22380 f75392;

    public C23232(C20409 c20409, C6111 c6111, InterfaceC2916 interfaceC2916, C7522 c7522, C16881 c16881, C22380 c22380) {
        this.f75388 = c20409;
        this.f75391 = c6111;
        this.f75389 = interfaceC2916;
        this.f75390 = c7522;
        this.f75387 = c16881;
        this.f75392 = c22380;
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m51268() {
        C20409 c20409 = this.f75388;
        if (c20409.f66148 != null || !c20409.f66146) {
            return false;
        }
        C6111 c6111 = c20409.f66125;
        C6111 c6112 = this.f75391;
        return c6111 == c6112 && c6112.m17000() == this.f75389 && this.f75387.f53983.mo33986().equals(c20409.m13346().f53983.mo33986());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51267() {
        if (m51268()) {
            C22380 c22380 = this.f75392;
            C20409 c20409 = this.f75388;
            boolean zM49639 = c22380.m49639(c20409.f66123);
            C6111 c6111 = this.f75391;
            boolean z = zM49639 && c6111.m16895(this.f75390);
            if (m51268()) {
                c20409.m13342(c20409.m46130(c6111.m17040()));
                c20409.f16887.m18579(c20409.m13338() || c20409.f66126);
                c20409.m46126();
            }
            if (z && m51268()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f75392.close();
    }
}
