package l;

/* JADX INFO: renamed from: l.۬ܺ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N6PY */
/* JADX INFO: loaded from: classes4.dex */
public final class C13975 extends C12925 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5049 f44317;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f44318;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13975(C3523 c3523, C5049 c5049) {
        super(c3523);
        this.f44317 = c5049;
    }

    @Override // l.AbstractC0540
    /* JADX INFO: renamed from: ܺ */
    public final void mo2521() {
        super.mo2521();
        this.f44318--;
    }

    @Override // l.AbstractC0540
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2524(C7998 c7998) {
        super.mo2524(c7998);
        this.f44318--;
    }

    @Override // l.AbstractC0540
    /* JADX INFO: renamed from: ۙ */
    public final void mo2511(C7998 c7998, int i, int i2) {
        this.f44317.m15284();
        int i3 = this.f44318 + 1;
        this.f44318 = i3;
        if (i3 <= 256) {
            super.mo2511(c7998, i, i2);
            return;
        }
        throw C15489.m37050(EnumC19965.LIMIT, "Parser nesting limit exceeded");
    }

    @Override // l.AbstractC0540
    /* JADX INFO: renamed from: ۙ */
    public final void mo2512(C7998 c7998, int i, int i2, int i3) {
        this.f44317.m15284();
        int i4 = this.f44318 + 1;
        this.f44318 = i4;
        if (i4 <= 256) {
            super.mo2512(c7998, i, i2, 0);
            return;
        }
        throw C15489.m37050(EnumC19965.LIMIT, "Parser nesting limit exceeded");
    }
}
