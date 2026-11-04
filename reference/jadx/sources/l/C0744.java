package l;

/* JADX INFO: renamed from: l.֡᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470W */
/* JADX INFO: loaded from: classes2.dex */
public final class C0744 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f2708;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3727 f2709;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C1270 f2710;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f2711;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f2712;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f2713;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C14913 f2714;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C20661 f2715;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8246 f2716;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C21627 f2717;

    public C0744(C20661 c20661, long j, int i, int i2, int i3, C1270 c1270, C8246 c8246, C14913 c14913, C3727 c3727, C21627 c21627) {
        C17359.requireNonNull(c20661, "program");
        this.f2715 = c20661;
        this.f2710 = c1270;
        this.f2716 = c8246;
        this.f2714 = c14913;
        this.f2709 = c3727;
        this.f2717 = c21627;
        if (c21627 != null && (c21627.f69050.m50767() != i || c21627.f69051.m35882() != c20661)) {
            throw new IllegalArgumentException("Window pending reuse identity differs");
        }
        if (i < 0 || i2 < 0 || i2 > i3 || i3 > i) {
            throw new IllegalArgumentException("Invalid syntax window result range");
        }
        int i4 = i3 - i2;
        if (c1270.m4628() != i4) {
            throw new IllegalArgumentException("Window style length differs from requested range");
        }
        if (c8246.m22191() != i4 || c8246.m22193(0) != c20661.f66265) {
            throw new IllegalArgumentException("Window context differs from requested range");
        }
        if (c3727.m12137() != c20661 || c3727.m12135() != i) {
            throw new IllegalArgumentException("Window checkpoint cache identity differs");
        }
        this.f2712 = j;
        this.f2708 = i;
        this.f2713 = i2;
        this.f2711 = i3;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20661 m3078() {
        return this.f2715;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m3070() {
        return this.f2712;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m3072() {
        return this.f2708;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m3075() {
        return this.f2713;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m3073() {
        return this.f2711;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C1270 m3074() {
        return this.f2710;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C8246 m3077() {
        return this.f2716;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3727 m3071() {
        return this.f2709;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C14913 m3076() {
        return this.f2714;
    }
}
