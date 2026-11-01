package l;

import com.google.android.material.motion.MotionUtils;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܶ۟۠, reason: contains not printable characters */
/* JADX INFO: compiled from: GAXP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15083 implements Serializable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Object f49165;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f49166;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15083)) {
            return false;
        }
        C15083 c15083 = (C15083) obj;
        return C13465.m32965(this.f49165, c15083.f49165) && C13465.m32965(this.f49166, c15083.f49166);
    }

    public final int hashCode() {
        Object obj = this.f49165;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f49166;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m36157() {
        return this.f49165;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m36159() {
        return this.f49166;
    }

    public C15083(Object obj, Object obj2) {
        this.f49165 = obj;
        this.f49166 = obj2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Object m36158() {
        return this.f49165;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object m36156() {
        return this.f49166;
    }

    public final String toString() {
        return MotionUtils.EASING_TYPE_FORMAT_START + this.f49165 + ", " + this.f49166 + ')';
    }
}
