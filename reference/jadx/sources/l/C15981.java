package l;

/* JADX INFO: renamed from: l.ܺܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: WBAF */
/* JADX INFO: loaded from: classes5.dex */
public final class C15981 extends AbstractC1100 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f51754;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8157 f51755;

    public C15981(C8157 c8157) {
        super("BootstrapMethods");
        this.f51755 = c8157;
        int size = (c8157.size() * 4) + 8;
        for (int i = 0; i < c8157.size(); i++) {
            size += c8157.m15277get(i).m43291().size() * 2;
        }
        this.f51754 = size;
    }

    @Override // l.InterfaceC5771
    /* JADX INFO: renamed from: ۙ */
    public final int mo2281() {
        return this.f51754;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8157 m37960() {
        return this.f51755;
    }
}
