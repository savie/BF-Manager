package l;

/* JADX INFO: renamed from: l.֡ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U707 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0571 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f2357;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f2358;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f2359;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f2360;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC16095 f2361;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f2362;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f2363;

    public C0571(C20328 c20328, EnumC16095 enumC16095) {
        this(c20328.f65837, c20328.f65843, c20328.f65840, c20328.f65842, c20328.f65839, c20328.f65838, enumC16095);
    }

    public C0571(int i, int i2, int i3, int i4, int i5, boolean z, EnumC16095 enumC16095) {
        this.f2357 = i;
        this.f2363 = i2;
        this.f2360 = i3;
        this.f2362 = i4;
        this.f2359 = i5;
        this.f2358 = z;
        this.f2361 = enumC16095;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m2681() {
        return this.f2357;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m2693() {
        return this.f2363;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m2688() {
        return this.f2360;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m2691() {
        return this.f2362;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m2684() {
        return this.f2359;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m2682() {
        return this.f2358;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC16095 m2689() {
        return this.f2361;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2687(C21033 c21033) {
        C13638.requireNonNull(c21033);
        if (c21033.m47422() != this.f2357) {
            throw new IllegalArgumentException("Dependency and change set lengths differ");
        }
        if (c21033.m47425()) {
            return false;
        }
        if (this.f2361 != EnumC16095.COMPLETE) {
            return true;
        }
        if (this.f2358 && c21033.m47421()) {
            return true;
        }
        int iM2683 = m2683();
        if (iM2683 == -1) {
            return false;
        }
        int iM2690 = m2690();
        for (int iM47418 = c21033.m47418(iM2683); iM47418 < c21033.m47429() && c21033.m47423(iM47418) <= iM2690; iM47418++) {
            if (m2686(c21033.m47423(iM47418), c21033.m47417(iM47418))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C0571 m2692(C21033 c21033) {
        C13638.requireNonNull(c21033, "changes");
        m2672(c21033);
        if (m2687(c21033)) {
            throw new IllegalArgumentException("Affected dependency cannot be remapped");
        }
        return m2676(c21033);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0571 m2685(C21033 c21033, int i) {
        C13638.requireNonNull(c21033, "changes");
        m2672(c21033);
        int i2 = this.f2357;
        C13638.checkFromToIndex(i, i, i2);
        if (!c21033.m47425()) {
            int iM47429 = c21033.m47429() - 1;
            if (c21033.m47417(iM47429) == i2 || i < c21033.m47417(iM47429)) {
                throw new IllegalArgumentException("Dependency is not in a stable suffix");
            }
        }
        int iM2683 = m2683();
        if (iM2683 != -1) {
            int iM2690 = m2690();
            int iMin = Math.min(i, iM2683);
            int iMax = Math.max(i, iM2690);
            for (int iM47418 = c21033.m47418(iMin); iM47418 < c21033.m47429() && c21033.m47423(iM47418) <= iMax; iM47418++) {
                int iM47423 = c21033.m47423(iM47418);
                int iM47417 = c21033.m47417(iM47418);
                if (m2686(iM47423, iM47417) || (iM47417 - iM47423 != c21033.m47427(iM47418) - c21033.m47424(iM47418) && iMin <= iM47417 && iM47423 <= iMax)) {
                    throw new IllegalArgumentException("Affected suffix dependency cannot be remapped");
                }
            }
        }
        int iM47428 = c21033.m47428(i, EnumC10451.AFTER);
        long jM47416 = ((long) c21033.m47416()) - ((long) i2);
        if (iM47428 < 0 || ((long) iM47428) - ((long) i) != jM47416) {
            throw new IllegalArgumentException("Suffix replay entry does not move with EOF");
        }
        return m2676(c21033);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m2672(C21033 c21033) {
        if (c21033.m47422() != this.f2357) {
            throw new IllegalArgumentException("Dependency and change set lengths differ");
        }
        if (this.f2361 != EnumC16095.COMPLETE) {
            throw new IllegalArgumentException("Only complete dependencies can be remapped");
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C0571 m2676(C21033 c21033) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.f2360;
        int i6 = this.f2363;
        if (i6 != -1) {
            int iM2679 = m2679(c21033, i6);
            int iM26710 = m2679(c21033, i5);
            if (iM26710 <= iM2679) {
                throw new IllegalArgumentException("Invalid remapped read range");
            }
            i = iM2679;
            i2 = iM26710;
        } else {
            i = -1;
            i2 = -1;
        }
        int i7 = this.f2359;
        int i8 = this.f2362;
        if (i8 != -1) {
            int iM26711 = m2679(c21033, i8);
            int iM26712 = m2679(c21033, i7);
            if (iM26712 < iM26711) {
                throw new IllegalArgumentException("Invalid remapped boundary range");
            }
            i3 = iM26711;
            i4 = iM26712;
        } else {
            i3 = -1;
            i4 = -1;
        }
        return (c21033.m47416() == this.f2357 && i == i6 && i2 == i5 && i3 == i8 && i4 == i7) ? this : new C0571(c21033.m47416(), i, i2, i3, i4, this.f2358, EnumC16095.COMPLETE);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m2679(C21033 c21033, int i) {
        int iM47428 = c21033.m47428(i, EnumC10451.BEFORE);
        int iM47429 = c21033.m47428(i, EnumC10451.AFTER);
        if (iM47428 < 0 || iM47428 != iM47429) {
            throw new IllegalArgumentException("Dependency endpoint cannot be remapped uniquely");
        }
        return iM47428;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m2686(int i, int i2) {
        int i3 = this.f2363;
        if (i3 != -1) {
            int i4 = this.f2360;
            if (i == i2) {
                if (i3 <= i && i <= i4) {
                    return true;
                }
            } else if (i < i4 && i3 < i2) {
                return true;
            }
        }
        int i5 = this.f2362;
        return i5 != -1 && i <= this.f2359 && i5 <= i2;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int m2683() {
        int i = this.f2362;
        int i2 = this.f2363;
        if (i2 == -1) {
            return i;
        }
        return i == -1 ? i2 : Math.min(i2, i);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m2690() {
        return Math.max(this.f2360, this.f2359);
    }
}
