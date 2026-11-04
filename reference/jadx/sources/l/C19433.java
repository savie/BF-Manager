package l;

/* JADX INFO: renamed from: l.ᩳ᩻ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: T6ZS */
/* JADX INFO: loaded from: classes5.dex */
public final class C19433 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f62795;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f62796;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f62797;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f62798;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10482 f62799;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f62800;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f62801;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f62802;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f62803 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f62804;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f62805;

    public C19433(C10482 c10482, int i, int i2, int i3, int i4) {
        this.f62799 = c10482;
        this.f62802 = i;
        this.f62796 = i2;
        this.f62795 = i3;
        this.f62804 = i4;
        int i5 = c10482.f33362;
        this.f62800 = i5;
        this.f62801 = new int[i5 - i];
        this.f62805 = i;
        this.f62797 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44926() {
        if (this.f62798) {
            return true;
        }
        C10482 c10482 = this.f62799;
        if (c10482.f33371 || c10482.f33364 != this) {
            throw new IllegalStateException("Syntax context clip is not active");
        }
        int i = this.f62797;
        int i2 = this.f62800;
        if (i < i2) {
            this.f62797 = i + 1;
            int i3 = c10482.f33367[i];
            int[] iArr = this.f62801;
            int i4 = this.f62802;
            if (i3 >= i4) {
                i3 = iArr[i3 - i4];
            }
            int i5 = this.f62796;
            int[] iArr2 = c10482.f33366;
            int iMax = i < i5 ? Math.max(iArr2[i], this.f62795) : iArr2[i];
            int iMin = i < i5 ? Math.min(c10482.f33365[i], this.f62804) : c10482.f33365[i];
            if (iMax >= iMin || c10482.f33370 == c10482.f33363 || iMin <= c10482.f33370 || iMax >= c10482.f33363) {
                iArr[i - i4] = i3;
                return false;
            }
            int i6 = this.f62805;
            this.f62805 = i6 + 1;
            c10482.f33366[i6] = iMax;
            c10482.f33365[i6] = iMin;
            c10482.f33367[i6] = i3;
            c10482.f33369[i6] = c10482.f33369[i];
            iArr[i - i4] = i6;
            return false;
        }
        if (this.f62803 < 0) {
            this.f62803 = this.f62805;
        }
        if (this.f62803 < i2) {
            C16800[] c16800Arr = c10482.f33369;
            int i7 = this.f62803;
            int i8 = i7 + 1;
            this.f62803 = i8;
            c16800Arr[i7] = null;
            if (i8 < i2) {
                return false;
            }
        }
        c10482.f33362 = this.f62805;
        c10482.f33368 = true;
        this.f62798 = true;
        c10482.f33364 = null;
        return true;
    }
}
