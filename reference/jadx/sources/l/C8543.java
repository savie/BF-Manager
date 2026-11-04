package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.۠ۢۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes4.dex */
public final class C8543 extends AbstractC0078 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f27899;

    public final String toString() {
        return C14442.m34865(":containsWholeOwnText(", this.f27899, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C8543(String str) {
        this.f27899 = str;
    }

    @Override // l.AbstractC0078
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1133(C15496 c15496, C15496 c15497) {
        return c15497.m37095().contains(this.f27899);
    }
}
