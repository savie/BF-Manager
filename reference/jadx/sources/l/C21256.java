package l;

/* JADX INFO: renamed from: l.᩸֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes5.dex */
public final class C21256 implements InterfaceC20592 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Class f69225;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7186 f69226;

    public C21256(Class cls, AbstractC7186 abstractC7186) {
        this.f69225 = cls;
        this.f69226 = abstractC7186;
    }

    @Override // l.InterfaceC20592
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7186 mo5183(C6044 c6044, C11730 c11730) {
        Class<?> clsM29316 = c11730.m29316();
        if (this.f69225.isAssignableFrom(clsM29316)) {
            return new C14907(this, clsM29316);
        }
        return null;
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.f69225.getName() + ",adapter=" + this.f69226 + "]";
    }
}
