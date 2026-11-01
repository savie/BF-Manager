package l;

/* JADX INFO: renamed from: l.ۧۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes4.dex */
public class C10894 extends AbstractC16538 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C21825 f37076;

    public C10894(AbstractC16579 abstractC16579, C21825 c21825) {
        super(EnumC6617.FORALL, (C13757) abstractC16579);
        this.f37076 = c21825;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16579 mo1929(C3794 c3794) {
        throw new AssertionError("Cannot add metadata to a forall type");
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1928(InterfaceC15874 interfaceC15874, Object obj) {
        return interfaceC15874.mo9280(this, obj);
    }

    @Override // l.AbstractC16538, l.AbstractC16579, l.InterfaceC9105
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m39000(sb, false);
        sb.append('<');
        sb.append(this.f37076);
        sb.append('>');
        sb.append(this.f53121);
        return sb.toString();
    }

    @Override // l.AbstractC16538, l.AbstractC16579
    /* JADX INFO: renamed from: ۨۙ */
    public final C21825 mo1938() {
        return this.f37076;
    }

    @Override // l.AbstractC16538, l.AbstractC16579
    /* JADX INFO: renamed from: ֨ۙ */
    public final boolean mo1926() {
        return this.f53121.mo1926();
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1932(AbstractC16579 abstractC16579) {
        return this.f53121.mo1932(abstractC16579);
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13757 mo27295() {
        return (C13757) this.f53121;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ܽ */
    public final void mo1940() {
        for (C21825 c21825 = this.f37076; c21825.m48595(); c21825 = c21825.f70877) {
            ((C22929) c21825.f70876).mo18112().mo1940();
        }
        this.f53121.mo1940();
    }

    @Override // l.AbstractC16579, l.InterfaceC9105
    /* JADX INFO: renamed from: ۙ */
    public final EnumC19688 mo1931() {
        return EnumC19688.EXECUTABLE;
    }
}
