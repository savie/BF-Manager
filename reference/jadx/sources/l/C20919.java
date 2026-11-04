package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩵᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5SA */
/* JADX INFO: loaded from: classes5.dex */
public final class C20919 extends C23903 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public Object f66938;

    @Override // l.C23903, java.lang.Throwable
    public final String toString() {
        Object obj = this.f66938;
        if (obj != null && this.f16097 != null) {
            return "MissingTokenException(inserted " + obj + " at " + this.f16097.getText() + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (this.f16097 == null) {
            return "MissingTokenException";
        }
        return "MissingTokenException(at " + this.f16097.getText() + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
