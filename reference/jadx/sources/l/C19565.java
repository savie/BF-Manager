package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩵ܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes5.dex */
public final class C19565 extends AbstractC4166 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f62868;

    public final String toString() {
        return C16523.m38890(":containsWholeText(", this.f62868, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C19565(String str) {
        this.f62868 = str;
    }

    @Override // l.AbstractC4166
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2407(C0617 c0617, C0617 c0618) {
        return c0618.m2865().contains(this.f62868);
    }
}
