package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩵֡ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: S578 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19110 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f61742;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f61743;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f61744;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f61745;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f61746;

    public C19110(int i, String str, String str2, String str3, boolean z) {
        this.f61744 = i;
        this.f61742 = str;
        this.f61745 = str2;
        this.f61743 = str3;
        this.f61746 = z;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m43910() {
        return this.f61744;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m43913() {
        return this.f61742;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m43914() {
        return this.f61745;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m43911() {
        return this.f61743;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m43912() {
        return this.f61746;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C19110)) {
            return false;
        }
        C19110 c19110 = (C19110) obj;
        return this.f61744 == c19110.f61744 && this.f61746 == c19110.f61746 && this.f61742.equals(c19110.f61742) && this.f61745.equals(c19110.f61745) && this.f61743.equals(c19110.f61743);
    }

    public final int hashCode() {
        return (this.f61743.hashCode() * this.f61745.hashCode() * this.f61742.hashCode()) + this.f61744 + (this.f61746 ? 64 : 0);
    }

    public final String toString() {
        return this.f61742 + "." + this.f61745 + this.f61743 + " (" + this.f61744 + (this.f61746 ? " itf" : "") + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
