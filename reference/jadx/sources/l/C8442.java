package l;

/* JADX INFO: renamed from: l.۠ۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0BC1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8442 extends AbstractC4493 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C20901[] f27610;

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final String mo18812() {
        return null;
    }

    public C8442(C9012 c9012, C0063 c0063) {
        super(c9012, c0063);
        if (c0063.size() == 0) {
            throw new IllegalArgumentException("registers.size() == 0");
        }
        this.f27610 = null;
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ᩷ */
    public final int mo8331() {
        m22630();
        int iMo8331 = 0;
        for (C20901 c20901 : this.f27610) {
            iMo8331 += c20901.mo8331();
        }
        return iMo8331;
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final void mo8329(C15000 c15000) {
        m22630();
        for (C20901 c20901 : this.f27610) {
            c20901.mo8329(c15000);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m22630() {
        if (this.f27610 != null) {
            return;
        }
        C0063 c0063M43795 = m43795();
        int size = c0063M43795.size();
        this.f27610 = new C20901[size];
        int iM47901 = 0;
        for (int i = 0; i < size; i++) {
            C20946 c20946M31619get = c0063M43795.m31619get(i);
            this.f27610[i] = AbstractC18884.m43794(C9012.f29360, C20946.m47883(iM47901, c20946M31619get.getType()), c20946M31619get);
            iM47901 += c20946M31619get.m47901();
        }
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC18884 mo18813(C0063 c0063) {
        return new C8442(m43799(), c0063);
    }

    @Override // l.AbstractC18884
    /* JADX INFO: renamed from: ܺ */
    public final String mo8330() {
        C0063 c0063M43795 = m43795();
        int size = c0063M43795.size();
        StringBuilder sb = new StringBuilder(100);
        int iM47901 = 0;
        for (int i = 0; i < size; i++) {
            C20946 c20946M31619get = c0063M43795.m31619get(i);
            C20901 c20901M43794 = AbstractC18884.m43794(C9012.f29360, C20946.m47883(iM47901, c20946M31619get.getType()), c20946M31619get);
            if (i != 0) {
                sb.append('\n');
            }
            sb.append(c20901M43794.mo8330());
            iM47901 += c20946M31619get.m47901();
        }
        return sb.toString();
    }
}
