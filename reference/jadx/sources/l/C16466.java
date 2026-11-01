package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܽۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: KAHM */
/* JADX INFO: loaded from: classes4.dex */
public final class C16466 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f52921;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f52922;

    public C16466(String str, int i) {
        this.f52921 = str;
        this.f52922 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16466)) {
            return false;
        }
        C16466 c16466 = (C16466) obj;
        return this.f52922 == c16466.f52922 && C13638.equals(this.f52921, c16466.f52921);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f52921) + (this.f52922 * 31);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m38728() {
        return this.f52921;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m38729() {
        return this.f52922;
    }

    public final String toString() {
        String str = this.f52921;
        int i = this.f52922;
        if (i < 0) {
            return str + " - (" + i + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        return str + " - " + i;
    }
}
