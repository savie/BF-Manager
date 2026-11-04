package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۙۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 367O */
/* JADX INFO: loaded from: classes2.dex */
public final class C4869 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f16979;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f16980;

    public C4869(Object obj, Object obj2) {
        this.f16979 = obj;
        this.f16980 = obj2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m14925() {
        return this.f16979;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m14926() {
        return this.f16980;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4869)) {
            return false;
        }
        C4869 c4869 = (C4869) obj;
        return this.f16979.equals(c4869.f16979) && this.f16980.equals(c4869.f16980);
    }

    public final int hashCode() {
        return (this.f16980.hashCode() * 31) + this.f16979.hashCode();
    }

    public final String toString() {
        return MotionUtils.EASING_TYPE_FORMAT_START + this.f16979 + ", " + this.f16980 + ')';
    }
}
