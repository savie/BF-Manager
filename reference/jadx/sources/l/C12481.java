package l;

/* JADX INFO: renamed from: l.۫ܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: MAHH */
/* JADX INFO: loaded from: classes3.dex */
public final class C12481 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f41603;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f41604;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f41605;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f41606;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f41607;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f41608;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f41609;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f41610;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f41611;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f41612;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f41613;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12481 m30982(int i, AbstractC12068 abstractC12068) {
        if (abstractC12068 instanceof C4718) {
            return new C12481(i, (C4718) abstractC12068);
        }
        if (abstractC12068 instanceof C13186) {
            return new C12481(i, (C13186) abstractC12068);
        }
        throw new RuntimeException();
    }

    public C12481(int i, C4718 c4718) {
        this.f41613 = i;
        this.f41605 = 0;
        this.f41609 = c4718.f16654;
        this.f41603 = c4718.f16652;
        this.f41608 = c4718.f16655;
        this.f41612 = c4718.f16650;
        this.f41604 = c4718.f40395;
        this.f41606 = c4718.f16651;
        this.f41607 = c4718.f16653;
        this.f41611 = true;
        this.f41610 = false;
    }

    public C12481(int i, C13186 c13186) {
        this.f41613 = i;
        this.f41605 = 1;
        this.f41609 = c13186.f43891;
        this.f41603 = c13186.f43894;
        this.f41608 = c13186.f43892;
        this.f41612 = c13186.f43890;
        this.f41604 = c13186.f40395;
        this.f41606 = c13186.f43889;
        this.f41607 = c13186.f43888;
        this.f41611 = c13186.f43893;
        this.f41610 = c13186.f43887;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12481.class != obj.getClass()) {
            return false;
        }
        C12481 c12481 = (C12481) obj;
        return this.f41613 == c12481.f41613 && this.f41605 == c12481.f41605 && this.f41603 == c12481.f41603 && this.f41607 == c12481.f41607 && this.f41611 == c12481.f41611 && this.f41610 == c12481.f41610 && this.f41609.equals(c12481.f41609) && this.f41608.equals(c12481.f41608) && this.f41612.equals(c12481.f41612) && this.f41606.equals(c12481.f41606);
    }

    public final int hashCode() {
        return C13638.hash(Integer.valueOf(this.f41613), Integer.valueOf(this.f41605), this.f41609, Integer.valueOf(this.f41603), this.f41608, this.f41612, this.f41606, Boolean.valueOf(this.f41607), Boolean.valueOf(this.f41611), Boolean.valueOf(this.f41610));
    }
}
