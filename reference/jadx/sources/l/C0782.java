package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.֡᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: L64G */
/* JADX INFO: loaded from: classes3.dex */
public final class C0782 extends C23903 {
    @Override // l.C23903, java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder(", expected ");
        int i = this.f77386;
        sb.append(i);
        String string = sb.toString();
        if (i == 0) {
            string = "";
        }
        if (this.f16097 == null) {
            return C14442.m34865("UnwantedTokenException(found=null", string, MotionUtils.EASING_TYPE_FORMAT_END);
        }
        return "UnwantedTokenException(found=" + this.f16097.getText() + string + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
