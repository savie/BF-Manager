package l;

/* JADX INFO: renamed from: l.᩻ۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAYQ */
/* JADX INFO: loaded from: classes.dex */
public final class C24876 implements InterfaceC21146 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f80503;

    @Override // l.InterfaceC21146
    /* JADX INFO: renamed from: ۙ */
    public final C1951 mo6734() {
        return null;
    }

    public C24876(boolean z) {
        this.f80503 = z;
    }

    @Override // l.InterfaceC21146
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo6735() {
        return this.f80503;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.f80503 ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
