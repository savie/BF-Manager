package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩷۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: GAXP */
/* JADX INFO: loaded from: classes.dex */
public final class C21914 implements Serializable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f70765;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f70766;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21914)) {
            return false;
        }
        C21914 c21914 = (C21914) obj;
        return C15243.m36589(this.f70765, c21914.f70765) && C15243.m36589(this.f70766, c21914.f70766);
    }

    public final int hashCode() {
        Object obj = this.f70765;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f70766;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m49600() {
        return this.f70765;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m49602() {
        return this.f70766;
    }

    public C21914(Object obj, Object obj2) {
        this.f70765 = obj;
        this.f70766 = obj2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Object m49601() {
        return this.f70765;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object m49603() {
        return this.f70766;
    }

    public final String toString() {
        return MotionUtils.EASING_TYPE_FORMAT_START + this.f70765 + ", " + this.f70766 + ')';
    }
}
