package l;

/* JADX INFO: renamed from: l.ۢ۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4UL */
/* JADX INFO: loaded from: classes4.dex */
public final class C9610 extends AbstractC12432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C17432 f32377;

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final void mo4171(C4669 c4669) {
    }

    public C9610(C17432 c17432) {
        super(1, c17432.m40640() + C10336.m26220(c17432.m40639()) + 1);
        this.f32377 = c17432;
    }

    @Override // l.AbstractC21603
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18075 mo4170() {
        return EnumC18075.TYPE_STRING_DATA_ITEM;
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ܰ */
    public final void mo6992(C4669 c4669, C2718 c2718) {
        C17432 c17432 = this.f32377;
        C14009 c14009M40638 = c17432.m40638();
        int iM40639 = c17432.m40639();
        if (c2718.m8288()) {
            c2718.m8283(C10336.m26220(iM40639), "utf16_size: ".concat(C22475.m49978(iM40639)));
            c2718.m8283(c14009M40638.m33864() + 1, c17432.m40637());
        }
        c2718.m8293(iM40639);
        c2718.m8286(c14009M40638);
        c2718.m8280(0);
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ۜ */
    public final String mo6991() {
        return this.f32377.m40637();
    }

    @Override // l.AbstractC12432
    /* JADX INFO: renamed from: ۙ */
    public final int mo6990(AbstractC12432 abstractC12432) {
        return this.f32377.compareTo(((C9610) abstractC12432).f32377);
    }
}
