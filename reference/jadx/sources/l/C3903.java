package l;

/* JADX INFO: renamed from: l.ۘۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0B0D */
/* JADX INFO: loaded from: classes3.dex */
public final class C3903 implements InterfaceC16075 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Class f13309;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17567 f13310;

    public C3903(Class cls, AbstractC17567 abstractC17567) {
        this.f13309 = cls;
        this.f13310 = abstractC17567;
    }

    @Override // l.InterfaceC16075
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17567 mo1459(C24522 c24522, C6446 c6446) {
        if (c6446.m18232() == this.f13309) {
            return this.f13310;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f13309.getName() + ",adapter=" + this.f13310 + "]";
    }
}
