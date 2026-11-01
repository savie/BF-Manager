package l;

/* JADX INFO: renamed from: l.ۚᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470W */
/* JADX INFO: loaded from: classes2.dex */
public final class C5511 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C4099 f18911;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f18912;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C1900 f18913;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14789 f18914;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f18915;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C21033 f18916;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11862 f18917;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C2688 f18918;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10743 f18919;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f18920;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f18921;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f18922;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f18923;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f18924;

    public C5511(C4099 c4099, long j, C1900 c1900, Object obj, long j2, int i, int i2, int i3, C11862 c11862, C14789 c14789, C10743 c10743, C21033 c21033, C2688 c2688) {
        this.f18911 = c4099;
        this.f18923 = j;
        this.f18913 = c1900;
        this.f18922 = obj;
        this.f18921 = j2;
        this.f18920 = i;
        this.f18924 = i2;
        this.f18915 = i3;
        this.f18917 = c11862;
        this.f18914 = c14789;
        this.f18919 = c10743;
        this.f18916 = c21033;
        this.f18918 = c2688;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15203(C5511 c5511, C4099 c4099) {
        synchronized (c5511) {
            if (c5511.f18911 != c4099) {
                throw new IllegalArgumentException("Syntax window request belongs to another session");
            }
            if (c5511.f18912) {
                throw new IllegalStateException("Syntax window request was already constructed");
            }
            c5511.f18912 = true;
        }
    }
}
