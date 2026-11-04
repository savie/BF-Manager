package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۟ۛ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: KAHM */
/* JADX INFO: loaded from: classes4.dex */
public final class C7694 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f25387;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f25388;

    public C7694(String str, int i) {
        this.f25387 = str;
        this.f25388 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7694)) {
            return false;
        }
        C7694 c7694 = (C7694) obj;
        return this.f25388 == c7694.f25388 && C17359.equals(this.f25387, c7694.f25387);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f25387) + (this.f25388 * 31);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m20965() {
        return this.f25387;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m20966() {
        return this.f25388;
    }

    public final String toString() {
        String str = this.f25387;
        int i = this.f25388;
        if (i < 0) {
            return str + " - (" + i + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        return str + " - " + i;
    }
}
