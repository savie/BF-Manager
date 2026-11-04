package l;

/* JADX INFO: renamed from: l.ۢۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9907 extends AbstractRunnableC22060 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31836;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22478 f31837;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9907(C22478 c22478, Object[] objArr, int i, EnumC15874 enumC15874) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.f31837 = c22478;
        this.f31836 = i;
    }

    @Override // l.AbstractRunnableC22060
    /* JADX INFO: renamed from: ۙ */
    public final void mo1658() {
        this.f31837.f72746.getClass();
        synchronized (this.f31837) {
            this.f31837.f72724.remove(Integer.valueOf(this.f31836));
        }
    }
}
