package l;

/* JADX INFO: renamed from: l.ۡۡۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes4.dex */
public class C8777 extends AbstractC16579 implements InterfaceC7299, InterfaceC18982 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f30194;

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

    @Override // l.AbstractC16579, l.InterfaceC15767
    /* JADX INFO: renamed from: ᩳ */
    public final int mo1941() {
        return 7;
    }

    public C8777(AbstractC16579 abstractC16579, AbstractC0618 abstractC0618) {
        this(abstractC16579, abstractC0618, C3794.f13674);
    }

    public C8777(AbstractC16579 abstractC16579, AbstractC0618 abstractC0618, C3794 c3794) {
        super(abstractC0618, c3794);
        this.f30194 = abstractC16579;
    }

    public C8777(C8777 c8777) {
        this(c8777.f30194, c8777.f53222, c8777.f53221);
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public AbstractC16579 mo1929(C3794 c3794) {
        return new C8071(this, this.f30194, this.f53222, c3794);
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙۙ */
    public final EnumC6617 mo1933() {
        return EnumC6617.ARRAY;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1928(InterfaceC15874 interfaceC15874, Object obj) {
        return interfaceC15874.mo6580(this, obj);
    }

    @Override // l.AbstractC16579, l.InterfaceC9105
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        AbstractC16579 abstractC16579 = this.f30194;
        while (abstractC16579.mo1931() == EnumC19688.ARRAY) {
            abstractC16579 = ((C8777) abstractC16579).f30194;
        }
        sb.append(abstractC16579);
        AbstractC16579 abstractC165710 = this;
        do {
            abstractC165710.m39000(sb, true);
            sb.append("[]");
            abstractC165710 = ((C8777) abstractC165710).f30194;
        } while (abstractC165710.mo1931() == EnumC19688.ARRAY);
        return sb.toString();
    }

    @Override // l.AbstractC16579
    public final boolean equals(Object obj) {
        if (!(obj instanceof C8777)) {
            return false;
        }
        C8777 c8777 = (C8777) obj;
        return this == c8777 || this.f30194.equals(c8777.f30194);
    }

    public final int hashCode() {
        return this.f30194.hashCode() + (EnumC6617.ARRAY.ordinal() << 5);
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ᩷ */
    public final C21825 mo1943() {
        return this.f30194.mo1943();
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ֨ۙ */
    public final boolean mo1926() {
        return this.f30194.mo1926();
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ᩳۙ */
    public final boolean mo1942() {
        return this.f30194.mo1942();
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۡۙ */
    public final boolean mo1936() {
        return this.f30194.mo1936();
    }

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final C8777 m22849() {
        return new C19360(this.f30194, this.f53222, this.f53221);
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1932(AbstractC16579 abstractC16579) {
        return abstractC16579.m39004(this) || this.f30194.mo1932(abstractC16579);
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ܽ */
    public final void mo1940() {
        this.f30194.mo1940();
    }

    /* JADX INFO: renamed from: ۚ */
    public AbstractC16579 mo21285() {
        return this.f30194;
    }

    @Override // l.AbstractC16579, l.InterfaceC9105
    /* JADX INFO: renamed from: ۙ */
    public final EnumC19688 mo1931() {
        return EnumC19688.ARRAY;
    }
}
