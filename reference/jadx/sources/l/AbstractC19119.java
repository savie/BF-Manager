package l;

/* JADX INFO: renamed from: l.᩵֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: N65V */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19119 extends AbstractC7124 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC7124 f61770;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC7124 f61771;

    @Override // l.AbstractC7124
    public /* bridge */ /* synthetic */ Object clone() {
        return super.clone();
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ܰ */
    public final void mo19026(AbstractC7124 abstractC7124) {
        this.f61770 = abstractC7124;
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۨ */
    public final void mo19025(AbstractC7124 abstractC7124) {
        this.f61771 = abstractC7124;
    }

    public AbstractC19119(EnumC9947 enumC9947, AbstractC7124 abstractC7124, AbstractC7124 abstractC7125) {
        super(enumC9947, EnumC19699.E2);
        this.f61770 = abstractC7124;
        this.f61771 = abstractC7125;
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۨ */
    public final AbstractC7124 mo19024() {
        return this.f61770;
    }

    @Override // l.AbstractC7124
    /* JADX INFO: renamed from: ۖ */
    public final AbstractC7124 mo19019() {
        return this.f61771;
    }
}
