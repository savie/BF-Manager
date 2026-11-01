package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۜۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: L64G */
/* JADX INFO: loaded from: classes3.dex */
public final class C6562 extends C2951 {
    @Override // l.C2951, java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder(", expected ");
        int i = this.f11055;
        sb.append(i);
        String string = sb.toString();
        if (i == 0) {
            string = "";
        }
        if (this.f71539 == null) {
            return C16523.m38890("UnwantedTokenException(found=null", string, MotionUtils.EASING_TYPE_FORMAT_END);
        }
        return "UnwantedTokenException(found=" + this.f71539.getText() + string + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
