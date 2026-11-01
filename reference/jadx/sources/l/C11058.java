package l;

/* JADX INFO: renamed from: l.ۧܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes4.dex */
public final class C11058 extends AbstractC21682 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22680 f37544;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public StringBuilder f37545;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f37546;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11058(C22680 c22680, boolean z) {
        super(c22680.f73852);
        this.f37544 = c22680;
        this.f37545 = new StringBuilder();
        this.f37546 = z;
    }

    @Override // l.AbstractC21682
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo27879(AbstractC16579 abstractC16579) {
        if (this.f37546) {
            return;
        }
        super.mo27879(abstractC16579);
        throw null;
    }

    @Override // l.AbstractC21682
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27876(char c) {
        this.f37545.append(c);
    }

    @Override // l.AbstractC21682
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27878(byte[] bArr) {
        this.f37545.append(this.f37544.f73845.m52777(bArr).toString());
    }

    @Override // l.AbstractC21682
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo27877(AbstractC11242 abstractC11242) {
        this.f37545.append(abstractC11242.toString());
    }

    public final String toString() {
        return this.f37545.toString();
    }
}
