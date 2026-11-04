package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.֨ۢۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes3.dex */
public final class C1086 extends AbstractC0078 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f3881;

    public final String toString() {
        return C14442.m34865(":containsData(", this.f3881, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C1086(String str) {
        this.f3881 = C15300.m36731(str);
    }

    @Override // l.AbstractC0078
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1133(C15496 c15496, C15496 c15497) {
        return C15300.m36731(c15497.m37063()).contains(this.f3881);
    }
}
