package l;

/* JADX INFO: renamed from: l.᩵ۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1BA1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20550 extends C20222 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C24698 f65790;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C24698 f65791;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f65792;

    public C20550(int i) {
        super(true);
        this.f65790 = new C24698(i);
        this.f65791 = new C24698(i + 1);
        this.f65792 = i;
    }

    @Override // l.C20222
    /* JADX INFO: renamed from: ܺ */
    public final void mo15005() {
        this.f65790.mo15005();
        this.f65791.mo15005();
        super.mo15005();
    }

    public final int size() {
        return this.f65792;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47111(int i) {
        return this.f65791.get(i);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m47113() {
        return this.f65791.get(this.f65792);
    }

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C24698 m47112() {
        return this.f65791;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C24698 m47115() {
        return this.f65790;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m47114(int i) {
        m46490();
        if (i < 0) {
            throw new IllegalArgumentException("target < 0");
        }
        C24698 c24698 = this.f65791;
        if (c24698.size() != this.f65792) {
            throw new RuntimeException("non-default elements not all set");
        }
        c24698.add(i);
    }

    public final void add(int i, int i2) {
        m46490();
        if (i2 < 0) {
            throw new IllegalArgumentException("target < 0");
        }
        this.f65790.add(i);
        this.f65791.add(i2);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m47110() {
        C24698 c24698;
        m46490();
        int i = this.f65792;
        C24698 c24699 = this.f65791;
        if (i != c24699.size() - 1) {
            throw new IllegalArgumentException("incomplete instance");
        }
        int i2 = c24699.get(i);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            c24698 = this.f65790;
            if (i3 >= i) {
                break;
            }
            int i5 = c24699.get(i3);
            if (i5 != i2) {
                if (i3 != i4) {
                    c24699.set(i4, i5);
                    c24698.set(i4, c24698.get(i3));
                }
                i4++;
            }
            i3++;
        }
        if (i4 != i) {
            c24698.m55048(i4);
            c24699.set(i4, i2);
            c24699.m55048(i4 + 1);
            this.f65792 = i4;
        }
    }
}
