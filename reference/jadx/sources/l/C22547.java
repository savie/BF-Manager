package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩸ۘܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes.dex */
public final class C22547 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f72891;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f72892;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f72893;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f72894;

    public C22547(int i, int i2, int i3, int i4) {
        this.f72892 = i;
        this.f72891 = i2;
        this.f72894 = i3;
        this.f72893 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C22547.class == obj.getClass()) {
            C22547 c22547 = (C22547) obj;
            if (this.f72892 == c22547.f72892 && this.f72891 == c22547.f72891 && this.f72894 == c22547.f72894 && this.f72893 == c22547.f72893) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f72892 * 31) + this.f72891) * 31) + this.f72894) * 31) + this.f72893;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f72892);
        sb.append(", ");
        sb.append(this.f72891);
        sb.append(") - [");
        sb.append(this.f72894);
        sb.append(", ");
        return C12669.m31437(this.f72893, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50782() {
        return this.f72892 == this.f72891 && this.f72894 == this.f72893;
    }
}
