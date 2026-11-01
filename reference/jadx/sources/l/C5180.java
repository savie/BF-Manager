package l;

/* JADX INFO: renamed from: l.ۚۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6ZS */
/* JADX INFO: loaded from: classes2.dex */
public final class C5180 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f17971;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f17972;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f17973;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f17974;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f17975;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22114 f17976;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f17977;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f17978;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f17979 = -1;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f17980;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f17981;

    public C5180(C22114 c22114, int i, int i2, int i3, int i4) {
        this.f17976 = c22114;
        this.f17975 = i;
        this.f17974 = i2;
        this.f17973 = i3;
        this.f17972 = i4;
        int i5 = c22114.f71596;
        this.f17971 = i5;
        this.f17980 = new int[i5 - i];
        this.f17981 = i;
        this.f17978 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m14348() {
        if (this.f17977) {
            return true;
        }
        C22114 c22114 = this.f17976;
        if (c22114.f71595 || c22114.f71601 != this) {
            throw new IllegalStateException("Syntax context clip is not active");
        }
        int i = this.f17978;
        int i2 = this.f17971;
        if (i < i2) {
            this.f17978 = i + 1;
            int i3 = c22114.f71594[i];
            int[] iArr = this.f17980;
            int i4 = this.f17975;
            if (i3 >= i4) {
                i3 = iArr[i3 - i4];
            }
            int i5 = this.f17974;
            int[] iArr2 = c22114.f71599;
            int iMax = i < i5 ? Math.max(iArr2[i], this.f17973) : iArr2[i];
            int iMin = i < i5 ? Math.min(c22114.f71600[i], this.f17972) : c22114.f71600[i];
            if (iMax >= iMin || c22114.f71602 == c22114.f71597 || iMin <= c22114.f71602 || iMax >= c22114.f71597) {
                iArr[i - i4] = i3;
                return false;
            }
            int i6 = this.f17981;
            this.f17981 = i6 + 1;
            c22114.f71599[i6] = iMax;
            c22114.f71600[i6] = iMin;
            c22114.f71594[i6] = i3;
            c22114.f71598[i6] = c22114.f71598[i];
            iArr[i - i4] = i6;
            return false;
        }
        if (this.f17979 < 0) {
            this.f17979 = this.f17981;
        }
        if (this.f17979 < i2) {
            C20889[] c20889Arr = c22114.f71598;
            int i7 = this.f17979;
            int i8 = i7 + 1;
            this.f17979 = i8;
            c20889Arr[i7] = null;
            if (i8 < i2) {
                return false;
            }
        }
        c22114.f71596 = this.f17981;
        c22114.f71603 = true;
        this.f17977 = true;
        c22114.f71601 = null;
        return true;
    }
}
