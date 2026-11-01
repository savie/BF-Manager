package l;

/* JADX INFO: renamed from: l.᩷ۖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes5.dex */
public class C20581 implements InterfaceC15643 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13609 f67069;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C18258 f67070;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public AbstractC0618 f67071;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f67072;

    @Override // l.InterfaceC15643
    /* JADX INFO: renamed from: ۙ */
    public C23195 mo8775(C23195 c23195) {
        return c23195;
    }

    public C20581(C13609 c13609, AbstractC0618 abstractC0618) {
        this.f67069 = c13609;
        this.f67071 = abstractC0618;
    }

    @Override // l.InterfaceC15643
    /* JADX INFO: renamed from: ۙ */
    public AbstractC16579 mo8774() {
        if (this.f67072 == null) {
            C21825 c21825M48588 = C21825.m48588();
            C13609 c13609 = this.f67069;
            this.f67072 = new C13757(c21825M48588, c13609.f44893.f14293, C21825.m48588(), c13609.f44893.f14240);
        }
        return this.f67072;
    }

    @Override // l.InterfaceC15643
    /* JADX INFO: renamed from: ۖ */
    public C18258 mo8773() {
        if (this.f67070 == null) {
            AbstractC0618 abstractC0618 = this.f67071;
            long jMo20276 = abstractC0618.mo20276() & 16384;
            C13609 c13609 = this.f67069;
            this.f67070 = new C18258((jMo20276 == 0 || c13609.f44895.m52432(abstractC0618.f77449).f53222 != c13609.f44893.f14289) ? (abstractC0618.mo20276() & 7) | 68719476736L : 68719476738L, c13609.f44901.f77632, mo8774(), this.f67071);
        }
        return this.f67070;
    }

    @Override // l.InterfaceC15643
    /* JADX INFO: renamed from: ۨ */
    public AbstractC16579 mo19104() {
        return AbstractC16579.f53219;
    }

    @Override // l.InterfaceC15643
    /* JADX INFO: renamed from: ܰ */
    public C21825 mo19105() {
        return C21825.m48588();
    }
}
