package l;

/* JADX INFO: renamed from: l.۬ۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: NBDN */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13096 extends AbstractC1100 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1806 f43607;

    public AbstractC13096(String str, C1806 c1806) {
        super(str);
        try {
            if (c1806.m43640()) {
                throw new C8364("localVariables.isMutable()", null);
            }
            this.f43607 = c1806;
        } catch (NullPointerException unused) {
            throw new NullPointerException("localVariables == null");
        }
    }

    @Override // l.InterfaceC5771
    /* JADX INFO: renamed from: ۙ */
    public final int mo2281() {
        return (this.f43607.size() * 10) + 8;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1806 m32314() {
        return this.f43607;
    }
}
