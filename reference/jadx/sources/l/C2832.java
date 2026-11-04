package l;

/* JADX INFO: renamed from: l.ۖܿ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes3.dex */
public class C2832 extends AbstractC22664 implements InterfaceC8344, InterfaceC0075 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AbstractC22664 f9333;

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo9326() {
        return true;
    }

    @Override // l.AbstractC22664, l.InterfaceC13564
    /* JADX INFO: renamed from: ܶ */
    public final int mo2973() {
        return 7;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo9331() {
        return true;
    }

    public C2832(AbstractC22664 abstractC22664, AbstractC22970 abstractC22970) {
        this(abstractC22664, abstractC22970, C14458.f45498);
    }

    public C2832(AbstractC22664 abstractC22664, AbstractC22970 abstractC22970, C14458 c14458) {
        super(abstractC22970, c14458);
        this.f9333 = abstractC22664;
    }

    public C2832(C2832 c2832) {
        this(c2832.f9333, c2832.f73596, c2832.f73595);
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ */
    public AbstractC22664 mo4934(C14458 c14458) {
        return new C1341(this, this.f9333, this.f73596, c14458);
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙۙ */
    public final EnumC21172 mo9097() {
        return EnumC21172.ARRAY;
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo9324(InterfaceC4764 interfaceC4764, Object obj) {
        return interfaceC4764.mo1767(this, obj);
    }

    @Override // l.AbstractC22664, l.InterfaceC9769
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC22664 abstractC22664 = this.f9333;
        while (abstractC22664.mo5501() == EnumC18720.ARRAY) {
            abstractC22664 = ((C2832) abstractC22664).f9333;
        }
        sb.append(abstractC22664);
        AbstractC22664 abstractC22665 = this;
        do {
            abstractC22665.m51066(sb, true);
            sb.append("[]");
            abstractC22665 = ((C2832) abstractC22665).f9333;
        } while (abstractC22665.mo5501() == EnumC18720.ARRAY);
        return sb.toString();
    }

    @Override // l.AbstractC22664
    public final boolean equals(Object obj) {
        if (!(obj instanceof C2832)) {
            return false;
        }
        C2832 c2832 = (C2832) obj;
        return this == c2832 || this.f9333.equals(c2832.f9333);
    }

    public final int hashCode() {
        return this.f9333.hashCode() + (EnumC21172.ARRAY.ordinal() << 5);
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C14769 mo9323() {
        return this.f9333.mo9323();
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo9329() {
        return this.f9333.mo9329();
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo9330() {
        return this.f9333.mo9330();
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo9328() {
        return this.f9333.mo9328();
    }

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final C2832 m9327() {
        return new C9543(this.f9333, this.f73596, this.f73595);
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo9325(AbstractC22664 abstractC22664) {
        return abstractC22664.m51074(this) || this.f9333.mo9325(abstractC22664);
    }

    @Override // l.AbstractC22664
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void mo9322() {
        this.f9333.mo9322();
    }

    /* JADX INFO: renamed from: ۫ */
    public AbstractC22664 mo1131() {
        return this.f9333;
    }

    @Override // l.AbstractC22664, l.InterfaceC9769
    /* JADX INFO: renamed from: ۙ */
    public final EnumC18720 mo5501() {
        return EnumC18720.ARRAY;
    }
}
