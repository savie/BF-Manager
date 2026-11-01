package l;

/* JADX INFO: renamed from: l.ۙۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6ZQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C4474 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f15906;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f15907;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f15908;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f15909;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f15910;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f15911;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21033 f15912;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f15913;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f15914;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C2357 f15915;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f15918;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f15917 = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f15916 = true;

    public C4474(C2357 c2357, C21033 c21033, int i, int i2, int i3, int i4, int[] iArr) {
        this.f15915 = c2357;
        C13638.requireNonNull(c21033, "changes");
        this.f15912 = c21033;
        C13638.requireNonNull(iArr, "activeRelativeNodes");
        this.f15914 = iArr;
        if (c21033.m47422() != c2357.f8313 || i < 1 || i > c2357.f8316 || i2 < 0 || ((long) i) + ((long) i2) > c2357.f8316 || i3 < 0 || i3 > c21033.m47422() || i4 < 0 || i4 > c21033.m47416()) {
            throw new IllegalArgumentException("Syntax context checkpoint boundaries differ");
        }
        this.f15918 = i;
        this.f15910 = i2;
        this.f15913 = i + i2;
        this.f15911 = i3;
        this.f15908 = i4;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12489(C22114 c22114) {
        int iM12487;
        int iM49060;
        C13638.requireNonNull(c22114, "target");
        if (this.f15907) {
            return false;
        }
        boolean z = this.f15906;
        int[] iArr = this.f15914;
        int i = this.f15908;
        int i2 = this.f15911;
        int i3 = this.f15913;
        if (!z) {
            this.f15906 = true;
            if (c22114.m49059() != this.f15912.m47416() || c22114.m49067() != 1 || m12487(i2) != i) {
                m12486();
                return true;
            }
            if (this.f15917 >= i3) {
                if (this.f15909 != iArr.length) {
                    m12486();
                    return true;
                }
                this.f15907 = true;
                return true;
            }
        } else {
            int i4 = this.f15917;
            if (i4 < i3) {
                int i5 = this.f15918;
                int i6 = i4 - i5;
                int i7 = this.f15909;
                int i8 = i7 < iArr.length ? iArr[i7] : Integer.MAX_VALUE;
                if (i8 < i6 || i8 < 0 || i8 >= this.f15910) {
                    m12486();
                    return true;
                }
                boolean z2 = i8 == i6;
                C2357 c2357 = this.f15915;
                int i9 = c2357.f8317[i4];
                if (i4 >= i5 && i9 != 0 && i9 < i5) {
                    m12486();
                } else if (z2) {
                    int i10 = this.f15909;
                    if (i9 != (i10 != 0 ? iArr[i10 - 1] + i5 : 0)) {
                        m12486();
                    } else {
                        iM12487 = m12487(c2357.f8319[i4]);
                        if (iM12487 >= 0) {
                            m12486();
                        } else {
                            m12486();
                        }
                    }
                } else {
                    iM12487 = m12487(c2357.f8319[i4]);
                    if (iM12487 >= 0 || iM12487 > i) {
                        m12486();
                    } else {
                        try {
                            if (z2) {
                                iM49060 = c22114.m49060(i9);
                            } else {
                                int i11 = c2357.f8315[i4];
                                int iM12488 = m12487(i11);
                                if (i11 > i2 || iM12488 < 0 || iM12488 > i || iM12488 - iM12487 != i11 - c2357.f8319[i4]) {
                                    m12486();
                                } else {
                                    iM49060 = iM12488;
                                }
                            }
                            if (!c22114.m49065(i4, iM12487, iM49060, i9, c2357.f8318[i4])) {
                                m12486();
                            }
                        } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
                            m12486();
                        }
                    }
                }
                if (this.f15916) {
                    if (z2) {
                        this.f15909++;
                    }
                    int i12 = this.f15917 + 1;
                    this.f15917 = i12;
                    if (i12 >= i3) {
                        if (this.f15909 != iArr.length) {
                            m12486();
                        } else {
                            this.f15907 = true;
                        }
                    }
                }
            } else {
                if (this.f15909 != iArr.length) {
                    m12486();
                    return false;
                }
                this.f15907 = true;
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m12487(int i) {
        C21033 c21033 = this.f15912;
        try {
            int iM47428 = c21033.m47428(i, EnumC10451.BEFORE);
            if (iM47428 == c21033.m47428(i, EnumC10451.AFTER)) {
                return iM47428;
            }
            return -1;
        } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m12486() {
        this.f15916 = false;
        this.f15907 = true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m12490() {
        return this.f15918;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m12488() {
        return this.f15907;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m12491() {
        return this.f15916;
    }
}
