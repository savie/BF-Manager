package l;

/* JADX INFO: renamed from: l.۠ۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BA1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7888 extends C18947 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C4129 f25934;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C4129 f25935;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f25936;

    public C7888(int i) {
        super(true);
        this.f25935 = new C4129(i);
        this.f25934 = new C4129(i + 1);
        this.f25936 = i;
    }

    @Override // l.C18947
    /* JADX INFO: renamed from: ܶ */
    public final void mo9637() {
        this.f25935.mo9637();
        this.f25934.mo9637();
        super.mo9637();
    }

    public final int size() {
        return this.f25936;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m20810(int i) {
        return this.f25934.get(i);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int m20812() {
        return this.f25934.get(this.f25936);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C4129 m20813() {
        return this.f25934;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C4129 m20811() {
        return this.f25935;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20814(int i) {
        m43641();
        if (i < 0) {
            throw new IllegalArgumentException("target < 0");
        }
        C4129 c4129 = this.f25934;
        if (c4129.size() != this.f25936) {
            throw new RuntimeException("non-default elements not all set");
        }
        c4129.add(i);
    }

    public final void add(int i, int i2) {
        m43641();
        if (i2 < 0) {
            throw new IllegalArgumentException("target < 0");
        }
        this.f25935.add(i);
        this.f25934.add(i2);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m20815() {
        C4129 c4129;
        m43641();
        int i = this.f25936;
        C4129 c41210 = this.f25934;
        if (i != c41210.size() - 1) {
            throw new IllegalArgumentException("incomplete instance");
        }
        int i2 = c41210.get(i);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            c4129 = this.f25935;
            if (i3 >= i) {
                break;
            }
            int i5 = c41210.get(i3);
            if (i5 != i2) {
                if (i3 != i4) {
                    c41210.set(i4, i5);
                    c4129.set(i4, c4129.get(i3));
                }
                i4++;
            }
            i3++;
        }
        if (i4 != i) {
            c4129.m11754(i4);
            c41210.set(i4, i2);
            c41210.m11754(i4 + 1);
            this.f25936 = i4;
        }
    }
}
