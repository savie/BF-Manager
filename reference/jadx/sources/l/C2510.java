package l;

/* JADX INFO: renamed from: l.ۖ۟ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8PO */
/* JADX INFO: loaded from: classes3.dex */
public final class C2510 implements InterfaceC11986 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C7445 f8029 = C7445.f24498;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f8030;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f8031;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14814 f8032;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f8033;

    @Override // l.InterfaceC11986
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean mo8398() {
        return false;
    }

    public C2510(InterfaceC14814 interfaceC14814) {
        this.f8032 = interfaceC14814;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8394() {
        if (this.f8030) {
            return;
        }
        this.f8031 = this.f8032.mo2210();
        this.f8030 = true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m8399() {
        if (this.f8030) {
            m8395(mo8400());
            this.f8030 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8395(long j) {
        this.f8033 = j;
        if (this.f8030) {
            this.f8031 = this.f8032.mo2210();
        }
    }

    @Override // l.InterfaceC11986
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long mo8400() {
        long jM20396;
        long j = this.f8033;
        if (!this.f8030) {
            return j;
        }
        long jMo2210 = this.f8032.mo2210() - this.f8031;
        C7445 c7445 = this.f8029;
        if (c7445.f24500 == 1.0f) {
            jM20396 = C7116.m19474(jMo2210);
        } else {
            jM20396 = c7445.m20396(jMo2210);
        }
        return jM20396 + j;
    }

    @Override // l.InterfaceC11986
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo8396(C7445 c7445) {
        if (this.f8030) {
            m8395(mo8400());
        }
        this.f8029 = c7445;
    }

    @Override // l.InterfaceC11986
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7445 mo8397() {
        return this.f8029;
    }
}
