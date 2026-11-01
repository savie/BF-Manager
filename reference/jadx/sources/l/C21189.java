package l;

/* JADX INFO: renamed from: l.᩷᩺ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: GBHS */
/* JADX INFO: loaded from: classes4.dex */
public final class C21189 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C19073 f68972;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public InterfaceC4919 f68973;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f68974;

    public /* synthetic */ C21189(int i) {
        this();
    }

    public C21189() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47644(int i, InterfaceC4919 interfaceC4919, C19073 c19073) {
        this.f68974 = i;
        this.f68973 = interfaceC4919;
        this.f68972 = c19073;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16251 m47643() {
        return new C16251(this.f68974, this.f68973, this.f68972);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16251) {
            return ((C16251) obj).m38382(this.f68974, this.f68973, this.f68972);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f68974;
        InterfaceC4919 interfaceC4919 = this.f68973;
        C19073 c19073 = this.f68972;
        int i2 = C16251.f52405;
        return ((interfaceC4919.hashCode() + ((c19073 != null ? c19073.hashCode() : 0) * 31)) * 31) + i;
    }
}
