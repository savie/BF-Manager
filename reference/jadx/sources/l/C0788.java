package l;

/* JADX INFO: renamed from: l.֡᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6ZQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0788 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f2817;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22528 f2818;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f2820;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C8246 f2822;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f2823;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f2824;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f2825;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f2826;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f2819 = 1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f2821 = -1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f2827 = true;

    public C0788(C8246 c8246, C22528 c22528, int i, int i2, boolean z) {
        this.f2822 = c8246;
        C17359.requireNonNull(c22528, "changes");
        this.f2818 = c22528;
        this.f2823 = i;
        this.f2824 = i2;
        this.f2817 = z;
        if (c22528.m50762() != c8246.f27123 || i < 0 || i > c22528.m50762() || i2 < 0 || i2 > c22528.m50767()) {
            throw new IllegalArgumentException("Syntax context reuse boundaries differ");
        }
        if (z) {
            this.f2820 = c8246.f27125 - 1;
            this.f2826 = true;
        } else {
            this.f2820 = 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3184(C10482 c10482) {
        if (this.f2825) {
            return false;
        }
        boolean z = this.f2826;
        int i = this.f2823;
        C8246 c8246 = this.f2822;
        if (z) {
            if (this.f2820 > 0) {
                int[] iArr = c8246.f27124;
                int i2 = this.f2820;
                if (iArr[i2] >= i) {
                    this.f2820 = i2 - 1;
                    return true;
                }
            }
            int i3 = this.f2820 + 1;
            this.f2819 = i3;
            this.f2820 = i3;
            this.f2821 = c10482.m26947();
            this.f2826 = false;
            if (this.f2820 >= c8246.f27125) {
                this.f2825 = true;
                return true;
            }
        } else {
            boolean z2 = this.f2817;
            if (!z2 && (this.f2820 >= c8246.f27125 || c8246.f27121[this.f2820] > i)) {
                this.f2825 = true;
                return false;
            }
            if (this.f2820 >= c8246.f27125) {
                this.f2825 = true;
                return false;
            }
            if (this.f2821 < 0) {
                this.f2821 = c10482.m26947();
            }
            int i4 = this.f2820;
            int i5 = c8246.f27122[i4];
            if (i5 != 0 && i5 < this.f2819) {
                this.f2827 = false;
                this.f2825 = true;
            } else {
                EnumC21782 enumC21782 = z2 ? EnumC21782.AFTER : EnumC21782.BEFORE;
                int i6 = c8246.f27124[i4];
                C22528 c22528 = this.f2818;
                int iM50766 = c22528.m50766(i6, enumC21782);
                int iM50767 = c22528.m50766(c8246.f27121[i4], enumC21782);
                if (iM50766 < 0 || iM50767 <= iM50766 || iM50767 - iM50766 != c8246.f27121[i4] - c8246.f27124[i4]) {
                    this.f2827 = false;
                    this.f2825 = true;
                } else {
                    int i7 = this.f2824;
                    if (!z2 ? iM50767 > i7 : iM50766 < i7) {
                        this.f2827 = false;
                        this.f2825 = true;
                    } else {
                        if (!c10482.m26945((this.f2821 + i4) - this.f2819, iM50766, iM50767, i5 == 0 ? 0 : (this.f2821 + i5) - this.f2819, c8246.f27126[i4])) {
                            this.f2827 = false;
                            this.f2825 = true;
                        }
                    }
                }
            }
            int i8 = this.f2820 + 1;
            this.f2820 = i8;
            if (i8 >= c8246.f27125) {
                this.f2825 = true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m3183() {
        return this.f2825;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m3185() {
        return this.f2827;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m3182(int i) {
        if (!this.f2817 || !this.f2825 || !this.f2827 || this.f2821 < 0 || i < this.f2819 || i > this.f2822.f27125) {
            return -1;
        }
        return (this.f2821 + i) - this.f2819;
    }
}
