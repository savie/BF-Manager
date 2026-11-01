package l;

/* JADX INFO: renamed from: l.ᩳۖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes5.dex */
public final class C17758 extends C5954 {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5930 f56330;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC8587 f56331;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4603 f56332;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f56333;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f56334;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17758(AbstractC8587 abstractC8587, AbstractC16579 abstractC16579, AbstractC0618 abstractC0618, C4603 c4603, boolean z, AbstractC5930 abstractC5930) {
        super(abstractC16579, abstractC0618);
        this.f56331 = abstractC8587;
        this.f56332 = c4603;
        this.f56334 = z;
        this.f56330 = abstractC5930;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ܳ */
    public final AbstractC16579 mo39006() {
        if (this.f56333 == null) {
            C19170 c19170 = new C19170(this.f56331, this.f56332.f16295.f34730, mo16234(), this.f56334);
            this.f56330.mo1802(c19170);
            this.f56333 = c19170.f61911;
        }
        return this.f56333;
    }
}
