package l;

/* JADX INFO: renamed from: l.ܿ֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes5.dex */
public class C17969 extends AbstractC22664 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f58891;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f58892;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f58893;

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۛۙ */
    public final boolean mo9326() {
        return true;
    }

    /* JADX INFO: renamed from: ۢۙ */
    public boolean mo34139() {
        return false;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ܺۙ */
    public final boolean mo9331() {
        return true;
    }

    public C17969(AbstractC11781 abstractC11781, AbstractC22664 abstractC22664, AbstractC19728 abstractC19728) {
        super(null, C14458.f45498);
        this.f58891 = null;
        this.f58892 = -1;
        C11972.m30021(abstractC22664);
        this.f73596 = new C19986(0L, abstractC19728, this, abstractC11781);
        mo19991((AbstractC22664) null);
        this.f58893 = abstractC22664;
    }

    public C17969(AbstractC22970 abstractC22970, AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C14458 c14458) {
        super(abstractC22970, c14458);
        this.f58891 = null;
        this.f58892 = -1;
        C11972.m30021(abstractC22665);
        mo19991(abstractC22664);
        this.f58893 = abstractC22665;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public C17969 mo4934(C14458 c14458) {
        return new C20953(this, this.f73596, mo19992(), this.f58893, c14458);
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙۙ */
    public final EnumC21172 mo9097() {
        return EnumC21172.TYPEVAR;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public Object mo9324(InterfaceC4764 interfaceC4764, Object obj) {
        return interfaceC4764.mo1771(this, obj);
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ᩸ۙ */
    public AbstractC22664 mo19992() {
        return this.f58891;
    }

    /* JADX INFO: renamed from: ᩸ */
    public void mo19991(AbstractC22664 abstractC22664) {
        this.f58891 = abstractC22664;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 mo41925() {
        return this.f58893;
    }

    @Override // l.AbstractC22664, l.InterfaceC9769
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18720 mo5501() {
        return EnumC18720.TYPEVAR;
    }
}
