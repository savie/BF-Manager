package l;

/* JADX INFO: renamed from: l.۫ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: U707 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12831 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f41102;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC19544 f41103;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f41104;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f41105;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f41106;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f41107;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f41108;

    public C12831(C15068 c15068, EnumC19544 enumC19544) {
        this(c15068.f49201, c15068.f49202, c15068.f49203, c15068.f49204, c15068.f49199, c15068.f49205, enumC19544);
    }

    public C12831(int i, int i2, int i3, int i4, int i5, boolean z, EnumC19544 enumC19544) {
        this.f41104 = i;
        this.f41105 = i2;
        this.f41106 = i3;
        this.f41107 = i4;
        this.f41102 = i5;
        this.f41108 = z;
        this.f41103 = enumC19544;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m31855() {
        return this.f41104;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m31856() {
        return this.f41105;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m31857() {
        return this.f41106;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m31858() {
        return this.f41107;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m31849() {
        return this.f41102;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m31860() {
        return this.f41108;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC19544 m31854() {
        return this.f41103;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31852(C22528 c22528) {
        C17359.requireNonNull(c22528);
        if (c22528.m50762() != this.f41104) {
            throw new IllegalArgumentException("Dependency and change set lengths differ");
        }
        if (c22528.m50760()) {
            return false;
        }
        if (this.f41103 != EnumC19544.COMPLETE) {
            return true;
        }
        if (this.f41108 && c22528.m50758()) {
            return true;
        }
        int iM31848 = m31848();
        if (iM31848 == -1) {
            return false;
        }
        int iM31853 = m31853();
        for (int iM50755 = c22528.m50755(iM31848); iM50755 < c22528.m50761() && c22528.m50763(iM50755) <= iM31853; iM50755++) {
            if (m31851(c22528.m50763(iM50755), c22528.m50768(iM50755))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12831 m31859(C22528 c22528) {
        C17359.requireNonNull(c22528, "changes");
        m31846(c22528);
        if (m31852(c22528)) {
            throw new IllegalArgumentException("Affected dependency cannot be remapped");
        }
        return m31839(c22528);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12831 m31850(C22528 c22528, int i) {
        C17359.requireNonNull(c22528, "changes");
        m31846(c22528);
        int i2 = this.f41104;
        C17359.checkFromToIndex(i, i, i2);
        if (!c22528.m50760()) {
            int iM50761 = c22528.m50761() - 1;
            if (c22528.m50768(iM50761) == i2 || i < c22528.m50768(iM50761)) {
                throw new IllegalArgumentException("Dependency is not in a stable suffix");
            }
        }
        int iM31848 = m31848();
        if (iM31848 != -1) {
            int iM31853 = m31853();
            int iMin = Math.min(i, iM31848);
            int iMax = Math.max(i, iM31853);
            for (int iM50755 = c22528.m50755(iMin); iM50755 < c22528.m50761() && c22528.m50763(iM50755) <= iMax; iM50755++) {
                int iM50763 = c22528.m50763(iM50755);
                int iM50768 = c22528.m50768(iM50755);
                if (m31851(iM50763, iM50768) || (iM50768 - iM50763 != c22528.m50765(iM50755) - c22528.m50759(iM50755) && iMin <= iM50768 && iM50763 <= iMax)) {
                    throw new IllegalArgumentException("Affected suffix dependency cannot be remapped");
                }
            }
        }
        int iM50766 = c22528.m50766(i, EnumC21782.AFTER);
        long jM50767 = ((long) c22528.m50767()) - ((long) i2);
        if (iM50766 < 0 || ((long) iM50766) - ((long) i) != jM50767) {
            throw new IllegalArgumentException("Suffix replay entry does not move with EOF");
        }
        return m31839(c22528);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m31846(C22528 c22528) {
        if (c22528.m50762() != this.f41104) {
            throw new IllegalArgumentException("Dependency and change set lengths differ");
        }
        if (this.f41103 != EnumC19544.COMPLETE) {
            throw new IllegalArgumentException("Only complete dependencies can be remapped");
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C12831 m31839(C22528 c22528) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.f41106;
        int i6 = this.f41105;
        if (i6 != -1) {
            int iM31845 = m31845(c22528, i6);
            int iM31846 = m31845(c22528, i5);
            if (iM31846 <= iM31845) {
                throw new IllegalArgumentException("Invalid remapped read range");
            }
            i = iM31845;
            i2 = iM31846;
        } else {
            i = -1;
            i2 = -1;
        }
        int i7 = this.f41102;
        int i8 = this.f41107;
        if (i8 != -1) {
            int iM31847 = m31845(c22528, i8);
            int iM31848 = m31845(c22528, i7);
            if (iM31848 < iM31847) {
                throw new IllegalArgumentException("Invalid remapped boundary range");
            }
            i3 = iM31847;
            i4 = iM31848;
        } else {
            i3 = -1;
            i4 = -1;
        }
        return (c22528.m50767() == this.f41104 && i == i6 && i2 == i5 && i3 == i8 && i4 == i7) ? this : new C12831(c22528.m50767(), i, i2, i3, i4, this.f41108, EnumC19544.COMPLETE);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m31845(C22528 c22528, int i) {
        int iM50766 = c22528.m50766(i, EnumC21782.BEFORE);
        int iM50767 = c22528.m50766(i, EnumC21782.AFTER);
        if (iM50766 < 0 || iM50766 != iM50767) {
            throw new IllegalArgumentException("Dependency endpoint cannot be remapped uniquely");
        }
        return iM50766;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m31851(int i, int i2) {
        int i3 = this.f41105;
        if (i3 != -1) {
            int i4 = this.f41106;
            if (i == i2) {
                if (i3 <= i && i <= i4) {
                    return true;
                }
            } else if (i < i4 && i3 < i2) {
                return true;
            }
        }
        int i5 = this.f41107;
        return i5 != -1 && i <= this.f41102 && i5 <= i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m31848() {
        int i = this.f41107;
        int i2 = this.f41105;
        if (i2 == -1) {
            return i;
        }
        return i == -1 ? i2 : Math.min(i2, i);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m31853() {
        return Math.max(this.f41106, this.f41102);
    }
}
