package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ᩳܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BJX */
/* JADX INFO: loaded from: classes5.dex */
public final class C18153 extends AbstractC4166 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f58045;

    public final String toString() {
        return C16523.m38890(":containsOwn(", this.f58045, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    public C18153(String str) {
        StringBuilder sbM11782 = C4145.m11782();
        C4145.m11784(str, sbM11782, false);
        this.f58045 = C1323.m4722(C4145.m11780(sbM11782));
    }

    @Override // l.AbstractC4166
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2407(C0617 c0617, C0617 c0618) {
        return C1323.m4722(c0618.m2845()).contains(this.f58045);
    }
}
