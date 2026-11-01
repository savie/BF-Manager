package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܰۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C5SA */
/* JADX INFO: loaded from: classes4.dex */
public final class C13619 extends C2951 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object f44937;

    @Override // l.C2951, java.lang.Throwable
    public final String toString() {
        Object obj = this.f44937;
        if (obj != null && this.f71539 != null) {
            return "MissingTokenException(inserted " + obj + " at " + this.f71539.getText() + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (this.f71539 == null) {
            return "MissingTokenException";
        }
        return "MissingTokenException(at " + this.f71539.getText() + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
