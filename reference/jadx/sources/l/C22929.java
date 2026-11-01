package l;

/* JADX INFO: renamed from: l.᩺ۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes.dex */
public class C22929 extends AbstractC16579 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f74534;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f74535;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f74536;

    /* JADX INFO: renamed from: ۛۙ */
    public boolean mo46762() {
        return false;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۤۙ */
    public final boolean mo1937() {
        return true;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ܶۙ */
    public final boolean mo1939() {
        return true;
    }

    public C22929(AbstractC23903 abstractC23903, AbstractC16579 abstractC16579, AbstractC11242 abstractC11242) {
        super(null, C3794.f13674);
        this.f74534 = null;
        this.f74535 = -1;
        C6171.m17171(abstractC16579);
        this.f53222 = new C16847(0L, abstractC11242, this, abstractC23903);
        mo18111((AbstractC16579) null);
        this.f74536 = abstractC16579;
    }

    public C22929(AbstractC0618 abstractC0618, AbstractC16579 abstractC16579, AbstractC16579 abstractC165710, C3794 c3794) {
        super(abstractC0618, c3794);
        this.f74534 = null;
        this.f74535 = -1;
        C6171.m17171(abstractC165710);
        mo18111(abstractC16579);
        this.f74536 = abstractC165710;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public C22929 mo1929(C3794 c3794) {
        return new C6700(this, this.f53222, mo18112(), this.f74536, c3794);
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙۙ */
    public final EnumC6617 mo1933() {
        return EnumC6617.TYPEVAR;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public Object mo1928(InterfaceC15874 interfaceC15874, Object obj) {
        return interfaceC15874.mo1769(this, obj);
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۖۙ */
    public AbstractC16579 mo18112() {
        return this.f74534;
    }

    /* JADX INFO: renamed from: ۖ */
    public void mo18111(AbstractC16579 abstractC16579) {
        this.f74534 = abstractC16579;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC16579 mo39002() {
        return this.f74536;
    }

    @Override // l.AbstractC16579, l.InterfaceC9105
    /* JADX INFO: renamed from: ۙ */
    public final EnumC19688 mo1931() {
        return EnumC19688.TYPEVAR;
    }
}
