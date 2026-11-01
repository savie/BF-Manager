package l;

/* JADX INFO: renamed from: l.ܰۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34PY */
/* JADX INFO: loaded from: classes4.dex */
public class C13757 extends AbstractC16579 implements InterfaceC7299 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21825 f45366;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21825 f45367;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f45368;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC16579 f45369;

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC0618 mo33525() {
        return null;
    }

    @Override // l.AbstractC16579, l.InterfaceC15767
    /* JADX INFO: renamed from: ᩳ */
    public final int mo1941() {
        return 16;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ᩶ */
    public final C13757 mo27295() {
        return this;
    }

    public C13757(C21825 c21825, AbstractC16579 abstractC16579, C21825 c21826, AbstractC0618 abstractC0618) {
        super(abstractC0618, C3794.f13674);
        this.f45367 = c21825;
        this.f45368 = abstractC16579;
        this.f45366 = c21826;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC16579 mo1929(C3794 c3794) {
        throw new AssertionError("Cannot add metadata to a method type");
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙۙ */
    public final EnumC6617 mo1933() {
        return EnumC6617.METHOD;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1928(InterfaceC15874 interfaceC15874, Object obj) {
        return interfaceC15874.mo6581(this, obj);
    }

    @Override // l.AbstractC16579, l.InterfaceC9105
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m39000(sb, false);
        sb.append('(');
        sb.append(this.f45367);
        sb.append(')');
        sb.append(this.f45368);
        return sb.toString();
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C21825 mo33523() {
        return this.f45367;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۗ */
    public final AbstractC16579 mo16235() {
        return this.f45368;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C21825 mo33524() {
        return this.f45366;
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ֨ۙ */
    public final boolean mo1926() {
        if (AbstractC16579.m38998(this.f45367)) {
            return true;
        }
        AbstractC16579 abstractC16579 = this.f45368;
        return abstractC16579 != null && abstractC16579.mo1926();
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1932(AbstractC16579 abstractC16579) {
        return abstractC16579.m39004(this) || AbstractC16579.m38996(abstractC16579, this.f45367) || this.f45368.mo1932(abstractC16579) || AbstractC16579.m38996(abstractC16579, this.f45366);
    }

    @Override // l.AbstractC16579
    /* JADX INFO: renamed from: ܽ */
    public final void mo1940() {
        for (C21825 c21825 = this.f45367; c21825.m48595(); c21825 = c21825.f70877) {
            ((AbstractC16579) c21825.f70876).mo1940();
        }
        this.f45368.mo1940();
        this.f45369.mo1940();
        for (C21825 c21826 = this.f45366; c21826.m48595(); c21826 = c21826.f70877) {
            ((AbstractC16579) c21826.f70876).mo1940();
        }
    }

    @Override // l.AbstractC16579, l.InterfaceC9105
    /* JADX INFO: renamed from: ۙ */
    public final EnumC19688 mo1931() {
        return EnumC19688.EXECUTABLE;
    }
}
