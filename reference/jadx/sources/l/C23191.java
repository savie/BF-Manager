package l;

/* JADX INFO: renamed from: l.᩹֡᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes.dex */
public class C23191 extends AbstractC22664 implements InterfaceC8344 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C14769 f75155;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f75156;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C14769 f75157;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f75158;

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC22970 mo51070() {
        return null;
    }

    @Override // l.AbstractC22664, l.InterfaceC13564
    /* JADX INFO: renamed from: ܶ */
    public final int mo2973() {
        return 16;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ᩶ */
    public final C23191 mo15883() {
        return this;
    }

    public C23191(C14769 c14769, AbstractC22664 abstractC22664, C14769 c147610, AbstractC22970 abstractC22970) {
        super(abstractC22970, C14458.f45498);
        this.f75155 = c14769;
        this.f75156 = abstractC22664;
        this.f75157 = c147610;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC22664 mo4934(C14458 c14458) {
        throw new AssertionError("Cannot add metadata to a method type");
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙۙ */
    public final EnumC21172 mo9097() {
        return EnumC21172.METHOD;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public final Object mo9324(InterfaceC4764 interfaceC4764, Object obj) {
        return interfaceC4764.mo2231(this, obj);
    }

    @Override // l.AbstractC22664, l.InterfaceC9769
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m51066(sb, false);
        sb.append('(');
        sb.append(this.f75155);
        sb.append(')');
        sb.append(this.f75156);
        return sb.toString();
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۜ */
    public final C14769 mo50621() {
        return this.f75155;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۬ */
    public final AbstractC22664 mo31585() {
        return this.f75156;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ᩷ۙ */
    public final C14769 mo50622() {
        return this.f75157;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۫ۙ */
    public final boolean mo9329() {
        if (AbstractC22664.m51062(this.f75155)) {
            return true;
        }
        AbstractC22664 abstractC22664 = this.f75156;
        return abstractC22664 != null && abstractC22664.mo9329();
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo9325(AbstractC22664 abstractC22664) {
        return abstractC22664.m51074(this) || AbstractC22664.m51061(abstractC22664, this.f75155) || this.f75156.mo9325(abstractC22664) || AbstractC22664.m51061(abstractC22664, this.f75157);
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ֡ */
    public final void mo9322() {
        for (C14769 c14769 = this.f75155; c14769.m35550(); c14769 = c14769.f48336) {
            ((AbstractC22664) c14769.f48335).mo9322();
        }
        this.f75156.mo9322();
        this.f75158.mo9322();
        for (C14769 c147610 = this.f75157; c147610.m35550(); c147610 = c147610.f48336) {
            ((AbstractC22664) c147610.f48335).mo9322();
        }
    }

    @Override // l.AbstractC22664, l.InterfaceC9769
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18720 mo5501() {
        return EnumC18720.EXECUTABLE;
    }
}
