package l;

/* JADX INFO: renamed from: l.۟ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes4.dex */
public final class C7839 extends C12748 {

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f26123;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22295 f26124;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f26125;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3168 f26126;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC9329 f26127;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7839(AbstractC9329 abstractC9329, AbstractC22664 abstractC22664, AbstractC22970 abstractC22970, C3168 c3168, boolean z, AbstractC22295 abstractC22295) {
        super(abstractC22664, abstractC22970);
        this.f26127 = abstractC9329;
        this.f26126 = c3168;
        this.f26125 = z;
        this.f26124 = abstractC22295;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 mo21362() {
        if (this.f26123 == null) {
            C1127 c1127 = new C1127(this.f26127, this.f26126.f10275.f61859, mo31584(), this.f26125);
            this.f26124.mo2284(c1127);
            this.f26123 = c1127.f4201;
        }
        return this.f26123;
    }
}
