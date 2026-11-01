package l;

/* JADX INFO: renamed from: l.ۨ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBDV */
/* JADX INFO: loaded from: classes4.dex */
public class C11976 extends AbstractC12568 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f40118;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4129 f40119;

    public C11976(int i) {
        super(1);
        this.f40119 = new C4129(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29784() {
        return this.f40118;
    }

    @Override // l.AbstractC12568
    /* JADX INFO: renamed from: ۙ */
    public final C16251 mo15518(C16251 c16251) {
        int i;
        if (c16251 == null) {
            return null;
        }
        try {
            i = this.f40119.get(c16251.m38400());
        } catch (IndexOutOfBoundsException unused) {
            i = -1;
        }
        if (i < 0) {
            throw new RuntimeException("no mapping specified for register");
        }
        return c16251.m38397(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29785(int i) {
        C4129 c4129 = this.f40119;
        if (i >= c4129.size()) {
            return -1;
        }
        return c4129.get(i);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo20392(int i, int i2, int i3) {
        C4129 c4129 = this.f40119;
        if (i >= c4129.size()) {
            for (int size = i - c4129.size(); size >= 0; size--) {
                c4129.add(-1);
            }
        }
        c4129.set(i, i2);
        int i4 = i2 + i3;
        if (this.f40118 < i4) {
            this.f40118 = i4;
        }
    }
}
