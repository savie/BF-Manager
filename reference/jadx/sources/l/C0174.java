package l;

/* JADX INFO: renamed from: l.֡ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes3.dex */
public final class C0174 implements InterfaceC16075 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Class f1246;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17567 f1247;

    public C0174(Class cls, AbstractC17567 abstractC17567) {
        this.f1246 = cls;
        this.f1247 = abstractC17567;
    }

    @Override // l.InterfaceC16075
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC17567 mo1459(C24522 c24522, C6446 c6446) {
        Class<?> clsM18232 = c6446.m18232();
        if (this.f1246.isAssignableFrom(clsM18232)) {
            return new C18073(this, clsM18232);
        }
        return null;
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.f1246.getName() + ",adapter=" + this.f1247 + "]";
    }
}
