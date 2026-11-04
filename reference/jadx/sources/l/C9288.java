package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ۡۢۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes4.dex */
public final class C9288 extends AbstractC0078 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f30195;

    public final String toString() {
        return C14442.m34865(":containsOwn(", this.f30195, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C9288(String str) {
        StringBuilder sbM2898 = C0669.m2898();
        C0669.m2900(str, sbM2898, false);
        this.f30195 = C15300.m36731(C0669.m2896(sbM2898));
    }

    @Override // l.AbstractC0078
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1133(C15496 c15496, C15496 c15497) {
        return C15300.m36731(c15497.m37097()).contains(this.f30195);
    }
}
