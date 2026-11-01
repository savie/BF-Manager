package l;

/* JADX INFO: renamed from: l.۫۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB05 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12258 implements InterfaceC10597, InterfaceC9811 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20019 f41018;

    public C12258(C20019 c20019) {
        this.f41018 = c20019;
    }

    public final int hashCode() {
        return this.f41018.hashCode();
    }

    @Override // l.InterfaceC9811
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15456 mo24916() {
        return this.f41018;
    }

    @Override // l.InterfaceC10597
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo1473(Object obj) {
        this.f41018.invoke(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC10597) || !(obj instanceof InterfaceC9811)) {
            return false;
        }
        return this.f41018.equals(((InterfaceC9811) obj).mo24916());
    }
}
