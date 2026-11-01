package l;

/* JADX INFO: renamed from: l.ۨۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6ZQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11531 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C2357 f38750;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f38751;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean f38752;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21033 f38753;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f38754;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f38756;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f38758;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f38759;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f38757 = 1;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f38755 = -1;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f38760 = true;

    public C11531(C2357 c2357, C21033 c21033, int i, int i2, boolean z) {
        this.f38750 = c2357;
        C13638.requireNonNull(c21033, "changes");
        this.f38753 = c21033;
        this.f38759 = i;
        this.f38754 = i2;
        this.f38752 = z;
        if (c21033.m47422() != c2357.f8313 || i < 0 || i > c21033.m47422() || i2 < 0 || i2 > c21033.m47416()) {
            throw new IllegalArgumentException("Syntax context reuse boundaries differ");
        }
        if (z) {
            this.f38756 = c2357.f8316 - 1;
            this.f38751 = true;
        } else {
            this.f38756 = 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28704(C22114 c22114) {
        if (this.f38758) {
            return false;
        }
        boolean z = this.f38751;
        int i = this.f38759;
        C2357 c2357 = this.f38750;
        if (z) {
            if (this.f38756 > 0) {
                int[] iArr = c2357.f8319;
                int i2 = this.f38756;
                if (iArr[i2] >= i) {
                    this.f38756 = i2 - 1;
                    return true;
                }
            }
            int i3 = this.f38756 + 1;
            this.f38757 = i3;
            this.f38756 = i3;
            this.f38755 = c22114.m49067();
            this.f38751 = false;
            if (this.f38756 >= c2357.f8316) {
                this.f38758 = true;
                return true;
            }
        } else {
            boolean z2 = this.f38752;
            if (!z2 && (this.f38756 >= c2357.f8316 || c2357.f8315[this.f38756] > i)) {
                this.f38758 = true;
                return false;
            }
            if (this.f38756 >= c2357.f8316) {
                this.f38758 = true;
                return false;
            }
            if (this.f38755 < 0) {
                this.f38755 = c22114.m49067();
            }
            int i4 = this.f38756;
            int i5 = c2357.f8317[i4];
            if (i5 != 0 && i5 < this.f38757) {
                this.f38760 = false;
                this.f38758 = true;
            } else {
                EnumC10451 enumC10451 = z2 ? EnumC10451.AFTER : EnumC10451.BEFORE;
                int i6 = c2357.f8319[i4];
                C21033 c21033 = this.f38753;
                int iM47428 = c21033.m47428(i6, enumC10451);
                int iM47429 = c21033.m47428(c2357.f8315[i4], enumC10451);
                if (iM47428 < 0 || iM47429 <= iM47428 || iM47429 - iM47428 != c2357.f8315[i4] - c2357.f8319[i4]) {
                    this.f38760 = false;
                    this.f38758 = true;
                } else {
                    int i7 = this.f38754;
                    if (!z2 ? iM47429 > i7 : iM47428 < i7) {
                        this.f38760 = false;
                        this.f38758 = true;
                    } else {
                        if (!c22114.m49065((this.f38755 + i4) - this.f38757, iM47428, iM47429, i5 == 0 ? 0 : (this.f38755 + i5) - this.f38757, c2357.f8318[i4])) {
                            this.f38760 = false;
                            this.f38758 = true;
                        }
                    }
                }
            }
            int i8 = this.f38756 + 1;
            this.f38756 = i8;
            if (i8 >= c2357.f8316) {
                this.f38758 = true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28703() {
        return this.f38758;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m28705() {
        return this.f38760;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m28702(int i) {
        if (!this.f38752 || !this.f38758 || !this.f38760 || this.f38755 < 0 || i < this.f38757 || i > this.f38750.f8316) {
            return -1;
        }
        return (this.f38755 + i) - this.f38757;
    }
}
