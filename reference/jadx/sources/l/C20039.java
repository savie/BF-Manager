package l;

import com.google.android.material.textfield.IndicatorViewController;

/* JADX INFO: renamed from: l.᩶۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: B8N9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20039 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f64168;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f64169;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C3392 f64170 = C3392.f12527;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f64171;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Object f64172;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f64173;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Object f64174;

    static {
        C9023.m23358(0, 1, 2, 3, 4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45388(Object obj, Object obj2, int i, long j, long j2, C3392 c3392, boolean z) {
        this.f64172 = obj;
        this.f64174 = obj2;
        this.f64168 = i;
        this.f64173 = j;
        this.f64171 = j2;
        this.f64170 = c3392;
        this.f64169 = z;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m45389(int i) {
        C3392 c3392 = this.f64170;
        int i2 = c3392.f12528;
        if (i != i2 - 1 || i != i2 - 1) {
            return false;
        }
        c3392.m10067(i).getClass();
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m45386(int i) {
        this.f64170.m10067(i).getClass();
        return 0L;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m45390(int i) {
        return this.f64170.m10067(i).m24724(-1);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m45391(long j) {
        C3392 c3392 = this.f64170;
        int i = c3392.f12528;
        int i2 = i - 1;
        if (i2 == i - 1) {
            c3392.m10067(i2).getClass();
        }
        while (i2 >= 0 && j != Long.MIN_VALUE) {
            c3392.m10067(i2).getClass();
            if (j >= 0) {
                break;
            }
            i2--;
        }
        if (i2 >= 0) {
            C9744 c9744M10067 = c3392.m10067(i2);
            int i3 = c9744M10067.f32786;
            if (i3 != -1) {
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = c9744M10067.f32790[i4];
                    if (i5 != 0 && i5 != 1) {
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m45385(long j) {
        C9744 c9744M10067;
        int i;
        C3392 c3392 = this.f64170;
        long j2 = this.f64173;
        int i2 = c3392.f12528;
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i3 = 0;
            while (i3 < i2) {
                c3392.m10067(i3).getClass();
                c3392.m10067(i3).getClass();
                if (0 > j && ((i = (c9744M10067 = c3392.m10067(i3)).f32786) == -1 || c9744M10067.m24724(-1) < i)) {
                    break;
                }
                i3++;
            }
            if (i3 < i2) {
                if (j2 != -9223372036854775807L) {
                    c3392.m10067(i3).getClass();
                    if (0 <= j2) {
                    }
                }
                return i3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m45387(int i, int i2) {
        C9744 c9744M10067 = this.f64170.m10067(i);
        if (c9744M10067.f32786 != -1) {
            return c9744M10067.f32789[i2];
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m45384(int i) {
        this.f64170.m10067(i).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C20039.class.equals(obj.getClass())) {
            return false;
        }
        C20039 c20039 = (C20039) obj;
        return C13638.equals(this.f64172, c20039.f64172) && C13638.equals(this.f64174, c20039.f64174) && this.f64168 == c20039.f64168 && this.f64173 == c20039.f64173 && this.f64171 == c20039.f64171 && this.f64169 == c20039.f64169 && C13638.equals(this.f64170, c20039.f64170);
    }

    public final int hashCode() {
        Object obj = this.f64172;
        int iHashCode = ((obj == null ? 0 : obj.hashCode()) + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) * 31;
        Object obj2 = this.f64174;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f64168) * 31;
        long j = this.f64173;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f64171;
        return this.f64170.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f64169 ? 1 : 0)) * 31);
    }
}
