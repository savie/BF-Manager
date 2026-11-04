package l;

/* JADX INFO: renamed from: l.ۧۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11585 extends C22774 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25012 f36383;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f36384;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11585(C3523 c3523, C25012 c25012) {
        super(c3523);
        this.f36383 = c25012;
    }

    @Override // l.AbstractC0540
    /* JADX INFO: renamed from: ۙ */
    public final void mo2511(C7998 c7998, int i, int i2) {
        this.f36383.m55844();
        int i3 = this.f36384 + 1;
        this.f36384 = i3;
        if (i3 > 256) {
            throw C16060.m38214(EnumC4590.LIMIT, "Parser nesting limit exceeded");
        }
        super.mo2511(c7998, i, i2);
    }

    @Override // l.AbstractC0540
    /* JADX INFO: renamed from: ۙ */
    public final void mo2512(C7998 c7998, int i, int i2, int i3) {
        this.f36383.m55844();
        int i4 = this.f36384 + 1;
        this.f36384 = i4;
        if (i4 > 256) {
            throw C16060.m38214(EnumC4590.LIMIT, "Parser nesting limit exceeded");
        }
        super.mo2512(c7998, 24, 12, i3);
    }

    @Override // l.AbstractC0540
    /* JADX INFO: renamed from: ܺ */
    public final void mo2521() {
        super.mo2521();
        this.f36384--;
    }

    @Override // l.AbstractC0540
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2524(C7998 c7998) {
        super.mo2524(c7998);
        this.f36384--;
    }
}
