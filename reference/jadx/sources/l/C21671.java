package l;

/* JADX INFO: renamed from: l.᩶᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6ZQ */
/* JADX INFO: loaded from: classes.dex */
public final class C21671 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f69176;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f69177;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f69178;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C22528 f69179;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f69180;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f69181;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C8246 f69183;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f69185;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f69186;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f69187;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f69188;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f69182 = 1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f69184 = true;

    public C21671(C8246 c8246, C22528 c22528, int i, int i2, int i3, int i4, int[] iArr) {
        this.f69183 = c8246;
        C17359.requireNonNull(c22528, "changes");
        this.f69179 = c22528;
        C17359.requireNonNull(iArr, "activeRelativeNodes");
        this.f69186 = iArr;
        if (c22528.m50762() != c8246.f27123 || i < 1 || i > c8246.f27125 || i2 < 0 || ((long) i) + ((long) i2) > c8246.f27125 || i3 < 0 || i3 > c22528.m50762() || i4 < 0 || i4 > c22528.m50767()) {
            throw new IllegalArgumentException("Syntax context checkpoint boundaries differ");
        }
        this.f69188 = i;
        this.f69185 = i2;
        this.f69178 = i + i2;
        this.f69180 = i3;
        this.f69176 = i4;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e8  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49211(C10482 c10482) {
        int iM49208;
        int iM26940;
        C17359.requireNonNull(c10482, "target");
        if (this.f69187) {
            return false;
        }
        boolean z = this.f69181;
        int[] iArr = this.f69186;
        int i = this.f69176;
        int i2 = this.f69180;
        int i3 = this.f69178;
        if (!z) {
            this.f69181 = true;
            if (c10482.m26949() != this.f69179.m50767() || c10482.m26947() != 1 || m49208(i2) != i) {
                m49209();
                return true;
            }
            if (this.f69182 >= i3) {
                if (this.f69177 != iArr.length) {
                    m49209();
                    return true;
                }
                this.f69187 = true;
                return true;
            }
        } else {
            int i4 = this.f69182;
            if (i4 < i3) {
                int i5 = this.f69188;
                int i6 = i4 - i5;
                int i7 = this.f69177;
                int i8 = i7 < iArr.length ? iArr[i7] : Integer.MAX_VALUE;
                if (i8 < i6 || i8 < 0 || i8 >= this.f69185) {
                    m49209();
                    return true;
                }
                boolean z2 = i8 == i6;
                C8246 c8246 = this.f69183;
                int i9 = c8246.f27122[i4];
                if (i4 >= i5 && i9 != 0 && i9 < i5) {
                    m49209();
                } else if (z2) {
                    int i10 = this.f69177;
                    if (i9 != (i10 != 0 ? iArr[i10 - 1] + i5 : 0)) {
                        m49209();
                    } else {
                        iM49208 = m49208(c8246.f27124[i4]);
                        if (iM49208 >= 0) {
                            m49209();
                        } else {
                            m49209();
                        }
                    }
                } else {
                    iM49208 = m49208(c8246.f27124[i4]);
                    if (iM49208 >= 0 || iM49208 > i) {
                        m49209();
                    } else {
                        try {
                            if (z2) {
                                iM26940 = c10482.m26940(i9);
                            } else {
                                int i11 = c8246.f27121[i4];
                                int iM49209 = m49208(i11);
                                if (i11 > i2 || iM49209 < 0 || iM49209 > i || iM49209 - iM49208 != i11 - c8246.f27124[i4]) {
                                    m49209();
                                } else {
                                    iM26940 = iM49209;
                                }
                            }
                            if (!c10482.m26945(i4, iM49208, iM26940, i9, c8246.f27126[i4])) {
                                m49209();
                            }
                        } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
                            m49209();
                        }
                    }
                }
                if (this.f69184) {
                    if (z2) {
                        this.f69177++;
                    }
                    int i12 = this.f69182 + 1;
                    this.f69182 = i12;
                    if (i12 >= i3) {
                        if (this.f69177 != iArr.length) {
                            m49209();
                        } else {
                            this.f69187 = true;
                        }
                    }
                }
            } else {
                if (this.f69177 != iArr.length) {
                    m49209();
                    return false;
                }
                this.f69187 = true;
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m49208(int i) {
        C22528 c22528 = this.f69179;
        try {
            int iM50766 = c22528.m50766(i, EnumC21782.BEFORE);
            if (iM50766 == c22528.m50766(i, EnumC21782.AFTER)) {
                return iM50766;
            }
            return -1;
        } catch (IllegalArgumentException | IndexOutOfBoundsException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m49209() {
        this.f69184 = false;
        this.f69187 = true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m49212() {
        return this.f69188;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m49210() {
        return this.f69187;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m49213() {
        return this.f69184;
    }
}
