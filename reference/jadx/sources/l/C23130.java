package l;

/* JADX INFO: renamed from: l.᩺ܿۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8PO */
/* JADX INFO: loaded from: classes.dex */
public final class C23130 implements InterfaceC1941 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC11593 f75118;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f75119;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f75120;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C21449 f75121 = C21449.f69726;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f75122;

    @Override // l.InterfaceC1941
    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ boolean mo6302() {
        return false;
    }

    public C23130(InterfaceC11593 interfaceC11593) {
        this.f75118 = interfaceC11593;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51130() {
        if (this.f75119) {
            return;
        }
        this.f75120 = this.f75118.mo28888();
        this.f75119 = true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51132() {
        if (this.f75119) {
            m51131(mo6304());
            this.f75119 = false;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51131(long j) {
        this.f75122 = j;
        if (this.f75119) {
            this.f75120 = this.f75118.mo28888();
        }
    }

    @Override // l.InterfaceC1941
    /* JADX INFO: renamed from: ᩴ */
    public final long mo6304() {
        long jM48074;
        long j = this.f75122;
        if (!this.f75119) {
            return j;
        }
        long jMo28888 = this.f75118.mo28888() - this.f75120;
        C21449 c21449 = this.f75121;
        if (c21449.f69728 == 1.0f) {
            jM48074 = C17983.m41827(jMo28888);
        } else {
            jM48074 = c21449.m48074(jMo28888);
        }
        return jM48074 + j;
    }

    @Override // l.InterfaceC1941
    /* JADX INFO: renamed from: ۙ */
    public final void mo6301(C21449 c21449) {
        if (this.f75119) {
            m51131(mo6304());
        }
        this.f75121 = c21449;
    }

    @Override // l.InterfaceC1941
    /* JADX INFO: renamed from: ۨ */
    public final C21449 mo6303() {
        return this.f75121;
    }
}
