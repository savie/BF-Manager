package l;

/* JADX INFO: renamed from: l.ۚ֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public class C5291 extends AbstractC22445 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C14769 f18620;

    public C5291(AbstractC22664 abstractC22664, C14769 c14769) {
        super(EnumC21172.FORALL, (C23191) abstractC22664);
        this.f18620 = c14769;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC22664 mo4934(C14458 c14458) {
        throw new AssertionError("Cannot add metadata to a forall type");
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public final Object mo9324(InterfaceC4764 interfaceC4764, Object obj) {
        return interfaceC4764.mo4102(this, obj);
    }

    @Override // l.AbstractC22445, l.AbstractC22664, l.InterfaceC9769
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m51066(sb, false);
        sb.append('<');
        sb.append(this.f18620);
        sb.append('>');
        sb.append(this.f72657);
        return sb.toString();
    }

    @Override // l.AbstractC22445, l.AbstractC22664
    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final C14769 mo15882() {
        return this.f18620;
    }

    @Override // l.AbstractC22445, l.AbstractC22664
    /* JADX INFO: renamed from: ۫ۙ */
    public final boolean mo9329() {
        return this.f72657.mo9329();
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9325(AbstractC22664 abstractC22664) {
        return this.f72657.mo9325(abstractC22664);
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23191 mo15883() {
        return (C23191) this.f72657;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ֡ */
    public final void mo9322() {
        for (C14769 c14769 = this.f18620; c14769.m35550(); c14769 = c14769.f48336) {
            ((C17969) c14769.f48335).mo19992().mo9322();
        }
        this.f72657.mo9322();
    }

    @Override // l.AbstractC22664, l.InterfaceC9769
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18720 mo5501() {
        return EnumC18720.EXECUTABLE;
    }
}
