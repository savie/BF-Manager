package l;

/* JADX INFO: renamed from: l.ۗ۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N1MQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3246 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC11462 f12070;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f12071;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public String f12072;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC11462 f12073;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC20745 f12074;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f12075;

    public C3246(AbstractC20745 abstractC20745, AbstractC20745 abstractC20746, String str, String str2, AbstractC11462 abstractC11462, AbstractC11462 abstractC11463) {
        this.f12071 = abstractC20745;
        this.f12074 = abstractC20746;
        this.f12072 = str;
        this.f12075 = str2;
        this.f12073 = abstractC11462;
        this.f12070 = abstractC11463;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m9719() {
        if (this.f12071.mo33991() > this.f12074.mo33991()) {
            m9718();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m9718() {
        AbstractC20745 abstractC20745 = this.f12071;
        this.f12071 = this.f12074;
        this.f12074 = abstractC20745;
        String str = this.f12072;
        this.f12072 = this.f12075;
        this.f12075 = str;
        AbstractC11462 abstractC11462 = this.f12073;
        this.f12073 = this.f12070;
        this.f12070 = abstractC11462;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9717() {
        this.f12073.mo23626(this.f12071.mo33986(), false);
        this.f12070.mo23626(this.f12074.mo33986(), false);
    }
}
