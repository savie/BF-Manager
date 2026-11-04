package l;

/* JADX INFO: renamed from: l.ܺ᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KW */
/* JADX INFO: loaded from: classes5.dex */
public final class C17170 implements InterfaceC5984 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C16579 f55971;

    public C17170(C16579 c16579) {
        this.f55971 = c16579;
    }

    @Override // l.InterfaceC5984
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo17407() {
        return this.f55971 != null;
    }

    @Override // l.InterfaceC5984
    public final void next() {
        this.f55971 = this.f55971.f53657;
    }

    @Override // l.InterfaceC5984
    /* JADX INFO: renamed from: ᩸ */
    public final int mo17411() {
        return this.f55971.f53656;
    }

    @Override // l.InterfaceC5984
    /* JADX INFO: renamed from: ᩴ */
    public final int mo17409() {
        return this.f55971.f53659;
    }

    @Override // l.InterfaceC5984
    /* JADX INFO: renamed from: ۤ */
    public final int mo17408() {
        C16579 c16579 = this.f55971;
        return c16579.f53656 + c16579.f53655;
    }

    @Override // l.InterfaceC5984
    /* JADX INFO: renamed from: ᩷ */
    public final int mo17410() {
        C16579 c16579 = this.f55971;
        return c16579.f53659 + c16579.f53658;
    }
}
