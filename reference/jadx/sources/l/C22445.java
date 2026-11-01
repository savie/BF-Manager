package l;

/* JADX INFO: renamed from: l.᩹ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470W */
/* JADX INFO: loaded from: classes.dex */
public final class C22445 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f73239;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2688 f73240;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f73241;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14789 f73242;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C1900 f73243;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f73244;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f73245;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C7027 f73246;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2357 f73247;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11862 f73248;

    public C22445(C1900 c1900, long j, int i, int i2, int i3, C7027 c7027, C2357 c2357, C11862 c11862, C14789 c14789, C2688 c2688) {
        C13638.requireNonNull(c1900, "program");
        this.f73243 = c1900;
        this.f73246 = c7027;
        this.f73247 = c2357;
        this.f73248 = c11862;
        this.f73242 = c14789;
        this.f73240 = c2688;
        if (c2688 != null && (c2688.f10374.m47416() != i || c2688.f10375.m29565() != c1900)) {
            throw new IllegalArgumentException("Window pending reuse identity differs");
        }
        if (i < 0 || i2 < 0 || i2 > i3 || i3 > i) {
            throw new IllegalArgumentException("Invalid syntax window result range");
        }
        int i4 = i3 - i2;
        if (c7027.m18860() != i4) {
            throw new IllegalArgumentException("Window style length differs from requested range");
        }
        if (c2357.m7174() != i4 || c2357.m7164(0) != c1900.f7183) {
            throw new IllegalArgumentException("Window context differs from requested range");
        }
        if (c14789.m35430() != c1900 || c14789.m35429() != i) {
            throw new IllegalArgumentException("Window checkpoint cache identity differs");
        }
        this.f73244 = j;
        this.f73241 = i;
        this.f73239 = i2;
        this.f73245 = i3;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C1900 m49815() {
        return this.f73243;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long m49816() {
        return this.f73244;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m49820() {
        return this.f73241;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m49822() {
        return this.f73239;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m49819() {
        return this.f73245;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C7027 m49814() {
        return this.f73246;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2357 m49821() {
        return this.f73247;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14789 m49817() {
        return this.f73242;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11862 m49818() {
        return this.f73248;
    }
}
