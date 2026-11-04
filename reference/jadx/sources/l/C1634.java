package l;

import com.google.android.material.textfield.IndicatorViewController;

/* JADX INFO: renamed from: l.֫ۗۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8N9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1634 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C24380 f5655 = C24380.f79095;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Object f5656;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f5657;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Object f5658;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f5659;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f5660;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f5661;

    static {
        C4794.m14773(0, 1, 2, 3, 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5789(Object obj, Object obj2, int i, long j, long j2, C24380 c24380, boolean z) {
        this.f5656 = obj;
        this.f5658 = obj2;
        this.f5657 = i;
        this.f5660 = j;
        this.f5659 = j2;
        this.f5655 = c24380;
        this.f5661 = z;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m5790(int i) {
        C24380 c24380 = this.f5655;
        int i2 = c24380.f79097;
        if (i != i2 - 1 || i != i2 - 1) {
            return false;
        }
        c24380.m54497(i).getClass();
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m5787(int i) {
        this.f5655.m54497(i).getClass();
        return 0L;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m5791(int i) {
        return this.f5655.m54497(i).m18312(-1);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m5792(long j) {
        C24380 c24380 = this.f5655;
        int i = c24380.f79097;
        int i2 = i - 1;
        if (i2 == i - 1) {
            c24380.m54497(i2).getClass();
        }
        while (i2 >= 0 && j != Long.MIN_VALUE) {
            c24380.m54497(i2).getClass();
            if (j >= 0) {
                break;
            }
            i2--;
        }
        if (i2 >= 0) {
            C6480 c6480M54497 = c24380.m54497(i2);
            int i3 = c6480M54497.f21782;
            if (i3 != -1) {
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = c6480M54497.f21785[i4];
                    if (i5 != 0 && i5 != 1) {
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m5786(long j) {
        C6480 c6480M54497;
        int i;
        C24380 c24380 = this.f5655;
        long j2 = this.f5660;
        int i2 = c24380.f79097;
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i3 = 0;
            while (i3 < i2) {
                c24380.m54497(i3).getClass();
                c24380.m54497(i3).getClass();
                if (0 > j && ((i = (c6480M54497 = c24380.m54497(i3)).f21782) == -1 || c6480M54497.m18312(-1) < i)) {
                    break;
                }
                i3++;
            }
            if (i3 < i2) {
                if (j2 != -9223372036854775807L) {
                    c24380.m54497(i3).getClass();
                    if (0 <= j2) {
                    }
                }
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m5788(int i, int i2) {
        C6480 c6480M54497 = this.f5655.m54497(i);
        if (c6480M54497.f21782 != -1) {
            return c6480M54497.f21787[i2];
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m5793(int i) {
        this.f5655.m54497(i).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C1634.class.equals(obj.getClass())) {
            return false;
        }
        C1634 c1634 = (C1634) obj;
        return C17359.equals(this.f5656, c1634.f5656) && C17359.equals(this.f5658, c1634.f5658) && this.f5657 == c1634.f5657 && this.f5660 == c1634.f5660 && this.f5659 == c1634.f5659 && this.f5661 == c1634.f5661 && C17359.equals(this.f5655, c1634.f5655);
    }

    public final int hashCode() {
        Object obj = this.f5656;
        int iHashCode = ((obj == null ? 0 : obj.hashCode()) + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) * 31;
        Object obj2 = this.f5658;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f5657) * 31;
        long j = this.f5660;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f5659;
        return this.f5655.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f5661 ? 1 : 0)) * 31);
    }
}
