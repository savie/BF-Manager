package l;

/* JADX INFO: renamed from: l.ܿۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 688Y */
/* JADX INFO: loaded from: classes5.dex */
public class C17333 extends AbstractC10590 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC7186 f55148 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40303(AbstractC7186 abstractC7186) {
        if (this.f55148 != null) {
            throw new AssertionError("Delegate is already set");
        }
        this.f55148 = abstractC7186;
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1571(C5379 c5379) {
        AbstractC7186 abstractC7186 = this.f55148;
        if (abstractC7186 == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        return abstractC7186.mo1571(c5379);
    }

    @Override // l.AbstractC7186
    /* JADX INFO: renamed from: ۙ */
    public final void mo1572(C1145 c1145, Object obj) {
        AbstractC7186 abstractC7186 = this.f55148;
        if (abstractC7186 == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        abstractC7186.mo1572(c1145, obj);
    }

    @Override // l.AbstractC10590
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC7186 mo26765() {
        AbstractC7186 abstractC7186 = this.f55148;
        if (abstractC7186 != null) {
            return abstractC7186;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
