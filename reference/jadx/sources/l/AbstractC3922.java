package l;

/* JADX INFO: renamed from: l.ۘۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBH6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3922 extends AbstractC1100 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C9424 f14626;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f14627;

    public AbstractC3922(String str, C9424 c9424, int i) {
        super(str);
        try {
            if (c9424.m43640()) {
                throw new C8364("parameterAnnotations.isMutable()", null);
            }
            this.f14626 = c9424;
            this.f14627 = i;
        } catch (NullPointerException unused) {
            throw new NullPointerException("parameterAnnotations == null");
        }
    }

    @Override // l.InterfaceC5771
    /* JADX INFO: renamed from: ۙ */
    public final int mo2281() {
        return this.f14627 + 6;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9424 m11382() {
        return this.f14626;
    }
}
