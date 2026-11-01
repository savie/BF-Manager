package l;

/* JADX INFO: renamed from: l.᩹ۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: QBDF */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22268 extends AbstractC1100 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f72779;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1661 f72780;

    public AbstractC22268(String str, C1661 c1661, int i) {
        super(str);
        try {
            if (c1661.m43640()) {
                throw new C8364("annotations.isMutable()", null);
            }
            this.f72780 = c1661;
            this.f72779 = i;
        } catch (NullPointerException unused) {
            throw new NullPointerException("annotations == null");
        }
    }

    @Override // l.InterfaceC5771
    /* JADX INFO: renamed from: ۙ */
    public final int mo2281() {
        return this.f72779 + 6;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1661 m49435() {
        return this.f72780;
    }
}
