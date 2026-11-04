package l;

/* JADX INFO: renamed from: l.᩷۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22088 extends C6661 implements InterfaceC7721, InterfaceC11449, InterfaceC21146 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C15374 f71184;

    @Override // l.InterfaceC21146
    /* JADX INFO: renamed from: ۙ */
    public final C1951 mo6734() {
        return null;
    }

    @Override // l.InterfaceC21146
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo6735() {
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15374 m49905() {
        C15374 c15374 = this.f71184;
        if (c15374 != null) {
            return c15374;
        }
        C15243.m36592("job");
        throw null;
    }

    @Override // l.InterfaceC11449
    /* JADX INFO: renamed from: ᩸ */
    public final void mo28808() {
        m49905().m36822(this);
    }

    @Override // l.C6661
    public final String toString() {
        return getClass().getSimpleName() + '@' + C21892.m49586(this) + "[job@" + C21892.m49586(m49905()) + ']';
    }

    public InterfaceC9211 getParent() {
        return m49905();
    }
}
