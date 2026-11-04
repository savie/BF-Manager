package l;

/* JADX INFO: renamed from: l.᩶ܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB05 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21363 implements InterfaceC16438, InterfaceC10768 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24347 f68050;

    public C21363(C24347 c24347) {
        this.f68050 = c24347;
    }

    public final int hashCode() {
        return this.f68050.hashCode();
    }

    @Override // l.InterfaceC10768
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC3071 mo1985() {
        return this.f68050;
    }

    @Override // l.InterfaceC16438
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo1486(Object obj) {
        this.f68050.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC16438) || !(obj instanceof InterfaceC10768)) {
            return false;
        }
        return this.f68050.equals(((InterfaceC10768) obj).mo1985());
    }
}
