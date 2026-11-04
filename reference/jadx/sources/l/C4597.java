package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۙۖۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: S578 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4597 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f16318;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f16319;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f16320;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f16321;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f16322;

    public C4597(int i, String str, String str2, String str3, boolean z) {
        this.f16320 = i;
        this.f16322 = str;
        this.f16319 = str2;
        this.f16318 = str3;
        this.f16321 = z;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m14406() {
        return this.f16320;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m14403() {
        return this.f16322;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m14405() {
        return this.f16319;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m14402() {
        return this.f16318;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m14404() {
        return this.f16321;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4597)) {
            return false;
        }
        C4597 c4597 = (C4597) obj;
        return this.f16320 == c4597.f16320 && this.f16321 == c4597.f16321 && this.f16322.equals(c4597.f16322) && this.f16319.equals(c4597.f16319) && this.f16318.equals(c4597.f16318);
    }

    public final int hashCode() {
        return (this.f16318.hashCode() * this.f16319.hashCode() * this.f16322.hashCode()) + this.f16320 + (this.f16321 ? 64 : 0);
    }

    public final String toString() {
        return this.f16322 + "." + this.f16319 + this.f16318 + " (" + this.f16320 + (this.f16321 ? " itf" : "") + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
